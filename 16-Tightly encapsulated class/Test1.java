// here demo1 class is tightly encapsulated
// demo2 class is not tightly encapsulated
// demo3 is tightly encapsulated
// demo4 is not tightly encapsulated

// class demo1{
//     private int a=13;
// }

// class demo2 extends demo1{
//     public int b=34;
// }

// class demo3 extends demo1{
//     private int c=453;
// }

// class demo4 extends demo2{
//     private int d=64;
// }

// class Test1{
//     public static void main(String[] args){
//         demo1 d1=new demo1();
//         demo2 d2=new demo2();
//         demo3 d3=new demo3();
//         demo4 d4=new demo4();
//     }
// }



// class demo1{
//     private int a=13;
//     void fun1(){
//         System.out.println("a : "+a);
//     }
// }

// class demo2 extends demo1{
//     public int b=34;
//     void fun2(){
//         System.out.println("b : "+b);
//     }
// }

// class demo3 extends demo1{
//     private int c=453;
//     void fun3(){
//         System.out.println("c : "+c);
//     }
// }

// class demo4 extends demo2{
//     private int d=64;
//     void fun4(){
//         System.out.println("d : "+d);
//     }
// }

// class Test1{
//     public static void main(String[] args){
//         demo1 d1=new demo1();
//         d1.fun1();
//         demo2 d2=new demo2();
//         d2.fun1();
//         d2.fun2();
//         demo3 d3=new demo3();
//         d3.fun1();
//         d3.fun3();
//         demo4 d4=new demo4();
//         d4.fun2();
//         d4.fun4();
//     }
// }
