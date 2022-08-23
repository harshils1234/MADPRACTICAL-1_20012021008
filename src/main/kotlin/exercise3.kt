open class Person(firstname:String,lastname:String){
    var age:Int=-1
    init{
        println("First Name:$firstname")
        println("Last Name:$lastname")
    }
    constructor(firstname: String,lastname: String,age:Int):this(firstname,lastname){
        this.age=age
        println("Age $age")
    }
}
class Student(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String):Person(firstname,lastname,age){
    var batch:String=""
    init{
        println("Branch $branch")
        println("Class $Class")
    }
    constructor(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String,batch:String):this(firstname,lastname,age,eno,branch,Class){
        this.batch=batch
        println("Batch $batch")
        println("--------------")
    }

}
fun main(){
    var s1=Student("Rushil","Kakadiya",19,20012011151,"CE","C","AB8")
    var s2=Student("Margav","Ghoghari",20,20012011061,"CE","A","AB2")
    var s3=Student("Nikhil","Rajani",21,20012011145,"CE","B","AB8")
    var s4=Student("Harshil","Sidapara",19,20012021009,"IT","C","AB9")
    var s5=Student("Tasmay","Kevadiya",20,20012021148,"AI","A","AB1")

}