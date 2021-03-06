package day05_me

/**
 * @ 文件名:   `19.集合过滤`
 * @ 创建者:   zl
 * @ 时间:    2018/8/11 20:22
 * @ 描述:
 */
fun main(args: Array<String>) {
    val list = listOf("张三","李四","王五","赵六","张四","李五","李六")
    val list2 = listOf("周芷若","张无忌","张五","李善长","林青霞","李寻欢")
    /*---------------------------- 找到第一个姓张的 ----------------------------*/
    val indexofFirstZhang=list.indexOfFirst {
        it.startsWith("张")
    }
    //println(indexofFirstZhang)
    /*---------------------------- 把第一个集合中所有姓张的找出来 ----------------------------*/
    val zhangList=list.filter {
        it.startsWith("张")
    }
    //println(zhangList)
    /*---------------------------- 把两个集合中所有姓张的找到并存放在同一个集合中 ----------------------------*/
//    val list3 = list.filter {
//        it.startsWith("张")
//    }
//
//    val list4 = list2.filter {
//        it.startsWith("张")
//    }
//
//    val list5 = ArrayList<String>()
//    list5.addAll(list3)
//    list5.addAll(list4)

    val listM= mutableListOf<String>()
    list.filterTo(listM){
        it.startsWith("张")
    }
    list2.filterTo(listM){
        it.startsWith("张")
    }
    println(listM)

    /*---------------------------- 把第一个集合中角标为偶数的元素找出来 ----------------------------*/
    val indexedlist=list.filterIndexed { index, s ->
        index%2==0
    }
    println(indexedlist)
}