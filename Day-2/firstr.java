import java.util.Scanner;
public class firstr{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ac=sc.next();
        for(int i=0;i<ac.length()-1;i++){
            for(int j=i+1;j<ac.length();j++){
                if(ac.charAt(i)==ac.charAt(j)){
                    System.out.println(ac.charAt(i));
                    return;
                }
            }
        }
    }
}