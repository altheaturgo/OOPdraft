
package model;

public class AccountingStaff  extends Employee implements AccountingStaffOperations {
    
    public AccountingStaff (String employeeId, String lastName, String firstName, String birthday, String address, 
                                        String phoneNumber, String sssNumber, String philhealthNumber, String tinNumber, 
                                        String pagibigNumber, String status, String position, String supervisor, double basicSalary, 
                                        double riceSubsidy, double phoneAllowance, double clothingAllowance, double grossRate, double hourlyRate) 
    {
        super(employeeId, lastName, firstName, birthday, address, phoneNumber, sssNumber, philhealthNumber, tinNumber, pagibigNumber, 
                status, position, supervisor, basicSalary, riceSubsidy, phoneAllowance, clothingAllowance, grossRate, hourlyRate);
    }

    
    // AccountingStaffOperations Methods
    @Override
    public void updatePayrollReportStatus() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void viewPayrollSummary(){
        //logic here
    }
    
    @Override
    public void generatePayrollReport(){
        //logic here
    }
    
}
