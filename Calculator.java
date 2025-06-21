import java.util.Scanner;

class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        String s = sc.next();
        char c = sc.next().charAt(0);
        Double n = 0.0;
        Double res = 0.0;

        for (int i = 0; i < s.length(); i++) {
            if (c == '+') {
                System.out.print(String.valueOf(s) + c);
                n = Double.parseDouble(s);
                res = res + n;
                System.out.println(res);

            } else if (c == '-') {
                System.out.print(String.valueOf(s) + c);
                res = res - n;
                System.out.println(res);

            } 

            }
        }

        sc.close();
    }}