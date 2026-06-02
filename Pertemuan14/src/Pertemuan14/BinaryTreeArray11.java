package Pertemuan14;

public class BinaryTreeArray11 {
    Mahasiswa11[] data;
    int idxLast;

    public BinaryTreeArray11() {
        data = new Mahasiswa11[10];
    }

    public void populateData(Mahasiswa11[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    public void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);

            data[idxStart].tampilInformasi();
            System.out.println();

            traverseInOrder(2 * idxStart + 2);
        }
    }
}
