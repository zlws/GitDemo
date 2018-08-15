package day05_me

/**
 * @ 文件名:   `03.遍历list集合`
 * @ 创建者:   zl
 * @ 时间:    2018/8/11 16:13
 * @ 描述:
 */
fun main(args: Array<String>) {
    val list= listOf<String>("林青霞","张曼玉","王祖贤")
    /********************for********************/
    for (s in list) {
        println(s)
    }
    for ((index,value) in list.withIndex()) {
        println("$index $value")
    }
    /********************forEach********************/
    list.forEach{
        println(it)
    }
    list.forEachIndexed{index,value->
        println(value)
    }
}