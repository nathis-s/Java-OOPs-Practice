// if the given data type is not available in fun1() argument then the datatype is promoted to higher level and if there is no availability in promoted data type fun1() then it gives error

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// class demo1{
//     public void fun1(int x){
//         System.out.println("int-arg");
//     }
// }
// class Test1{
//     public static void main(String[] args) throws IOException{
//         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//         float x=Float.parseFloat(br.readLine());
//         double y=Double.parseDouble(br.readLine());
//         demo1 d1=new demo1();
//         d1.fun1(x);
//         d1.fun1(y);
//     }
// }



// if the given data type is not available in fun1() argument then the datatype is promoted to higher level

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class demo1{
    public void fun1(float x){
        System.out.println("float-arg : "+x);
    }
}
class Test1{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x=Integer.parseInt(br.readLine());
        char y=(char)br.read();
        demo1 d1=new demo1();
        d1.fun1(x);
        d1.fun1(y);
    }
}
