package day05_me

/**
 * @ 文件名:   `22.最值`
 * @ 创建者:   zl
 * @ 时间:    2018/8/11 21:22
 * @ 描述:
 */
fun main(args: Array<String>) {
    val list= listOf<Char>('q','w','e','r','t','y')
    val max=list.max()
    println(max)
    val min=list.min()
    println(min)
    val personList = listOf(Person("林青霞",50),Person("张曼玉",30),Person("郑少秋",70))
    val maxAge=personList.maxBy {
        it.age
    }
    println(maxAge)
    val minAge=personList.minBy {
        it.age
    }
    println(minAge)
}