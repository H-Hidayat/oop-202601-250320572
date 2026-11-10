# Catatan Minggu 02: Struktur OOP: Class, Object, Encapsulation

## Yang saya kerjakan
Saya mengerjakan class Aset.java dengan menerapkan konsep encapsulation menggunakan field yang bersifat private. Saya membuat konstruktor untuk menginisialisasi kode dan nama aset, serta getter dan setter untuk mengakses dan mengubah data. Saya juga menambahkan validasi agar kode dan nama tidak boleh null atau kosong, serta status dan kondisi tidak boleh bernilai null. Nilai awal status diatur menjadi tersedia dan kondisi menjadi baik.

## Keputusan desain
Saya menggunakan access modifier private pada seluruh field untuk menerapkan encapsulation sehingga data tidak dapat diakses secara langsung dari luar class. Field kode menggunakan final karena kode aset tidak boleh diubah setelah objek dibuat. Saya tidak menyediakan setter untuk kode, sedangkan nama, status, dan kondisi dapat diubah melalui setter masing-masing. Saya juga memutuskan untuk tidak melakukan normalisasi data menggunakan trim() atau toUpperCase(). Fungsi trim() hanya digunakan untuk memeriksa apakah input kosong, sedangkan nilai asli tetap disimpan.

## Kendala
Kendala yang saya temui adalah memahami penerapan encapsulation, terutama dalam menentukan field yang harus menggunakan private serta membedakan field yang boleh dan tidak boleh diubah. Saya juga perlu memahami cara menerapkan validasi pada konstruktor dan setter agar data aset tidak menerima nilai null atau kosong. Saya mengatasinya dengan mempelajari kembali fungsi konstruktor, getter, setter, dan penggunaan IllegalArgumentException dalam Java.

## Penggunaan AI
- Alat yang dipakai: ChatGPT.
- Bagian yang dibantu AI: Implementasi class Aset.java, meliputi field private, konstruktor, getter, setter, dan validasi data.
- Prompt utama: 
1. "Minggu 2: Struktur OOP: Class, Object, Encapsulation. Membuat class dengan field private, konstruktor, getter/setter, dan validasi."
2. "Berikut kode Aset.java. Lengkapi sesuai aturan tugas Minggu 2."
3. "Bagaimana cara menjalankan pengujian scripts/uji.ps1 di PowerShell jika running scripts is disabled?"
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Saya mempertahankan method bisaDipinjam(), getJenis(), dan hitungDenda() sebagai TODO karena ketiganya merupakan materi Minggu 5, Minggu 3, dan Minggu 4. Saya juga tidak menambahkan normalisasi otomatis pada kode dan nama agar nilai asli tetap dipertahankan.
- Satu hal yang saya pahami lebih baik sekarang: Saya memahami bahwa encapsulation digunakan untuk melindungi data dalam sebuah class dengan menggunakan field private. Akses dan perubahan data dilakukan melalui getter dan setter sehingga validasi dapat diterapkan sebelum data disimpan.
