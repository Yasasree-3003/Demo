import java.util.Scanner;
class Demo1{
public static int add(int a,int b){
return a+b;
}
public static void printtable(int a){
for(int i=0;i<=10;i++)
System.out.println(a+"*"+i+"="+a*i);
}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n1=s.nextInt();
int n2=s.nextInt();
int res=Demo1.add(n1,n2);
System.out.println(res);
Demo1.printtable(n1);
Demo1.printtable(n2);
}
}

