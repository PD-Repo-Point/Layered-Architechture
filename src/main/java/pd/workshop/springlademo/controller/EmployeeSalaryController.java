package pd.workshop.springlademo.controller;

import pd.workshop.springlademo.bl.EmployeeSalaryBL;
import pd.workshop.springlademo.bo.EmployeeSalaryBO;

import java.io.IOException;
import java.sql.SQLException;
/*
* WebPages/WebPortal --->
*   Controller ----> XController, YController, ZController
*       Business Logic -----> XBL, YBL, ZBL
*           Data Access Layer ---> XDAO, YDAO, ZDAO
*
* ---> Business Object --> XBO, YBO, ZBO
* */

public class EmployeeSalaryController {
    public static void main(String args[]) throws SQLException, IOException {
        // -- Save the Employee Salary Details --
        EmployeeSalaryBO employeeSalaryBO =
                new EmployeeSalaryBO(
                        3008,
                        "DevOpsEngineer",
                        7000
                );

        EmployeeSalaryBL employeeSalaryBL = new EmployeeSalaryBL();

        System.out.println(employeeSalaryBL.getAllDetails(employeeSalaryBO));




    }
}
