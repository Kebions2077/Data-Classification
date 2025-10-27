package Stock;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int op=0;

        System.out.print("-------------------------Stock----------------------\n");
        System.out.println("1)Add\n2)Remove\n3)Show");
        System.out.print("------------------------------------------------------\n");
        System.out.println("Enter An Option:\n");
        op=sc.nextInt();
        sc.nextLine();
        switch(op){
            default-> {
                System.out.println("Invalid Operation\n");
            }
            case 1 -> {
                String temp;
                int qnt, c;
                float p;

                System.out.println("Enter Product Name:");
                temp = sc.nextLine();
                System.out.println("Enter Product Code:");
                c = sc.nextInt();
                System.out.println("Enter How Many Products:");
                qnt = sc.nextInt();
                System.out.println("Enter Price:");
                p = sc.nextFloat();

                Product temp = new Product();
                temp.name = temp;
                temp.code = code;
                temp.price = p;
                temp.quant = qnt;
            }


            }
        }
    }
}
