package hw1;

import java.util.Scanner;

public class HW_2 {
    public static void main(String[] args) {

        int a, b; // дом 1
        int c, d; // дом 2
        int e, f; // участок

        Scanner sc = new Scanner(System.in);
        System.out.println("введите длинну стороны A дома 1");
        a = sc.nextInt ();
        System.out.println("введите длинну стороны B дома 1");
        b = sc.nextInt();
        System.out.println("введите длинну стороны C дома 2");
        c = sc.nextInt();
        System.out.println("введите длинну стороны D дома 2");
        d = sc.nextInt();
        System.out.println("введите длинну стороны E участка");
        e = sc.nextInt();
        System.out.println("введите длинну стороны F участка");
        f = sc.nextInt();

        if (isFit(a, b, c, d, e, f)) {
            System.out.println("Да, можно построить");
        } else {
            System.out.println("Нет, построить нельзя");
        }

        }

        public static boolean isFit(double aSide, double bSide, double cSide, double dSide, double eSide, double fSide){

        if (eSide >= aSide && eSide >= cSide && fSide >= (bSide + dSide)){
      
        } else if (eSide >= aSide && eSide >= dSide && fSide >= (bSide + cSide)){
            
        } else if (eSide >= bSide && eSide >= dSide && fSide >= (aSide + cSide)){
            
        } else if (fSide >= aSide && fSide >= cSide && eSide >= (bSide + dSide)){
            
        } else if (fSide >= bSide && fSide >= cSide && eSide >= (aSide + dSide)){
            
        } else if (fSide >= aSide && fSide >= dSide && eSide >= (bSide + cSide)){
            
        } else if (fSide >= bSide && fSide >= dSide && eSide >= (aSide + cSide)){
                
            } else {
                    return false;
                }
        }

}
