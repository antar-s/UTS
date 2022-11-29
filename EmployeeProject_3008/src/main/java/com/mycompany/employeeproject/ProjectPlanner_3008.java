/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeproject;

/**
 *
 * @author user
 */
public class ProjectPlanner_3008 extends Employee_3008 {

    public float Komisi_3008;
    public float TotalHslProyek_3008;
    public double Totalgaji_3008;

    public ProjectPlanner_3008() {

    }

    public double TotalGaji() {
        Totalgaji_3008 = GajiPokok_3008 + (Komisi_3008 * TotalHslProyek_3008) - (GajiPokok_3008 * 5 / 100);
        return Totalgaji_3008;
    }

    public void TampilData() {
        System.out.println("Project Plannner");
        Tampil();
        System.out.println("Total Gaji: " + Totalgaji_3008);
    }
}
