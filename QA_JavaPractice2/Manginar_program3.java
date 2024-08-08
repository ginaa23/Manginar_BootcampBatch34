import java.util.Arrays;

public class Manginar_program3 {
    public static void main(String[] args){
        int[] a = {2, -34, 23, 44, 7, -40, 29, 0, 23, 22};
        int[] result = MaxDotProduct(a);

        System.out.println("dot product max: " + Arrays.toString(result));
    }

    public static int[] MaxDotProduct(int[] a){
        Arrays.sort(a);
        int n = a.length;
        int product1 = a[n-1] * a[n-2] * a[n-3]; //menghitung produk tiga angka terbesar
        int product2 = a[0] * a[1] * a[n-1];//menghitung produk 2 angka terkecil dam 1 angka terbesar

        //memilih produk max antara produk 1 dan 2
        if (product1 > product2){
            return new int[] {a[n-1], a[n-2], a[n-3]}; //mengembalikan 3 angka terbesar jika product1 lebih besar
        } else {
            return new int[] {a[0], a[1], a[n-1]}; //mengembalikan 2 angka terkecil dan 1 angka terbesar jika product2 lebih besar
        }
    }
}
