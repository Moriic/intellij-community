package demo

class Test {
    fun test(vararg args: Any) {
        var args = args
        args = array<Int>(1, 2, 3)
    }
}