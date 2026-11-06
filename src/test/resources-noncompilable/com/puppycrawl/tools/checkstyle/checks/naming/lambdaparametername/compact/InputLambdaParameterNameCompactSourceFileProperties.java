/*
LambdaParameterName
format = ^arg[0-9]$


*/

// non-compiled with javac: Compilable with Java25

import java.util.function.BinaryOperator;
import java.util.function.Function;

Function<Integer, Integer> good = arg1 -> arg1;
Function<Integer, Integer> bad = value -> value; // violation 'Name 'value' must match pattern'
BinaryOperator<Integer> pair = (arg1, two) -> arg1; // violation 'Name 'two' must match pattern'

void main() {
    Function<Integer, Integer> local = arg2 -> arg2;
}

class Inner {
    Function<Integer, Integer> inner = arg -> arg; // violation 'Name 'arg' must match pattern'
}
