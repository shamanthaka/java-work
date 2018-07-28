package com.shamanthaka.jdbc;


import com.shamanthaka.model.iface.Employee;

import java.sql.*;

public class EmployeeTest {

    public static Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/vinny_db";
            String userName = "root";
            String password = "root";

            connection = DriverManager.getConnection(url,userName,password);

        }catch(ClassNotFoundException cnfe){
            System.out.println(cnfe.getMessage());
        }catch (SQLException sql){
            System.out.println(sql.getMessage());
        }

        return connection;

    }

    public static void addEmployee(String firstName, String lastName, String emailId, double salary, String empNo){

        String insertEmp = "INSERT INTO EMPLOYEE (FIRST_NAME, LAST_NAME, EMAIL, SALARY, EMP_NO )" +
                "VALUES( " + "'" + firstName +"'" +", " + "'"+ lastName +"'"+ ", "
                + "'" + emailId +"'"+ ", " + salary + ", " + "'"+ empNo+"'" + ")";

        try {
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();

            stmt.execute(insertEmp);
            //conn.commit();

        }catch (SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }

    public static void showEmployee(){
        try{
           Connection conn = getConnection();
           Statement stmt = conn.createStatement();
           String executeQuery = "select * from employee";
           ResultSet resultSet = stmt.executeQuery(executeQuery);

           while(resultSet.next()){
               int id = resultSet.getInt("id");
               String firstName = resultSet.getString("FIRST_NAME");
               String lastName = resultSet.getString("LAST_NAME");
               String emailId = resultSet.getString("EMAIL");
               String empNo = resultSet.getString("EMP_NO");
               double salary = resultSet.getDouble("SALARY");

               System.out.println("Employee info " + id + " " + firstName + "  "
                       + lastName + "  " + emailId + " " + empNo + "  " + salary);


           }
        }catch (SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }

    public static void deleteEmployee(int id){
        try{

            Connection conn = getConnection();
            //String query = "delete from Employee where id = ?";
            String query = "delete from Employee where id = " + id;
            Statement stmt = conn.createStatement();
            boolean delete = stmt.execute(query);
            if(delete){
                System.out.println("Record is deleted it's id is " + id);
            }

        }catch (SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }

    public static void updateEmployee(String email, double salary, String empNo, int id){
        try{

            Connection con = getConnection();
            Statement stmt = con.createStatement();
            String query = "update employee set email = ?,salary = ?, emp_no =? where id = ?";

            PreparedStatement preparedStatement = con.prepareStatement(query);

            preparedStatement.setString(1,email);
            preparedStatement.setDouble(2, salary);
            preparedStatement.setString(3, empNo);
            preparedStatement.setInt(4, id);

            boolean update = preparedStatement.execute();
            if(update){
                System.out.println("Record is update...");
            }

        }catch (SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }


    public static void main(String[] args){
        //EmployeeTest.addEmployee("Shamanthaka","Veerareddy","vinny@vinny.com",1234999.55,"100");
        //EmployeeTest.deleteEmployee(2);
        EmployeeTest.showEmployee();
        EmployeeTest.updateEmployee("shamanthaka.veerareddy@gmail.com",9898988.8d, "121",1);
        EmployeeTest.showEmployee();

        System.out.println("Employee record is inserted...");
    }
/*

INSERT INTO employee(FIRST_NAME, LAST_NAME, EMAIL,SALARY, EMP_NO)
					VALUES('Anitha','Veerareddy','anitha.veerareddy@gmail.com',23232.23, '123')
 */


}
