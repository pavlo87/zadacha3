package com.zadachi;

public class Main {

    public static void main(String[] args) {
        int x= 0, i= 0;
        do {
            i++;
            if (((i<100)&&(i%11==0))||((i<1000)&&(i>100)&&(i%47==0)))
            {
                System.out.print(i +" ");
                x++;
            }
        }while(x!=25);
    }
}
