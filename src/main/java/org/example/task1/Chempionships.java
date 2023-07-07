package org.example.task1;

public class Chempionships {
    public static void main(String[] args) {
        //Бегуны
        Runner[] runners = {
                new Cat("Shine", 1500, 5),
            new Human("Vova", 5000, 4),
            new Robot("Rob", 1000000, 10),
            new Human("Jeka", 1000, 1),
            new Cat("looloo", 1000, 5)
        };


       //Препятствия
        Obstacle[] obstacles = {
                new Trak(1200),
                new Walls(3),
                new Trak(2000),
                new Walls(2),
                new Trak(3000),
                new Walls(4),

        };

        for (Runner r : runners){
            for (Obstacle o : obstacles){
                if( o instanceof Trak){
                    if(!r.run(o.getLength()))
                        break;

                }
                else if(o instanceof Walls){
                    if (!r.jump(o.getHight()))
                        break;
                }
            }
        }
    }
}
