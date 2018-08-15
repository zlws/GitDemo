package day05_me

/**
 * @ 文件名:   `13.单独存在的lambda表达式`
 * @ 创建者:   zl
 * @ 时间:    2018/8/11 17:53
 * @ 描述:
 */
fun main(args: Array<String>) {
    /********************无参的lambda表达式********************/
    {
        println("Hello")
    }()

    /*{
        println("Hi")
    }.invoke()*/
    /********************有参的lambda表达式********************/
    val result={a:Int,b:Int->
        a+b
    }(10,20)
    println(result)
    val res={a:Int,b:Int->
        a+b
    }.invoke(10,20)
    println(res)
}