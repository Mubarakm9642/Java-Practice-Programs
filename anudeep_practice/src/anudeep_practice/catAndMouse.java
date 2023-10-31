package anudeep_practice;
import java.util.Scanner;
public class catAndMouse {

static String catMouse(int x, int y, int z) {
        
        int diff1 = Math.abs(z-x);
        int diff2 = Math.abs(z-y);
        
        
        if(diff1<diff2)
        return "Cat A";
        else if(diff1>diff2)
        return "Cat B";
        else
         return "Mouse C";
              
    }
    public static void main(String[] args) {

       Scanner s = new Scanner(System.in);

        System.out.println("enter catA,catB,and mouse positions respectively");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.println(""+catMouse(a,b,c));
        }
}

