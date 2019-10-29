use JSON::Fast;
use Test;

plan *;

constant $MODULE-SCRIPT = '../../resources/symbols/perl6-module-symbols.p6';

subtest {
    my $proc = run $*EXECUTABLE, $MODULE-SCRIPT, 'use NativeCall', :out;
    my $output = $proc.out.slurp(:close);
    my $data;
    lives-ok { $data = from-json $output }, "Can parse json";
    # Subs, constants, types
    ok $data.first({ $_<n> eq "explicitly-manage" && $_<k> eq "s" && $_<m> == 1 }), 'Subroutine is exported';
    # Roles
    my $native = $data.first({ $_<n> eq "NativeCall::Native" });
    ok $native, 'Native role is exported';
    ok $native<a>.first({ $_<n> eq '$!setup' && $_<t> eq "int" }), 'Native private attributes are exported';
    ok $native<m>.first({ $_<n> eq 'CALL-ME' && $_<k> eq 'm' && $_<m> == 0 && $_<s><p> eqv ['|args is raw'] && $_<s><r> eq 'Mu'}), 'Native role methods are exported';
    ok $native<m>.first({ $_<n> eq '!setup' && $_<k> eq 'm' && $_<m> == 0 && $_<s><r> eq 'Mu' && $_<s><p> eqv ['*%_'] }), 'Native role methods are exported';
    # Classes
    $native = $data.first({ $_<n> eq 'CArray' });
    ok $native, 'CArray class is exported';
    ok $native<m>.first({ $_<n> eq 'AT-POS' }), 'CArray class methods are exported';
    # Exports
    subtest {
      ok $data.first({ $_<n> eq 'Pointer' });
      ok $data.first({ $_<n> eq 'OpaquePointer' });
      ok $data.first({ $_<n> eq 'NativeCall::Types::Pointer' });
      ok $data.first({ $_<n> eq 'NativeCall::EXPORT::types::Pointer' });
      ok $data.first({ $_<n> eq 'NativeCall::EXPORT::DEFAULT::Pointer' });
      ok $data.first({ $_<n> eq 'NativeCall::EXPORT::ALL::Pointer' });
    }, 'Various symbols to access Pointer are exported';
}, 'Module script test';

subtest {
    my $proc = run $*EXECUTABLE, $MODULE-SCRIPT, 'use SymbolScriptModule', :out;
    my $output = $proc.out.slurp(:close);
    my $data;
    lives-ok { $data = from-json $output }, 'Can parse json';
    my $variable = $data.first(*.<n> eq '$test-variable');
    ok $variable<n> eq '$test-variable';
    ok $variable<k> eq 'v';
    ok $variable<t> eq 'Any';
}

done-testing;
