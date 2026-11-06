class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Dog {
    @Override
    void sound() {
        System.out.println("cat meows");
    }
}
class Main{
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        a=new Cat();
        a.sound();
    }
}