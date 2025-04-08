package dev.labs.s3;

public class SuperKeyword {
    public class Main {
        public static void main(String[] args) {
            SubClass sub = new SubClass();  // This works because SuperClass has a default constructor.
            SubClassParameterized subPar = new SubClassParameterized();
        }
    }

}

class SuperClass {
    // No explicit constructor, so it uses the default constructor from Object.
}

class SubClass extends SuperClass {
    // No explicit constructor, so Java will implicitly insert a call to super().
}

class SuperClassParameterized {
    // Constructor with parameters
    public SuperClassParameterized(String message) {
        System.out.println("SuperClass Constructor: " + message);
    }
}

// This will result in a compile-time error because the super class does not have a no-argument constructor.
class SubClassParameterized extends SuperClassParameterized {
    // No constructor explicitly, so Java will try to insert a super() call.
}

class JustObjectSuperclass{

}

/*
Beware of constructor chaining if there is a long line of class descent.
 */


