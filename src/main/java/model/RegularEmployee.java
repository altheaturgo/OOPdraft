
package model;

import java.time.LocalDate;

public class RegularEmployee extends Employee {

    public RegularEmployee (String employeeId, String lastName, String firstName, String birthday, String address, 
                                        String phoneNumber, String sssNumber, String philhealthNumber, String tinNumber, 
                                        String pagibigNumber, String status, String position, String supervisor, double basicSalary, 
                                        double riceSubsidy, double phoneAllowance, double clothingAllowance, double grossRate, double hourlyRate) 
    {
        super(employeeId, lastName, firstName, birthday, address, phoneNumber, sssNumber, philhealthNumber, tinNumber, pagibigNumber, 
                status, position, supervisor, basicSalary, riceSubsidy, phoneAllowance, clothingAllowance, grossRate, hourlyRate);
    }
    
    @Override
    public void viewMyInformation(String employeeId){
         //logic here
     }
    
    @Override
     public void updateMyInformation(String employeeId){
         //logic here
     }
     
    @Override
     public void viewMyAttendance(String employeeId){
         //logic here
     }
     
    @Override
     public void viewMyPayslip(String employeeId){
         //logic here
     }
     
    @Override
     public void submitLeaveRequest(String employeeId, LocalDate leaveStartDate, LocalDate leaveEndDate){
         //logic here
     }
}
