// PROBLEM: none

fun nullable() {}

fun bar() {}

fun foo(f: Boolean) {
    <caret>nullable() ?: if (f) bar()
}