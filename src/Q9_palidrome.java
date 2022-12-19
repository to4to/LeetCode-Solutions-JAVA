import java.util.Scanner;

public class Q9_palidrome {


public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Number To Check");
    int x=sc.nextInt();



    System.out.println(isPalidrome(x));
}

    private static boolean isPalidrome(int x) {


        int rev=0;
        for(int i=x;i>0;i/=10){

            rev=rev*10+i%10;
        }
        return rev==x?true:false;

    }



}
