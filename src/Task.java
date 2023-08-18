import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Task {

     public void Create_Table(){
        Connection a = new Connection();
        a.Crate_conn();

        try {
            Statement statement = a.connection.createStatement();
            String query =  "Create Table Employee( empID int, empName varchar(20), empPos varchar(20), empSal int, empDep varchar(20))";
            statement.execute(query);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        a.Close_conn();
    }

    public void addEmp(Employee employee) {
        Connection a = new Connection();
        a.Crate_conn();

        try {
            Query query = new Query();
            String ope = query.insert;
            PreparedStatement preparedStatement =  a.connection.prepareStatement(ope);
            preparedStatement.setInt(1, employee.getEmpID());
            preparedStatement.setString(2, employee.getEmpName());
            preparedStatement.setString(3, employee.getEmpPos());
            preparedStatement.setInt(4, employee.getEmpSal());
            preparedStatement.setString(5, employee.getEmpDep());
            preparedStatement.execute();
            System.out.println("Congratulations, Employee Added💥💥");
        } catch (Exception e) {
            e.printStackTrace();
        }

        a.Close_conn();
    }

    public ArrayList<Employee> showEmp() {
        Connection a = new Connection();
        a.Crate_conn();

        ArrayList<Employee> arrayList = new ArrayList<>();
        try {
            Statement statement = a.connection.createStatement();
            Query query = new Query();
            String ope = query.select;
            ResultSet resultSet = statement.executeQuery(ope);
            while (resultSet.next()){
                Employee employee = new Employee(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getInt(4), resultSet.getString(5));
                arrayList.add(employee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        a.Close_conn();
        return arrayList;
    }

    public void updateEmp(String query) {
        Connection a = new Connection();
        a.Crate_conn();

        try {
            Statement statement = a.connection.createStatement();
            statement.execute(query);

            System.out.println("Congratulations, Employee Details Updated💥💥");
        } catch (Exception e) {
            e.printStackTrace();
        }

        a.Close_conn();
    }

    public void deleteEmp(int delId) {
        Connection a = new Connection();

        // Connection Created
        a.Crate_conn();

        try {
            Query query = new Query();
            String ope = query.delete;
            PreparedStatement preparedStatement =  a.connection.prepareStatement(ope);
            preparedStatement.setInt(1, delId);
            preparedStatement.execute();
            System.out.println("Congratulations, Employee Removed💥💥");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Connection Closed
        a.Close_conn();
    }

    public void searchEmp(int id) {
        Connection a = new Connection();
        a.Crate_conn();

        try {
            Query query = new Query();
            String ope = query.selectOne;
            PreparedStatement preparedStatement =  a.connection.prepareStatement(ope);
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Employee employee = new Employee(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getInt(4), resultSet.getString(5));
                employee.toString();
            }
            System.out.println("\nCongratulations, Here is the detail of searched Employee💥💥");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        a.Close_conn();
    }
}
