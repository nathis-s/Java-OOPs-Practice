// class parentclass{
//     protected void fun1(){
//         System.out.println("Vsgrsj");
//     }
// }

// class childclass extends parentclass{
//     public void fun2(){

//     }
// }

// class Test1{
//     public static void main(String[] args){
//         parentclass pc=new parentclass();
//         pc.fun1();
//         childclass cc=new childclass();
//         cc.fun1();
//     }
// }



// import pack1.Test2;

// class Test1{
//     public static void main(String[] args){
//         Test2 t=new Test2();
//         t.fun1();
//         Test3 t2=new Test3();
//         t2.fun();
//     }
// }



import pack1.Test2;

class Test extends Test2{
    public static void main(String[] args){
        Test t=new Test();
        t.fun1();
    }
}
