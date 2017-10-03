public class Main1 {
    public static void main(String[]args) {
        java.util.Scanner in = new java.util.Scanner(System.in);

        System.out.println("攝氏");
        Double C = in.nextDouble();
        Double F = (C * 5 / 9 + 32);

        System.out.println("攝氏:"+ C);
        System.out.println("華氏:" + F);

    }


}
