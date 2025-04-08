package dev.labs.s3;

class Oracle2 extends Database {

    // TODO 3: You can declare new fields in the subclass that are not in the superclass.
    private String databaseType;

    // TODO 2. You can declare a field in the subclass with the same name as the one in the superclass, thus hiding it
    //          (not recommended as it makes code difficult to read).
    String hiddenName = "Oracle2 hid this field";
    // A field that has the same name as a field in the superclass hides the superclass's field, EVEN IF their types are different.
    int sameNameDifferentType = 0;

    // TODO 8. You can write a subclass constructor that invokes the constructor of the superclass, either implicitly
    //          or explicitly by using the keyword super.
    //          javac automatically calls a no-argument constructor in the superclass
    public Oracle2(String startConnectionString, String startUsername, String startPassword, String databaseType) {
        // Using the superclass constructor with super() syntax or super(parameter list) syntax to initialize inherited fields
        super(startConnectionString, startUsername, startPassword);
        this.databaseType = databaseType;
    }

    // TODO 5. You can write a new instance method in the subclass that has the same signature as the one in the superclass, thus overriding it.
    //          E.g. Overriding the connect method to add extra functionality.
    //          // Use the @Override annotation to instruct the compiler of the intention to override a method in the superclass,
    //          so it errors out if such a method does not exist in any of the superclasses.
    //          More on Annotations later.
    @Override
    void connect(String newConnectionString, String newUsername, String newPassword) {
        // Calling the superclass's connect method
        super.connect(newConnectionString, newUsername, newPassword);
        System.out.println("Connection to " + databaseType + " database established.");
    }

    // TODO 5a. Covariant Return Type: Override to return a subtype of the type returned by the overridden method
    @Override
    SQLDefault returnsCovariantType(SQLDefault sql){
        return new Database(); // Subtype of SQLDefault
    }

    // TODO 6. You can write a new static method in the subclass that has the same signature as the one in the superclass, thus hiding it.
    static void testHiding(){
        System.out.println("Static method hidden by Oracle2");
    }

    // TODO 7. You can declare new methods in the subclass that are not in the superclass.
    void backupDatabase() {
        if (!connectionString.isEmpty()) {
            System.out.println("Backing up the " + databaseType + " database...");
            // Logic for backup
        } else {
            System.out.println("No database connection. Cannot perform backup.");
        }
    }

    // Overriding printStatus to show additional information
    @Override
    void printStatus() {
        super.printStatus();  // Calling the superclass printStatus
        System.out.println("Database Type: " + databaseType);  // Adding new field info
    }

    // Getter and Setter for the new field databaseType
    public String getDatabaseType() {
        return databaseType;
    }

    public void setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
    }
}
