import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int pilih, porsi,harga =0, sminum, minum, hargami=0,porsiminum;
        System.out.println("pilih menu bakso ");
        System.out.println("1. bakso biasa ");
        System.out.println("2. bakso jumbo ");
        System.out.println("3. bakso kasar ");
        System.out.print("pilih = ");
        pilih= input.nextInt();
        System.out.print("porsi bakso = ");
        porsi= input.nextInt();
        switch (pilih){
            case 1:
                System.out.println("bakso biasa");
                System.out.println("12.000 / porsi");
                harga = 12000;
                break;
            case 2:
                System.out.println("bakso jumbo");
                harga = 10000;
                break;
            case 3:
                System.out.println("bakso kasar");
                harga= 6000;
                break;
        }

        harga = harga*porsi;

        System.out.println("dengan porsi : "+porsi);
        System.out.println("total bayar : "+harga);

        System.out.println("apakah anda ingin minum? ");
        System.out.println("1. ya : ");
        System.out.println("2. tidak : ");
        System.out.print("pilih salah satu = ");
        sminum=input.nextInt();

        if(sminum==1){
            System.out.println("pilih minum");
            System.out.println("1. teh");
            System.out.println("2. air");
            minum=input.nextInt();
            System.out.print("porsi minum = ");
            porsiminum=input.nextInt();

            if(minum==1){
                System.out.println("teh");
                hargami= 5000;
                harga= harga+hargami*porsiminum;
                System.out.println("jadi total + minum = "+harga);
            }
            else if (minum==2){
                System.out.println("air");
                hargami= 3000;
                harga= harga+hargami*porsiminum;
                System.out.println("jadi total + minum = "+harga);
            }
        }
        else if (sminum==2){
            System.out.println("tidak minum");

        }



    }

}