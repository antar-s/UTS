/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.employeeproject;

/**
 *
 * @author user
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EmployeeProject_3008 {

    public static void main(String[] args) {
        SalariedEmployee_3008 se = new SalariedEmployee_3008();
        CommissionEmployee_3008 ce = new CommissionEmployee_3008();
        ProjectPlanner_3008 pp = new ProjectPlanner_3008();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        try{
            System.out.println("Data Pegawai");
            System.out.print("Nama: ");
            se.Nama_3008 = br.readLine();
            System.out.print("NIP: ");
            se.NIP_3008 = br.readLine();
            System.out.print("Gaji Pokok: ");
            se.GajiPokok_3008 = Float.parseFloat(br.readLine());
            se.TampilData();
            
            System.out.print("Nama: ");
            ce.Nama_3008 = br.readLine();
            System.out.print("NIP: ");
            ce.NIP_3008 = br.readLine();
            System.out.print("GajiPokok: ");
            ce.GajiPokok_3008 = Float.parseFloat(br.readLine());
            System.out.print("Komisi: ");
            ce.Komisi_3008 = Float.parseFloat(br.readLine());
            System.out.print("Total Penjualan: ");
            ce.TotalPenjualan_3008 = Float.parseFloat(br.readLine());
            ce.TotalGaji();
            ce.TampilData();
            
            System.out.print("Nama: ");
            pp.Nama_3008 = br.readLine();
            System.out.print("NIP: ");
            pp.NIP_3008 = br.readLine();
            System.out.print("Gaji Pokok: ");
            pp.GajiPokok_3008 = Float.parseFloat(br.readLine());
            System.out.print("Komisi: ");
            pp.Komisi_3008 = Float.parseFloat(br.readLine());
            System.out.print("Total Hasil Proyek: ");
            pp.TotalHslProyek_3008 = Float.parseFloat(br.readLine());
            pp.TotalGaji();
            pp.TampilData();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
