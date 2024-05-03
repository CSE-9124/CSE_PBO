package Tugas_LAB_PBO.TP_6.Task1_Classes.Dog;

import Tugas_LAB_PBO.TP_6.Task1_Classes.IMystery; 

abstract class Dog implements IMystery {
    int position, averageLength;
    
    public Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    // public abstract void move();
    
    abstract void describe();
    

    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }

    public int getAverageLength() {
        return averageLength;
    }
    public void setAverageLength(int averageLength) {
        this.averageLength = averageLength;
    }
}
