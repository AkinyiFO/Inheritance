package dev.labs.s3;

/*
Possible implementation of a Database
 */
class Database implements SQLDefault{

    String connectionString = "";
    String username = "";
    String inheritedField = "Inherited field";
    String hiddenName = "To be hidden in Oracle2";
    String sameNameDifferentType = "To be hidden as a different datatype in Oracle2";

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password = "Password Accessed!";

    public Database(){}

    public Database(String startConnectionString, String startUsername, String startPassword) {
        connectionString = startConnectionString;
        username = startUsername;
        password = startPassword;
    }

    SQLDefault returnsCovariantType(SQLDefault sql){
        return sql;
    }

    void useAsIs(){
        System.out.println("Accessed from Database directly");
    }

    void connect(String newConnectionString, String newUsername, String newPassword) {
        connectionString = newConnectionString;
        username = newUsername;
        password = newPassword;
        System.out.println("Connected to the database with connection string: " + connectionString);
    }

    void disconnect() {
        connectionString = "";
        username = "";
        password = "";
        System.out.println("Disconnected from the database.");
    }

    void executeQuery(String query) {
        if (!connectionString.isEmpty()) {
            System.out.println("Executing query: " + query);
            // Logic to execute query
        } else {
            System.out.println("No database connection. Please connect first.");
        }
    }

    void printStatus() {
        System.out.println("Connection String: " + connectionString +
                " Username: " + username +
                " Password: " + password);
    }

    static void testHiding(){
        System.out.println("Static method to be hidden in Oracle2");
    }
}
