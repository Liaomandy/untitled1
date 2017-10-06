public class Main4 {
    public static void main(String[]args){
        java.util.Scanner in=new java.util.Scanner(System.in);

        System.out.println("體重:");
        Double kg=in.nextDouble();
        System.out.println("身高:");
        Double cm=in.nextDouble();
        Double BMI=kg/(cm*cm/10000);
        System.out.println("BMI:"+BMI);




    }
}
