import java.sql.*;

public class SQLInjectionExample {
  public static void main(String[] args) throws SQLException {
    String userInput = args[1];
    String userInput2 = args[2];

    String query = "SELECT * FROM users WHERE username = '" + userInput + "' AND password = '" + userInput2 + "'";
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery(query);

    while (rs.next()) {
      String username = rs.getString("username");
      String password = rs.getString("password");

      System.out.println("Username: " + username);
      System.out.println("Password: " + password);
    }
  }
}
