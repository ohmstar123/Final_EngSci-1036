public class Department {
    //Declare variables
    private int departmentID;
    private String departmentName;
    private FacultyMember[] members;
    private int departmentSize;

    //Constructor
    public Department(int id, String n){
        departmentID = id;
        departmentName = n;
        departmentSize = 0;
        members = new FacultyMember[10];
    }

    //Void method which adds objects of type FacultyMember to the members array
    public void addMember(FacultyMember m){
        members[departmentSize++] = m;
    }

    //Mutator method that returns a string
    public String toString(){
        int counter = 1;

        return "Department ID: " + departmentID + "\nDepartment Name: " + departmentName + "\nFaculty Members:" +
                "\nNo. ID        Name                 Rank\n" + "=== ========= ==================== ===============" +
                "\n" + counter + members[0].toString() + "\n" + counter++ + members[1].toString();
    }
}
