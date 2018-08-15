package day05_me

/**
 * @ 文件名:   `04.set`
 * @ 创建者:   zl
 * @ 时间:    2018/8/11 16:21
 * @ 描述:set无序
 */
fun main(args: Array<String>) {
    /********************快速set，不能扩容，不能修改元素********************/
    val set= setOf<String>("abc","abc")
    println(set)
    /********************可变set********************/
    val mutableSet= mutableSetOf<String>("abc","asd","zxc")
    mutableSet.add("012")
    println(mutableSet)

}