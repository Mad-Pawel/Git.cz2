package com.company;

public class Main {

    static void zamiana(int []tab, int index1, int index2)
    {
        int tmp = tab[index1];
        tab[index1] = tab[index2];
        tab[index2] = tmp;

    }
    static void wypisz(int []tab)
    {
        for (int x: tab) {
            System.out.println(x);
        }
    }
    static void sortBabelkowe(int []tab)
    {
        for(int i = 0; i < tab.length;i++)
        {
            for (int j =0 ; j < tab.length; j++)
            {
                if(tab[j] > tab[i])
                    zamiana(tab,i,j);

            }
        }


    }

    public static void main(String[] args) {
	int []tab = {1,2,3,4,12,54,-5};

	zamiana(tab,0,2);
        sortBabelkowe(tab);
	wypisz(tab);

    }
}
