public class Third extends Winners{
    //Declare variable
    private String name;

    //Constructor
    public Third(String name){
        this.name = name;
    }

    //mutator method to output the name of person and that they have won third place
    public String congratulate(){
        return "Congratulations " + name + "! you have won the third place";
    }
}
