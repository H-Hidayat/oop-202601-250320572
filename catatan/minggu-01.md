# Catatan Minggu 01: Paradigma Pemrograman dan Setup

## Yang saya kerjakan
Pada Minggu 01, saya mempelajari dan mengimplementasikan tiga paradigma pemrograman, yaitu prosedural, Object-Oriented Programming (OOP), dan fungsional menggunakan bahasa Java. Saya membuat beberapa kelas, seperti HelloProsedural, HelloOOP, dan HelloFungsional, dengan tujuan memahami perbedaan cara kerja setiap paradigma dalam menghasilkan sebuah sapaan. Selain itu, saya mempelajari struktur proyek Java menggunakan Maven dan menjalankan pengujian menggunakan perintah mvn test -Dgroups=week1. Dari proses tersebut, saya belajar memahami hubungan antara implementasi kode dan hasil pengujian otomatis.

## Keputusan desain
Saya memutuskan untuk memisahkan implementasi setiap paradigma ke dalam kelas yang berbeda agar karakteristik dan konsep masing-masing paradigma dapat dipahami dengan lebih jelas.

Prosedural: Menggunakan fungsi atau metode untuk menjalankan instruksi secara berurutan tanpa berfokus pada objek.

OOP: Menggunakan class, atribut, konstruktor, dan metode untuk menggabungkan data dengan perilakunya.

Fungsional: Menggunakan fungsi sebagai nilai, seperti Function dan lambda expression, serta menghindari perubahan state yang tidak diperlukan.

Saya juga menggunakan modifier private untuk membatasi akses terhadap atribut pada implementasi OOP. Keputusan ini bertujuan menerapkan prinsip enkapsulasi agar data tidak dapat diakses atau diubah secara langsung dari luar kelas.

## Kendala
Kendala yang saya hadapi adalah memahami perbedaan implementasi ketiga paradigma pemrograman, terutama ketika menerapkannya dalam bentuk kode Java. Saya juga mengalami kesulitan ketika menjalankan pengujian Maven karena terdapat satu pengujian yang gagal dari lima pengujian yang dijalankan.

Untuk mengatasinya, saya memeriksa kembali implementasi metode, konstruktor, parameter, serta hasil yang diharapkan oleh kelas pengujian (Minggu01Test). Saya juga mempelajari pesan error yang ditampilkan Maven agar dapat mengetahui bagian kode yang belum sesuai dengan ketentuan pengujian.

## Penggunaan AI
- Alat yang dipakai: ChatGPT (OpenAI).

Bagian yang dibantu AI: Memahami konsep paradigma prosedural, OOP, dan fungsional serta membantu menganalisis implementasi kelas HelloProsedural, HelloOOP, dan HelloFungsional. AI juga membantu memahami pesan error ketika menjalankan Minggu01Test menggunakan Maven.

- Prompt utama:

"Jelaskan perbedaan paradigma pemrograman prosedural, OOP, dan fungsional menggunakan bahasa Java beserta contoh implementasinya."

"Bantu implementasikan kelas HelloOOP dengan atribut nama dan NIM, konstruktor, serta metode untuk menghasilkan sapaan sesuai ketentuan tugas."

"Analisis error ketika menjalankan mvn test -Dgroups=week1 dan berikan perbaikan kode yang sesuai dengan pengujian."

- Yang saya ubah atau tolak dari saran AI, dan alasannya:

Saya tidak langsung menerima seluruh saran AI. Saya memeriksa kembali kode yang diberikan dan menyesuaikannya dengan struktur proyek, ketentuan tugas, serta hasil yang diharapkan oleh Minggu01Test. Saya juga menghindari perubahan pada bagian kode yang sebenarnya sudah benar agar tidak menimbulkan error baru.

- Satu hal yang saya pahami lebih baik sekarang:

Saya memahami bahwa paradigma prosedural, OOP, dan fungsional memiliki pendekatan yang berbeda dalam menyelesaikan masalah pemrograman. Prosedural berfokus pada urutan instruksi dan fungsi, OOP berfokus pada objek yang menggabungkan data dan perilaku, sedangkan fungsional berfokus pada penggunaan fungsi sebagai nilai dan meminimalkan perubahan state. Ketiganya dapat digunakan untuk menyelesaikan masalah yang sama, tetapi memiliki cara pengorganisasian kode dan pendekatan yang berbeda.