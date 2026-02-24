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

  - Setiap karakter (misalnya `x|` atau `|x`) harus diapit dengan karakter `%`. kecuali jika karakter tersebut adalah vokal, maka diapit dengan karakter `#`.
  - contoh: `BC` -> `B|%C|`, `AB` -> `|A#B|` `AA` -> `|A#|A`

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

## Contoh 1

### Input

```
hello world
```

### Output

```
h|%|e#l|%l|%|o=w|%|o#r|%l|%d|
```

---

## Contoh 2

### Input

```
Code
```

### Output

```
C|%|o#d|%|e
```

## Contoh 3

### Input

```
aku kamu
```

### Output

```
|a#k|%|u=k|%|a#m|%|u
```
