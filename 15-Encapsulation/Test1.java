import java.util.Scanner;

class abstaction{
    private double balance=1000;
    public double getbalance(){
        return balance;
    }
    public double setbalance(double add){
        this.balance+=add;
        return balance;
    }
}

class Test1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        abstaction ab=new abstaction();
        System.out.println(ab.getbalance());
        System.out.println(ab.setbalance(sc.nextInt()));
    }
}
