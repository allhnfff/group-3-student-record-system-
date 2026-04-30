# Group 3 - Student Academic Record System

Project ini merupakan tugas mata kuliah **Struktur Data dan Algoritma** yang dikerjakan oleh **Group 3**.  
Sistem ini dirancang untuk membantu pengelolaan data akademik mahasiswa, mulai dari data mahasiswa, mata kuliah, daftar peserta kuliah, hingga nilai akademik.

---

## Project Overview

Dalam project ini, setiap anggota kelompok mengerjakan modul yang berbeda dengan memanfaatkan **shared classes** yang sama agar seluruh sistem tetap terintegrasi.

### Shared Classes
Folder `shared/` berisi class yang digunakan bersama oleh semua anggota kelompok:

- `Student.java` → menyimpan data mahasiswa
- `Course.java` → menyimpan data mata kuliah
- `Grade.java` → menyimpan data nilai mahasiswa

---

## Struktur Project

```text
group-3-student-record-system/
├── shared/
│   ├── Student.java
│   ├── Course.java
│   └── Grade.java
├── student1/
│   ├── StudentRegistry.java
│   └── StudentRegistryDemo.java
├── student2/
│   ├── EnrollmentQueue.java
│   └── EnrollmentQueueDemo.java
├── student3/
│   ├── GradeRevisionStack.java
│   └── GradeRevisionStackDemo.java
├── student4/
│   ├── CourseRosterMap.java
│   └── CourseRosterMapDemo.java
├── student5/
│   ├── EnrollmentDeque.java
│   └── EnrollmentDequeDemo.java
└── README.md

Modul Tiap Anggota
Student 1 - StudentRegistry

Modul untuk menyimpan dan mengelola data mahasiswa.

Student 2 - EnrollmentQueue

Modul untuk mengelola antrean pendaftaran mata kuliah.

Student 3 - GradeRevisionStack

Modul untuk mengelola revisi nilai menggunakan struktur stack.

Student 4 - CourseRosterMap

Modul untuk memetakan kode mata kuliah ke daftar mahasiswa yang terdaftar pada mata kuliah tersebut.

Operasi utama:

enrollStudent(String courseCode, Student student)
getStudentsInCourse(String courseCode)
dropStudent(String courseCode, String nim)
listCourses()
size()
Student 5 - EnrollmentDeque

Modul untuk mengelola data enrollment menggunakan deque.

Fokus Modul Student 4 - CourseRosterMap

CourseRosterMap digunakan untuk menyimpan roster mahasiswa berdasarkan kode mata kuliah.
Dengan struktur ini, data peserta kuliah dapat dikelola dengan lebih teratur dan lebih mudah diakses.

Fungsi utama modul ini:
menambahkan mahasiswa ke mata kuliah tertentu
melihat daftar mahasiswa dalam suatu mata kuliah
menghapus mahasiswa dari mata kuliah
menampilkan daftar mata kuliah yang tersimpan
menghitung jumlah mata kuliah yang terdaftar
Cara Menjalankan Demo

Jalankan file demo sesuai modul masing-masing.

Contoh Student 4

Jalankan:

student4/CourseRosterMapDemo.java

Alur demo Student 4

Program akan:

menambahkan mahasiswa ke mata kuliah,
menampilkan daftar mata kuliah,
menampilkan peserta mata kuliah tertentu,
menghapus mahasiswa dari mata kuliah,
lalu menampilkan hasil setelah perubahan.
Tujuan Project

Project ini dibuat untuk melatih implementasi berbagai struktur data dalam satu studi kasus yang saling terhubung, yaitu Student Academic Record System.
Setiap anggota kelompok mengerjakan modul berbeda, tetapi tetap terhubung melalui class bersama di folder shared/.