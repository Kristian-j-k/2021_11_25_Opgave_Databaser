package com.company;

public class studcontainer {
    public int antal;
    public studerende [] array;

    studcontainer(){
        antal=0;
        array=new studerende[100];
        for(int i=0;i<100;i++)
            array[i]=new studerende();
    }

    public int hentantal(){
        return antal;
    }

    public studerende[] hentarray(){
        return array;
    }

}
