import java.util.*;

public class Solution{
    public static void Solu(int n){
        if(n==0)System.out.println("Enter number Greater than 0");
        String j="";
        for(int i=0;i<n;i++){
            j+="11";
            System.out.println(j);
        }        
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        Solu(m);
    }
}
