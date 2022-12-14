fun main(){
    fun add(vararg x:Int){
        var add:Int = x[0]
        for(i in x[1]..x.size){
            add += i
        }
        var y:String = ""
        for(i in x){
            y += "$i,"
        }
        println("Addition of $y is $add")
    }

    fun sub(vararg x:Int){
        var sub:Int = x[0]
        for(i in x[1]..x.size-1){
            sub -= i
        }
        var y:String = ""
        for(i in x){
            y += "$i,"
        }
        println("Subtraction of $y is $sub")
    }

    fun mul(vararg x:Int){
        var mul:Int = x[0]
        for(i in x[1]..x.size){
            mul *= i
        }
        var y:String = ""
        for(i in x){
            y += "$i,"
        }
        println("Multiplication of $y is $mul")
    }

    fun div(vararg x:Int) {
        var div: Int = x[0]
        for (i in x[1]..x.size) {
            div /= i
        }
        var y: String = ""
        for (i in x) {
            y += "$i,"
        }
        println("Division of $y is $div")
    }

    add(1,2)
    sub(20,1)
    mul(1,2)
    div(20,2)
}