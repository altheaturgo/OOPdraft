
package model;

/**
 *
 * @author Name
 */

public class Supervisor extends Employee implements SupervisorOperations {
    
    public Supervisor (String employeeId, String lastName, String firstName, String birthday, String address, 
                                        String phoneNumber, String sssNumber, String philhealthNumber, String tinNumber, 
                                        String pagibigNumber, String status, String position, String supervisor, double basicSalary, 
                                        double riceSubsidy, double phoneAllowance, double clothingAllowance, double grossRate, double hourlyRate) 
    {
        super(employeeId, lastName, firstName, birthday, address, phoneNumber, sssNumber, philhealthNumber, tinNumber, pagibigNumber, 
                status, position, supervisor, basicSalary, riceSubsidy, phoneAllowance, clothingAllowance, grossRate, hourlyRate);
    }

    // SupervisorOperations Methods

    @Override
    public void viewSubordinateInformation() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void viewSubordinateLeaveApplication() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateSubordinateLeaveStatus() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
