class B
{
public static void main(){
System.out.println("Main method without arguments");
}
public static void main(int x){
System.out.println("Main mathod with:"+x*20);
}
public static void main(String s){
System.out.println( "Welcome"+s);
}
public static void main(String args[]){
System.out.println("she is typing");
main();
main("to javatraining");
main(4);
}
}