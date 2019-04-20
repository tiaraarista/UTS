package service;

import entity.*;
import java.util.*;

public class ServiceKaryawan {
    private static List<Karyawan> data = new LinkedList<Karyawan>();

    public void tambahData(Karyawan kry){
        ServiceKaryawan.data.add(kry);
        System.out.println("Data telah tersimpan");
    }

    public void ubahData(Karyawan kry){
        int result = data.indexOf(kry);
        if(result >= 0){
            data.set(result, kry);
            System.out.println("Data telah berubah");
        }
    }

    public void hapusData(String id){
        int idx = data.indexOf(new Karyawan(id, "","","","",""));
        if(idx >= 0){
            data.remove(idx);
            System.out.println("Data telah terhapus");
        }else {
         System.out.println("Tidak ada data");
        }
    }

    public void cetakData() {
            System.out.println("------------ cetak data ------------");
        int i=1;
        for(Karyawan kry : data){
            System.out.println("data ke-" + i++);
            System.out.println("------------------------------------");
            System.out.println(" ID             :" + kry.getId());
            System.out.println(" Nama           :" + kry.getNama());
            System.out.println(" Divisi         :" + kry.getDivisi());
            System.out.println(" Jenis Kelamin  :" + kry.getJk());
            System.out.println(" Agama          :" + kry.getAgama());
            System.out.println(" Alamat         :" + kry.getAlamat());
            System.out.println("------------------------------------");
        }
    }
}