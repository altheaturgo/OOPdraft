
package model;

/**
 *
 * @author Miles
 */

import java.time.LocalDate;

public interface RegularEmployeeOperations {
    void viewMyInformation(String employeeId);
    void updateMyInformation(String employeeId);
    void viewMyAttendance(String employeeId);
    void viewMyPayslip(String employeeId);
    void submitLeaveRequest(String employeeId, LocalDate leaveStartDate, LocalDate leaveEndDate);
}
