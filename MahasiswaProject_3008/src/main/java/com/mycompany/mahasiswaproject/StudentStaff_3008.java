/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mahasiswaproject;

/**
 *
 * @author user
 */
public class StudentStaff_3008 extends Mahasiswa_3008 implements IPendapatan_3008 {

    public int unitKerja_3008[];
    public int jamkerja_3008[];

    public StudentStaff_3008() {

    }

    @Override
    public double totalPendapatan() {
        return jamkerja_3008[Jumlah_3008] * 30000;
    }

    public void tampilDataMhs() {
        TampilDataMhs();
        System.out.println("Unit Kerja: " + unitKerja_3008[Jumlah_3008]);
        System.out.println("Jam kerja: " + jamkerja_3008[Jumlah_3008]);
    }

}
