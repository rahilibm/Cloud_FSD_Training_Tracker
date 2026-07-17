import java.util.Scanner;

class basics {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.print("Hello, ");
        System.out.print("World!");
        System.out.println("Hello \n Worryyy");
        System.out.println("Hello \t Rahil");
        System.out.println("Hello \r Rahil");
        System.out.println("Hello \b Rahil");
        System.out.println("Hello \f Rahil");

        int age = 31;
        double price = 679.989;
        char grade = 'D';
        boolean isLoggedin = false;
        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Grade: " + grade);
        System.out.println("Is Logged in: " + isLoggedin);

        int num = 450;
        double result = num;
        System.out.println(result);
        double pricee = 159.9989;
        int rounded = (int) pricee;
        System.out.println(result);
        System.out.println(rounded);

        int a = 12, b = 23;
        System.out.println(a + b);
        System.out.println(a - b); 
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);  

        int x = 20, y = 120;
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x >= 10);

        boolean aa = true, bb = false;
        System.out.println(aa && bb);
        System.out.println(aa || bb);
        System.out.println(!aa);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int agee = sc.nextInt();
        System.out.print("Enter your GPA: ");
        double cgpa = sc.nextDouble();
        System.out.println("Welcome, " + name + "!");
        System.out.println("Age: " + agee + ", CGPA: " + cgpa);
        sc.close();

        int marks = 92;
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        for (int i = 1; i <= 7; i++) {
            System.out.println("Value: " + i);
        }

        int i = 1;
        while (i <= 5) {
            System.out.println("Value: " + i);
            i++;
        }

        int m = 1;
        do {
            System.out.println("Count: " + m);
            m++;
        } while (m <= 5);

    }
}