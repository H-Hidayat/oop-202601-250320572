# Catatan Minggu 03: Inheritance

## Yang saya kerjakan
Saya membuat hierarki class menggunakan konsep inheritance pada Java. Saya mengimplementasikan class Ruang, Laptop, dan AlatLab dengan memanfaatkan class induk untuk mewariskan atribut dan method kepada class turunannya. Saya juga membuat konstruktor menggunakan super() untuk memanggil konstruktor dari class induk serta menyediakan getter untuk mengakses atribut.

## Keputusan desain
Saya menggunakan inheritance agar atribut dan method yang memiliki kesamaan dapat diletakkan pada class induk sehingga tidak perlu ditulis berulang kali pada setiap class. Class turunan menggunakan extends untuk mewarisi properti dari class induk. Saya menggunakan super() agar proses inisialisasi atribut dari class induk dapat dilakukan dengan benar.

## Kendala
Kendala yang saya hadapi adalah memahami hubungan antara class induk dan class turunan, terutama dalam penggunaan super() pada konstruktor. Saya mengatasinya dengan mempelajari kembali struktur inheritance dan memastikan pemanggilan konstruktor class induk sesuai dengan parameter yang dibutuhkan.

## Penggunaan AI
- Alat yang dipakai: ChatGPT.
- Bagian yang dibantu AI: Implementasi class Ruang.java, Laptop.java, dan AlatLab.java, khususnya penggunaan inheritance, konstruktor, super(), dan getter.
- Prompt utama:
"Buat hierarki inheritance untuk class Ruang, Laptop, dan AlatLab pada Java."
"Jelaskan cara menggunakan extends dan super() pada konstruktor class turunan."
"Bantu periksa kesalahan kompilasi pada implementasi inheritance Java."
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Saya menyesuaikan kode yang diberikan dengan struktur package, atribut, konstruktor, dan ketentuan tugas pada proyek Aset-Pinjam agar sesuai dengan kebutuhan program.
- Satu hal yang saya pahami lebih baik sekarang: Inheritance memungkinkan sebuah class mewarisi atribut dan method dari class lain. Dengan demikian, kode dapat digunakan kembali dan struktur program menjadi lebih terorganisasi. Saya juga memahami bahwa super() digunakan untuk memanggil konstruktor class induk.