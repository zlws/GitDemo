package day05_me

/**
 * @ 文件名:   `24.去重复`
 * @ 创建者:   zl
 * @ 时间:    2018/8/11 21:33
 * @ 描述:
 */
fun main(args: Array<String>) {
    val list = listOf("张三","李四","王五","赵六","张三","张四","李六","李四")
/*    var distinct = list.distinct()
    println(distinct)*/
    println(list.distinctBy {
        val first=it.substring(0,1)
        if(first=="张"){
            "张"
        }else{
            it
        }
    })
}