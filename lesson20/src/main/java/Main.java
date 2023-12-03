import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        String uri = "jdbc:mysql://localhost:3306/mysql";
        String name = "root";
        String password = "root";

        Driver driver = new com.mysql.cj.jdbc.Driver();
        DriverManager.registerDriver(driver);

        try(Connection connection = DriverManager.getConnection(uri, name, password)) {
            //table create
            Statement statement = connection.createStatement();
            statement.execute("create table if not exists users (id integer primary key auto_increment," +
                    "name varchar(200))");


            //create user
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users (name) VALUES ('Admin')");
            preparedStatement.executeUpdate();

            //read user
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id") + resultSet.getString("name"));
            }

            //update user
            PreparedStatement preparedStatementUpd = connection.prepareStatement("UPDATE users SET name = 'AdminNew' WHERE id = 1");
            preparedStatementUpd.executeUpdate();

            //delete user
            PreparedStatement preparedStatementDel = connection.prepareStatement("DELETE FROM users WHERE id = 1");
            preparedStatementDel.executeUpdate();

//            Scanner switchsc = new Scanner(System.in);
//            System.out.println("""
//                    1. CREATE
//                    2. READ
//                    3. UPDATE
//                    4. DELETE
//                    0. EXIT
//                    """);
//            int input = switchsc.nextInt();
//
//            switch (input){
//                case 1:
//                    PreparedStatement preparedStatement1 = connection.prepareStatement("INSERT INTO users (id, name) VALUES (?, ?)");
//                    preparedStatement1.setInt(2, 2);
//                    preparedStatement1.setString(2, "User");
//                    preparedStatement1.executeUpdate();
//
//            }


        }

    }
}
