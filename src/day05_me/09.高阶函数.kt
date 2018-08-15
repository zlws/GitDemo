package day05_me

/**
 * @ 文件名:   `09.高阶函数`
 * @ 创建者:   zl
 * @ 时间:    2018/8/11 17:20
 * @ 描述:
 */
fun main(args: Array<String>) {
    val a = 10
    val b = 20
    //a+b
    var sum = 0
    //a-b
    var result = 0

//    sum = add(a, b)
//    result = sub(a,b)
//
//    println(sum)
//    println(result)
    //只调用一个方法调用两次就可以求sum和result
    println(cacl(a,b,::add))
    println(cacl(a,b,::sub))
}
//不知道具体是要求和还是求差  只要传递一个和的运算规则 就可以求和  传递一个求差的运算规则就可以求差
//高阶函数:把函数作为参数或者返回值的函数就是高阶函数
fun cacl(m:Int,n:Int,block:(Int,Int)->Int):Int{
    return block(m,n)
}
fun add(m:Int,n:Int):Int{
    return m+n
}
fun sub(m:Int,n:Int):Int{
    return m-n
}