package org.example.task1;

public interface Runner {

   default boolean jump(int hight) {
        if (hight <= getMaxJump()) {
            System.out.printf("%s jumped wall %d m. \n", getName(), hight);
            return true;
        } else {
            System.out.printf("%s did't jumped %d m \n", getName(), hight);


            return false;
        }
    }

    default boolean run(int lenght) {
        if (lenght <= getMaxRun()) {
            System.out.printf("%s runed wall %d m. \n", getName(), lenght);
            return true;
        } else {
            System.out.printf("%s did't runed %d m \n", getName(), lenght);


            return false;
        }
    }
    String getName();

    int getMaxRun();
    int getMaxJump();

}
