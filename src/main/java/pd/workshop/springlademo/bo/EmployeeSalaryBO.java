package pd.workshop.springlademo.bo;

public class EmployeeSalaryBO {
    private int empID;
    private String jobTitle;
    private int salary;

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public EmployeeSalaryBO(int empID, String jobTitle, int salary) {
        this.empID = empID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeSalaryBO{}";
    }
}
