import java.util.Scanner;

// 1. Class
class MenuEs {
    // 3. Atribut
    private String namaEs;
    private int harga;

    // 4. Constructor
    public MenuEs(String namaEs, int harga) {
        this.namaEs = namaEs;
        this.harga = harga;
    }

    // 6. Accessor
    public String getNamaEs() {
        return namaEs;
    }

    public int getHarga() {
        return harga;
    }

    // 5. Mutator
    public void setHarga(int harga) {
        this.harga = harga;
    }
}

// 8. Inheritance
class EsCampur extends MenuEs {
    private String topping;

    public EsCampur(String namaEs, int harga, String topping) {
        super(namaEs, harga);
        this.topping = topping;
    }

    public String getTopping() {
        return topping;
    }
}

// 9. Polymorphism
class Kasir {
    public void cetakStruk(MenuEs es) {
        System.out.println("Menu: " + es.getNamaEs() + " - Harga: Rp" + es.getHarga());
    }

    public void cetakStruk(EsCampur esCampur) {
        System.out.println("Menu: " + esCampur.getNamaEs() + " - Topping: " + esCampur.getTopping() + " - Harga: Rp" + esCampur.getHarga());
    }
}

// 7. Main class harus disimpan dengan nama file yang sama: WarungEsApp.java
public class WarungEsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 12. IO Sederhana

        // 13. Array - daftar menu
        MenuEs[] menu = {
            new MenuEs("Es Teh", 3000),
            new MenuEs("Es Jeruk", 4000),
            new EsCampur("Es Campur", 7000, "Cincau")
        };

        System.out.println("=== Menu Warung Es ===");
        // 11. Perulangan
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i].getNamaEs() + " - Rp" + menu[i].getHarga());
        }

        System.out.print("Pilih menu (1-" + menu.length + "): ");
        int pilihan = scanner.nextInt();

        // 10. Seleksi
        if (pilihan < 1 || pilihan > menu.length) {
            System.out.println("Pilihan tidak tersedia.");
            scanner.close();
            return;
        }

        System.out.print("Jumlah pesanan: ");
        int jumlah = scanner.nextInt();

        try {
            // 14. Error Handling
            if (jumlah <= 0) {
                throw new IllegalArgumentException("Jumlah tidak boleh kurang dari 1.");
            }

            // 2. Object
            MenuEs pesanan = menu[pilihan - 1];
            Kasir kasir = new Kasir();

            int total = pesanan.getHarga() * jumlah;

            System.out.println("\n=== Struk Pembelian ===");
            // 9. Polymorphism
            if (pesanan instanceof EsCampur) {
                kasir.cetakStruk((EsCampur) pesanan);
            } else {
                kasir.cetakStruk(pesanan);
            }

            System.out.println("Jumlah: " + jumlah);
            System.out.println("Total: Rp" + total);

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

        scanner.close();
    }
}
