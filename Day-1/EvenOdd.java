import java.util.*;
public class EvenOdd{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        int n=sc.nextInt();
        int odd=0;
        int even=0;
        while(n>0){
            int digit=n%10;
            if(digit%2==0){
                even++;
            }
            else{
                odd++;
            }
            n=n/10;

        }
        System.out.println("Even:"+even);
        System.out.println("Odd:"+ odd);
        
    }
}