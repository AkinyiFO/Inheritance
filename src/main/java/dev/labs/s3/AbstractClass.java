package dev.labs.s3;

// Cannot be instantiated.
// CAN be subclassed.
// MUST be declared abstract if it contains abstract methods.
abstract class AbstractClass {
    public static void main(String[] args) {
//        AbstractClass abstractClass = new AbstractClass(); // Errors out
    }

//    abstract void abstractMethod(); // abstract method MUST be implemented in NON-ABSTRACT subclasses.
}

// Can be subclassed.
class SubAbstract extends AbstractClass{

}
