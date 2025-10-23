public class Array{
    public static void main(String[] args){
       int [] array= new int[10];
       int x= array.length;
       System.out.println("----------Random Array------------\n");
       for(int y=0;y<x;y++){
           array[y]= (int) (Math.random() *300);
           System.out.println("Position:"+y+ ":" +array[y]);
       }
        System.out.println("----------------------\n");
        System.out.println("Array Size:\n"+array.length);

    }
}