/*
MethodTypeParameterName
format = ^[A-Z][a-zA-Z0-9]+$


*/

// non-compiled with javac: Compilable with Java25

<Foo> Foo good(Foo value) {
    return value;
}

<T> T bad(T value) { // violation 'Name 'T' must match pattern'
    return value;
}

void main() {
}

class Inner {
    <Bar> void good() {
    }

    <foo> void bad() { // violation 'Name 'foo' must match pattern'
    }
}
