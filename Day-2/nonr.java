import java.util.Scanner;
public class nonr{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ac=sc.next();
        int c;
        for(int i=0;i<ac.length();i++){
            c=0;
            for(int j=0;j<ac.length();j++){
                if(ac.charAt(i)==ac.charAt(j)){
                    c++;
                    
                }
            }
            if(c==1){
                System.out.println(ac.charAt(i));
                break;
            }
        }
    }
}