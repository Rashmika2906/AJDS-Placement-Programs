public class twoprime{
    public static void main(String[] args) {
        int d;
        
        int ma=0;
        int m;
        int count;
        for(int i=250;i<=750;i++){
            m=i;
            count=0;
            while(m!=0){

                d=m%10;
                if(d==2||d==3||d==5||d==7){
                count++;
                }
                m=m/10;
            }
            
             if(count==2){
               ma++;
            }

            }
        
        System.out.println("Count:"+ma);
        
    }

}