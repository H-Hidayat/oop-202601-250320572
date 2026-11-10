
package id.ac.upb.asetpinjam.minggu01;

import id.ac.upb.asetpinjam.config.Varian;

/**
 * Minggu 1, gaya PROSEDURAL:
 * hanya fungsi statis dan data primitif,
 * tanpa objek buatan sendiri.
 */
public final class HelloProsedural {

    private HelloProsedural() {
    }

    /**
     * Menghasilkan sapaan yang memuat nama dan NIM.
     */
    public static String sapa(String nama, String nim) {
        return "Halo, " + nama
                + "! Selamat datang di Aset-Pinjam. NIM: " + nim;
    }

    public static void main(String[] args) {
        Varian v = Varian.aktif();
        System.out.println(sapa(v.nama, v.nim));
    }
}
