package main;

import clase.*;

public class Main{
    static void main(String[] args) {
        CalatorieHandler calatorieAutobuz=new CalatorieAutobuz();
        CalatorieHandler calatorieTramvai=new CalatorieTramvai();
        CalatorieHandler calatorieTroleibuz=new CalatorieTroleibuz();
        CalatorieHandler calatorieMetrou=new CalatorieMetrou();



        calatorieTroleibuz.setCalatorieHandler(calatorieAutobuz);
        calatorieAutobuz.setCalatorieHandler(calatorieMetrou);
      //  calatorieTramvai.setCalatorieHandler(calatorieMetrou);


        System.out.println(calatorieTroleibuz.recomandaCalatorie(5));
        System.out.println(calatorieTroleibuz.recomandaCalatorie(12));
        System.out.println(calatorieTroleibuz.recomandaCalatorie(2));
        System.out.println(calatorieTroleibuz.recomandaCalatorie(4));
    }
}