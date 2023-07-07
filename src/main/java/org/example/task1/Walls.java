package org.example.task1;

public class Walls implements Obstacle{
    private int hight;
    public Walls(int hight){
        this.hight = hight;
    }
    @Override
    public int getHight() {
        return hight;
    }

    @Override
    public int getLength() {
        return 0;
    }
}
