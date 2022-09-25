public class Announcement {
    public static void main(String[] args) {

        //Creating object of type Winners for first, second, and third
        Winners[] winners = {new First("John"), new Second("Mike"), new Third("Jane")};

        //For loop to output the congratulate String method
        for (int i = 0; i < 3; i++) {

            System.out.println(winners[i].congratulate());

        }
    }
}
