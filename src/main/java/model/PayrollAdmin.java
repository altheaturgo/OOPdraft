
package model;

/**
 *
 * @author Name
 */

public class PayrollAdmin extends Employee implements PayrollAdminOperations {

    public PayrollAdmin (String employeeId, String lastName, String firstName, String birthday, String address, 
                                        String phoneNumber, String sssNumber, String philhealthNumber, String tinNumber, 
                                        String pagibigNumber, String status, String position, String supervisor, double basicSalary, 
                                        double riceSubsidy, double phoneAllowance, double clothingAllowance, double grossRate, double hourlyRate) 
    {
        super(employeeId, lastName, firstName, birthday, address, phoneNumber, sssNumber, philhealthNumber, tinNumber, pagibigNumber, 
                status, position, supervisor, basicSalary, riceSubsidy, phoneAllowance, clothingAllowance, grossRate, hourlyRate);
    }

    // PayrollAdminOperations Methods
    
    @Override
    public void computePayroll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void generatePayrollReport() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void viewAllEmployees() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void viewEmployeesLeaveRequestRecords(){
        //
    }
}
