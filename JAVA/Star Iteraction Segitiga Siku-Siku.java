public class TestES {
    public static void main(String[] args) {
      //menambahkan variabel i dan j
      int i, j;
      //untuk variabel i di set dimana variabel i adalah 0 kemudian i lebih kecil dari 3 kemudian i ditambah 1
      for(i=0; i<3; i++)
      {
          //untuk variabel j di set dimana variabel j adalah 0 kemudian variabel j di tambah 1
         for(j=0; j<=i; j++)
         {
             //cetak bintang yang di hasilkan dari rumus diatas
             //fungsi spasi setelah bintang untuk memberi jarak antar bintang
            System.out.print("* ");
         }
         //cetak ini untuk menyusun bintang agar lebih rapih (tidak sebaris)
         // \n digunakan untuk memberi enter pada bintang
         System.out.print("\n");
      }
    }
    
}
