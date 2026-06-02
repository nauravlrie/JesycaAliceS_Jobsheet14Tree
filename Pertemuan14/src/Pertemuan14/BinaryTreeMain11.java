package Pertemuan14;

public class BinaryTreeMain11 {
    public static void main(String[] args) {

        BinaryTree11 bst = new BinaryTree11();

        // Menggunakan addRekursif()
        bst.addRekursif(new Mahasiswa11("244160121", "Ali", "A", 3.57));
        bst.addRekursif(new Mahasiswa11("244160221", "Badar", "B", 3.85));
        bst.addRekursif(new Mahasiswa11("244160185", "Candra", "C", 3.21));
        bst.addRekursif(new Mahasiswa11("244160220", "Dewi", "B", 3.54));
        bst.addRekursif(new Mahasiswa11("244160131", "Devi", "A", 3.72));
        bst.addRekursif(new Mahasiswa11("244160205", "Ehsan", "D", 3.37));
        bst.addRekursif(new Mahasiswa11("244160170", "Fizi", "B", 3.46));

        System.out.println("=================================================");
        System.out.println("InOrder Traversal:");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPreOrder Traversal:");
        bst.traversePreOrder(bst.root);

        System.out.println("\nPostOrder Traversal:");
        bst.traversePostOrder(bst.root);

        System.out.println();

        System.out.println("=================================================");
        System.out.println("Pencarian data mahasiswa:");

        System.out.print("Cari mahasiswa dengan IPK 3.54 : ");
        String hasilCari = bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        System.out.print("Cari mahasiswa dengan IPK 3.22 : ");
        hasilCari = bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        System.out.println();

        System.out.println("=================================================");
        bst.cariMinIPK();

        System.out.println();
        bst.cariMaxIPK();

        System.out.println();
        System.out.println("=================================================");
        System.out.println("Mahasiswa dengan IPK di atas 3.50");
        bst.tampilMahasiswaIPKdiAtas(3.50);

        System.out.println();
        System.out.println("=================================================");
        System.out.println("Penghapusan data mahasiswa dengan IPK 3.57 (Ali):");

        bst.delete(3.57);

        System.out.println();
        System.out.println("Daftar mahasiswa setelah penghapusan:");

        bst.traverseInOrder(bst.root);

        System.out.println();
        System.out.println("=================================================");
    }
}