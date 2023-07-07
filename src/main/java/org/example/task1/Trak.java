package org.example.task1;

public class Trak implements Obstacle{
    private int lenght;
    public Trak(int lenght){
        this.lenght = lenght;

    }
    @Override
    public int getHight() {
        return  0;
    }

    @Override
    public int getLength() {
        return lenght;
    }
}
