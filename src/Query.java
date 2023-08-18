public class Query {
    String insert = "INSERT INTO Employee VALUES(?, ?, ?, ?, ?);";
    String updateName = "UPDATE INTO Employee WHERE empID = ? SET empName = ?;";
    String updateSalary = "UPDATE INTO Employee WHERE empID = ? SET empSal = ?;";
    String updatePosition = "UPDATE INTO Employee WHERE empID = ? SET empPos = ?;";
    String updateDepartment = "UPDATE INTO Employee WHERE empID = ? SET empDep = ?;";
    String select = "SELECT * FROM Employee;";
    String selectOne = "SELECT * FROM Employee WHERE empID = ?;";
    String delete = "DELETE FROM Employee WHERE empID = ?;";


    public String update(int id, Employee employee) {
        return "UPDATE Employee SET empName = \"" + employee.getEmpName() + "\", empPos = \"" + employee.getEmpPos() + "\", empSal = \"" + employee.getEmpSal() + "\", empDep = \"" + employee.getEmpDep() + "\" WHERE empID = " + id +  ";";
    }
}
