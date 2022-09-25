public class First extends Winners{
    //Declare variable
    private String name;

    //Constructor
    public First(String name){
        this.name = name;
    }

    //mutator method to output the name of person and that they have won first place
    public String congratulate(){
        return "Congratulations " + name + "! you have won the first place";
    }
}
