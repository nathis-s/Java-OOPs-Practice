// abstract class abstracttest{
//     public abstract void fun1();
//     public abstract void fun2();
// }

// class abstractchild extends abstracttest{
//     public void fun1(){
//         System.out.println("Abstract child class fun1()");
//     }
//     public void fun2(){
//         System.out.println("Abstract child class fun2()");
//     }
// }

// class Test{
//     public static  void main(String[] args){
//         abstracttest at=new abstractchild();
//         at.fun1();
//         at.fun2();
//     }
// }



// abstract class abstracttest{
//     public abstract void fun1();
//     public void fun2(){
//         System.out.println("Abstract parent class fun2()");
//     }
// }

// class abstractchild extends abstracttest{
//     public void fun1(){
//         System.out.println("Abstract child class fun1()");
//     }
// }

// class Test{
//     public static  void main(String[] args){
//         abstracttest at=new abstractchild();
//         at.fun1();
//         at.fun2();
//     }
// }



// we can create object and access method either by creating object for parent class with respect to child class or by creating object for child class with respect to child class

// abstract class abstracttest{
//     public abstract void fun1();
//     public void fun2(){
//         System.out.println("Abstract parent class fun2()");
//     }
// }

// class abstractchild extends abstracttest{
//     public void fun1(){
//         System.out.println("Abstract child class fun1()");
//     }
// }

// class Test{
//     public static  void main(String[] args){
//         abstractchild ac=new abstractchild();
//         ac.fun1();
//         abstracttest at=new abstractchild();
//         at.fun2();
//     }
// }



// if parent and child class both has same method then child class method will get executed

// abstract class abstracttest{
//     public abstract void fun1();
//     public void fun2(){
//         System.out.println("Abstract parent class fun2()");
//     }
// }

// class abstractchild extends abstracttest{
//     public void fun1(){
//         System.out.println("Abstract child class fun1()");
//     }
//     public void fun2(){
//         System.out.println("Abstract child class fun2()");
//     }
// }

// class Test{
//     public static  void main(String[] args){
//         abstracttest at=new abstractchild();
//         at.fun1();
//         at.fun2();
//         abstracttest at2=new abstractchild();
//         at2.fun2();
//     }
// }



// abstract class demo1{
//     public abstract void fun1();
//     public abstract void fun2();
// }

// abstract class demo2 extends demo1{
//     public void fun1(){

//     }
// }

// class demo3 extends demo2{
//     public void fun2(){

//     }
// }

