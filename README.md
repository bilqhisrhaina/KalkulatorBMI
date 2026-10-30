# 🧡 Kalkulator BMI

Aplikasi **Kalkulator Body Mass Index (BMI)** berbasis JavaFX untuk menghitung indeks massa tubuh berdasarkan berat dan tinggi badan.

Project ini menggunakan desain antarmuka minimalis dengan tema warna oranye dan krem serta layout portrait berukuran 360 × 640 logical pixels.

## ✨ Fitur Aplikasi

- Pemilihan jenis kelamin.
- Input berat badan (kg).
- Input tinggi badan (cm).
- Perhitungan BMI secara otomatis.
- Menampilkan hasil dan kategori BMI.
- Tombol reset untuk menghapus input dan hasil perhitungan.
- Validasi input agar data yang dimasukkan sesuai.

## 🖥️ Tampilan Aplikasi

Aplikasi dirancang dengan konsep mobile portrait, tampilan sederhana, dan penggunaan warna yang nyaman dilihat.

## 🛠️ Teknologi yang Digunakan

- Java
- JavaFX
- FXML
- Apache Maven
- JDK 17 atau lebih baru

## 📁 Struktur Project

```text
KalkulatorBMI/
│
├── src/
│   └── main/
│       ├── java/
│       │   ├── main/
│       │   │   └── Main.java
│       │   ├── controller/
│       │   │   └── KalkuBmiController.java
│       │   └── model/
│       │       └── Bmi.java
│       │
│       └── resources/
│           └── fxml/
│               └── KalkuBmi.fxml
│
├── pom.xml
└── README.md
```

## 🚀 Cara Menjalankan Aplikasi

1. Clone repository ini atau download project.
2. Buka project menggunakan Apache NetBeans.
3. Pastikan JDK 17 atau lebih baru sudah terpasang.
4. Tunggu Maven menyelesaikan proses dependency.
5. Jalankan aplikasi menggunakan Maven Goal:

```bash
clean javafx:run
```

## 📊 Rumus Perhitungan BMI

BMI dihitung menggunakan rumus:

```text
BMI = Berat Badan (kg) / Tinggi Badan (m)²
```

Kategori BMI dewasa yang digunakan:

| Nilai BMI | Kategori |
|---|---|
| Di bawah 18,5 | Berat badan kurang |
| 18,5 – 24,9 | Normal |
| 25 – 29,9 | Berat badan berlebih |
| 30 atau lebih | Obesitas |

*Kategori tersebut merupakan acuan umum untuk orang dewasa.*

---

**Kalkulator BMI**  
Project aplikasi desktop berbasis JavaFX.
