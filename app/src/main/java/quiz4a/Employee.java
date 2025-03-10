package quiz4a;

/**
 * คลาส พนักงาน
 *  ชื่อ นามสกุล
 *  ที่อยู่
 * เบอร์โทรศัพท์ 
 * อีเมล
 */
// (1.1) เขียน Java Docs
public class Employee {
    private int employeeId;
    private String name;
    private double salary;

    /**
     * พนักงาน เก็บ ไอดี, ชื่อพนักงาน, เงินเดือน
     * 
     * @param employeeId
     *                 ไอดีพนักงงาน
     * @param name
     *                 ชื่อพนักงาน
     * @param salary
     *                  เงินเดือนพนักงาน
     */
    // (1.2)
    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = (salary > 0) ? salary : 0;
    }

    /**
     * คำนวณเงินเดือน
     * 
     * @return เงินเดือน
     */
    // (1.3)
    public double calculateSalary() {
        return salary;
    }

    /**
     * รับไอดีพนักงงาน
     * 
     * @return ไอดีพนักงาน
     */
    // (1.4)
    public int getEmployeeId() {
        return employeeId;
    }

     /**
     * รับไอดีพนักงงาน
     * 
     * @return ชื่อพนักงาน
     */
    // (1.5)
    public String getName() {
        return name;
    }
}