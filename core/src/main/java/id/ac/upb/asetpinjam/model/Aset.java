
package id.ac.upb.asetpinjam.model;

import id.ac.upb.asetpinjam.kontrak.DapatDipinjam;

/**
 * Aset yang dapat dipinjam.
 *
 * Minggu 2: field, konstruktor, getter/setter, dan validasi.
 * Minggu 3: getJenis() di tiap subclass.
 * Minggu 4: hitungDenda() dioverride di tiap subclass.
 * Minggu 5: bisaDipinjam() dan class abstrak.
 */
public class Aset implements DapatDipinjam {

    // Field private (encapsulation)
    private final String kode;
    private String nama;
    private StatusAset status = StatusAset.TERSEDIA;
    private Kondisi kondisi = Kondisi.BAIK;

    /**
     * Konstruktor Aset.
     * Kode dan nama tidak boleh null atau kosong.
     */
    public Aset(String kode, String nama) {
        if (kode == null || kode.trim().isEmpty()) {
            throw new IllegalArgumentException("Kode tidak boleh null atau kosong");
        }

        if (nama == null || nama.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama tidak boleh null atau kosong");
        }

        this.kode = kode;
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public StatusAset getStatus() {
        return status;
    }

    public Kondisi getKondisi() {
        return kondisi;
    }

    /**
     * Mengubah nama aset.
     * Nama tidak boleh null atau kosong.
     */
    public void setNama(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama tidak boleh null atau kosong");
        }

        this.nama = nama;
    }

    /**
     * Mengubah status aset.
     * Status tidak boleh null.
     */
    public void setStatus(StatusAset status) {
        if (status == null) {
            throw new IllegalArgumentException("Status tidak boleh null");
        }

        this.status = status;
    }

    /**
     * Mengubah kondisi aset.
     * Kondisi tidak boleh null.
     */
    public void setKondisi(Kondisi kondisi) {
        if (kondisi == null) {
            throw new IllegalArgumentException("Kondisi tidak boleh null");
        }

        this.kondisi = kondisi;
    }

    /** Implementasi minggu 5. */
    @Override
    public boolean bisaDipinjam() {
        throw new UnsupportedOperationException("TODO minggu 5");
    }

    /** Implementasi minggu 3. */
    public JenisAset getJenis() {
        throw new UnsupportedOperationException("TODO minggu 3");
    }

    /** Implementasi minggu 4. */
    public long hitungDenda(int hariTerlambat) {
        throw new UnsupportedOperationException("TODO minggu 4");
    }
}
