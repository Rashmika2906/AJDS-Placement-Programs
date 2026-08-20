import java.util.*;
public class primeno{
    public static void main(String[] args) {
        int l,p;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        boolean flag=true;
        while(a/10!=0){
            l=a%10;
            p=(a/10)%10;
            if(p<l){
                flag=false;
                break;
            }
            a=a/10;
        }
        if(flag){
            System.out.println("Descending");
        }
        else{
            System.out.println("Not Descending");
        }
    }
}