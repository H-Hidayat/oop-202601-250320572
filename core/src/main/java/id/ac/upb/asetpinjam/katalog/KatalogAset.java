
package id.ac.upb.asetpinjam.katalog;

import id.ac.upb.asetpinjam.model.Aset;
import id.ac.upb.asetpinjam.model.JenisAset;

import java.util.ArrayList;
import java.util.List;

/** Katalog aset di memori. */
public class KatalogAset {

    private final List<Aset> daftar = new ArrayList<>();

    public void tambah(Aset aset) {
        daftar.add(aset);
    }

    public List<Aset> semua() {
        return List.copyOf(daftar);
    }

    /**
     * Mencari aset berdasarkan nama.
     * Pencarian tidak membedakan huruf besar dan kecil.
     */
    public List<Aset> cari(String kata) {
        if (kata == null) {
            throw new IllegalArgumentException(
                    "Kata pencarian tidak boleh null"
            );
        }

        List<Aset> hasil = new ArrayList<>();

        for (Aset aset : daftar) {
            if (aset.getNama().toLowerCase().contains(kata.toLowerCase())) {
                hasil.add(aset);
            }
        }

        return hasil;
    }

    /**
     * Mencari aset berdasarkan nama dan jenis aset.
     * Pencarian nama tidak membedakan huruf besar dan kecil.
     */
    public List<Aset> cari(String kata, JenisAset jenis) {
        if (kata == null) {
            throw new IllegalArgumentException(
                    "Kata pencarian tidak boleh null"
            );
        }

        if (jenis == null) {
            throw new IllegalArgumentException(
                    "Jenis aset tidak boleh null"
            );
        }

        List<Aset> hasil = new ArrayList<>();

        for (Aset aset : daftar) {
            if (aset.getNama().toLowerCase().contains(kata.toLowerCase())
                    && aset.getJenis() == jenis) {
                hasil.add(aset);
            }
        }

        return hasil;
    }
}
