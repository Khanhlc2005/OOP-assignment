public abstract class Person {

    //Attribute
    protected String name;
    protected int age;
    protected char gender;

    //Constructor
    public Person(){
        this.name = "";
        this.age = 0;
        this.gender = 'M';
    }
    public Person(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //Setter
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setGender(char gender){
        this.gender = gender;
    }

    //Getter
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public char getGender(){
        return gender;
    }

    //toString method
    public String toString(){
        return "Name: " + name + "\nAge: " + age + "\nGender: " + gender;
    }

    //nhap method
    public abstract void nhap();
}