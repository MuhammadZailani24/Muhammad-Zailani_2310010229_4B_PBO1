# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pemesanan minuman es menggunakan Java sebagai tugas akhir dari mata kuliah Pemrograman Berbasis Objek 1.

## Deskripsi

Aplikasi ini memungkinkan pengguna untuk memilih menu es, menentukan jumlah pesanan, dan mencetak struk pembelian. Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, MenuEs, EsCampur, Kasir, dan WarungEsApp adalah contoh class.

```bash
class MenuEs { ... }
class EsCampur extends MenuEs { ... }
class Kasir { ... }
public class WarungEsApp { ... }

```

2. **Object** adalah instance dari class. Pada kode ini, `MenuEs pesanan = menu[pilihan - 1];
, Kasir kasir = new Kasir();` adalah contoh pembuatan object.

```bash
MenuEs pesanan = menu[pilihan - 1];
Kasir kasir = new Kasir();
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `namaES` , `harga` Dan `topping` adalah contoh atribut.

```bash
private String namaEs;
private int harga;
private String topping;
```

4. **Constructor** adalah method khusus yang dijalankan saat object dibuat.

```bash
public MenuEs(String namaEs, int harga) {
    this.namaEs = namaEs;
    this.harga = harga;
}

public EsCampur(String namaEs, int harga, String topping) {
    super(namaEs, harga);
    this.topping = topping;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Contoh dalam kode:

```bash
public void setHarga(int harga) {
    this.harga = harga;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Contoh dalam kode:

```bash
public String getNamaEs() {
    return namaEs;
}

public int getHarga() {
    return harga;
}
```

7. **Encapsulation** adalahmenyembunyikan data dengan membuat atribut private dan mengaksesnya melalui getter dan setter:

```bash
private String namaEs;
public String getNamaEs() { return namaEs; }
```

8. **Inheritance** adalah  pewarisan dari class induk ke class anak.  Pada kode ini, `EsCampur` mewarisi semua atribut dan method dari `MenuEs`.


```bash
public class EsCampur extends MenuEs {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Dalam kode ini:

```bash
public void cetakStruk(MenuEs es) { ... } // overloading
public void cetakStruk(EsCampur esCampur) { ... } // overloading

if (pesanan instanceof EsCampur) {
    kasir.cetakStruk((EsCampur) pesanan);
} else {
    kasir.cetakStruk(pesanan);
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Dalam Kode ini:
```bash
if (pilihan < 1 || pilihan > menu.length) {
    System.out.println("Pilihan tidak tersedia.");
    return;
}

if (jumlah <= 0) {
    throw new IllegalArgumentException("Jumlah tidak boleh kurang dari 1.");
}
```

11. **Perulangan** Perulangan digunakan untuk menampilkan seluruh daftar menu: Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < menu.length; i++) {
    System.out.println((i + 1) + ". " + menu[i].getNamaEs() + " - Rp" + menu[i].getHarga());
}
```

12. **Input Output Sederhana** menggunakan `Scanner` dan `System.out.println`:
```bash
Scanner scanner = new Scanner(System.in);
int pilihan = scanner.nextInt();
System.out.println("Total: Rp" + total);
```

13. **Array** Di Gunkana untuk menyimpan data menu. Contoh Pada Kode:

```bash
MenuEs[] menu = {
    new MenuEs("Es Teh", 3000),
    new MenuEs("Es Jeruk", 4000),
    new EsCampur("Es Campur", 7000, "Cincau")
};
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    if (jumlah <= 0) {
        throw new IllegalArgumentException("Jumlah tidak boleh kurang dari 1.");
    }
    ...
} catch (Exception e) {
    System.out.println("Terjadi kesalahan: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Zailani
NPM: 2310010229
