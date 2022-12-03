public class TKebalik {
    public static void main(String[] args) {
        /*menambahkan dan mengset variabel M dimana nilai M adalah satu kemudian M lebih kecil atau sama dengan 3 kemudian M ditambah satu*/
        /*for yang pertama untuk baris pertama*/
        for (int m = 1; m <= 3; m++)
        {
            /*menambahkan dan mengset variabel N dimana nilai N adalah satu kemudian N lebih kecil atau sama dengan 3 kemudian N ditambah satu*/
            /*for kedua untuk baris ke dua*/
            for (int n = 1; n <= 3; n++)
        {
            /*Jika M tidak sama dengan 3*/
            /*menentukan baris bintang*/
    if (m != 3){
        /*dan jika N sama dengan 1 atau N sama dengan 3*/
        /*agar bintang pada baris 1 dan 2 tepat berada di tengah*/
    if(n==1||n==3)
    {
        /*maka di cetak kosong*/
        /*print ini untuk menghilangkan bintang pada sisi kiri dan kanan di baris 1 dan 2*/
        System.out.print(" ");
    }
    else{
        /*jika pernyataan kedua tidak memenuhi maka dicetak bintang*/
        /*print ini untuk mencetak bintang pada baris 1 dan baris 2*/
    System.out.print("*");}
        }
    else{
        /*jika pernyataan pertama tidak memenuhi maka dicetak bintang*/
        /*print ini untuk mencetak bintang pada baris ke tiga*/
        System.out.print("*");
    }
        }
            /*cetakan ini agar semua bintang yang di cetak bisa tersusun dengan baik (tidak menumpuk dalam satu baris)*/
            System.out.println(" ");
        }
    }
    
}
