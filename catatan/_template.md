# Catatan Minggu 04: Polimorfisme

## Yang saya kerjakan
Pada minggu keempat, saya mempelajari dan menerapkan konsep polimorfisme dalam pemrograman berorientasi objek menggunakan Java. Saya mengimplementasikan method hitungDenda() pada beberapa subclass, yaitu Laptop.java, Ruang.java, dan AlatLab.java, dengan melakukan overriding terhadap method dari class induk. Setiap jenis aset memiliki aturan perhitungan denda masing-masing sesuai karakteristiknya.

## Keputusan desain
Saya menggunakan konsep method overriding agar setiap subclass dapat memiliki implementasi hitungDenda() yang berbeda. Dengan demikian, perhitungan denda dapat disesuaikan dengan jenis aset tanpa harus membuat banyak percabangan kondisi dalam satu method. Saya tetap mempertahankan struktur inheritance dari minggu sebelumnya agar kode lebih terorganisasi dan mudah dikembangkan.

## Kendala
Kendala yang saya hadapi adalah memahami penerapan overriding dan memastikan setiap subclass memiliki implementasi method hitungDenda() yang sesuai. Saya mengatasinya dengan memeriksa kembali hubungan antara class induk dan subclass serta memperbaiki implementasi method agar sesuai dengan struktur program.

## Penggunaan AI
- Alat yang dipakai: ChatGPT.
- Bagian yang dibantu AI: Penulisan kode-kode pemrograman untuk efisiensi waktu.
- Prompt utama:
  1. "Tuliskan kode secara lengkap untuk masing-masing."
  2. "Bantu periksa implementasi method hitungDenda() pada setiap subclass agar sesuai dengan konsep OOP."
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Saya menyesuaikan implementasi kode dengan struktur class dan ketentuan tugas yang sudah diberikan agar tidak mengubah desain program yang telah dibuat pada minggu sebelumnya.
- Satu hal yang saya pahami lebih baik sekarang: Polimorfisme memungkinkan beberapa subclass menggunakan nama method yang sama, tetapi memberikan perilaku atau hasil yang berbeda sesuai implementasi masing-masing subclass.