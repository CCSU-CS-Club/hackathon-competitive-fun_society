package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int k,m,n,si;
        n = 0;
        int[] a;
        int[] b; // number of types of sweets on each day I
        double[] fi;
        double temp = 0;
        double lBal, rBal;
        int[] count;

        Scanner sc=new Scanner(System.in);


        // FIRST LINE

        System.out.println("Number of types of Sweets m");
        m=sc.nextInt();
        a= new int [m];
        fi= new double [m];

        System.out.println("Number of sweets eaten k");
        k=sc.nextInt();
        b= new int [k];
        count= new int[m];


        // SECOND LINE

        System.out.println("Enter the A values");
        for(int i=0;i<m;i++) {
            a[i]=sc.nextInt();
        }

        //calculate fi based on ai
        for(int i=0; i<m; i++)
        {
            for(int j=1;j<m; j++)
            {
                temp+=a[j];
            }
            fi[i]=a[i]/temp;
        }



        // THIRD LINE


        System.out.println("Enter the B values");
        for(int i = 0; i < k; i++)
            b[i] = sc.nextInt();

        // fill the si array, gives us # each type of candy eaten SI
        for(int i = 0; i < k; i++)
            count[b[i] -1]++;

        //calculate n total number of sweets eaten
        for(int i = 0; i < m; i++)
            n += count[i];

        // balance checker
        for(int i = 0; i < n; i++) {
            lBal = n * fi[i] - 1;
            rBal = n * fi[i] + 1;

            System.out.println("f["+i+"] = " + fi[i]);
            System.out.println("left bal = " + lBal);
            System.out.println("s["+i+"] = " + count[i]);
            System.out.println("right bal = " + rBal);

            if(rBal > count[i] && count[i] > lBal) {
                System.out.println("Balance achieved\n");
            }
        }

        for(int p =0; p<m;p++)
        {
            for(int j=0;j<m;j++)
            {

            }
        }
    }
}
