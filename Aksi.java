/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package praktikum5;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Aksi {
    public static void main(String args[]){
        String NIK,Nama, JenisKelamin;
        int Umur;
        String NIM,Fakultas,Jurusan;
        double Tugas1,Tugas2,Tugas3;
        double UTS, UAS;
        double hasil;
        
        mahasiswa MHS= new mahasiswa();
        Scanner SC = new Scanner(System.in);
        
        System.out.println("Masukkan NIK: ");
        NIK= SC.nextLine();
        System.err.println("Masukkan Nama Anda: ");
        Nama=SC.nextLine();
        System.out.println("Masukkan Jenis Kelamin: ");
        JenisKelamin=SC.nextLine();
        System.out.println("Masukkan Ummur: ");
        Umur=SC.nextInt();
        System.out.println("masukkan NIM: ");
        NIM=SC.nextLine();
        System.out.println("masukkan fakultas: ");
        Fakultas=SC.nextLine();
        System.out.println("masukkan jurusan: ");
        Jurusan=SC.nextLine();
        System.out.println("masukkan TGS1: ");
        Tugas1=SC.nextInt();
        System.out.println("masukkan TGS2: ");
        Tugas2=SC.nextInt();
        System.out.println("masukkan TGS3: ");
        Tugas3=SC.nextInt();
        System.out.println("masukkan UTS: ");
        UTS=SC.nextInt();
        System.out.println("masukkan UAS: ");
        UAS= SC.nextInt();
        
        MHS.identitas(NIK, Nama, JenisKelamin, Umur);
        MHS.dataMahasiswa(NIM, Fakultas, Jurusan);
        MHS.nilaiMahasiswa(Tugas1, Tugas2, Tugas3,UTS,UAS);
    
        
                
        
    }
    
}
