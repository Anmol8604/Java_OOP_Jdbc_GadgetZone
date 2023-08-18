public class Employee {

    private int empID;
    private String empName;
    private String empPos;
    private int empSal;
    private String empDep;

    public Employee(int empID, String empName, String empPos, int empSal, String empDep) {
        this.empID = empID;
        this.empName = empName;
        this.empPos = empPos;
        this.empSal = empSal;
        this.empDep = empDep;
    }

    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpPos() {
        return empPos;
    }

    public int getEmpSal() {
        return empSal;
    }

    public String getEmpDep() {
        return empDep;
    }


    public String toString() {
        System.out.println("Employee{" +
                "empID=" + empID +
                ", empName='" + empName + '\'' +
                ", empPos='" + empPos + '\'' +
                ", empSal=" + empSal +
                ", empDep='" + empDep + '\'' +
                '}');
        return null;
    }
}
