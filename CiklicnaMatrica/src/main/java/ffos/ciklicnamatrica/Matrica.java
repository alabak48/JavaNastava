/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.ciklicnamatrica;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author anja0
 */

 
public class Matrica {
    public static void main(String[] args) {
        
       int [][] niz = new int[5][5];
       
       niz [4][4] = 1;
       niz [4][3] = 2;
       niz [4][2] = 3;
       niz [4][1] = 4;
       niz [4][0] = 5;
       
       niz [3][0] = 6;
       niz [2][0] = 7;
       niz [1][0] = 8;
       niz [0][0] = 9;
       
       niz [0][1] = 10;
       niz [0][2] = 11;
       niz [0][3] = 12;
       niz [0][4] = 13;
       
       niz [1][4] = 14;
       niz [2][4] = 15;
       niz [3][4] = 16;
       
       niz [3][3] = 17;
       niz [3][2] = 18;
       niz [3][1] = 19;
       
       niz [2][1] = 20;
       niz [1][1] = 21;
       
       niz [1][2] = 22;
       niz [1][3] = 23;

       niz [2][3] = 24;
       
       niz [2][2] = 25;
       
       for(int i=0;i<niz.length;i++){
           System.out.println(Arrays.toString(niz[i]));
           
       }
    }


}
