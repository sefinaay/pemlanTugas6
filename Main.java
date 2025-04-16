package tugasEnam;

public class Main {

    public static void main(String[] args) {
        
        //test case contoh soal
        //proses inisialisasi objek dari kelas Manusia, MahasiswaFilkom, Pekerja, dan Manager
        Manusia a = new Manusia("A", "111", true, true);        //memanggil konstrukor dari kelas Manusia, membuat objek a dengan tipe Manusia
        System.out.println(a);      //menampilkan  informasi objek 

        MahasiswaFilkom b = new MahasiswaFilkom("165150300111100", 4.0, "B", "111", false, false);      //memanggil konstrukor dari kelas MahasiswaFilkom, membuat objek b dengan tipe MahasiswaFilkom
        System.out.println(b);      //menampilkan informasi objek

        Pekerja c = new Pekerja(1000, 2016, 3, 2, 4, "C", "111", true, true);           //memanggil konstruktor dari kelas Pekerja, membuat objek c dengan tipe Pekerja
        System.out.println(c);      //menampilkan informasi objek
        
        Manager d = new Manager("HRD", 1000, 2017, 1, 2, 3, "D", "111", true, true);        //memanggil konstruktor dari kelas Manager, membuat objek d dengan tipe Manager
        System.out.println(d);      //menampilkan informasi objek

        //test case tambahan
        System.out.println("---------------------------------------");
        //laki laki menikah 
        Manusia lm = new Manusia("Kevin", "346", true, true);
        System.out.println(lm);

        //perempuan menikah
        Manusia pm = new Manusia("Cantika", "643", false, true);
        System.out.println(pm);

        //perempuan belum menikah
        Manusia m = new Manusia("Laras", "987", false, false);
        System.out.println(m);

        //mahasiswa laki laki belum mikah dengan ipk 3.0
        MahasiswaFilkom mf1 = new MahasiswaFilkom("235150400111100", 3.0, "Andre", "987", true, false);
        System.out.println(mf1);

        //mahasiswa perempuan belum nikah dengan ipk 3.4
        MahasiswaFilkom mf2 = new MahasiswaFilkom("245150700111100", 3.4, "Olive", "875", false, false);
        System.out.println(mf2);

        //mahasiswa perempuan belum nikah dengan ipk 3.9
        MahasiswaFilkom mf3 = new MahasiswaFilkom("225150200111100", 3.9, "Khadija", "549", true, false);
        System.out.println(mf3);

        //pekerja laki laki sudah nikah
        Pekerja p1 = new Pekerja(1000, 2023, 1, 2, 2, "Genta", "890", true, true);
        System.out.println(p1);

        //pekerja laki laki belum menikah
        Pekerja p2 = new Pekerja(1000, 2016, 3, 18, 0, "Kenan", "098", true, false);
        System.out.println(p2);

        //pekerja laki laki sudah menikah dengan 10 anak
        Pekerja p3 = new Pekerja(9000, 2005, 2, 27, 10, "Sujarwo", "005", true, true);
        System.out.println(p3);

        //manager perempuan belum menikah 
        Manager m1 = new Manager("HRD", 7500, 2009, 9, 9, 0, "Ashana", "090", false, false);
        System.out.println(m1);
    }

}
