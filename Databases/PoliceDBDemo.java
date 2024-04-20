import java.sql.*;

public class PoliceDBDemo{
   public static void main(String[] args){
      try{
         Class.forName("com.mysql.cj.jdbc.Driver");

         Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/policeDataBase2", "root", "");

         Statement statement = connection.createStatement();

         ResultSet resultSet = statement.executeQuery("select * from caller table");

         while(resultSet.next()){
            System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
         }

         connection.close();
      }
      catch(Exception e){
         e.printStackTrace();
      }
   }
}