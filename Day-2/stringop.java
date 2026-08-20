import java.util.Scanner;

public class stringop{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int d=0;
        int u=0;
        int l=0;
        int s=0;
        
        for(char x:a.toCharArray()){
            if(Character.isDigit(x)){
                d++;
            }
            if(Character.isUpperCase(x)){
                u++;
            }
            if(Character.isLowerCase(x)){
                l++;
            }
            if(!Character.isLetter(x)&&!Character.isDigit(x)){
                s++;
            }
        }
        System.out.println("Digit:"+d);
        System.out.println("Uppercase:"+u);
        System.out.println("Lowercase:"+l);
        System.out.println("Special:"+s);
    }
}