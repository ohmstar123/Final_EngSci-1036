public class DepartmentInfo {
    public static void main(String[] args) {
        //Object of type Department
        Department department = new Department(123, "Software Engineering");

        //Two objects of type FacultyMember
        FacultyMember member1 = new FacultyMember(111, "Jane Doe", "Associate Professor");
        FacultyMember member2 = new FacultyMember(222, "John Doe", "Professor");

        //Add both objects of type FacultyMember to department via addMember method
        department.addMember(member1);
        department.addMember(member2);

        //Output the given statement with the use of toString methods
        System.out.println(department.toString());
    }
}
