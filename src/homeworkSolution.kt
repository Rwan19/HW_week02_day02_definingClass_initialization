fun main(){
    val mazda=Car("mazda",2019)


    val lexus=Car("ma","chgh",2000)//

    lexus.accelaration(67,34)
    mazda.stop(false,60)
}


class Car ( val name:String , val manufacturingYear:Int) {
    var color:String=""


    constructor(nName: String, nColor: String, nManufacturingYear: Int) : this(name = nName,manufacturingYear = nManufacturingYear) {
        color=nColor


        print("$nName,$nColor,$nManufacturingYear")
    }




    init {
        println("\n welcom ")
    }


    fun accelaration(speed:Int,time:Int) {
        val acc = speed * time
        println("\n accelaration:$acc")
    }


    fun stop (highWay:Boolean=true,speed: Int=90) {

        if (highWay == true && speed >= 90) {
            println("you can't stop the car you are in the highway")
        } else {
            println(" you can slow down the car until it stops")

        }
    }
}





