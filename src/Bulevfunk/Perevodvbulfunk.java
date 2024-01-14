package Bulevfunk;

import funk.Createfunk;

public class Perevodvbulfunk {
    public boolean[] bulevfunk;
    public void perevod(Createfunk createfunk){
        bulevfunk = new boolean[createfunk.getDlinznachfunk()];
        for(int i=0; i < createfunk.getDlinznachfunk(); i++){
            bulevfunk[i] = createfunk.funk[i] == 1;
        }
    }
}
