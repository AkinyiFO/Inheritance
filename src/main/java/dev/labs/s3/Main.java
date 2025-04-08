package dev.labs.s3;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the subclass
        Oracle2 oracle2 = new Oracle2("jdbc:mysql://localhost:3306", "admin", "adminPass", "MySQL");

        // TODO 1. The inherited fields can be used directly, just like any other fields.
        System.out.println(oracle2.inheritedField);

        // Calling the hiding field
        System.out.println(oracle2.hiddenName);
        System.out.println(oracle2.sameNameDifferentType);

        // TODO 4. The inherited methods can be used directly as they are.
        oracle2.disconnect();

        // Calling the hiding static method
        Oracle2.testHiding();

        // Calling the overridden method
        oracle2.printStatus();

        // Calling the new method in AdvancedDatabase
        oracle2.backupDatabase();

        // Casting
        // 1. Implicit casting
        Object db = new Oracle2("jdbc:mysql://localhost:3306", "admin", "adminPass", "MySQL");
        Database db1 = new Oracle2("jdbc:mysql://localhost:3306", "admin", "adminPass", "MySQL");

        // 2. Explicit casting
        Oracle2 oracle = (Oracle2) db; // The compiler does not know Object to be Oracle2

        // Logical test to avoid a runtime error
        if (db instanceof Oracle2) {
            Oracle2 myBike = (Oracle2) db;
        }
    }
}