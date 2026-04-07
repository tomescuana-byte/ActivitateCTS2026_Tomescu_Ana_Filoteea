package main;

import clasa.ConexiuneDB;

public class Main {
    public static void main(String[] args) {
        ConexiuneDB db1= ConexiuneDB.getInstance("dcb");
        ConexiuneDB db2= ConexiuneDB.getInstance("acd");

        db1.conecteaza();
        db2.conecteaza();
        System.out.println(db1 == db2);



    }
}