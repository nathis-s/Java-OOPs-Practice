// whatever methods we have declared in abstract class we must initialize all the methods in child class,otherwise it gives error

// abstract class abstractparent{
//     public abstract void fun1();
//     public abstract void fun2();
// }

// class abstractchild extends abstractparent{
//     public void fun1(){
//         System.out.println("Abstract child fun1()");
//     }
// }

// public class Test{
//     public static void main(String[] args){
//         abstractparent ap=new abstractchild();
//         ap.fun1();
//     }
// }



// whatever methods we have declared in abstract class we must initialize all the methods in child class
// There are two methods to solve this problem
// Method 1:

// abstract class abstractparent{
//     public abstract void fun1();
//     public abstract void fun2();
// }

// class abstractchild extends abstractparent{
//     public void fun1(){
//         System.out.println("Abstract child fun1()");
//     }
//     public void fun2(){
//         System.out.println("Abstract child fun2()");
//     }
// }

// public class Test{
//     public static void main(String[] args){
//         abstractparent ap=new abstractchild();
//         ap.fun1();
//         ap.fun2();
//     }
// }



// Method 2:
// we can create another child class for previous child class

// abstract class abstractparent{
//     public abstract void fun1();
//     public abstract void fun2();
// }

// abstract class abstractchild extends abstractparent{
//     public void fun1(){
//         System.out.println("Abstract child fun1()");
//     }
// }

// class abstractsubchild extends abstractchild{
//     public void fun2(){
//         System.out.println("Abstract subchild fun2()");
//     }
// }

// class Test{
//     public static void main(String[] args){
//         abstractsubchild asc=new abstractsubchild();
//         asc.fun1();
//         asc.fun2();
//     }
// }




// abstract class vehicle{
//     public abstract int wheels();
// }

// class car extends vehicle{
//     public int wheels(){
//         return 4;
//     }
// }

// class bike extends vehicle{
//     public int wheels(){
//         return 2;
//     }
// }

// class Test{
//     public static void main(String[] args){
//         bike b=new bike();
//         System.out.println(b.wheels());
//         car c=new car();
//         System.out.println(c.wheels());
//     }
// }



// we can also implement the method in child class without any declaration in parent class but only use  of abstract is,if we declared a method in parent class it should compulsorily implemented in parent class

// abstract class vehicle{
// }

// class car extends vehicle{
//     public int wheels(){
//         return 4;
//     }
// }

// class bike extends vehicle{
//     public int wheels(){
//         return 2;
//     }
// }

// class Test{
//     public static void main(String[] args){
//         bike b=new bike();
//         System.out.println(b.wheels());
//         car c=new car();
//         System.out.println(c.wheels());
//     }
// }
