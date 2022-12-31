package day16_NestedLopp;

public class PracticeTask3_UpperLowerLetter {
    public static void main(String[] args) {

            for (char i = 97; i <= 122; i++) {
                char lowerChar =i ;
                System.out.print("A"+lowerChar+" ");
            }
        System.out.println();
        for (char i = 97; i <= 122; i++) {
            char lowerChar =i ;
            System.out.print("B"+lowerChar+" ");
        }
        System.out.println();
        for (char i = 97; i <= 122; i++) {
            char lowerChar =i ;
            System.out.print("C"+lowerChar+" ");
        }
        System.out.println();
        for (char i = 97; i <= 122; i++) {
            char lowerChar =i ;
            System.out.print("D"+lowerChar+" ");
        }
        System.out.println();
        for (char i = 97; i <= 122; i++) {
            char lowerChar =i ;
            System.out.print("E"+lowerChar+" ");
        }
        System.out.println();

        System.out.println("=======Teacher Approach=========");

        for (char j = 'A'; j <='E' ; j++) {
            for (char i ='a'; i <='z' ; i++) {
                System.out.print(j+""+i+" ");
            }
            System.out.println();

        }









    }
}
/*
Use a nested loop to print the following output:
        Aa Ab Ac Ad Ae Af Ag Ah Ai Aj Ak Al Am An Ao Ap Aq Ar As At Au Av Aw Ax Ay Az
        Ba Bb Bc Bd Be Bf Bg Bh Bi Bj Bk Bl Bm Bn Bo Bp Bq Br Bs Bt Bu Bv Bw Bx By Bz
        Ca Cb Cc Cd Ce Cf Cg Ch Ci Cj Ck Cl Cm Cn Co Cp Cq Cr Cs Ct Cu Cv Cw Cx Cy Cz
        Da Db Dc Dd De Df Dg Dh Di Dj Dk Dl Dm Dn Do Dp Dq Dr Ds Dt Du Dv Dw Dx Dy Dz
        Ea Eb Ec Ed Ee Ef Eg Eh Ei Ej Ek El Em En Eo Ep Eq Er Es Et Eu Ev Ew Ex Ey Ez
 */
