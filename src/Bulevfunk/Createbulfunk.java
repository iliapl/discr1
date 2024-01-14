package Bulevfunk;

import funk.Createfunk;

public class Createbulfunk {
    private String name;
    public boolean[] bulfunk;
    public Createbulfunk(int i, Createfunk createfunk, Perevodvbulfunk perevodvbulfunk){
        this.name = "znach" + i;
        bulfunk = new boolean[createfunk.funk.length];
        for(int t = 0; t < createfunk.funk.length-1; t++){
            bulfunk[t] = perevodvbulfunk.bulevfunk[t] ^ perevodvbulfunk.bulevfunk[t+1];
        }
    }
    public Createbulfunk(int i, Createbulfunk createbulfunk){
        this.name = "znach" + i;
        bulfunk = new boolean[createbulfunk.bulfunk.length-1];
        for(int t = 0; t <createbulfunk.bulfunk.length-1; t++){
            bulfunk[t] = createbulfunk.bulfunk[t] ^ createbulfunk.bulfunk[t+1];
        }
        for(int a = 0; a < bulfunk.length; a++){

        }
    }
}
