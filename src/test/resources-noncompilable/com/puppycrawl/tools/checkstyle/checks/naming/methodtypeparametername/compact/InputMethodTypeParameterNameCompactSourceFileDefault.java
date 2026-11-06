/*
MethodTypeParameterName
format = (default)^[A-Z]$


*/

// non-compiled with javac: Compilable with Java25

<T> T good(T value) {
    return value;
}

<TT> TT bad(TT value) { // violation 'Name 'TT' must match pattern'
    return value;
}

<T, Second> T two(T first, Second second) { // violation 'Name 'Second' must match pattern'
    return first;
}

static <Foo> void staticMethod(Foo foo) { // violation 'Name 'Foo' must match pattern'
}

void main() {
}

class Inner<ClassIgnored> {
    <Bar> void method() { // violation 'Name 'Bar' must match pattern'
    }
}

interface Shape<InterfaceIgnored> {
    <Baz> void draw(); // violation 'Name 'Baz' must match pattern'
}

enum Color {
    RED;
    <Qux> void method() { // violation 'Name 'Qux' must match pattern'
    }
}

record Point<RecordIgnored>(int x) {
    <Quux> void method() { // violation 'Name 'Quux' must match pattern'
    }
}
