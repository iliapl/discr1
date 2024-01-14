package Tablist;

import funk.Createfunk;

import java.util.Arrays;

public class Tablist {
int strok;
public int[][] tablist;
    public Tablist(Createfunk createfunk){
        strok = createfunk.strok;
        tablist = new int[strok][createfunk.perem];
        for(int i = 0; i < strok; i++){
            for(int a = createfunk.perem - 1; a >= 0; a--){
                tablist[i][a] = (i/ (int) Math.pow(2, a))%2;
            }
        }

    }
}
