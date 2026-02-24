# Struktur Multidimensi

## Deskripsi

Diberikan sebuah struktur data multidimensi yang terdiri dari elemen-elemen bertipe string.
Struktur ini dapat mengandung string maupun struktur serupa di dalamnya (nested), dengan kedalaman yang tidak terbatas.

Struktur tersebut dapat dianggap sebagai sebuah array yang setiap elemennya dapat berupa:

- Sebuah string, atau
- Sebuah array lain yang memiliki format serupa.

Diberikan sebuah string target, tentukan apakah string tersebut terdapat di dalam struktur multidimensi tersebut.

Pencarian harus dilakukan dengan menjelajahi seluruh elemen, termasuk elemen-elemen di dalam array yang bersarang (nested array).

---

## Format Masukan

Masukan diberikan dalam bentuk:

- Sebuah struktur multidimensi `S`
- Sebuah string `T`

Struktur `S` dijamin hanya berisi string.

---

## Format Keluaran

Keluarkan sebuah nilai boolean:

- `true` jika string `T` terdapat dalam struktur `S`
- `false` jika tidak terdapat

---

## Contoh 1

### Masukan

```java
S = {"a","b",{"c","d",{"e"}}}
T = "e"
```

### Keluaran

```
true
```

---

## Contoh 2

### Masukan

```java
S = {{"a"},{"b","c"},{"d",{"e","f"}}}
T = "f"
```

### Keluaran

```
true
```

---

## Hint

- Kamu bisa menggunakan `Object[] name` untuk membuat nested array
- Gunakan `instanceof` pada _condition_ untuk membandingkan suatu object merupakan suatu instance dari _class_ tertentu
