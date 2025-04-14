package dev.labs.s3;

public class Polymorphism {
    /*
    Main method to demonstrate polymorphism
    */
        public static void main(String[] args) {
            // JVM calls the appropriate method for the object NOT for the datatype thanks to virtual method invocation.
            Database oracleDB = new OracleDatabase("oracleConnectionString", "oracleUser", "oraclePass");
            Database mysqlDB = new MySQL1Database("mysqlConnectionString", "mysqlUser", "mysqlPass");

            // Using polymorphism: Parent class reference to call methods on child objects
            System.out.println("\nConnecting to Oracle Database:");
            oracleDB.connect("oracleConnectionString", "oracleUser", "oraclePass");
            oracleDB.executeQuery("SELECT * FROM users;");
            oracleDB.printStatus();

            System.out.println("\nConnecting to MySQL Database:");
            mysqlDB.connect("mysqlConnectionString", "mysqlUser", "mysqlPass");
            mysqlDB.executeQuery("SELECT * FROM customers;");
            mysqlDB.printStatus();
        }
    }
/*
Sub-Class 1: OracleDatabase - A specific type of Database for Oracle
*/
 class OracleDatabase extends Database {

    // Constructor calling the parent class constructor
    public OracleDatabase(String startConnectionString, String startUsername, String startPassword) {
        super(startConnectionString, startUsername, startPassword);
    }

    // Overriding the connect method to give a different behavior for Oracle
    @Override
    void connect(String newConnectionString, String newUsername, String newPassword) {
        super.connect(newConnectionString, newUsername, newPassword);
        System.out.println("Successfully connected to Oracle Database.");
    }

    // Overriding the executeQuery method to simulate Oracle-specific query execution
    @Override
    void executeQuery(String query) {
        super.executeQuery(query);
        System.out.println("Oracle specific query execution...");
    }
}

/*
Sub-Class 2: MySQLDatabase - A specific type of Database for MySQL
*/
 class MySQL1Database extends Database {

    // Constructor calling the parent class constructor
    public MySQL1Database(String startConnectionString, String startUsername, String startPassword) {
        super(startConnectionString, startUsername, startPassword);
    }

    // Overriding the connect method to give a different behavior for MySQL
    @Override
    void connect(String newConnectionString, String newUsername, String newPassword) {
        super.connect(newConnectionString, newUsername, newPassword);
        System.out.println("Successfully connected to MySQL Database.");
    }

    // Overriding the executeQuery method to simulate MySQL-specific query execution
    @Override
    void executeQuery(String query) {
        super.executeQuery(query);
        System.out.println("MySQL specific query execution...");
    }
}
