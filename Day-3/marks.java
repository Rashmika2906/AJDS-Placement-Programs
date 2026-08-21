import java.util.Scanner;
public class marks{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] marks=new int[5];
        String[] names=new String[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter marks & name for Student "+(i+1)+":");
            marks[i]=sc.nextInt();
            sc.nextLine();
            names[i]=sc.nextLine();
        }
        int s=1;
        for(int i=0;i<5;i++){
            if(marks[i]>50){
                System.out.println(s+" "+names[i]+" has scored "+marks[i]);
                s++;
            }
        }
    }
}