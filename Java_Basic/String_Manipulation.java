import java.util.Scanner;
import java.util.Arrays;

public class String_Manipulation{

    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            String array[]= new String[3];
            int op=0;
            while (op!=4) {
                System.out.println("-----------String Manipulation-----------\n");
                System.out.println("1)Compare Two String\n2)Copy\n3)Alphabetic Order\n4)Exit\n");
                System.out.println("-----------------------------------------\n");
                System.out.println("Enter An Option:\n");
                op = sc.nextInt();
                sc.nextLine();
                
                switch (op) {
                    
                    
                    case 1 -> {
                        System.out.println("Enter The First String:\n");
                        array[0] = sc.nextLine();
                        
                        System.out.println("Enter The Second String:\n");
                        array[1] = sc.nextLine();
                        
                        if (array[0].equals(array[1])) {
                            System.out.println("Both Strings are equal!!!\n");
                        } else {
                            System.out.println("Different!!!\n");
                        }
                    }
                        
                    case 2 -> {
                        System.out.println("Enter The First String:\n");
                        array[0] = sc.nextLine();
                        
                        System.out.println("Enter The Second String:\n");
                        array[1] = sc.nextLine();
                        
                        array[2] = array[0];
                        System.out.println("-------------------------------\n");
                        System.out.println("1->3");
                        System.out.println("1th String:" + array[0]);
                        System.out.println("2th String:" + array[1]);
                        System.out.println("3th String:" + array[2]);
                        System.out.println("-------------------------------\n");
                    }
                    case 3 -> {
                        System.out.println("-----Alphabetic Order---\n");
                        System.out.println("Enter The First String:\n");
                        array[0] = sc.nextLine();
                        
                        System.out.println("Enter The Second String:\n");
                        array[1] = sc.nextLine();
                        
                        System.out.println("Enter The Third String:\n");
                        array[2] = sc.nextLine();
                        
                        Arrays.sort(array);
                        System.out.println("------------Alphabetic Order------------\n");
                        for (int x = 0; x < array.length; x++) {
                            System.out.println("String " + x + ":" + array[x]);
                        }
                        System.out.println("------------------------------------------------\n");
                    }
                        
                    case 4 -> {
                    }
                    default -> System.out.println("Invalid Option\n");
                }
            }
        }


        }


    }
