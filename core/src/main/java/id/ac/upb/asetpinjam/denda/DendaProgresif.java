
package id.ac.upb.asetpinjam.denda;

import id.ac.upb.asetpinjam.kontrak.AturanDenda;
import id.ac.upb.asetpinjam.model.Aset;

/**
 * Minggu 5: denda yang makin berat bila makin lama terlambat.
 *
 * Aturan progresif:
 * Hari 1-3 : tarif normal.
 * Hari 4-6 : dua kali tarif normal.
 * Hari 7+  : tiga kali tarif normal.
 */
public class DendaProgresif implements AturanDenda {

    @Override
    public long hitung(Aset aset, int hariTerlambat) {

        if (aset == null) {
            throw new IllegalArgumentException("Aset tidak boleh null");
        }

        if (hariTerlambat < 0) {
            throw new IllegalArgumentException(
                "Hari keterlambatan tidak boleh negatif"
            );
        }

        if (hariTerlambat == 0) {
            return 0;
        }

        // Menggunakan tarif denda dasar dari Aset.
        long tarifPerHari = aset.hitungDenda(1);

        if (hariTerlambat <= 3) {
            return (long) hariTerlambat * tarifPerHari;
        }

        if (hariTerlambat <= 6) {
            return 3L * tarifPerHari
                    + (hariTerlambat - 3L) * 2L * tarifPerHari;
        }

        return 9L * tarifPerHari
                + (hariTerlambat - 6L) * 3L * tarifPerHari;
    }
}
