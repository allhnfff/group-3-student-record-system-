# Group 3 - Student Academic Record System

Project ini merupakan tugas mata kuliah **Struktur Data dan Algoritma** yang dikerjakan oleh **Group 3**.  
Sistem ini dibuat untuk membantu pengelolaan data akademik mahasiswa secara lebih terstruktur, meliputi data mahasiswa, mata kuliah, daftar peserta kuliah, dan nilai akademik.

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

Shared Classes

Folder shared/ berisi class yang digunakan bersama oleh seluruh anggota kelompok:

Student.java → menyimpan data mahasiswa
Course.java → menyimpan data mata kuliah
Grade.java → menyimpan data nilai mahasiswa
Modul Tiap Anggota
Student 1 - StudentRegistry

Modul untuk menyimpan dan mengelola data mahasiswa.

Student 2 - EnrollmentQueue

Modul untuk mengelola antrean pendaftaran mata kuliah.

Student 3 - GradeRevisionStack

Modul untuk mengelola revisi nilai menggunakan struktur stack.

Student 4 - CourseRosterMap

Modul untuk memetakan kode mata kuliah ke daftar mahasiswa yang mengambil mata kuliah tersebut.

Operasi utama:

enrollStudent(String courseCode, Student student)
getStudentsInCourse(String courseCode)
dropStudent(String courseCode, String nim)
listCourses()
size()
Student 5 - EnrollmentDeque

Modul untuk mengelola data enrollment menggunakan deque.

Fokus Modul Student 4

CourseRosterMap dirancang untuk membantu penyimpanan roster mahasiswa berdasarkan mata kuliah.
Dengan struktur ini, data peserta kuliah dapat:

ditambahkan dengan lebih rapi,
dicari berdasarkan kode mata kuliah,
dihapus jika mahasiswa batal mengambil mata kuliah,
dan ditampilkan kembali dengan lebih mudah.
Cara Menjalankan Demo

Untuk menjalankan demo salah satu modul, jalankan file Demo sesuai folder masing-masing.

Contoh untuk modul Student 4:

student4/CourseRosterMapDemo.java

Contoh Alur Demo Student 4

Pada demo CourseRosterMap, program akan:

menambahkan mahasiswa ke mata kuliah tertentu,
menampilkan daftar mata kuliah yang tersimpan,
menampilkan peserta pada mata kuliah tertentu,
menghapus mahasiswa dari mata kuliah,
lalu menampilkan kembali hasil setelah perubahan.
Tujuan Project

Project ini dibuat sebagai latihan implementasi berbagai struktur data dalam satu studi kasus yang saling terhubung, yaitu Student Academic Record System.
Dengan project ini, setiap anggota kelompok mengimplementasikan modul yang berbeda, namun tetap menggunakan shared class yang sama agar sistem terintegrasi.

Author

Group 3
Mata Kuliah Struktur Data dan Algoritma

## Pull Request Demo
Branch feature-course-roster digunakan untuk demonstrasi workflow Git.