package com.company;
import java.util.Scanner;
import java.io.*;

public class Main{

    public static void main(String[] args) throws IOException{
        File file = new File(arg[1]);
        PrintStream out = new PrintStream(new FileOutputStream(arg[2]));
        System.setOut(out);
        Scanner sc=new Scanner(file);
        int k,m,n,si;
        int[] a,b,count;
        double lBal, rBal, temp;
        double[] fi;

        temp = 0;
        n = 0;


        // FIRST LINE

        //System.out.println("Number of types of Sweets m");
        m=sc.nextInt();
        a= new int [m];
        fi= new double [m];

        //System.out.println("Number of sweets eaten k");
        k=sc.nextInt();
        b= new int [k];
        count= new int[m];


        // SECOND LINE

        //System.out.println("Enter the A values");
        for(int i=0;i<m;i++) {
            a[i]=sc.nextInt();
        }

        //calculate fi based on ai
        for(int i=0; i<m; i++)
        {
            for(int j=0;j<m; j++)
            {
                temp+=a[j];
            }
            fi[i]=a[i]/temp;
        }



        // THIRD LINE

        //System.out.println("Enter the B values");
        for(int i = 0; i < k; i++)
            b[i] = sc.nextInt();

        // fill the si array, gives us # each type of candy eaten SI
        for(int i = 0; i < k; i++)
            count[b[i] -1]++;

        //calculate n total number of sweets eaten
        for(int i = 0; i < m; i++)
            n += count[i];

        // balance checker
        int p = 0;
        for(int i = 0; i < m; i++) {
            lBal = n * fi[i] - 1;
            rBal = n * fi[i] + 1;

            if(rBal > count[i] && count[i] > lBal) {
                p++;
            }

        }

        if( Math.abs(n-p) >= 1)
            System.out.println("forever");
        else if( Math.abs(n-p) < 1 && Math.abs(n-p) > -1)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
