package day05_me

/**
 * @ 文件名:   `02.List集合`
 * @ 创建者:   zl
 * @ 时间:    2018/8/11 16:02
 * @ 描述:
 */
fun main(args: Array<String>) {
    val list1= listOf<String>("张曼玉","林青霞","王祖贤")
    //不能添加元素
    val list2= mutableListOf<String>("张曼玉","林青霞","王祖贤")
    list2.add("朱茵")//支持扩容
    list2.add(1,"关之琳")
    println(list2)
    list2.set(1,"李若彤")//修改方法
    println(list2)
    val mutableList= MutableList<String>(10){
        "wqe"
    }

}