class Foo {
    has $.public-attribute;

    method test-method() {
        $!public-attribute;
        $.public-<caret>attribute;
        self.public-attribute;
    }
}

Foo.new.public-attribute;
