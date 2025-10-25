public class Bubblesort{
    public static void main(String[] args){
       int [] array= new int[10];
       int x= array.length;
       System.out.print("----------Random Array---------------------\n");
       for(int y=0;y<x;y++){
           array[y]= (int) (Math.random() *300);
           System.out.print("["+array[y]+"]");
       }
        System.out.print("\n---------------------------------\n");
         for (int i = 0; i < x - 1; i++) {
        for(int j=0;j<x-1-i;j++){
            if(array[j]>array[j+1]){
                int temp;
                temp=array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
            }
        }
    }
        System.out.print("---------Bubblesort-------\n");
        for(int o=0;o<x;o++){
            System.out.print("["+array[o]+"]");
        }
        System.out.println("\n------------------------------------\n");


        }

    }
