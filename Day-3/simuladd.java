public class simuladd{
    public static void main(String[] args) {
        int a[]={1,2,5,9,5,6,7,8,9,10};
        int l=0;
        int r=9;

        while(l<r){
             System.out.println(a[l]+a[r]);
             l++;
             r--;
        }
    }
}