package day05_me

import day05.Person

/**
 * @ 文件名:   `25.集合重新组合`
 * @ 创建者:   zl
 * @ 时间:    2018/8/11 21:45
 * @ 描述:
 */
fun main(args: Array<String>) {
    val personList = listOf(Person("林青霞",50), Person("张曼玉",30), Person("郑少秋",70))
    val nameList=personList.map{
        it.name
    }
    println(nameList)
}