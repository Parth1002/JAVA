package com.company;

public class Pa_24_MultiArray {
    public static void main(String[] args) {
        int [][] flat=new int[2][3];
        flat[0][0]=101;
        flat[0][1]=102;
        flat[0][2]=103;
        flat[1][0]=201;
        flat[1][1]=202;
        flat[1][2]=203;

        System.out.println(flat[0][1]);

//        for loop multi Array in print
        for (int i=0;i<flat.length;i++){
            for (int j=0;j<=flat.length;j++) {
                System.out.print(flat[i][j]);
                System.out.print("  ");
            }
            System.out.println("\n");
        }

//        while loop and for loop multi Array in print
        int i=0,j=0;
        while (i<flat.length){
            for (j=0;j<=flat.length;j++){
                  System.out.print(flat[i][j]);
                  System.out.print(" ");
            }
            System.out.println("\n");
            i++;
        }

    }
}
