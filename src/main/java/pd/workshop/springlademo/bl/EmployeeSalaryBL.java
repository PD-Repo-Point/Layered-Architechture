package pd.workshop.springlademo.bl;

import pd.workshop.springlademo.bo.EmployeeSalaryBO;
import pd.workshop.springlademo.dal.EmployeeSalaryDAO;

import java.io.IOException;
import java.sql.SQLException;

public class EmployeeSalaryBL {
    EmployeeSalaryDAO employeeSalaryDAO =
            new EmployeeSalaryDAO(); // dependency
    public String getAllDetails(EmployeeSalaryBO employeeSalaryBO) throws SQLException, IOException {
        return employeeSalaryDAO.saveAll(employeeSalaryBO);

    }
}
