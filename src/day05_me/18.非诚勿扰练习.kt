package day05_me

/**
 * @ 文件名:   `18.非诚勿扰练习`
 * @ 创建者:   zl
 * @ 时间:    2018/8/11 20:01
 * @ 描述:
 */
data class Girl(val name:String,val age:Int,val height:Int,val location:String)
val list = listOf(Girl("依儿", 18, 168, "山东"),
        Girl("笑笑", 19, 175, "河南"),
        Girl("小百合", 17, 155, "福建"),
        Girl("michel", 22, 148, "广东"),
        Girl("猫咪", 28, 159, "广西"),
        Girl("玲儿", 23, 169, "广东"),
        Girl("环环", 25, 172, "安徽"),
        Girl("胖嘟嘟", 32, 180, "河北"),
        Girl("乔乔", 35, 180, "广东"),
        Girl("小可爱", 27, 150, "江西"),
        Girl("一生有你", 22, 163, "山东"),
        Girl("敏儿", 28, 155, "黑龙江"),
        Girl("月儿", 25, 178, "吉林"),
        Girl("花儿", 21, 183, "山东"),
        Girl("S小糖", 49, 190, "新疆"),
        Girl("悦悦", 19, 160, "广西"),
        Girl("小可爱", 29, 158, "广东"),
        Girl("紫琪", 49, 149, "新疆"),
        Girl("糖心", 26, 165, "甘肃"),
        Girl("棒棒糖", 23, 172, "浙江"),
        Girl("猪猪侠", 18, 173, "山东"),
        Girl("喵喵", 27, 164, "河南"),
        Girl("安琦", 19, 159, "河北"),
        Girl("叶子", 20, 160, "广东"))

fun main(args: Array<String>) {
    /*---------------------------- 俺是河南里,俺只找河南的妹子 ----------------------------*/
    val heNanList=list.filter{
        it.location=="河南"
    }
    //println(heNanList)
    /*---------------------------- 我只喜欢30岁以下的女生 ----------------------------*/
    val thirtyList=list.filter{
        it.age<30
    }
    //println(thirtyList)
    /*---------------------------- 我喜欢广东的,身高162以上,25岁以下的妹子 ----------------------------*/
    val gdList=list.filter {
       it.location=="广东"&&it.height>162&&it.age<25
    }
    //println(gdList)
    /*---------------------------- 我喜欢广东的,身高160以上,35岁以上的妹子 ----------------------------*/
    val gdDmz=list.filter{
        it.location=="广东"&&it.height>160&&it.age>35
    }
    //println(gdDmz)
}
