import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        String s="==";
        if(a>b){ s=">"; }
        else if(a<b) { s="<"; }
        System.out.println(s);
    }
}