my @list = await Promise.anyof(start {
    long-call(1,2,3)
}, Promise.in(5));