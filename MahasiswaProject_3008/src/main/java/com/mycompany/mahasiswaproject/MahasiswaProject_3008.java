/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mahasiswaproject;

/**
 *
 * @author user
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MahasiswaProject_3008 {

    public static void main(String[] args) throws IOException {
        AsistenPraktikum_3008 ap = new AsistenPraktikum_3008();
        StudentStaff_3008 ss = new StudentStaff_3008();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Jumlah Input Asprak: ");
            ap.Jumlah_3008 = Integer.parseInt(br.readLine());
            for (int i = 0; i <= ap.Jumlah_3008; i++) {
                System.out.println("Data Asprak");
                System.out.print("NIM: ");
                ap.NIM_3008[i] = br.readLine();
                System.out.print("Nama: ");
                ap.Nama_3008[i] = br.readLine();
                System.out.print("Jurusan: ");
                ap.Jurusan_3008[i] = br.readLine();
                System.out.print("IPK: ");
                ap.IPK_3008[i] = Integer.parseInt(br.readLine());
                System.out.print("Mata Kuliah Asistensi: ");
                ap.mkAsistensi_3008[i] = br.readLine();
                System.out.print("Jumlah pertemuan: ");
                ap.JmlPertemuan_3008[i] = Integer.parseInt(br.readLine());
                ap.totalPendapatan();
                ap.tampilDataMhs();
                System.out.println();
            }

            System.out.print("Jumlah Input Student Staff: ");
            ss.Jumlah_3008 = Integer.parseInt(br.readLine());
            for (int j = 0; j <= ss.Jumlah_3008; j++) {
                System.out.println("Data Asprak");
                System.out.print("NIM: ");
                ss.NIM_3008[j] = br.readLine();
                System.out.print("Nama: ");
                ss.Nama_3008[j] = br.readLine();
                System.out.print("Jurusan: ");
                ss.Jurusan_3008[j] = br.readLine();
                System.out.print("IPK: ");
                ss.IPK_3008[j] = Integer.parseInt(br.readLine());
                System.out.print("Unit kerja: ");
                ss.unitKerja_3008[j] = Integer.parseInt(br.readLine());
                System.out.print("Jam kerja: ");
                ss.jamkerja_3008[j] = Integer.parseInt(br.readLine());
                ss.totalPendapatan();
                ss.tampilDataMhs();
                System.out.println();
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

}
