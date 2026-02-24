# Pencarian Kata Kunci

## Deskripsi

Sebuah sistem mesin pencari sederhana sedang dikembangkan.
Sistem ini menerima satu string target yang berisi kumpulan huruf sebagai kata kunci pencarian. Setiap huruf dalam target dianggap sebagai satu kata kunci yang wajib ada dalam hasil.

Mesin pencari juga memiliki daftar hasil pencarian dalam bentuk array string. Tugasnya adalah memfilter daftar tersebut dan hanya menampilkan hasil yang mengandung seluruh huruf pada target sesuai ketentuan.

Sebuah string target yang merepresentasikan kumpulan kata kunci.

Sebuah array string `searchResult` bertipe `String[]` yang berisi daftar hasil pencarian. Setiap karakter dalam target dianggap sebagai satu kata kunci.

```java
String target = "abc";
```

berarti terdapat **tiga** kata kunci: 'a', 'b', dan 'c'.

Tugas Anda adalah:

- mengembalikan semua string dalam `searchResult` yang mengandung seluruh karakter dalam target.

### Ketentuan

- Huruf bersifat case-sensitive.
- Urutan karakter tidak harus sama.
- Karakter tidak harus berurutan.
- Jika suatu huruf muncul lebih dari sekali dalam target, maka hasil harus mengandung huruf tersebut minimal sebanyak kemunculannya.
- Urutan hasil mengikuti urutan asli dalam `searchResult`.
- Duplikasi tidak perlu dihapus.

---

## Format Masukan

```java
String[] searchResult = {...}; // list hasil pencarian
String target = ""; // target satu kata kunci
```

---

## Format Keluaran

Keluarkan semua string dalam `searchResult` yang mengandung seluruh huruf dalam `target`, masing-masing pada baris terpisah.

Jika tidak ada yang memenuhi, keluarkan baris kosong.

---

## Contoh 1

**Input**

```java
String target = "abc";

String[] searchResult = {
    "ab",
    "abc",
    "abcd",
    "bcd"
};
```

**Output**

```java
["abc", "abcd"]
```

---

## Contoh 2

**Input**

```java
String[] list = {
    "ab", "cba", "abc", "axbxc",
    "ddd", "abc", "cxab", "aabbcc"
};

String target = "abc";
```

**Output**

```java
[cba, abc, axbxc, abc, cxab, aabbcc]
```

### helper

- `Character.toString(string i)` untuk konversi dari char ke string
