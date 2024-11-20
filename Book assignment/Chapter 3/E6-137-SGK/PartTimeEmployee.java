import java.util.Scanner;

public class PartTimeEmployee extends Employee{
    
    //Attribute
    protected int hourPerWeek;

    //Constructor
    public PartTimeEmployee(){
        super();
        this.hourPerWeek = 0;
    }
    public PartTimeEmployee(String name, int age, char gender, String empName, String dateHired, int ID, double salary, int hourPerWeek){
        super(name, age, gender, empName, dateHired, ID, salary);
        this.hourPerWeek = hourPerWeek;
    }

    //Setter
    public void setHourPerWeek(int hourPerWeek) {
        this.hourPerWeek = hourPerWeek;
    }

    //Getter
    public int getHourPerWeek() {
        return hourPerWeek;
    }

    //toString method
    @Override
    public String toString(){
        return super.toString() + "\nHour per week: " + hourPerWeek;
    }

    //nhap method
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hour per week: ");
        int hourperweek = Integer.parseInt(sc.nextLine());

        PartTimeEmployee nhanvienbantg = new PartTimeEmployee(name, age, gender, getEmpName(), getDatehired(), getID(), getSalary(), hourperweek);
    }
}
