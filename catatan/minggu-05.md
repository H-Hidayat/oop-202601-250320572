## Catatan Minggu 05: Abstraction

# Yang saya kerjakan
Pada minggu kelima, saya mempelajari dan menerapkan konsep abstraction dalam pemrograman berorientasi objek menggunakan Java. Saya mengubah kelas Aset menjadi abstract class dan mengimplementasikan metode bisaDipinjam() berdasarkan kondisi ketersediaan dan tingkat kerusakan aset. Saya juga mempelajari penggunaan interface DapatDipinjam serta penerapan metode abstrak hitungDenda() yang harus diimplementasikan oleh setiap subclass.

# Keputusan desain
Saya memilih menggunakan abstract class Aset karena kelas tersebut menjadi induk bagi beberapa jenis aset, seperti Laptop, Ruang, dan AlatLab. Saya menggunakan interface DapatDipinjam untuk mendefinisikan perilaku yang berkaitan dengan proses peminjaman. Metode hitungDenda() dibuat abstrak agar setiap subclass dapat memiliki perhitungan denda sesuai karakteristik masing-masing aset. Dengan desain ini, kode menjadi lebih terstruktur dan mudah dikembangkan.

# Kendala
Kendala yang saya hadapi adalah memahami penerapan abstract class, interface, dan aturan overriding metode pada subclass. Saya juga mengalami kegagalan pada beberapa pengujian, terutama pada validasi bisaDipinjam() dan perhitungan denda progresif. Untuk mengatasinya, saya memeriksa kembali kondisi pada setiap metode, memperbaiki implementasi kode, dan menjalankan pengujian Maven sampai hasilnya sesuai dengan ketentuan.

# Penggunaan AI
- Alat yang dipakai: ChatGPT
- Bagian yang dibantu AI: Membantu menuliskan kode untuk efisiensi dan meminimalisir error.
- Prompt utama:
"Kode yang digunakana error. Perbaiki kodenya secara lengkap dan tidak mengubah struktur yang saya kerjakan."
- Yang saya ubah atau tolak dari saran AI, dan alasannya:
Saya memeriksa kembali saran kode dari AI dan menyesuaikannya dengan struktur proyek serta ketentuan tugas. Saya tidak langsung menerima semua saran, tetapi memastikan bahwa implementasi metode sesuai dengan aturan peminjaman aset, tingkat kerusakan, dan perhitungan denda yang diharapkan oleh pengujian.
- Satu hal yang saya pahami lebih baik sekarang:
Saya memahami bahwa abstract class digunakan sebagai kelas induk yang menyediakan struktur umum dan dapat memiliki metode abstrak, sedangkan interface digunakan untuk mendefinisikan kontrak perilaku yang harus diterapkan oleh kelas yang mengimplementasikannya. Saya juga memahami bahwa setiap subclass wajib menyediakan implementasi untuk metode abstrak yang diwariskan dari abstract class.