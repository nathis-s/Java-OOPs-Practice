// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// class demo1{
//     public void fun1(Object obj){
//         System.out.println("Object-arg");
//     }
//     public void fun1(String str){
//         System.out.println("String-arg");
//     }
// }
// class Test1{
//     public static void main(String[] args) throws IOException{
//         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//         String str=br.readLine();
//         demo1 d1=new demo1();
//         d1.fun1(new Object());
//         d1.fun1(str);
//     }
// }



// string class is a child class of object class
// so if we pass the value the first priority is given to the child class and then parent class

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class demo1{
    public void fun1(Object obj){
        System.out.println("Object-arg");
    }
    public void fun1(String str){
        System.out.println("String-arg");
    }
}
class Test1{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        demo1 d1=new demo1();
        d1.fun1(null);
    }
}
