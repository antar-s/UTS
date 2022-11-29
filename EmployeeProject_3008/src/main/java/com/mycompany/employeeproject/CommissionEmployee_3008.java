/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeproject;

/**
 *
 * @author user
 */
public class CommissionEmployee_3008 extends Employee_3008 {

    public float Komisi_3008;
    public float TotalPenjualan_3008;
    public float Totalgaji_3008;

    public CommissionEmployee_3008() {

    }

    public float TotalGaji() {
        Totalgaji_3008 = GajiPokok_3008 + (Komisi_3008 * TotalPenjualan_3008);
        return Totalgaji_3008;
    }

    public void TampilData() {
        System.out.println("Commission Employee");
        Tampil();
        System.out.println("Total Gaji: " + Totalgaji_3008);
    }
}
