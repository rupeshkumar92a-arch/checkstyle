/*
LambdaParameterName
format = (default)^([a-z][a-zA-Z0-9]*|_)$


*/

// non-compiled with javac: Compilable with Java25

import java.util.function.BinaryOperator;
import java.util.function.Function;

Function<Integer, Integer> good = value -> value + 1;
Function<Integer, Integer> bad = Value -> Value + 1; // violation 'Name 'Value' must match pattern'
Function<Integer, Integer> unnamed = _ -> 1;
BinaryOperator<Integer> pair = (a, B) -> a; // violation 'Name 'B' must match pattern'
BinaryOperator<Integer> op = (Integer a, Integer C) -> a; // violation 'Name 'C' must match pattern'

void main() {
    Runnable noParameters = () -> { };
    Function<Integer, Integer> local = Lcl -> Lcl; // violation 'Name 'Lcl' must match pattern'
}

class Inner {
    Function<Integer, Integer> inner = Inn -> Inn; // violation 'Name 'Inn' must match pattern'
}

interface Shape {
    Function<Integer, Integer> CONSTANT = Shp -> Shp; // violation 'Name 'Shp' must match pattern'
}

enum Color {
    RED;
    Function<Integer, Integer> field = Enm -> Enm; // violation 'Name 'Enm' must match pattern'
}

record Point(int x) {
    static Function<Integer, Integer> f = Rec -> Rec; // violation 'Name 'Rec' must match pattern'
}
