```groovy
class MyClass {
    def myMethod(String arg) {
        return "Argument: "+ (arg ?: "")
    }
}

MyClass myObject = new MyClass()
println myObject.myMethod(null)
println myObject.myMethod("")
println myObject.myMethod("Hello")

//Alternative Solution Using Safe Navigation
class MyClass2 {
    def myMethod(String arg) {
        return "Argument: "+ arg?.toString() ?: "Null or Empty Argument"
    }
}

MyClass2 myObject2 = new MyClass2()
println myObject2.myMethod(null)
println myObject2.myMethod("")
println myObject2.myMethod("Hello")
```