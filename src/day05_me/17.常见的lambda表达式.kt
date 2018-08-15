package day05_me

/**
 * @ 文件名:   `17.常见的lambda表达式`
 * @ 创建者:   zl
 * @ 时间:    2018/8/11 19:29
 * @ 描述:
 */
fun main(args: Array<String>) {
    val str="qwertyuiop"
/*    str.forEach {
        println(it)
    }*/
    /*str.forEach{ele->
        println(ele)
    }*/
    //str.forEach(::println)
    /********************indexof********************/
    var arr= arrayOf("张三","李四","王五","赵六")
/*    var index=arr.indexOfFirst { m->
        m=="张三"
    }*/
/*    var index=arr.indexOfFirst({m->
        m=="张三"
    })*/
    var index=arr.indexOfFirst {
        it=="张三"
    }
    //println(index)
    /********************List********************/
    val list=List<String>(10){
        if(it==0){
            "第一个"
        }else{
            "其他"
        }
    }
    println(list)
}