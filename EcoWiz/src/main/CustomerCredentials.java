package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement; 

public class CustomerCredentials extends General{
    private String username, password;
    private int customerId, ecoPoints;

    //getters
    String getUsername(){
        return username;
    }

    String getPassword(){
        return password;
    }

    int getCustomerId(){
        return customerId;
    }
    
    int getEcoPoints(){
        return ecoPoints;
    }

    //saving new customer
    boolean saveCredentials(String newUsername, String newPassword) {
        boolean isSuccessful = false;
        String sql = "INSERT INTO customers (user_Name, user_Password, eco_points) VALUES (?, ?, ?)";
    
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
    
            // Set the parameters for the insert statement
            pstmt.setString(1, newUsername);
            pstmt.setString(2, newPassword);
            pstmt.setInt(3, 0);  // default eco_points value
    
            this.username = newUsername;
            this.password = newPassword;
            this.ecoPoints = 0;
    
            // Execute the insert query
            int rowsAffected = pstmt.executeUpdate();
            
            if (rowsAffected > 0) {
                // Now retrieve the last inserted ID using SELECT LAST_INSERT_ID()
                try (Statement stmt = conn.createStatement();
                     ResultSet rs = stmt.executeQuery("SELECT LAST_INSERT_ID()")) {
                    if (rs.next()) {
                        this.customerId = rs.getInt(1);  // Get the last inserted ID
                        System.out.println("\nCustomer credentials saved successfully!");
                        System.out.println("Customer ID:  " + this.customerId);
                        System.out.print("\nPress [enter]...");
                        scan.nextLine();
    
                        isSuccessful = true;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.print("\nPress [enter]...");
            scan.nextLine();
        }
        return isSuccessful;
    }
    

    //credentials of existing customer
    boolean customerLogin(int checkId, String checkPassword) {
        boolean isSuccessful = false;
        String checkSql = "SELECT * FROM customers WHERE customer_id = ?";
    
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(checkSql)) {
    
            pstmt.setInt(1, checkId);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    this.password = rs.getString("user_password");
        
                    // Compare passwords
                    if (checkPassword.equals(password)) {
                        System.out.print("\nLogin successful!");
                        this.customerId = checkId;
                        this.username = rs.getString("user_name");
                        this.ecoPoints = rs.getInt("eco_points");
                        isSuccessful = true;
                    } else {
                        System.out.print("\nPassword doesn't match!");
                        delay(1500);
                    }
                } else {
                    System.out.print("\nNo customer found with this ID.");
                    delay(1500);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.print("\nPress [enter]...");
            scan.nextLine();
        }
        return isSuccessful;
    }

    //update customer eco_score
    public boolean updateEcoScore(int updateEcoScore) {
        boolean isSuccessful = false;
        String checkSql = "UPDATE customers SET eco_points = ? WHERE customer_id = ?";
    
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(checkSql)) {
            
            this.ecoPoints = ecoPoints + updateEcoScore;
            pstmt.setInt(1, ecoPoints);
            pstmt.setInt(2, customerId);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                isSuccessful = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.print("\nPress [enter]...");
            scan.nextLine();
        }
        return isSuccessful;
    }

}