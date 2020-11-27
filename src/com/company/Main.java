package com.company;

public class Main {

    static void zamiana(int []tab, int index1, int index2)
    {
        int tmp = tab[index1];
        tab[index1] = tab[index2];
        tab[index2] = tmp;
        // return tab;
    }

    public static void main(String[] args) {
	int []tab = {1,2,3,4,12,54,-5};

	zamiana(tab,0,2);
            System.out.println(tab[0]);

    }
}
