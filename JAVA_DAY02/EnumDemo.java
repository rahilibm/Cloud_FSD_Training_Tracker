import java.util.Scanner;

public class EnumDemo {
    public static void main(String args[]){
        String[] days = {
            "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday", "Sunday"
        };

        System.out.print("Enter the day: ");
        Scanner sc= new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        int index = -1;

        for (int i = 0; i < days.length; i++) {
            if (days[i].equalsIgnoreCase(input)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Invalid day entered!");
            return;
        }

        int newIndex = (index + 30) % 7;

        if (newIndex==5 || newIndex==6) {
            newIndex = 0;
        }

        System.out.println("Working day after 30 days: " + days[newIndex]);
    }
}
