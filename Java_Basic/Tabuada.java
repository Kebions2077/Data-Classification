import java.util.Scanner;

public class Tabuada {
    public void main(String[] args){
     Scanner sc= new Scanner(System.in);
     int num;
        System.out.println("Digite um numero para realizar a tabuada:");
         num= sc.nextInt();
         sc.nextLine();
        System.out.println("-------------------------------------");
        System.out.println("=====Tabuada=====");
         for(int x=1;x<=10;x++){
             int temp;
             temp=x *num;
             System.out.println(""+x+"*"+num+"="+temp);

         }
        System.out.println("===============");
        System.out.print("-------------------------------------");
    }
}
