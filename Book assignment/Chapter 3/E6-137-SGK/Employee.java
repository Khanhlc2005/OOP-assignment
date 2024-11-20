import java.util.Scanner;

public class Employee extends Person {

    // Attribute
    protected String empName;
    protected String dateHired;
    protected int ID;
    protected double salary;

    // Constructor
    public Employee() {
        super();
        empName = "";
        dateHired = "";
        ID = 0;
        salary = 1.0;
    }

    public Employee(String name, int age, char gender, String empName, String dateHired, int ID, double salary) {
        super(name, age, gender);
        this.empName = empName;
        this.dateHired = dateHired;
        this.ID = ID;
        this.salary = salary;
    }

    // Setter
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter
    public String getEmpName() {
        return empName;
    }

    public String getDatehired() {
        return dateHired;
    }

    public int getID() {
        return ID;
    }

    public double getSalary() {
        return salary;
    }

    // toString method
    public String toString() {
        return super.toString() + "\nEmployee name: " + empName + "\nDate hired: " + dateHired + "\nID: " + ID
                + "\nSalary: " + salary;
    }

    // nhap method
    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        setName(name);

        System.out.println("Enter age: ");
        int age = Integer.parseInt(sc.nextLine());
        setAge(age);

        System.out.println("Enter gender: ");
        char gender = sc.next().charAt(0);
        setGender(gender);
        sc.nextLine();

        System.out.println("Enter employer name: ");
        String empname = sc.nextLine();
        setEmpName(empname);

        System.out.println("Enter date hired: ");
        String datehired = sc.nextLine();
        setDateHired(datehired);

        System.out.println("Enter ID: ");
        int ID1 = Integer.parseInt(sc.nextLine());
        setID(ID1);

        System.out.println("Enter salary: ");
        double salary1 = Double.parseDouble(sc.nextLine());
        setSalary(salary1);

        Employee nhanvien = new Employee(name, age, gender, getEmpName(), getDatehired(), getID(), getSalary());
    }

    // Sort by gender
    public void sortgender() {
        boolean isMale;
        if (getGender() == 'M' || getGender() == 'm')
            isMale = true;
        else if (getGender() == 'F' || getGender() == 'f')
            isMale = false;
        else {
            System.out.println("Error");
            return;
        }
        if (isMale)
            System.out.println("\n" + getName() + " is Male");
        else {
            System.out.println("\n" + getName() + " is Female");
        }
    }

    // Finding object
    public boolean findobject(String ten) {
        return getName().equalsIgnoreCase(ten);
    }
}
