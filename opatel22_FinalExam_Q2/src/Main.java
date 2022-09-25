public class Main {
    public static void main(String[] args) {

        //Declaring objects of type Employee
        Employee person1 = new Employee("Susan Meyers", 47899);
        Employee person2 = new Employee("Mark Jones", 39119);

        //Set up department and position using accessor method for person 1
        person1.setDepartment("Accounting");
        person1.setPosition("Vice President");

        //Set up department and position using accessor method for person 2
        person2.setDepartment("IT");
        person2.setPosition("Programmer");

        //Output the given statment
        System.out.printf("%1s" + "%20s" + "%10s" + "%11s" + "%14s", "Name", "Age", "ID number", "Department", "Position");
        System.out.println("\n==================== === ========= =============== ===============");
        if (person1.getAge() <= person2.getAge())
        {
            System.out.printf("%1s" + "%11s" + "%7s" + "%15s" + "%20s" + "\n", person1.getName(), person1.getAge(), person1.getIdNumber(), person1.getDepartment(), person1.getPosition());
            System.out.printf("%1s" + "%13s" + "%7s" + "%7s" + "%24s", person2.getName(), person2.getAge(), person2.getIdNumber(), person2.getDepartment(), person2.getPosition());
        }
        else
        {
            System.out.printf("%1s" + "%13s" + "%7s" + "%7s" + "%24s" + "\n", person2.getName(), person2.getAge(), person2.getIdNumber(), person2.getDepartment(), person2.getPosition());
            System.out.printf("%1s" + "%11s" + "%7s" + "%15s" + "%20s", person1.getName(), person1.getAge(), person1.getIdNumber(), person1.getDepartment(), person1.getPosition());
        }

    }
}
