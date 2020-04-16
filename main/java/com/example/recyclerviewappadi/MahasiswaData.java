package com.example.recyclerviewappadi;

import java.util.ArrayList;


public class MahasiswaData {
    private static String[] mahasiswaNama = {
            "Andi Purnama",
            "Mega Restu Mirantika",
            "Yoga",
            "Budi",
            "Rita",
            "Fuad",
    };

    private static String[] mahasiswaNim = {
            "311710003",
            "311710112",
            "311710496",
            "311710406",
            "311710619",
            "311710640",
    };

    private static String[] mahasiswaHp = {
            "0857-9493-2912",
            "0896-8857-1302",
            "0858-6009-6469",
            "0878-7654-1728",
            "0878-4325-1234",
            "0819-0677-2319"
    };

    private static int[] mahasiswaImage = {
            R.drawable.andi,
            R.drawable.mega,
            R.drawable.yoga,
            R.drawable.budi,
            R.drawable.rita,
            R.drawable.fuad,
    };

    static ArrayList<Mahasiswa> getListData() {
        ArrayList<Mahasiswa> list = new ArrayList<>();
        for (int position =0; position < mahasiswaNama.length; position++) {
            Mahasiswa mahasiswa = new Mahasiswa();
            mahasiswa.setNama(mahasiswaNama[position]);
            mahasiswa.setNim(mahasiswaNim[position]);
            mahasiswa.setPhoto(mahasiswaImage[position]);
            mahasiswa.setNoHp(mahasiswaHp[position]);
            list.add(mahasiswa);
        }
        return list;
    }
}