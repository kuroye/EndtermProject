import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Computer> products = new ArrayList<>();

        Menu menu = new Menu();
        Admin admin = new Admin();
        Scanner sc = new Scanner(System.in);

        boolean c1 = true, c2 = true, c3 = true ,c4 = true;
        int b1,b2,b3,d1=0;

        while (c1) {
            menu.MainF();
            b1 = sc.nextInt();

            if (b1 == 1) {

                while(c2){
                    menu.UserF();
                    b2= sc.nextInt();
                    switch (b2){
                        case 1:
                            admin.sell();
                            break;
                        case 2:
                            admin.show();
                            break;
                        case 3:
                            c2=false;
                            break;
                    }
                }



            } else if (b1 == 2) {

                while(c3){
                    menu.AdminF();
                    b3= sc.nextInt();
                    switch (b3){
                        case 1:
                            while(c4) {
                                menu.PhoneOrPC();
                                if (d1 == 1) {
                                    admin.addNewPhone();
                                } else if (d1 == 2) {
                                    admin.addNewPC();
                                }
                                break;
                            }
                        case 2:
                            admin.remove();
                            break;
                        case 3:
                            c3=false;
                            break;
                    }
                }




            }else if(b1==3){
                c1 = false;
            }


        }



    }
}

