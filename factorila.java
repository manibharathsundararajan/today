import java.util.*;


public class factorial {

   
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int i=1,f=1;
       for( i=1;i<=n;i++)
       {
           f=f*i;
       }
        System.out.println(f);
    }
    
}
