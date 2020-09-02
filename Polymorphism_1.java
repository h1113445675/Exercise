package Exercise;

public class Polymorphism_1 {
    public static void main(String args[]){
        Pet p1 = new Pet();
        Master m1 = new Master();
        YingWu y1 = new YingWu();
        Dog d1 = new Dog();
        Cat c1 = new Cat();
        m1.feed(y1);
        m1.feed(c1);
        m1.feed(d1);
    }
}
class Master{
    public void feed(Pet pet){
        pet.eat();
    }
}
class Pet{
    public  void eat(){
    }
}

class YingWu extends Pet{
    public void eat(){
        System.out.println("鹦鹉正在吃东西");
    }
}
class Dog extends Pet{
    public void eat(){
        System.out.println("小狗正在吃东西");
    }
}
class Cat extends Pet{
    public void eat(){
        System.out.println("猫咪正在吃东西");
    }
}