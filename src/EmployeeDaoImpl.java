public class EmployeeDaoImpl implements EmployeeDao{

    @Override
    public void create(String client,EmployeeDo obj) throws Exception{
        //Creates a new row
        System.out.println("Created new row in the employee table");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception{
        //deletes a row
        System.out.println("Deleted row with employeeID: " + employeeId);
    }

    @Override
    public EmployeeDo get(String client, int EmployeeId) throws Exception{
        //fetches a row
        System.out.println("Fetching data from the DB");
        return new EmployeeDo();
        }
    }
