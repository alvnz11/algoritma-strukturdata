# Laporan Jobsheet 9
#### Nama : Alvanza Saputra Yudha
#### Kelas : 1-H
#### NIM : 2341720182

<hr>

# Praktikum 

* ## 2.1 Pembuatan Single Linked List

    Verifikasi Hasil Percobaan

    <img src = "lampiran/out11.PNG">

    Hasil percobaan jika index pada insertAt() -1 :

    <img src = "lampiran/out12.PNG">

    ### 2.1.2 Pertanyaan
1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?
    - Karena pada baris pertama belum memasukkan nilai apa-apa.

2. Jelaskan kegunaan variable temp secara umum pada setiap method!
    - Digunakan untuk menyimpan data sementara sebelum dipindahkan

3. Perhatikan class SingleLinkedList, pada method insertAt Jelaskan kegunaan kode berikut 

    <img src = "lampiran/p11.PNG">

    - Digunakan untuk memeriksa apakah node berikutnya setelah node saat ini adalah node terakhir dalam linked list nya. jika ya, maka tail akan menjadi node saat ini (temp.next).

* ## 2.2 Modifikasi Elemen pada Single Linked List

    Verifikasi Hasil Percobaan

    <img src = "lampiran/out21.PNG">

    ### 2.1.2 Pertanyaan
1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan!
    - Break digunakan untuk keluar dari looping setelah node dengan kunci yang cocok ditemukan dan dihapus. Jika tidak menggunakan break iterasi akan terus dilanjutkan meskipun node yang diinginkan sudah dihapus.
    
2. Jelaskan kegunaan kode dibawah pada method remove

    <img src = "lampiran/p21.PNG">

    - Kode berikut digunakan untuk memeriksa apakah data elemen selanjutnya dalam linked list sama dengan parameter key. Jika ditemukan, maka elemen selanjutnya dihapus dari node.