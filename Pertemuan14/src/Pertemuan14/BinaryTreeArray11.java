package Pertemuan14;

public class BinaryTreeArray11 {
    Mahasiswa11[] data;
    int idxLast;

    public BinaryTreeArray11() {
        data = new Mahasiswa11[10];
        idxLast = -1;
    }

    public void populateData(Mahasiswa11[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    public void add(Mahasiswa11 mahasiswa) {
        if (idxLast < data.length - 1) {
            data[++idxLast] = mahasiswa;
        } else {
            System.out.println("Array penuh!");
        }
    }

    public void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast && data[idxStart] != null) {

            traverseInOrder(2 * idxStart + 1);

            data[idxStart].tampilInformasi();
            System.out.println();

            traverseInOrder(2 * idxStart + 2);
        }
    }
    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast && data[idxStart] != null) {
            data[idxStart].tampilInformasi();
            System.out.println();
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }
}