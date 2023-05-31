import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class demo1{
    public void fun1(int x){
        System.out.println("int : "+x);
    }
    public void fun1(double y){
        System.out.println("double : "+y);
    }
    public void fun1(String str){
        System.out.println("str : "+str);
    }
}

class Test{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x=Integer.parseInt(br.readLine());
        double y=Double.parseDouble(br.readLine());
        String str=br.readLine();
        demo1 d1=new demo1();
        d1.fun1(x);
        d1.fun1(y);
        d1.fun1(str);
    }
}
