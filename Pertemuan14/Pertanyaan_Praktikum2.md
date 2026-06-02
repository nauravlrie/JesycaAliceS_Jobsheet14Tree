# Jawaban Pertanyaan - Kegiatan Praktikum 2: Binary Tree Array

Dokumen ini berisi jawaban lengkap dan terstruktur atas pertanyaan reflektif dari Kegiatan Praktikum 2 pada Jobsheet 14 (Tree).

---

### **Pertanyaan 1**
**Apakah kegunaan dari atribut `data` dan `idxLast` yang ada di class `BinaryTreeArray`?**

**Jawaban:**
* **Atribut `data` (bertipe `int[]`)**: Berfungsi sebagai wadah/media penyimpanan utama untuk seluruh node dalam *Binary Tree*. Array ini menampung nilai elemen secara sekuensial (berdasarkan penomoran level-order).
* **Atribut `idxLast` (bertipe `int`)**: Berfungsi untuk melacak indeks terakhir dalam array yang berisi elemen tree yang valid/terisi. Ini sangat penting untuk membatasi proses penelusuran (*traversal*) agar tidak mencoba mengakses indeks array kosong (out of bounds atau nilai *default* `0`).

---

### **Pertanyaan 2**
**Apakah kegunaan dari method `populateData()`?**

**Jawaban:**
Method `populateData()` digunakan untuk menginisialisasi seluruh isi dari binary tree dengan cara meng-assign sebuah array secara langsung ke atribut `data` serta menentukan batas indeks maksimum melalui parameter `idxLast`. Dengan method ini, data awal dari tree dapat disiapkan secara instan untuk diuji traversal-nya.

---

### **Pertanyaan 3**
**Apakah kegunaan dari method `traverseInOrder()`?**

**Jawaban:**
Method `traverseInOrder()` digunakan untuk melakukan penelusuran (*traversal*) simpul-simpul pohon biner dengan urutan **In-Order** (kiri-akar-kanan). Secara rekursif, method ini akan mengunjungi:
1. Sub-tree bagian kiri (*Left Child*).
2. Cetak/proses nilai pada simpul saat ini (*Root/Parent*).
3. Sub-tree bagian kanan (*Right Child*).

---

### **Pertanyaan 4**
**Jika suatu node binary tree disimpan dalam array indeks `i`, maka di indeks berapakah posisi *left child* dan *right child* masing-masing?**

**Jawaban:**
Dalam representasi *Binary Tree* berbasis array (dimulai dari indeks `0`):
* **Left Child** berada di indeks: **`2 * i + 1`**
* **Right Child** berada di indeks: **`2 * i + 2`**

*Contoh:* Jika node berada pada indeks `i = 2` (nilai data `8`), maka anak kirinya ada di indeks `2 * 2 + 1 = 5` (nilai data `7`), dan anak kanannya ada di indeks `2 * 2 + 2 = 6` (nilai data `9`).

---

### **Pertanyaan 5 & 6 (Modifikasi)**
**Bagaimana implementasi method `traversePreOrder`, `traversePostOrder`, dan `add` secara dinamis?**

**Jawaban:**
Kami telah mengimplementasikan method-method modifikasi tersebut di dalam berkas kelas `BinaryTreeArray11.java`:

1. **Method `traversePreOrder` (akar-kiri-kanan):**
   ```java
   public void traversePreOrder(int idxStart) {
       if (idxStart <= idxLast) {
           System.out.print(data[idxStart] + " ");
           traversePreOrder(2 * idxStart + 1);
           traversePreOrder(2 * idxStart + 2);
       }
   }
   ```

2. **Method `traversePostOrder` (kiri-kanan-akar):**
   ```java
   public void traversePostOrder(int idxStart) {
       if (idxStart <= idxLast) {
           traversePostOrder(2 * idxStart + 1);
           traversePostOrder(2 * idxStart + 2);
           System.out.print(data[idxStart] + " ");
       }
   }
   ```

3. **Method `add` (Penambahan Dinamis & Auto-resizing):**
   ```java
   public void add(int element) {
       // Melakukan resize otomatis jika array sudah penuh
       if (idxLast >= data.length - 1) {
           int[] temp = new int[data.length * 2];
           System.arraycopy(data, 0, temp, 0, data.length);
           data = temp;
       }
       idxLast++;
       data[idxLast] = element;
   }
   ```
