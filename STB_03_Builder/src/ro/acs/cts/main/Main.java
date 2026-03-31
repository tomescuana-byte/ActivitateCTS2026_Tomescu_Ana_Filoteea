package ro.acs.cts.main;

import ro.acs.cts.builder.AbstractBuilder;
import ro.acs.cts.builder.AutobuzLinie;
import ro.acs.cts.builder.AutobuzLinieBuilder;

public class Main {
    public static void main(String[] args) {
        AutobuzLinie ab1=new AutobuzLinieBuilder().setDeschideUsa(true).build("Ana","jjjjjj");
        AutobuzLinie ab2=new AutobuzLinieBuilder().build("Ban","lllll");
        System.out.println(ab1.toString());
        System.out.println(ab2.toString());
    }
}