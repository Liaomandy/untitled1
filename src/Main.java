public class Main {

    public static void main(String[] args) {
	// write your code here
        java.util.Scanner in=new java.util.Scanner(System.in);
        System.out.println("What's your name");
        String name=in.nextLine();
        System.out.println("How old are you?");
        int age=in.nextInt();

        System.out.println(name +"  "+ age+ " years old");


    }
}
