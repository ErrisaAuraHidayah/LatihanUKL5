/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanukl5;

/**
 *
 * @author erisa
 */
public class LatihanUKL5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [][] matriksA = {{-5,3},{7,2}}; //array untuk isi dari matriks A
        int [][] matriksB = {{3,1},{5,-2}}; // array untuk isi dari matriks b
        int [][] hasil = new int[2][2]; // memberikan batas isi Matriks hasil dari penguranagn
        int i,j =0; // mendeklarasikan variabel i dan j
       
        System.out.println("Matriks A "); // menampilkan matriks A
        for(i=0; i<2; i++){ // perulangan untuk membuat matriks A
            for(j=0; j<2; j++){ // perulangan untul membuat matriks A
                System.out.print(matriksA[i][j] + " "); // menampilkan matriks A
            }
            System.out.println(" "); // memberi spasi
        }
        
        System.out.println("Matriks B "); // menampilkan matriks B
        for(i=0; i<2; i++){ // perulangan untuk membuat matriks B
            for(j=0; j<2; j++){ // perulangan untuk membuat matriks B
                System.out.print(matriksB[i][j] + " "); // menampilkan matriks B
            }
            System.out.println(" "); // memberi spasi 
        }
        
        System.out.println("Hasil Pengurangan Matriks A dan Matriks B "); // menampilkan hasil pengurangan kedua matriks
        for(i=0; i < 2; i++){ // perulangan untuk menampilkan matriks dari hasil pengurangannya 
            for(j=0; j < 2; j++){ // perulangan untuk menampilkan matriks dari hasil pengurangannya 
                hasil[i][j] = matriksA[i][j] - matriksB[i][j]; // operator untuk perngurangan matriks A dengan matriks B
                System.out.print(hasil[i][j] + "  "); // menampilkan hasil dari pengurangannya 
                
            }
            System.out.println(" "); //memberi spasi
        }
        

            
            
        
    }
    
}
