package InheritanceDemo;

public class TestHybridInheritance {

    public static void main(String[] args) {

        Animal1 a = new Animal1();
        a.eat();

        Mammal m = new Mammal();
        m.walk();
        m.eat();

        Tiger t = new Tiger();
        t.roar();
        t.walk();
        t.eat();

        Reptile r = new Reptile();
        r.crawl();
        r.eat();

    }
}

class Animal1
{
    void eat()
    {
        System.out.println("eat");
    }
}

class Mammal extends Animal
{
    void walk()
    {
        System.out.println("walk");
    }
}

class Tiger extends Mammal
{
    void roar()
    {
        System.out.println("roar");
    }
}

class Reptile extends Animal1
{
    void crawl()
    {
        System.out.println("crawl");
    }
}
