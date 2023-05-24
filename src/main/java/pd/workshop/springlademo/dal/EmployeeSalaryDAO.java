package pd.workshop.springlademo.dal;

import pd.workshop.springlademo.bo.EmployeeSalaryBO;
import pd.workshop.springlademo.utility.DatabaseConnectivity;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

import static pd.workshop.springlademo.utility.DatabaseConnectivity.closeConnection;

public class EmployeeSalaryDAO {
    static Properties prop = new Properties();
    static Connection connection = null;
    static PreparedStatement preparedStatement = null;

    private String INSERT_QUERY =
            "INSERT INTO Employee.EmployeeSalary VALUES(?,?,?)";
            /*"INSERT INTO EmployeeSalary (EmployeeID, JobTitle, Salary) " +
            "VALUES(?,?,?)";*/


    public String saveAll(EmployeeSalaryBO employeeSalaryBO) throws SQLException, IOException {

        prop.load(EmployeeSalaryDAO.class.getClassLoader().getResourceAsStream("application.properties"));
        connection = DatabaseConnectivity.getConnection(
                prop.getProperty("db_url"),
                prop.getProperty("db_user"),
                prop.getProperty("db_pwd"));

        // Object Relation Mapping

         preparedStatement = connection.prepareStatement(INSERT_QUERY);
         preparedStatement.setInt(1, employeeSalaryBO.getEmpID());
         preparedStatement.setString(2, employeeSalaryBO.getJobTitle());
         preparedStatement.setInt(3, employeeSalaryBO.getSalary());


         int num = preparedStatement.executeUpdate();

        System.out.println("No. of rows affected : "+num);
        if(preparedStatement!=null)
            preparedStatement.close();

        closeConnection(connection);

        if(num>=1)
            return "Data entered Successfully ... ";
        else
            return "No Data Entered";
    }
}
