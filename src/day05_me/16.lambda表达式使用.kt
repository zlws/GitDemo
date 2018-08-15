package day05_me

/**
 * @ 文件名:   `16.lambda表达式使用`
 * @ 创建者:   zl
 * @ 时间:    2018/8/11 19:18
 * @ 描述:
 */
fun main(args: Array<String>) {
    val a=10
/*    val res=add(a,{m->
        m+10
    })*/
/*    val res=add(a){m->m+10}
    println(res)*/
    val res=add(a){
        it+10
    }
    println(res)
}
fun add(m:Int,block:(Int)->Int):Int{
    return block(m)+10
}