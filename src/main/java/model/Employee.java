
package model;

import java.time.LocalDate;

 /**
 * Represents an employee in the MotorPH Payroll System.
 * Contains personal details, employment information, and compensation data.
 */

public abstract class Employee implements RegularEmployeeOperations {
    
    // Personal Information
    protected String employeeId;
    protected String lastName;
    protected String firstName;
    protected String birthday;
    protected String address;
    protected String phoneNumber;

    // Government IDs
    protected String sssNumber;
    protected String philhealthNumber;
    protected String tinNumber;
    protected String pagibigNumber;

    // Employment Details
    protected String status;
    protected String position;
    protected String supervisor;

    // Compensation
    protected double basicSalary;
    protected double riceSubsidy;
    protected double phoneAllowance;
    protected double clothingAllowance;
    protected double grossRate; 
    protected double hourlyRate;
    
    // Default Constructor
    public Employee() {}
    
    // Constructor
    public Employee (String employeeId, String lastName, String firstName, String birthday, 
                            String address, String phoneNumber, String sssNumber, String philhealthNumber, 
                            String tinNumber, String pagibigNumber, String status, String position, String supervisor, 
                            double basicSalary, double riceSubsidy, double phoneAllowance, double clothingAllowance, 
                            double grossRate, double hourlyRate) 
    {    
        this.employeeId = employeeId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.sssNumber = sssNumber;
        this.philhealthNumber = philhealthNumber;
        this.tinNumber = tinNumber;
        this.pagibigNumber = pagibigNumber;
        this.status = status;
        this.position = position;
        this.supervisor = supervisor;
        this.basicSalary = basicSalary;
        this.riceSubsidy = riceSubsidy;
        this.phoneAllowance = phoneAllowance;
        this.clothingAllowance = clothingAllowance;
        this.grossRate = grossRate;
        this.hourlyRate = hourlyRate;
    }

    // Getters
    public String getEmployeeId() { return employeeId; }
    public String getLastName() { return lastName; }
    public String getFirstName() { return firstName; }
    public String getBirthday() { return birthday; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getSssNumber() { return sssNumber; }
    public String getPhilhealthNumber() { return philhealthNumber; }
    public String getTinNumber() { return tinNumber; }
    public String getPagibigNumber() { return pagibigNumber; }
    public String getStatus() { return status; }
    public String getPosition() { return position; }
    public String getSupervisor() { return supervisor; }
    public double getBasicSalary() { return basicSalary; }
    public double getRiceSubsidy() { return riceSubsidy; }
    public double getPhoneAllowance() { return phoneAllowance; }
    public double getClothingAllowance() { return clothingAllowance; }
    public double getGrossRate() { return grossRate; }
    public double getHourlyRate() { return hourlyRate; }
    
    // Setters
    private void setEmployeeId(String employeeId) { this.employeeId = employeeId; }
    protected void setLastName(String lastName) { this.lastName = lastName; }
    protected void setFirstName(String firstName) { this.firstName = firstName; }
    protected void setBirthday(String birthday) { this.birthday = birthday; }
    public void setAddress(String address) { this.address = address; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    protected void setSssNumber(String sssNumber) { this.sssNumber = sssNumber; }
    protected void setPhilhealthNumber(String philhealthNumber) { this.philhealthNumber = philhealthNumber; }
    protected void setTinNumber(String tinNumber) { this.tinNumber = tinNumber; }
    protected void setPagibigNumber(String pagibigNumber) { this.pagibigNumber = pagibigNumber; }
    protected void setStatus(String status) { this.status = status; }
    protected void setPosition(String position) { this.position = position; }
    protected void setSupervisor(String supervisor) { this.supervisor = supervisor; }
    protected void setBasicSalary(double basicSalary) { this.basicSalary = basicSalary; }
    protected void setRiceSubsidy(double riceSubsidy) { this.riceSubsidy = riceSubsidy; }
    protected void setPhoneAllowance(double phoneAllowance) { this.phoneAllowance = phoneAllowance; }
    protected void setClothingAllowance(double clothingAllowance) { this.clothingAllowance = clothingAllowance; }
    protected void setGrossRate(double grossRate) { this.grossRate = grossRate; }
    protected void setHourlyRate(double hourlyRate) { this.hourlyRate = hourlyRate; }

    @Override
    public void submitLeaveRequest(String employeeId, LocalDate leaveStartDate, LocalDate leaveEndDate) {
        // Insert code (call from services ??)
    };

    @Override
    public void viewMyPayslip(String employeeId) {
        // Insert code
    };

    @Override
    public void viewMyAttendance(String employeeId) {
        // Insert code
    };

    @Override
    public void updateMyInformation(String employeeId) {
        // Insert code
    };

    @Override
    public void viewMyInformation(String employeeId) {
        // Insert code
    };

}
 