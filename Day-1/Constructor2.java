import java.util.*;
class common{
    static String coll="Sathyabama";
}
class Student{
    String na;
    int m,s,l;
    Student(String name,int mat,int sci,int lang){
        na=name;
        m=mat;
        s=sci;
        l=lang;
    }
    public void display(){
        System.out.println(na+" Scored "+((m+s+l)/3)+"% at "+common.coll);
    }
    
}
public class Constructor2
{
	public static void main(String[] args) {
	    int mat,sci,lang;
	    String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of students:");
		int n=sc.nextInt();
		Student[] stu=new Student[n];
		for(int i=0;i<n;i++){
		    System.out.println("Enter Student"+" "+(i+1)+ " name");
		    name=sc.next();
		    System.out.println("Enter Maths marks:");
		    mat=sc.nextInt();
		    System.out.println("Enter Science marks:");
		    sci=sc.nextInt();
		    System.out.println("Enter Language marks:");
		    lang=sc.nextInt();
		    stu[i]=new Student(name,mat,sci,lang);
		}
		for(int i=0;i<n;i++){
		    stu[i].display();
		}
		
	}
}