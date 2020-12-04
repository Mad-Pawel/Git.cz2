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
    static int znaidzmin(int []tab , int i) {
        if (i <= tab.length - 1)
        {
            int min = tab[i];
            int index = i;
            for(;i < tab.length; i++)
            {
                if(min > tab[i])
                {
                    min = tab[i];
                    index = i;
                }

            }
            return index;
        }
        System.out.println("Out of index");
        return 0;


    }

    public static void main(String[] args) {
	int []tab = {1,-15,3,4,12,54,-5,10,-12};

        //sortBabelkowe(tab);
	int min = znaidzmin(tab,2);
	System.out.println(min);

	/*System.out.println("Pierwsza");
	wypisz(tab);
        sortBabelkowe(tab);
        System.out.println("Druga");
	wypisz(tab);*/
	

    }
}
