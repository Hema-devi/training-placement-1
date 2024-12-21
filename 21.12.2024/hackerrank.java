1)    public class Solution {

    public static void main(String[] args) {

        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }
}

-----------------------------------------------------------------------------------------------------------

2)     import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

---------------------------------------------------------------------------------------------------------------

3)     import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(rn|[nru2028u2029u0085])?");

        scanner.close();
        if(N%2 == 0)
    {
        if(N>=2 && N<=5)
        {
            System.out.println("Not Weird");
        }
        else if(N>=6 && N<=20)
        {
            System.out.println("Weird");
        }
        else
        {
            System.out.println("Not Weird");
        } 
    }
    else
    {
        System.out.println("Weird");
    }

    }
}

----------------------------------------------------------------------------------------------------

4)   import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
    String s = scan.nextLine();
    s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

-------------------------------------------------------------------------------------------------

5)     import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d%n", s1, x);
            }
            System.out.println("================================");

    }
}

--------------------------------------------------------------------------------------------

6)   import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(rn|[nru2028u2029u0085])?");

        scanner.close();
        for(int i = 1; i <= 10; i++){

            System.out.printf("%d x %d = %d%n", N, i, N*i);
        }
    }
}

----------------------------------------------------------------------------------------------------------

7)    import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh)
    {

        Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();

    for(int i=0;i<t;i++)
    {

        try
        {
            long x=sc.nextLong();
            System.out.println(x+" can be fitted in:");
            if(x>=-128 && x<=127)System.out.println("* byte");
          
            if(x >= -Math.pow(2, 15) && x <= Math.pow(2, 15) - 1)
                System.out.println("* short");
            if(x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1)
                System.out.println("* int");
            if(x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1)
                System.out.println("* long");
        }
        catch(Exception e)
        {
            System.out.println(sc.next()+" can't be fitted anywhere.");
        }

    }
}
}

-------------------------------------------------------------------------------------------------------

8)   import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
   int i = 0;
        while(scan.hasNext()){
       i++;
       System.out.println(i + " " + scan.nextLine());
   }
    }
}

-----------------------------------------------------------------------------------------------------------------

9)    import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
static boolean flag = true; 
static int B,H;
static{

Scanner scan = new Scanner(System.in);
B = scan.nextInt();
scan.nextLine();
H = scan.nextInt();
scan.close();
if(B>0 && H>0){
    flag = true;

}else if(B<=0 || H<=0){
    flag=false;
    System.out.println("java.lang.Exception: Breadth and height must be positive");
}
}

public static void main(String[] args){
    if(flag){
      int area=B*H;
      System.out.print(area);
    }
    
}

}

---------------------------------------------------------------------------------------------------------------------

10)   import java.util.*;
import java.security.*;
public class Solution {
 public static void main(String[] args) {

  DoNotTerminate.forbidExit();

  try {
   Scanner in = new Scanner(System.in);
   int n = in .nextInt();
   in.close();
   

  
   String s = Integer.toString(n);

   
   if (n == Integer.parseInt(s)) {
    System.out.println("Good job");
   } else {
    System.out.println("Wrong answer.");
   }
  } catch (DoNotTerminate.ExitTrappedException e) {
   System.out.println("Unsuccessful Termination!!");
  }
 }
}


class DoNotTerminate {

 public static class ExitTrappedException extends SecurityException {

  private static final long serialVersionUID = 1;
 }

 public static void forbidExit() {
  final SecurityManager securityManager = new SecurityManager() {
   @Override
   public void checkPermission(Permission permission) {
    if (permission.getName().contains("exitVM")) {
     throw new ExitTrappedException();
    }
   }
  };
  System.setSecurityManager(securityManager);
 }
}

--------------------------------------------------------------------------------------------------------------------------
