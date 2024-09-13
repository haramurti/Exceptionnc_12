import java.util.Scanner;

class Exceptionnc_12{
    public static void main (String[]args){
        try{
        Scanner a = new Scanner(System.in); 
        System.out.println("input a number");
        double n = a.nextDouble();
        System.out.println(n);
        } catch (Exception c ){
            System.out.println("you know what mate ?, yeah , bloody you!");
        }
        
    }
}