package dev.labs.s3;

// Cannot be subclassed.
// Example: Immutable class like String class.
final public class FinalClass {
    final void doesNotSupportOverriding(){} // Does not need the final keyword, since the class cannot be subclassed, so the methods cannot be overridden.
}

// Error when attempting to subclass FinalClass
//class SubFinal extends FinalClass{
//
//}

class FinalMethods{

    FinalMethods(){
       doesNotSupportOverriding(); // Methods called from constructors should be declared final to avoid undesirable results that may occur when a subclass overrides the method.
    }
    // Cannot be overridden by subclasses to maintain its implementation for consistency.
    // More examples in java.lang.Object class
    final void doesNotSupportOverriding(){}

}