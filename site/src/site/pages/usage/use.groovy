article {
    a(name: 'use'){}
    h2 { yield 'Use Version' }
    p {
        yield 'Choose to use a given version in the current terminal:'
        pre { code '$ sdk use scala 2.12.1' }
        yield 'It is important to realise that this will switch the candidate version '
        strong 'for the current shell only'
        yield '. To make this change permanent, use the '
        a(href:'#default', 'default')
        yield ' command instead.'
    }
}
br()
