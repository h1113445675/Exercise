package Exercise;
import java.util.Scanner;
public class GuessNumber {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        B b1=new B();
        b1.setV(s.nextInt());
            while(b1.guess(s.nextInt())!="正确"){
                b1.guess(s.nextInt());
            }
    }
}
class A {
    public int v;
    public void setV(int number){
        v=number;
    }
}
class B extends A {
    public String guess(int number){
        if(number>v) {
            System.out.println("大了");
            return "大了";
        }
        else if(number<v) {
            System.out.println("小了");
            return "小了";
        }
        else {System.out.println("正确");
            return "正确";
        }
    }
}