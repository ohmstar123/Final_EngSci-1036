public class Second extends Winners{
    //Declare variable
    private String name;

    //Constructor
    public Second(String name){
        this.name = name;
    }

    //mutator method to output the name of person and that they have won second place
    public String congratulate(){
        return "Congratulations " + name + "! you have won the second place";
    }
}
