package TugasPraktikum1;

public class DemoNilai {
    public static void main(String[] args) {
        Nilai num = new Nilai();

        num.nim = 2210631170088l;
        num.nama = "Muhammad Rifky Akbar";
        num.absen = 100;
        num.tugas = 90;
        num.uts = 100;
        num.uas = 100;

        new Nilai();

        num.CetakNilai();

    }
}
