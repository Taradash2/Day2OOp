package org.example;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Barsik", "red");
        cat.jump();
        cat.voice();
        System.out.println("Cat color: " + cat.getColor());
        System.out.println("Cat name: " + cat.getName());

        Cat cat1 = new Cat("Tom", "Black");
        cat1.jump();


        Dog dog = new Dog("Ched", 30);
        dog.jump();
        dog.voice();
        System.out.println("Dog weight: " + dog.getWeight());

        Animal cat2 = new Cat("Pich", "grean");
        cat2.jump();
        cat2.voice();

        if(cat2 instanceof Dog){
            System.out.println("Cat Color" + ((Dog)cat2).getWeight());

        }
        voiceAlAnimals(new Animal[] {cat2, dog, cat1});

    }

    public static void voiceAlAnimals(Animal[] animals){
        for (Animal animal : animals){
            animal.voice();
            if (animal instanceof Dog){
                System.out.println("Dog weight: %s kg. \n" + ((Dog)animal).getWeight());

            }
        }
    }

}

abstract class Animal{
    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private String name;
    public void  jump(){
        System.out.println("Animal jump");
    }

    public abstract void voice();


}

interface Runnable{
    void swiming(int distance);

    void run(int distance);
}
interface Flyeble{
    void fly(int distance);
}
class CatV2 implements Runnable{

}


class Dog extends Animal{

    private int weight;


    public Dog(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void jump() {
        System.out.println("Dog jump");
    }

    @Override
    public void voice() {
        System.out.println("Dog burking");
    }
}

class Cat extends Animal{
    public String getColor() {
        return color;
    }

    private String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }


    @Override
    public void jump() {
        System.out.println("cat jump");
    }

    @Override
    public void voice() {
        System.out.println("cat meows");
    }
}