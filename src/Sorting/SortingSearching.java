package Sorting;

public class SortingSearching {
    public static void insertionSort(int[] B){
        for(int i = 1; i < B.length; i++){
            int key = B[i];
            int j = i - 1;
            while((j >= 0) && (B[j] > key)){
                B[j + 1] = B[j];
                j--;
            }
            B[j + 1] = key;
        }
    }
    public static void tampil(int data[]){
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
         System.out.println("Siti Aminah Dauda (20090102)" + "\n");
        int B[] = {25, 7, 9, 13, 3};
        int cari = 7;
        int ketemu = 0;
        
        SortingSearching.tampil(B);
        SortingSearching.insertionSort(B);
        SortingSearching.tampil(B);
        
        System.out.println("Isi data B adalah: ");
        for(int i = 0; i < B.length; i++){
            System.out.print(B[i] + " ");
        }
        System.out.println("");
        System.out.println("");
        
        for(int i = 0; i < B.length; i++){
            if(B[i] == cari){
                ketemu = 1;
                System.out.println("data " + cari + " berada di indeks ke-" + i);
            }
        }
        System.out.println("");
        
        if(ketemu == 1)
            System.out.println("Kesimpulan: data ditemukan");
        else
            System.out.println("data yang dicari= " + cari);
            System.out.println("Kesimpulan: data tidak ditemukan");
    }
    
}
