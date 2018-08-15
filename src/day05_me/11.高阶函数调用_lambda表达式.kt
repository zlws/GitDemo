package day05_megj

/**
 * @ 文件名:   `11.高阶函数调用`
 * @ 创建者:   zl
 * @ 时间:    2018/8/11 17:35
 * @ 描述:
 */
fun main(args: Array<String>) {
    var a=10
    var b=20
    var sum=0
    var result=0
    sum=cacl(a,b,{m:Int,n:Int->
        m+n})
    result=cacl(a,b,{m:Int,n:Int->
        m-n
    })
    println(sum)
    println(result)
}
fun cacl(m:Int,n:Int,block:(Int,Int)->Int):Int{
    return block(m,n)
}
