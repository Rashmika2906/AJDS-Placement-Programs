import java.util.*;
public class rno{
    public static void main(String[] args) {
        String s="";
        Random r= new Random();
        int []a=new int[5];
        int i=0;
        int no;
        String x;
        while(i<5){
            no=r.nextInt(10)+1;
            x=Integer.toString(no);
            while(s.contains(x)){
                no=r.nextInt(10)+1;
                x=Integer.toString(no);
            }
            s=s+x;
            a[i]=no;
            i++;
        }
        System.out.print(Arrays.toString(a));
    }
}