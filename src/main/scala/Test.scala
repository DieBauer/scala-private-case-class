case class MyCaseClass private(a: Int)
class MyClass private(a: Int)


// fails as expected with
// constructor MyCaseClass in class MyCaseClass cannot be accessed in object T

// object T {
//     val mcc = new MyCaseClass(1)
//     val mc = new MyClass(1)
// }