package day05_me

/**
 * @ 文件名:   `01.java的集合体系`
 * @ 创建者:   zl
 * @ 时间:    2018/8/11 15:54
 * @ 描述:
 */
fun main(args: Array<String>) {
    val hashMap=HashMap<String,String>()
    hashMap.put("中国","China")
    hashMap.put("英国","England")
    hashMap.put("美国","USA")
    val value=hashMap.get("中国")
    //println(value)
    val keys = hashMap.keys
    val values = hashMap.values
    println(keys)
    println(values)
}
