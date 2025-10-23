import java.util.Scanner;

public class Condition{

    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter X:");
        int x=scanner.nextInt();
        System.out.println("Enter y:");
        int y=scanner.nextInt();

        if(x>y){
            System.out.println("-----------------------------\n");
            System.out.println("X is Bigger than Y");
            System.out.println("-----------------------------\n");
        }
        else if(x==y){
            System.out.println("-----------------------------\n");
            System.out.println("Both numbers are equal\n");
            System.out.println("-----------------------------\n");
        }
        else{
            System.out.println("-----------------------------\n");
            System.out.println("Y is bigger than X\n");
            System.out.println("-----------------------------\n");
        }

        scanner.close();
    }
}




