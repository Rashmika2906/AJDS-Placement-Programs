public class digitprime{
    public static void main(String[] args) {
        int d;
        boolean f;
        int m;
        for(int i=100;i<1000;i++){
            m=i;
            f=true;
            while(m!=0){
                
                d=m%10;
                if(d!=7&&d!=5&&d!=3&&d!=2){
                    f=false;
                    break;
                }
                m=m/10;
            }

            if(f){
                System.out.println(i);
            }
        
        }
    }
}