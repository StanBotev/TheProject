package blog.services;

import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.Objects;

@Service
public class UserServiceStubImpl implements UserService {

    public boolean authenticate(String username, String password) throws SQLException {
        String query;
        String dbUsername, dbPassword;
        boolean login = false;

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/theprojectdb");
            Statement stmt = (Statement) con.createStatement();
            query = "SELECT username, password FROM users;";
            stmt.executeQuery(query);
            ResultSet rs = stmt.getResultSet();

            while(rs.next()){
                dbUsername = rs.getString("username");
                dbPassword = rs.getString("password");

                if(dbUsername.equals(username) && dbPassword.equals(password)){
                    System.out.println("OK");
                    login = true;
                }
                System.out.println(username + password + " " + dbUsername + dbPassword);
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return login;
    }
}
