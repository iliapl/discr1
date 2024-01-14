import Bulevfunk.Createbulfunk;
import Bulevfunk.Perevodvbulfunk;
import Tablist.Tablist;
import funk.Createfunk;
import provfunk.Provfunk;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
    Createfunk createfunk = new Createfunk();
    createfunk.create();
    Tablist tablist = new Tablist(createfunk);
    Perevodvbulfunk perevodvbulfunk = new Perevodvbulfunk();
    perevodvbulfunk.perevod(createfunk);
    Createbulfunk createbulfunk = new Createbulfunk(0, createfunk , perevodvbulfunk);
    Createbulfunk createbulfunk1 = new Createbulfunk(1, createbulfunk);
    Provfunk provfunk = new Provfunk(createfunk);
    provfunk.provone(createfunk);
    provfunk.provnull(createfunk);
    provfunk.provsamodv(createfunk);
    provfunk.provmon(createfunk, tablist);
    provfunk.provlin(perevodvbulfunk, createfunk, tablist, createbulfunk);
    provfunk.proverca();
    }
}