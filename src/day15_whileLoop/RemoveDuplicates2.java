package day15_whileLoop;

public class RemoveDuplicates2 {
    public static void main(String[] args) {

        String str ="xyzxyzxyz";

        String result="";

        for (int i = 0; i <str.length() ; i++) {
            if(result.contains(""+str.charAt(i))){
                continue;
            }
            result+=str.charAt(i);
        }
        System.out.println(result);

        System.out.println("===============================");

        for (int i = 50; i <101 ; i++) {
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for (int i = 50; i <101 ; i+=2) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 50; i <101 ; i++) {
            if(i%2!=0){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
