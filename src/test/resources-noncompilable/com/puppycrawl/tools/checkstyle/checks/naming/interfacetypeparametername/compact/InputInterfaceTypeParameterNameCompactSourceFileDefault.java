/*
InterfaceTypeParameterName
format = (default)^[A-Z]$


*/

// non-compiled with javac: Compilable with Java25

interface Good<T> {
}

interface Bad<TT> { // violation 'Name 'TT' must match pattern'
}

interface Two<T, Second> { // violation 'Name 'Second' must match pattern'
}

void main() {
    interface Local<LocalBad> { // violation 'Name 'LocalBad' must match pattern'
    }
}

class Inner<ClassIgnored> {
    interface Nested<NestedBad> { // violation 'Name 'NestedBad' must match pattern'
        <MethodIgnored> void method();
    }
}

enum Color {
    RED;
    interface InEnum<EnumBad> { // violation 'Name 'EnumBad' must match pattern'
    }
}

record Point<RecordIgnored>(int x) {
    interface InRecord<RecordBad> { // violation 'Name 'RecordBad' must match pattern'
    }
}
