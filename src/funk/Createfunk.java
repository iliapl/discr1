package funk;

import java.util.Scanner;
public class Createfunk {
    int cifr;
    public int perem;
    public int[] funk;
    int nomber;
    public int strok;
    int dlinznachfunk;

    public int getDlinznachfunk() {
        return dlinznachfunk;
    }

    public void create(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите количество переменных");
        perem = sc.nextInt();
        strok = (int) Math.pow(2,perem);
        System.out.println("Количество строк = " + strok);
        dlinznachfunk = strok;
        funk = new int[strok];
        for(int i=0;i<strok;i++){
            nomber = i+1;
            System.out.println("Введите значение 0 или 1 у функции в строке" +" " + nomber);
            cifr = sc.nextInt();
            if (cifr == 0 || cifr == 1){
                funk[i] = cifr;}
            else{
                System.out.println("Вы ввели неправильное значение, значение функции = 0");
                funk[i]=0;
            }
        }
    }
}
