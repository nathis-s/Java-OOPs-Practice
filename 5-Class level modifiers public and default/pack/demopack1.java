package pack;

class demopack3{
    void fun3(){
        System.out.println("Inside package 3");
    }
}

class demopack2{
    void fun2(){
        System.out.println("Inside package 2");
        demopack3 dp=new demopack3();
        dp.fun3();
    }
}

public class demopack1{
    public void fun1(){
        System.out.println("Inside package");
        demopack2 dp2=new demopack2();
        dp2.fun2();
    }
}

