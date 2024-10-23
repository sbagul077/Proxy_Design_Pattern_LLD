public interface EmployeeDao {
    public void create(String client, EmployeeDo obj) throws Exception; //creates an object
    public void delete(String client, int employeeId) throws Exception; //takes the ID and deletes that row
    public EmployeeDo get(String client, int employeeId) throws Exception; // fetches the id from DB and returns it
}
