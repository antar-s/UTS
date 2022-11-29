/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mahasiswaproject;

/**
 *
 * @author user
 */
public class AsistenPraktikum_3008 extends Mahasiswa_3008 implements IPendapatan_3008 {

    public String mkAsistensi_3008[];
    public int JmlPertemuan_3008[];

    public AsistenPraktikum_3008() {

    }

    @Override
    public double totalPendapatan() {
        return JmlPertemuan_3008[Jumlah_3008] * 50000;
    }

    public void tampilDataMhs() {
        TampilDataMhs();
        System.out.println("Mata Kuliah Asistensi: " + mkAsistensi_3008[Jumlah_3008]);
        System.out.println("Jumlah Pertemuan: " + JmlPertemuan_3008[Jumlah_3008]);
        System.out.println("Total Pendapatan: " + totalPendapatan());
    }

}
