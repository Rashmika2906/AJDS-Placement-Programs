import java.util.*;
class Rect{
    int a,c;
    Rect(int l,int b){
        a=l;
        c=b;
    }
    public void display(){
        System.out.println("Area of rectangle"+":"+(a*c));
    }
}
public class Constructor
{
	public static void main(String[] args) {
	   int l,b;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter num of rectangles:");
       int n=sc.nextInt();
       Rect[] r=new Rect[n];
       for(int i=0;i<n;i++){
           System.out.println("Enter l for rect"+" "+(i+1)+": ");
           l=sc.nextInt();
           System.out.println("Enter b for rect"+" "+(i+1)+" ");
           b=sc.nextInt();
           r[i]= new Rect(l,b);
        }
        System.out.println("Area of reactangles are:");
        for(int i=0;i<n;i++){
            r[i].display();
        }
	}
}