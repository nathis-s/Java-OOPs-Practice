// we can't use child reference to create parent class object

// class demo1{
//     public void fun1(){
//         System.out.println("fun1()");
//     }
// }

// class demo2 extends demo1{
//     public void fun2(){
//         System.out.println("fun2()");
//     }
// }

// class Test1{
//     public static void main(String[] args){
//         demo2 d2=new demo1();
//     }
// }



// we can't execute child class method by creating object with parent class reference and parent class runtime object

// class demo1{
//     public void fun1(){
//         System.out.println("fun1()");
//     }
// }

// class demo2 extends demo1{
//     public void fun2(){
//         System.out.println("fun2()");
//     }
// }

// class Test1{
//     public static void main(String[] args){
//         demo1 d1=new demo1();
//         d1.fun1();
//         d1.fun2();
//     }
// }



// we can't execute child class method by creating object with parent class reference and child class runtime object

// class demo1{
//     public void fun1(){
//         System.out.println("fun1()");
//     }
// }

// class demo2 extends demo1{
//     public void fun2(){
//         System.out.println("fun2()");
//     }
// }

// class Test1{
//     public static void main(String[] args){
//         demo1 d1=new demo2();
//         d1.fun1();
//         d1.fun2();
//     }
// }



// we can execute child class method by creating object with child class reference and child class runtime object

// class demo1{
//     public void fun1(){
//         System.out.println("fun1()");
//     }
// }

// class demo2 extends demo1{
//     public void fun2(){
//         System.out.println("fun2()");
//     }
// }

// class Test1{
//     public static void main(String[] args){
//         demo2 d1=new demo2();
//         d1.fun1();
//         d1.fun2();
//     }
// }
