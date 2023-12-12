import java.util.Scanner;

public class login {
    public String Code[] = {"BM554","BSM1031","BSMLLH 009","mart2344","asdfg23455"};
    public String capca;
    public int hit =-1;
    public login(){
        String usr;
        String pw;
        System.out.println("SELAMAT DATANG DI BISMILLAH MART");
        for(int eql =1; eql<= 40; eql++){
            System.out.print("=");
        }
        System.out.println("\nLog in  ");
            do{
                Scanner n = new Scanner(System.in);
                System.out.print("Username         : ");
                usr = n.next();
                System.out.print("Password         : ");
                pw = n.next();
                if(usr.equalsIgnoreCase("Admin") && pw.equals("ILoveMyWife")){
                    int custom = 0;                    
                    do{
                        if(custom>0){
                            System.out.println("Captcha Salah !!!");
                        }
                        custom++;
                        hit ++;
                        hit %=3;
                        System.out.println("Kode Captcha     : " + Code[hit]);
                        System.out.print("Entry Captcha    : ");
                        Scanner cd = new Scanner(System.in);
                        capca = cd.next();

                    }while(!capca.equals(Code[hit]));


                    System.out.println("Akun Ditemukan");
                    break;
                }else{
                    System.out.println("Coba Lagi");
                }
            }while(!usr.equals("Admin") || !pw.equals("ILoveMyWife"));

        
    }
}