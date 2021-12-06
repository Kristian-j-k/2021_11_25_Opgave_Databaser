package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

/*
    //opret tabeller opg 3
    DbSql d1 = new DbSql();
    d1.createTableFag();
    d1.createTableStuderende();
    d1.createTableStudfag();
 */

 /*   //Opretter studerende med autoincrement studienummer opg4
    studerende s1 = new studerende();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tast fornavn: ");
        s1.setFnavn(scanner.next());
        System.out.println("Tast efternavn: ");
        s1.setEnavn(scanner.next());
        System.out.println("Tast vejnavn: ");
        String vej = scanner.next();
        System.out.println("Tast husnummer: ");
        String husNummer = scanner.next();
        s1.setAdresse(vej+" "+husNummer);
        System.out.println("Tast postnummer: ");
        s1.setPostnr(scanner.next());
        System.out.println("Tast mobilnummer: ");
        s1.setMobil(scanner.next());
        System.out.println("Tast klassenummer: ");
        s1.setKlasse(scanner.next());

        DbSql d2 = new DbSql();
        d2.indsaetstud(s1);
*/

/*        //opretter nye fag opg5
        fag f1 = new fag();
        f1.setFagnr(110);
        f1.setFagnavn("Gymnastik");
        DbSql d3 = new DbSql();
        d3.indsaetfag(f1);
*/

/*        //opdaterer en studerendes klasse opg6
        DbSql d4=new DbSql();
        d4.updatestudklasse(11,"3");
*/

/*        //returnere den studerende der søges på Opg7
        DbSql d5 = new DbSql();
        System.out.println( d5.soegstud(5)  );
*/

/*        // udskriv fra array fra studcontainer opgave 8
        DbSql d6 = new DbSql();
        studcontainer sc1 = new studcontainer();
        sc1.array[0]=d6.soegstud(1);
        sc1.array[1]=d6.soegstud(2);
        sc1.array[2]=d6.soegstud(3);
        sc1.array[3]=d6.soegstud(4);

        System.out.println(Arrays.toString(sc1.hentarray()));
*/

/*      // søg på efternavn opgave 9
        DbSql d7 = new DbSql();
        d7.soegEnavn("Hansen");
*/
    }
}
