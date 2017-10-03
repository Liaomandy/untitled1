public class Main2 {
    public static void main(String[]args){
        java.util.Scanner in=new java.util.Scanner(System.in);

        int a,b,c;
        System.out.print("a:");
        a=in.nextInt();
        System.out.print("b:");
        b=in.nextInt();
        System.out.print("c:");
        c=in.nextInt();

        int Sum=(a+b+c);
        int edv=(a+b+c)/3;



        System.out.println("Sum:" +Sum);
        System.out.println("edv:" +edv);


    }
}
