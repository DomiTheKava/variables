//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val bite: Byte = 64
    println(whatType(bite))

    val short: Short = 10000
    println(whatType(short))

    val int: Int = 1
    println(whatType(int))

    val long: Long = 1920381823L
    println(whatType(long))

    val float: Float = 3.1415F
    println(whatType(float))

    val double: Double = 12.34
    println(whatType(double))

    val boolean: Boolean = true
    println(whatType(boolean))

    val char: Char = 'a'
    println(whatType(char))

    val none = "asdasd"
    println(whatType(none))
}

fun whatType(obj: Any): String {
    when (obj) {
        is Byte -> {
            return "This is a Byte"
        }
        is Short -> {
            return "This is a Short"
        }
        is Int -> {
            return "This is a Int"
        }
        is Long -> {
            return "This is a Long"
        }
        is Float -> {
            return "This is a Float"
        }
        is Double -> {
            return "This is a Double"
        }
        is Boolean -> {
            return "This is a Boolean"
        }
        is Char -> {
            return "This is a Char"
        }
        is String -> {
            return "This is a String"
        }
        else -> {
            return "I don't know what that is"
        }
    }
}

 // When --------- \/
//    var obj: Any
//    obj = 1
//
//    when (obj) {
//        1 -> {
//            println("1")
//        }
//        "string" -> {
//            println("This is a string")
//        }
//        is Double -> {
//            println("this is a double")
//        }
//        !is Double -> {
//            println("Not a double")
//        }
//        2..10 -> {
//            println("more than 2, less than 10")
//        }
//        else -> {
//            println("no matches!")
//        }
//    }
//
//var a = 1
//var b = 2
//
//    while (b > a) {
//        //start
//        a++
//    } // end
//
//    do { // runs then check while loop, good for initalizing stuff
//
//    } while ( a > b )
//
//
//
//    for (i in 1..5 step 2) {
//        println("$i")
//    }
//
//    var list = listOf("a", "b", "c")
//
//    for (singleThing in list) {
//        println("$singleThing")
//    }
