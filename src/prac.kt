fun main(){
    introduction("becky",21)
    machine(4)
    machine(10)
    machine(35)
    mult(34,17)
    var food=Human("BECCK",20,40)
    food.eat(2)
    food.speak("yes its me")




}
fun introduction(  name:String, age:Int){
    println("my name is $name and I am $age years old")

}
fun machine(age:Int){
    if(age<6){
        println("serves a glass of milk")
    }else if(age>6 && age<15){
        println("serves a bottle of fanta")
    }else{
        println("cocacola")
    }


}
//fun names(){
//    var list= arrayListOf<String>("jane","mercy","ian")
//    println(list.)


//}
fun mult(num1:Int,num2:Int){
   if(num1%2==0){
       println("true")
}else{
    println("false")

   }}
class Human(var name:String,var age:Int, var weight:Int){
    fun eat(foodWeight:Int){
        println("I am eating $weight kgs of food")
    }
    fun speak(speach:String){
        println(" yes")
    }
}
//fun comparison(num1:Int,num2:Int):Double{
//    var a=30
//    var b=40
//

