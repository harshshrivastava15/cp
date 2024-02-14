import java.util.*;
public class cp2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b=0,r,p,count=0,rev=0;
        p=a;

        while(a>0){
            r=a%10;
            rev=rev*10+r;
            a=a/10;

        }
        System.out.println("reverse is:"+rev);


    }
}
