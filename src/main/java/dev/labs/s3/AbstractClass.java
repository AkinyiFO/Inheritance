package dev.labs.s3;

// CANNOT be instantiated.
// CAN be subclassed.
// MUST be declared abstract if it contains abstract methods.
abstract class AbstractClass {
    public static void main(String[] args) {
//        AbstractClass abstractClass = new AbstractClass(); // Errors out
    }

//    abstract void abstractMethod(); // abstract method MUST be implemented in NON-ABSTRACT subclasses.
    // 3. With abstract classes, you can declare fields that are not static and final
    //      and define public, and protected concrete methods.
    int test;
    final static int TEST = 2;
    protected void protectedMethod(){}
}

// Can be subclassed.
class SubAbstract extends AbstractClass{

}

// 2. abstract classes or interfaces may contain concrete or abstract methods:
// 3. In interfaces, all fields are automatically public, static, final. All methods are public by default.
interface CompareWithAbstract{
    void methodAbstract();
    default void methodDefault(){}
    static void methodStatic(){}
    private void avoidBoilerplateCode(){} // Since Java 9
}

class ComparisonTests{
    public static void main(String[] args) {
        // You cannot instantiate abstract classes or interfaces:
//        AbstractClass abstractClass = new AbstractClass();
//        CompareWithAbstract compareWithAbstract = new CompareWithAbstract();

    }
}

// 4. An abstract class does NOT need to implement abstract methods in interfaces it implements or abstract classes it extends.
abstract class ExtendsImplements extends AbstractClass implements CompareWithAbstract{}

// Why consider point 4:
// a. To get layer abstraction for clarity and clean code even in complex systems.
// b. To offer flexibility in implementation.
interface EventListener {
    void onClick();
    void onHover();
    void onDrag();
}

abstract class BaseEventListener implements EventListener {
    @Override
    public void onClick() {
        // Default click behavior
    }

    // onHover() and onDrag() left abstract
}

class CustomButton extends BaseEventListener {
    @Override
    public void onHover() {
        System.out.println("Custom hover!");
    }

    @Override
    public void onDrag() {
        System.out.println("Custom drag!");
    }
}
