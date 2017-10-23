public class Main2 {
    public static void main(String[]args){
        java.util.Scanner in=new java.util.Scanner(System.in);

        int a,b,c;
        System.out.print("a:");
        a=in.nextInt();
        System.out.print("b:");
        b=in.nextInt();
        //System.out.print("c:");
        //c=in.nextInt();
        int Sum=(a+b);
        int Sub=(a-b);
        int Mul=(a*b);
        int Div=(a/b);
        int div=(a%b);
        //int ave=(a+b)/2;
        //System.out.println("Sum:" +Sum);
        //System.out.println("ave:" +ave);
        System.out.println(Sum);
        System.out.println(Sub);
        System.out.println(Mul);
        System.out.println(Div);
        System.out.println(div);



    }
}
