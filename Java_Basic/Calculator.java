import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int op = 0;
        int[] array= new int[3];

        try (Scanner sc = new Scanner(System.in)) {
            while (op != 5) {
                
                System.out.println("-----------------Calculator-----------------");
                System.out.println("1) Add\n2) Sub\n3) Mult\n4) Div\n5)Comparator\n6) Exit");
                System.out.println("--------------------------------------------");
                System.out.print("Enter an option: ");
                op = sc.nextInt();
                
                switch (op) {
                    default -> System.out.println("Invalid Option");
                    
                    case 1 -> {
                        clear();
                        System.out.print("Enter First Number: ");
                        array[0] = sc.nextInt();
                        System.out.print("Enter Second Number: ");
                        array[1] = sc.nextInt();
                        array[2] = array[0] + array[1];
                        System.out.println("Result: " + array[2]);
                    }
                    
                    case 2 -> {
                        clear();
                        
                        System.out.print("Enter First Number: ");
                        array[0] = sc.nextInt();
                        System.out.print("Enter Second Number: ");
                        array[1] = sc.nextInt();
                        array[2] = array[0] - array[1];
                        System.out.println("Result: " + array[2]);
                    }
                    
                    case 3 -> {
                        clear();
                        
                        System.out.print("Enter First Number: ");
                        array[0] = sc.nextInt();
                        System.out.print("Enter Second Number: ");
                        array[1] = sc.nextInt();
                        array[2] = array[0] * array[1];
                        System.out.println("Result: " + array[2]);
                    }
                    
                    case 4 -> {
                        clear();
                        
                        System.out.print("Enter First Number: ");
                        array[0]= sc.nextInt();
                        System.out.print("Enter Second Number: ");
                        array[1] = sc.nextInt();
                        if (array[1] == 0) {
                            System.out.println("Division By Zero");
                        } else {
                            array[2] = array[0] / array[1];
                            System.out.println("Result: " + array[2]);
                        }
                    }
                    case 5 ->{
                        if(array[0]==array[1]){
                            System.out.println("Both Numbers are equal");
                        }
                        else{
                            System.out.println("Different Numbers");
                        }
                    }
                    case 6 -> System.out.println("Exiting...");
                }
            }
        }
    }

    public static void clear() {
        for (int i = 0; i < 50; i++) System.out.println();
    }
}


