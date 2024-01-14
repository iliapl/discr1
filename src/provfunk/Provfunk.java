package provfunk;

import Bulevfunk.Createbulfunk;
import Bulevfunk.Perevodvbulfunk;
import Tablist.Tablist;
import funk.Createfunk;

public class Provfunk {
    boolean provsamodv;
    boolean provnull;
    boolean provone;
    boolean provlin = true;
boolean provmon;
    int[] samodv;
    public Provfunk(Createfunk createfunk){
           samodv = new int[createfunk.getDlinznachfunk()/2 -1];
    }
    public boolean provnull(Createfunk createfunk){
        provnull = createfunk.funk[0] == 0;
        System.out.println("provnull" + provnull);
        return provnull;
    }
    public boolean provone(Createfunk createfunk){
        provone = createfunk.funk[createfunk.strok-1] == 1;
        System.out.println("provone" + provone);
        return provone;
    }
    public boolean provsamodv(Createfunk createfunk){
        int provprov =0;
        if(createfunk.funk[0] != createfunk.funk[createfunk.getDlinznachfunk()/2 + 1]){
            for(int i=1; i < createfunk.strok/2 -1; i++){
                if(createfunk.funk[i] != createfunk.funk[createfunk.getDlinznachfunk()/2 + i + 1]){
                    samodv[i-1] = 0;
                }
                else{
                    samodv[i-1] = 1;
                }
            }
            for(int k=0; k < samodv.length; k++){
                provprov = provprov + samodv[k];
            }
            if(provprov == 0){
                provsamodv = true;
            }
            else{
                provsamodv = false;
            }
        }
        else{
            provsamodv = false;
        }
        System.out.println("provsamodv" + provsamodv);
        return provsamodv;
    }
public boolean provlin(Perevodvbulfunk perevodvbulfunk, Createfunk createfunk, Tablist tablist, Createbulfunk createbulfunk){
        int h;
       Createbulfunk[] createbulfunks = new Createbulfunk[perevodvbulfunk.bulevfunk.length - 1];
       createbulfunks[0] = new Createbulfunk(0, createfunk, perevodvbulfunk);
       for(int i = 1; i < createbulfunk.bulfunk.length - 1; i++){
           createbulfunks[i] = new Createbulfunk(i, createbulfunks[i -1]);
       }
       for(int t = 0; t < createbulfunk.bulfunk.length - 1; t++){
           h = 0;
           if(createbulfunks[t].bulfunk[0]){
               for(int a = 0; a < createfunk.perem; a++){
                   if(a == 0){
                   h = tablist.tablist[t][a];
                   }
                   else{
                       h = h + tablist.tablist[t][a];
                   }
               }
           }
           if(h >= 2){
               provlin = false;
           }
       }
       System.out.println(" provlin" +  provlin);
    //в массиве результатов функций проверить каждое значение, если значение 1 то проверять таблицу истинности
    return  provlin;
}
public boolean provmon(Createfunk createfunk, Tablist tablist){
        int now;
        int next;
        for(int i = 0; i < createfunk.strok-1; i++){//а каждой новой строке р равно 0
            now = 0;
            next = 0;
            for(int a = 0; a < createfunk.perem; a++){
                if(a == 0){
                now = tablist.tablist[i][a];
                next = next + tablist.tablist[i + 1][a];
                }
                else{
                    now = now + tablist.tablist[i][a];
                    next = next + tablist.tablist[i+1][a];
                }
            }
           if( Math.abs(now -  next) < 2){
               provmon = createfunk.funk[i] >= createfunk.funk[i + 1];
           }

        }
    System.out.println("provmon" +  provmon);
        return  provmon;
}
public void proverca(){
        if(provone && provnull && provlin && provmon && provsamodv){
            System.out.println("Не является пфн");
        }
        else {
            System.out.println("Является пфн");
        }
}
}
