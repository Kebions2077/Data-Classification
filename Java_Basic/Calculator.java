import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int op = 0, n1, n2, res;

        Scanner sc = new Scanner(System.in);

        while (op != 5) {
            clear();
            System.out.println("-----------------Calculator-----------------");
            System.out.println("1) Add\n2) Sub\n3) Mult\n4) Div\n5) Exit");
            System.out.println("--------------------------------------------");
            System.out.print("Enter an option: ");
            op = sc.nextInt();

            switch (op) {
                default:

                    System.out.println("Invalid Option");
                    break;

                case 1:
                    clear();
                    System.out.print("Enter First Number: ");
                    n1 = sc.nextInt();
                    System.out.print("Enter Second Number: ");
                    n2 = sc.nextInt();
                    res = n1 + n2;
                    System.out.println("Result: " + res);
                    break;

                case 2:
                    clear();

                    System.out.print("Enter First Number: ");
                    n1 = sc.nextInt();
                    System.out.print("Enter Second Number: ");
                    n2 = sc.nextInt();
                    res = n1 - n2;
                    System.out.println("Result: " + res);
                    break;

                case 3:
                    clear();

                    System.out.print("Enter First Number: ");
                    n1 = sc.nextInt();
                    System.out.print("Enter Second Number: ");
                    n2 = sc.nextInt();
                    res = n1 * n2;
                    System.out.println("Result: " + res);
                    break;

                case 4:
                    clear();

                    System.out.print("Enter First Number: ");
                    n1 = sc.nextInt();
                    System.out.print("Enter Second Number: ");
                    n2 = sc.nextInt();
                    if (n2 == 0) {
                        System.out.println("Division By Zero");
                    } else {
                        res = n1 / n2;
                        System.out.println("Result: " + res);
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;
            }
        }
    }
    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}


