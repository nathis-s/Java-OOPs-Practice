interface demo1{
    public void fun1();
}

interface demo2{
    public void fun1();
}

interface demo3 extends demo1,demo2{

}

class demo4 implements demo3{
    public void fun1(){
        System.out.println("fun1");
    }
}

class Test1{
    public static void main(String[] args){
        demo1 d1=new demo4();
        d1.fun1();
        demo2 d2=new demo4();
        d1.fun1();
        demo3 d3=new demo4();
        d3.fun1();
        demo4 d4=new demo4();
        d4.fun1();
    }
}
