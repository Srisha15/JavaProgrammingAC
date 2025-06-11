
public class OOPSInh {
    public static void main(String[] args) {
        // Fish nemo = new Fish();
        // nemo.eat();

        Dog pintu = new Dog();
        pintu.eat();  //Function in Animal
        pintu.legs = 4;  //Property of Mammal
        System.out.println(pintu.legs);
        pintu.walk();


        Bird tinki = new Bird();
        tinki.fly();
        tinki.eat();  //Animal --> Hierarchial Inheritance


    }

}

//parent class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void attacks(){
        System.out.println("attacks");
    }
}

// child class
class Fish extends Animal{
    int fins;

    void swims(){
        System.out.println("Swims");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}

class Mammals extends Animal{
    int legs;

    void walk(){
        System.out.println("Walks");
    }
}

class Dog extends Mammals{   //Multi level Inheritance
    String breed;
}


