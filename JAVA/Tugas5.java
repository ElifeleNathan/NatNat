public class Tugas5 {
    public static void main(String[] args) {
    int z,harga1=65,harga2=70,harga3=85,parameter;
    for(z=0;z<43;z++){
    System.out.print("-");
    }
    System.out.println();
    System.out.println("Lembar    60 gram     70 gram    80 gram");
    System.out.println("          @ Rp 65,-   @ Rp 75,-  @ Rp 65,-");
    for(z=0;z<43;z++){
        System.out.print("-");
        }
        System.out.println();
    for(int i=1;i<=50;i++){
        System.out.print(i);
        for(int j=0;j<25;j++){
            parameter=0;          
            if(j==9){
            if(i>=10){
            System.out.print(i*harga1);
        }
            else if(i<10){
            System.out.print(" ");
            System.out.print(i*harga1);}
        } 
        parameter=i*harga1;
        if(j==16){
            if(parameter<100){
            System.out.print("   ");
            System.out.print(i*harga2);
            }
            else if(parameter<1000){
            System.out.print("  "+i*harga2);}
            else if(parameter>=1000){
            System.out.print(" "+i*harga2);}
        }
        
        parameter=i*harga2;
        if(j==23){
        if(parameter<100){
            System.out.print("   "+i*harga3);}
        else if(parameter<1000){
            System.out.print("  "+i*harga3);}
        else if(parameter>=1000){
            System.out.print(" "+i*harga3);}
    }
        System.out.print(" ");
        }
        System.out.println();
    }
  }
}
