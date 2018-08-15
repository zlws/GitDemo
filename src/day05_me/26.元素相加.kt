package day05_me

import day05.Person

/**
 * @ 文件名:   `26.元素相加`
 * @ 创建者:   zl
 * @ 时间:    2018/8/11 21:46
 * @ 描述:
 */
fun main(args: Array<String>) {
    val personList = listOf(Person("林青霞",50), Person("张曼玉",30), Person("郑少秋",70))
    val totalSum=personList.sumBy {
        it.age
    }
    println(totalSum)
}