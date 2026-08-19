class common{
    static String PM= "Narendra Modi";
    
}
class TN{
    static String CM="Vijay";
    static String state="Tamil Nadu";
    String dis;
    int no;
    public void set_obj(String a,int b){
        dis=a;
        no=b;
    }
    public void display(){
        System.out.println("PM:"+common.PM);
        System.out.println("CM:"+CM);
        System.out.println("State:"+state);
        System.out.println("District:"+dis);
        System.out.println("Population:"+no);
    }
    
}     
class AP{
    static String CM="CB Naidu";
    static String State="Andhra Pradesh";
    String dis;
    int no;
    public void set_obj(String a,int b){
        dis=a;
        no=b;
    }
    public void display(){
        System.out.println("PM:"+common.PM);
        System.out.println("CM:"+CM);
        System.out.println("State:"+State);
        System.out.println("District:"+dis);
        System.out.println("Population:"+no);
    }
    
}

public class OOPs 
{
	public static void main(String[] args) {
       TN c= new TN();
       TN py=new TN();
       AP ty=new AP();
       AP vjw=new AP();
       c.set_obj("Chennai",75);
       py.set_obj("Pondy",45);
       ty.set_obj("Tirupati",60);
       vjw.set_obj("Vijayawada",80);
       c.display();
       System.out.println("---------------------------");
       py.display();
       System.out.println("---------------------------");
       ty.display();
       System.out.println("---------------------------");
       vjw.display();
       System.out.println("---------------------------");
	}
}