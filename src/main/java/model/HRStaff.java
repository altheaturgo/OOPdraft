
package model;

/**
 *
 * @author Name
 */

public class HRStaff extends Employee implements HRStaffOperations {

    public HRStaff (String employeeId, String lastName, String firstName, String birthday, String address, 
                                        String phoneNumber, String sssNumber, String philhealthNumber, String tinNumber, 
                                        String pagibigNumber, String status, String position, String supervisor, double basicSalary, 
                                        double riceSubsidy, double phoneAllowance, double clothingAllowance, double grossRate, double hourlyRate) 
    {
        super(employeeId, lastName, firstName, birthday, address, phoneNumber, sssNumber, philhealthNumber, tinNumber, pagibigNumber, 
                status, position, supervisor, basicSalary, riceSubsidy, phoneAllowance, clothingAllowance, grossRate, hourlyRate);
    }
    
    // HRStaffOperations Methods
    
    @Override
    public void viewAllEmployees() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void addNewEmployee() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteEmployee() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateEmployeeInformation() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void processLeaveRequest(){
    }
    
}
