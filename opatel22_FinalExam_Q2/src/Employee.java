import java.util.Random;

public class Employee implements AgeComparable{
    //Declaring variables
    private String name;
    private int age;
    private int idNumber;
    private String department;
    private String position;

    //Constructor
    public Employee(String n, int id){
        Random randGen = new Random();

        name = n;
        idNumber = id;
        department = "";
        position = "";
        age = randGen.nextInt(21) + 30;
    }

    //Accessor method for department
    public void setDepartment(String d){
        department = d;
    }

    //Accessor method for position
    public void setPosition(String p){
        position = p;
    }

    //Accessor method for name
    public String getName(){
        return name;
    }

    //Mutator method for age
    public int getAge(){
        return age;
    }

    //Mutator method idNumber
    public int getIdNumber(){
        return idNumber;
    }
    //Mutator method for department
    public String getDepartment(){
        return department;
    }

    //Mutator method for position
    public String getPosition(){
        return position;
    }
}
