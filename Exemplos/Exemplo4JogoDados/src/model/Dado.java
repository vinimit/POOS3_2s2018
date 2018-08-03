package model;

import java.util.Random;

public class Dado {
	private int face;

    public Dado(){
        sortear();
    }
    
    private void sortear(){
        Random random = new Random();
        face = random.nextInt(6) + 1;
    }    

    public int getFace(){
        return face;
    }

    public void jogar(){
        sortear();
    }
}