import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class demo1{
    public void fun1(){
        System.out.println("no-arg");
    }
    public void fun1(int x){
        System.out.println("int-arg");
    }
    public void fun1(double y){
        System.out.println("double-arg");
    }
    public void fun1(String str){
        System.out.println("string-arg");
    }
    public void fun1(int x,double y){
        System.out.println("int_double-arg");
    }
    public void fun1(int x,int y){
        System.out.println("int_int-arg");
    }
    public void fun1(double y,int x){
        System.out.println("double_int-arg");
    }
    public void fun1(double x,double y){
        System.out.println("double_double-arg");
    }
}

class Test{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x=Integer.parseInt(br.readLine());
        double y=Double.parseDouble(br.readLine());
        String str=br.readLine();
        demo1 d1=new demo1();
        d1.fun1();
        d1.fun1(x);
        d1.fun1(y);
        d1.fun1(str);
        d1.fun1(x,y);
        d1.fun1(x,x);
        d1.fun1(y,x);
        d1.fun1(y,y);
    }
}
