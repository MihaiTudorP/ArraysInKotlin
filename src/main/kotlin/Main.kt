fun main(args: Array<String>) {
    val names = arrayOf("Michael", "Steve", "George")

    println("First element: ${names[0]}") // if index is outside bounds, exception will be thrown

    names[0] = "Alex"
    println("First element: ${names[0]}") // if index is outside bounds, exception will be thrown

    println("Array size: ${names.size}") // = greatest index + 1

    val numbers = arrayOf(1, 4, 5 , 18, 19, "Text 1", 'c') // can use multiple primitives, string & other types

    for (name in names){
        println(name)
    }

    for (element in numbers){
        println(element)
        if (element is Int){
            println("Integer element detected")
        }
    }
}