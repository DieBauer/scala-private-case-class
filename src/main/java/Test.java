public class Test {
    // Does not fail!
    final MyCaseClass myCaseClass = new MyCaseClass(1);

    // fails as expected with src/main/java/Test.java:4:1: MyClass
//(int) has private access in MyClass
    final MyClass myClass = new MyClass(1);
}
