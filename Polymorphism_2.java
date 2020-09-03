package Exercise;

public class Polymorphism_2 {
    public static void main(String args[]){
        Musician m1 = new Musician();
        Instrument e1 = new Erhu();
        Instrument p1 = new Paino();
        Instrument v1 = new Volin();
        m1.play(e1);
        m1.play(v1);
        m1.play(p1);
    }
}
class Instrument{ //乐器类
    public void makeSound(){
    }
}
class Erhu extends Instrument{
    public void makeSound(){
        System.out.println("演奏二胡");
    }
}
class Paino extends Instrument{
    public void makeSound(){
        System.out.println("演奏钢琴");
    }
}
class Volin extends Instrument{
    public void makeSound(){
        System.out.println("演奏小提琴");
    }
}
class Musician{
    public void play(Instrument a){
        a.makeSound();
    }
}