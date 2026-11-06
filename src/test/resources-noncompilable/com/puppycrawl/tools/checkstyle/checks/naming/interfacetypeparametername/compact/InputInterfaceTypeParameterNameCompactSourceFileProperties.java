/*
InterfaceTypeParameterName
format = ^[A-Z][a-zA-Z0-9]+$


*/

// non-compiled with javac: Compilable with Java25

interface Good<Foo> {
}

interface Bad<T> { // violation 'Name 'T' must match pattern'
}

void main() {
}

class Inner {
    interface NestedGood<Bar> {
    }

    interface NestedBad<foo> { // violation 'Name 'foo' must match pattern'
    }
}
