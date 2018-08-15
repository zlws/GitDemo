package day05_meq

/**
 * @ 文件名:   `12.lambda表达式去()`
 * @ 创建者:   zl
 * @ 时间:    2018/8/11 17:48
 * @ 描述:
 */
fun main(args: Array<String>) {
    var a =10
    var b=20
    var result=0
    var sum=0
    sum=cacl(a,b){m,n->
        m+n}
    println(sum)
    result=cacl(a,b){m,n->
        m-n
    }
    println(result)
}
fun cacl(m:Int,n:Int,block:(Int,Int)->Int):Int{
    return block(m,n)
}