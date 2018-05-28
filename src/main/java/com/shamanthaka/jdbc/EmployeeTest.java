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


    public static void main(String[] args){
        //EmployeeTest.addEmployee("Shamanthaka","Veerareddy","vinny@vinny.com",1234999.55,"100");
        EmployeeTest.showEmployee();

        System.out.println("Employee record is inserted...");
    }



}
