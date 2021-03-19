import java.util.*

fun main() {
   stringArray("Sarah","Sindeti","Nashivai","LoveLace")

    findCity()

    manipulateNumbers()


    println(Arrays.toString(triNames("Sarah","Sindet","Nashivai")))
}

fun stringArray(str1:String,str2:String,str3:String,str4:String){
//       Creating an array with placeholders as the assigned parameters in the function to create room for alteration

    var stringArray= arrayOf("$str1,$str2,$str3,$str4")
    println(Arrays.toString(stringArray))

}

fun findCity(){
    var cities= arrayOf("harare","mumbai","dodoma","jakarta")
//        Looping through the cities array to access each element

    cities.forEach { city ->
        println(city.capitalize())
    }

}

fun manipulateNumbers(){
    var numbers= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)

//         Finding the sum of the second and fifth elements
    println(numbers.get(1)+numbers.get(4))

//         getting the index of 158 "element"
    println(numbers.indexOf(158))

//      Looping through the numbers and sorting out them
    for(number in numbers.sorted()){
        println(number)
    }
}

fun triNames(name1:String,name2:String,name3:String):Array<String>{
//   Creating an array to hold the parameters of the above function
    var triNamesArray= arrayOf("$name1,$name2,$name3")
    return triNamesArray



}