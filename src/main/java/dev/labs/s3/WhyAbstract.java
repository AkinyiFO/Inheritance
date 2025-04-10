package dev.labs.s3;

public class WhyAbstract {
}

abstract class DatabaseAbstract {
    String host;
    int port;

    void connect() {
        System.out.println("Connecting to " + host + " on port " + port + "...");
        // Common logic (e.g., open socket, init resources)
    }

    void disconnect() {
        System.out.println("Disconnecting from " + host + "...");
        // Common logic
    }

    // Abstract methods - must be implemented by subclasses
    abstract void executeQuery(String sql);
    abstract void configure();
}

class MySQLDatabase extends DatabaseAbstract {

    @Override
    void executeQuery(String sql) {
        System.out.println("Executing MySQL query: " + sql);
        // MySQL-specific execution logic
    }

    @Override
    void configure() {
        this.host = "mysql.example.com";
        this.port = 3306;
        System.out.println("Configured MySQL database.");
    }
}

class PostgreSQLDatabase extends DatabaseAbstract {

    @Override
    void executeQuery(String sql) {
        System.out.println("Executing PostgreSQL query: " + sql);
        // PostgreSQL-specific execution logic
    }

    @Override
    void configure() {
        this.host = "postgres.example.com";
        this.port = 5432;
        System.out.println("Configured PostgreSQL database.");
    }
}

