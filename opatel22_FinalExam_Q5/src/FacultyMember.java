public class FacultyMember {
    //Declare variables
    private int id;
    private String name;
    private String rank;

    //Constructor
    public FacultyMember(int id, String name, String rank){
        this.id = id;
        this.name = name;
        this.rank = rank;
    }

    //Mutator method that returns a string
    public String toString(){
        return "   " + id + "       " + name + "             " + rank;
    }
}
