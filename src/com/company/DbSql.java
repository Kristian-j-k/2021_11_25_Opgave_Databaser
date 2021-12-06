package com.company;
import java.sql.*;

public class DbSql {
    private Connection connection;
    private Statement stmt;

    DbSql(){
        connection = null;
        stmt = null;
        try {
            String url = "jdbc:sqlite:C://........";//Indsæt dit eget databasenavn
            connection = DriverManager.getConnection(url);
            System.out.println("forbundet til database");
        } catch (SQLException throwables) {
            throwables.printStackTrace();

        }
    }

    public void DbSqlUpdate(String SQLUpdate) {
        DbSql c1 = new DbSql();  //TO DO NO NEED
        try {
            Statement sta = connection.createStatement();
            sta.executeUpdate(SQLUpdate);
            sta.close();            ///TO DO virker det?
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    //opret tabel fag
    public void createTableFag(){
        DbSqlUpdate("CREATE TABLE fag ( " +
                "fagnr int NoT NULL,"+
                "fagnavn varchar(255),"+
                "PRIMARY KEY (fagnr)" +
                ")");
    }

    //opret tabel studerende
    public void createTableStuderende() {
        DbSqlUpdate("CREATE TABLE studerende(" +
                "stdnr INTEGER NOT NULL UNIQUE," +
                "fnavn string," +
                "enavn string," +
                "adresse string," +
                "mobil string," +
                "klasse string," +
                "PRIMARY KEY(stdnr AUTOINCREMENT)" +
                ")");
    }

        //opret tabel studfag
        public void createTableStudfag() {
            DbSqlUpdate("CREATE TABLE studfag (" +
                    "stdnr integer," +
                    "fagnr	integer," +
                    "FOREIGN KEY(stdnr) REFERENCES studerende(stdnr)," +
                    "FOREIGN KEY(fagnr) REFERENCES fag(fagnr)," +
                    "PRIMARY KEY(stdnr,fagnr)" +
                    ")");
        }

    //Metoden indsætter s i tabellen studerende i din database
    public void indsaetstud(studerende s) {
            DbSqlUpdate("INSERT INTO studerende (fnavn,enavn, adresse, mobil, klasse)" + //
                    "VALUES ('"
                    +s.getFnavn()+"','"
                    +s.getEnavn()+"','"
                    +s.getAdresse()+"','"
                    +s.getMobil()+"','"
                    +s.getKlasse()+"');");
        System.out.println("Informationerne om den studerende er gemt, Studienummer er oprettet");
    }

    //Metoden indsætter f i tabellen fag i din database
    public void indsaetfag(fag f){
        DbSqlUpdate("INSERT INTO fag (fagnr,fagnavn)" +
                "VALUES('"+
                f.getFagnr()+"','"+
                f.getFagnavn()+"');");
    }

    //Metoden opdaterer klassen for den studerende med studienummer stdnr
    public void updatestudklasse(int stdnr,String nyklasse){
    DbSqlUpdate("UPDATE studerende " +
            "SET klasse = '" +nyklasse+"' "+
            "WHERE stdnr = "+stdnr+";");
    }


    public void DBSQLSelect(String SQLSelect) {

    }
//opgave 7
 /*   //Metoden returnerer den studerende med studienummer stdnr
    public studerende soegstud(int stdnr){
        String sog = "SELECT enavn FROM studerende WHERE  stdnr = '2'";
        studerende s1 = new studerende();

        try {
            Statement sta = connection.createStatement();
            ResultSet res = sta.executeQuery(sog);

            while (res.next()){
                s1.setFnavn(res.getString(2));
            }
//        connection.close();            ///TO DO virker det?
        }catch (SQLException e){
            System.out.println("uha da da, nu er den gal igen "+e);
        }


       return s1;
    } */

    //Metoden returnerer den studerende med studienummer stdnr
    public void tud(){
        String sog = "SELECT * FROM studerende WHERE  stdnr = '2'";
        String ret="";
        try {
            Statement sta = connection.createStatement();
            ResultSet res = sta.executeQuery(sog);

            while (res.next()){
                ret = ret+res.getString(2)+res.getString(3);
            }
//        connection.close();            ///TO DO virker det?
        }catch (SQLException e){
            System.out.println("uha da da, nu er den gal igen "+e);
        }

        System.out.println(ret);


    }

    //Metoden returnerer den studerende med studienummer stdnr
    public studerende soegstud(int stdnr){
        String sog = "SELECT * FROM studerende WHERE  stdnr = "+stdnr;
        studerende s1 = new studerende();

        try {
            Statement sta = connection.createStatement();
            ResultSet res = sta.executeQuery(sog);

            while (res.next()){
                s1.setStdnr(res.getInt(1));
                s1.setFnavn(res.getString(2));
                s1.setEnavn(res.getString(3));
                s1.setAdresse(res.getString(4));
               // s1.setPostnr(res.getString());
                s1.setMobil(res.getString(5));
                s1.setKlasse(res.getString(6));
            }
        connection.close();            ///TO DO virker det?
        }catch (SQLException e){
            System.out.println("uha da da, nu er den gal igen "+e);
        }
        return s1;

    }

    //Metoden returnerer en studcontainer med givnet efternavn
    public studcontainer soegEnavn(String enavn){
        studcontainer sc = new studcontainer();
        try{
            String sql ="SELECT * FROM studerende WHERE Enavn = '"+enavn+"'";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            sc.antal = 0;
            int i = 0;
            while (rs.next()){
                sc.array[i].setStdnr(rs.getInt(1));
                sc.array[i].setFnavn(rs.getString(2));
                sc.array[i].setEnavn(rs.getString(3));
                i++;
            }
            sc.antal=i;
            for (i = 0; i < sc.antal; i++) {
                System.out.format("\n%d %s %s",
                        sc.array[i].getStdnr(),sc.array[i].getFnavn(),sc.array[i].getEnavn());

            }
            connection.close();

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }

        return sc;
    }



}

