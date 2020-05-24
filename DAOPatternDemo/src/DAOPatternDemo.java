import com.priyanka.implementation.EmployeeDAOImplementation;
import com.priyanka.models.*;
public class DAOPatternDemo {

	public static void main(String[] args) {
		
		EmployeeDAOImplementation obj = new EmployeeDAOImplementation();
		for(Employee emp : obj.getAllEmployees()) {
			System.out.println(emp);
		}
		
		System.out.println("------------------------------------");
		
		Employee empObj = obj.getAllEmployees().get(101);
		empObj.setEmployeeName("Priyanka");
		obj.updateEmployee(empObj);
		for(Employee emp : obj.getAllEmployees())
			System.out.println(emp);
		
		System.out.println("-----------------------------------");
		
	}

}
