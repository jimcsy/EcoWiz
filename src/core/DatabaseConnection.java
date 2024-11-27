package core;

import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class DatabaseConnection extends General{
    // Database credentials
    private static String databaseName = "ecowiz"; //do not change
    private static String dbUrl = "jdbc:mysql://localhost:3306/";  // change if needed --> jdbc:mysql://"HOST CHANGE":"PORT CHANGE"/;
    private static String dbUser = "root";  // change
    private static String dbPassword = "genesis";  // change
    private static String sqlFilePath = "C:\\Users\\Genesis Jim\\Desktop\\OOP_Finals - Copy (2)\\ecowizDatabase.sql"; // change

    public static Scanner sc = new Scanner(System.in);

    public static Connection getConnection() throws SQLException {
        return attemptConn(dbUrl + databaseName, dbUser, dbPassword);
    }

    private static Connection attemptConn(String url, String user, String password) throws SQLException {
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Error connecting to the database.\n");
            return connectionDetails();
        }
    }

    private static Connection connectionDetails() throws SQLException {
        System.out.print("Enter MySQL Host (e.g., localhost):\t ");
        String host = sc.nextLine();

        System.out.print("Enter MySQL Port (e.g., 3306):\t\t ");
        String port = sc.nextLine();

        System.out.print("Enter MySQL Username (e.g., root):\t ");
        String username = sc.nextLine();
        
        System.out.print("Enter MySQL Password:\t\t\t ");
        String password = sc.nextLine();

        dbUrl = "jdbc:mysql://" + host + ":" + port + "/";
        dbUser = username;
        dbPassword = password;

        createDatabase(databaseName);

        return attemptConn(dbUrl + databaseName, dbUser, dbPassword);
    }

    public static boolean createDatabase(String dbName) {
        try (Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
             Statement stmt = conn.createStatement()) {

            if (!isDatabaseExist(stmt, dbName)) {
                stmt.executeUpdate("CREATE DATABASE " + dbName);
                System.out.println("Database '" + dbName + "' created successfully.");

                importSqlFile(sqlFilePath);
                System.out.print("\nTo run this program smoothly, ensure the variable values in the DbConnection \n" +
                        "class match your SQL credentials to avoid repeated logins. \n\nPress [enter]...");
                sc.nextLine();
                return true;
            } else {
                System.out.println("Database '" + dbName + "' already exists.");
                return true;
            }
        } catch (SQLException e) {
            System.err.println("Error while trying to create database or connect: " + e.getMessage());
            return databaseCreation(dbName);
        }
    }

    private static boolean databaseCreation(String dbName) {
        try {
            connectionDetails(); 
            return createDatabase(dbName);
        } catch (SQLException ex) {
            System.err.println("Failed to reconnect: " + ex.getMessage());
        }
        return false;
    }

    private static boolean isDatabaseExist(Statement stmt, String dbName) throws SQLException {
        ResultSet resultSet = stmt.executeQuery("SHOW DATABASES LIKE '" + dbName + "'");
        return resultSet.next();
    }

    public static void importSqlFile(String sqlFilePath) {
        try (Connection conn = getConnection();
             BufferedReader reader = new BufferedReader(new FileReader(sqlFilePath));
             Statement stmt = conn.createStatement()) {

            String line;
            StringBuilder query = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty() || line.startsWith("--")) continue;
                query.append(line).append("\n");

                if (line.trim().endsWith(";")) {
                    try {
                        stmt.executeUpdate(query.toString());
                        query.setLength(0);
                    } catch (SQLException e) {
                        System.err.println("Error executing SQL: " + query);
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("Database import completed successfully!");
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }
}