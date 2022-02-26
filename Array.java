import java.util.ArrayList;
import java.util.Scanner;



public class Array 
{
    public static void main(String[] args) throws Exception 
    {
        ArrayList<String> nama = new ArrayList<String>() ;
        
        nama.add("e");
        nama.add("n");
        nama.add("d");
        nama.add("i");
        

        System.out.println("\n\nNAMA\t : "+nama);
        System.out.println("--------------------");


        Scanner pilih = new Scanner(System.in);
        String pilihan;


        System.out.println("1. IsEmpty");
        System.out.println("2. Size()");
        System.out.println("3. Get()");
        System.out.println("4. IndexOf()");
        System.out.println("5. Remove()");
        System.out.println("6. Add()");

        System.out.println("\n\nInput Pilihan   : ");
        pilihan = pilih.next();
        System.out.println();

        switch (pilihan)
        {
            case "1" :
                System.out.println("Apakah array kosong?\n ->  "+nama.isEmpty());
            break;


            case "2" :
                System.out.println("Berapa elemen array?\n ->  "+nama.size());
            break;


            case "3" :
                System.out.printf("Input Nilai Indeks\t: ");
                Integer indeks = pilih.nextInt();
                System.out.println("\nNilai di Indeks ke-" + indeks + "\n->  " + nama.get(indeks));

                
            break;


            case "4" :
                System.out.printf("Input Elemen\t: ");
                String nilai = pilih.next();
                System.out.println("Elemen  "+ nilai + "    berada di Indeks ke- \n ->  " + nama.indexOf(nilai));
            break;


            case "5" :
                System.out.printf("Input Elemen yang Ingin Di Hapus\t: ");
                String ind = pilih.next();
                System.out.println(nama.remove(ind));  
                System.out.println(nama);  
            break;


            case "6" :
                System.out.print("Masukkan indeks array\t :");
                Integer inx = pilih.nextInt();
                System.out.print("Masukkan nilai elemen array\t :");
                String elemen = pilih.next();
                nama.add(inx,elemen);
                System.out.println(nama);
            break;

        }

    }
}
