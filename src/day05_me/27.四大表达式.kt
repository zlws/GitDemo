package day05_me

/**
 * @ 文件名:   `27.四大表达式`
 * @ 创建者:   zl
 * @ 时间:    2018/8/11 21:57
 * @ 描述:
 */
fun main(args: Array<String>) {
    val list:MutableList<String>?= mutableListOf<String>("林青霞","张曼玉","王祖贤")
    /********************apply********************/
/*    list?.apply{
        add("林志玲")
        indexOf("朱茵")
        add("朱茵")
    }?.add("王祖贤")
    println(list)*/
    /********************let********************/
/*    var result=list.let{
        it?.add("朱茵")
        it?.add("王祖贤")
    }*/
    /********************with********************/
/*   with(list!!){
     add("张三")
    }
    println(list)*/
    /********************run********************/
    list.run {
        this?.add("王五")
    }
}