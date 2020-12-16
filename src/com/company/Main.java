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
    static int znajdzmin(int []tab , int i) {
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
        return -1;
    }
    static void Sortuj(int tab[])
    {
        int j = tab.length -1;
        int x;
        int i;

        while (j >= 0)
        {
            boolean check = true;
            x = tab[j];
            i = j+1;
            while(i <= tab.length -1)
            {
                if(x <= tab[i])
                {
                    tab[i-1] = x;
                    j--;
                    check = false;
                    break;
                }
                else
                {
                    tab[i-1] = tab[i];
                    i++;
                }

            }
            if (check){
            tab[i-1] = x;
            j--;
            }


        }


    }


    public static void main(String[] args) {
	int []tab = {1,-15,3,4,12,54,-5,10,-12};

	wypisz(tab);
	Sortuj(tab);
	System.out.println("Posrotowane:");
	wypisz(tab);
	

    }
}
