package day05_me

/**
 * @ 文件名:   `08.闭包`
 * @ 创建者:   zl
 * @ 时间:    2018/8/11 17:12
 * @ 描述:
 */
fun main(args: Array<String>) {
    val block=test()
    block()
    block()
    block()
    /*Python:一个函数返回了一个内部函数，该内部函数引用了外部函数的相关参数和变量，我们把该返回的内部函数称为闭包
    在kotlin里面我们通常说的闭包就是lambda表达式
    */
}
fun test():()->Unit{
    var a=10
    return{
        println(a)
        a++
    }
}