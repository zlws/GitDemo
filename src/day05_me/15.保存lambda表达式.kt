package day05_me

/**
 * @ 文件名:   `15.保存lambda表达式`
 * @ 创建者:   zl
 * @ 时间:    2018/8/11 19:13
 * @ 描述:
 */
val block2={m:Int,n:Int->
    m+n
}
fun main(args: Array<String>) {
    //通过变量保存lambda表达式
    val block:()->Unit={

    }
    block()
    block.invoke()
    println(block2(10, 20))
    println(block2.invoke(10, 20))
}