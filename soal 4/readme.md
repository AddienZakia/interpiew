# Enkripsi Vokal dan Konsonan

## Deskripsi

Seorang programmer ingin membuat sistem enkripsi sederhana untuk menyamarkan sebuah pesan.
Setiap karakter dalam kalimat akan diubah berdasarkan jenis hurufnya (vokal atau bukan), lalu dibungkus dengan simbol tertentu.

Bantulah programmer tersebut untuk membuat fungsi yang dapat melakukan transformasi sesuai aturan berikut.

### Ketentuan

- Huruf vokal adalah: `a, e, i, o, u` (case-insensitive).
- Output harus mempertahankan huruf asli (tidak boleh diubah menjadi lowercase/uppercase).
- Jika karakter adalah **vokal**, maka ubah menjadi format:
  `|x`
- Jika karakter **bukan vokal**, maka ubah menjadi format:
  `x|`
- Setelah transformasi dasar:

  - Setiap karakter (misalnya `x|` atau `|x`) harus mengurung karakter `%`. kecuali jika karakter tersebut adalah vokal, maka mengurung karakter `#` **"setelah karakter vokal tersebut"**.
  - contoh: `BC` -> `B|%C|`, `AB` -> `|A#B|`, `AA` -> `|A#|A`, `BA` -> `B|%A|`

- Setiap kata diapit oleh karakter `=`
- Tidak diperbolehkan menggunakan:

  - `replace()`
  - `replaceAll()`

- Jika input adalah `undefined`, `null`, atau number, maka kembalikan string kosong `""`.

---

## Format Masukan

Sebuah string `s`.

---

## Format Keluaran

Sebuah string hasil transformasi sesuai aturan.

---

## Contoh

```
Input = hello world
Output = h|%|e#l|%l|%|o=w|%|o#r|%l|%d|

Input = Code
Output = C|%|o#d|%|e

Input = aku kamu
Output = |a#k|%|u=k|%|a#m|%|u

Input = Aku Aslab
Output = |A#k|%|u=|A#s|%l|%|a#b|
```

## Helper!

- `String.split(string delimiter)` untuk memisahkan string dari delimiter

contoh:

```java
String teks = "aslab-provikom";

System.out.println(teks.split("-")); // output: {"aslab", "provikom"}
```

- `String.toLowerCase()` untuk konversi string menjadi huruf kecil semua
- `String.toUpperCase()` untuk konversi string menjadi huruf besar semua

contoh:

```java
String teks = "Aslab Provikom";

teks.toLowerCase(); // output: aslab provikom
teks.toUpperCase(); // output: ASLAB PROVIKOM
```

- `String.charAt(int i)` untuk mendapatkan character pada string di index i

contoh:

```java
String teks = "aslab";

teks.chartAt(0); // output: 'a'
```

- `String.substring(int start, int end)` untk mendapatkan string pada index ke-_start_ hingga index ke-_end_

contoh:

```java
String teks = "provikom";

teks.substring(0, 3); // output: 'prov'
```
