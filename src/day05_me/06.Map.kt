package day05_me

/**
 * @ 文件名:   map
 * @ 创建者:   zl
 * @ 时间:    2018/8/11 16:54
 * @ 描述:
 */
fun main(args: Array<String>) {
    val map= mapOf<String,String>("中国" to "China","英国" to "England","美国" to "USA")
    val mutableMap= mutableMapOf<String,String>("中国" to "China","英国" to "England")
    mutableMap.put("美国","USA")
}