package tugasEnam;

//sebagai kelas induk dari kelas-kelas lain, kelas ini berfungsi untuk mendeklarasikan atribut dan method yang akan digunakan oleh kelas-kelas lain
public class Manusia {

    //deklarasi atribut kelas dengan private 
    private String nama;
    private String nik;
    private boolean jenisKelamin;
    private boolean menikah;

    //konstruktor untuk menginisialisasi atribut kelas
    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }
    
    //method untuk menghitung tunjangan yang didapatkan berdasarkan status menikah dan jenis kelamin
    public double getTunjangan() {
        if (menikah) {
            return jenisKelamin ? 25 : 20;  // jika menikah dan laki-laki akan mendapatkan tunjangan $25, jika menikah dan perempuan akan mendapatkan tunjangan $20
        } else {
            return 15;  //Jika tidak menikah akan mendapatkan tunjangan $15
        }
    }

    //method untuk menghitung total pendapatan, pada kelas ini hanya mengembalikan nilai dari tunjangan
    public double getPendapatan() {
        return getTunjangan();
    }

    //method untuk representasi string dari obejek Manusia
    public String toString(){
        return String.format("Nama\t\t: %s\nNIK\t\t: %s\nJenis Kelamin\t: %s\nPendapatan\t: %.1f\n", nama, nik, jenisKelamin ? "Laki-laki" : "Perempuan", getPendapatan());
    }
}
