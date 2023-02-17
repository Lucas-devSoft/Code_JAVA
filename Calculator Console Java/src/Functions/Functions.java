package Functions;

import javax.xml.transform.Result;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Functions {
    public static Boolean option_A() {

        Scanner Keyword = new Scanner(System.in);

        try {

            System.out.println("       ┌───────────────────────────────────────────────────────────────────────────┐");
            System.out.println("       │           ╔════════════════════════════════════╦═════════════╗            │");
            System.out.println("       │           ║  A ► Addition                      ║     (+)     ║            │");
            System.out.println("       │           ╠════════════════════════════════════╩═════════════╣            │");
            System.out.println("       │           ║            Insert the first value                ║");

            int Num1 = Keyword.nextInt();

            System.out.println("       │           ╠══════════════════════════════════════════════════╣            │");
            System.out.println("       │           ║            Insert the second value               ║");
            System.out.println("       │           ╠══════════════════════════════════════════════════╣            │");

            int Num2 = Keyword.nextInt();

            int Result = Num1 + Num2;

            System.out.println("       │           ╠══════════════════════════════════════════════════╣            │");
            System.out.println("       │           ║   Yours result of addition is:    " + Result + "              ║            │");
            System.out.println("       │           ╚══════════════════════════════════════════════════╝            │");

            return true;

        } catch (Exception e) {

            System.out.println("       ├───────────────────────────────────────────────────────────────────────────┤");
            System.out.println("       │       An error was caught because you are not allowed text values         │");
            System.out.println("       │       Show you your error > " + e + "              │");
            System.out.println("       └───────────────────────────────────────────────────────────────────────────┘");

            return false;

        }

    }

    public static Boolean option_B() {

        Scanner Keyword = new Scanner(System.in);

        try {

            System.out.println("       ┌───────────────────────────────────────────────────────────────────────────┐");
            System.out.println("       │           ╔════════════════════════════════════╦═════════════╗            │");
            System.out.println("       │           ║      B ► Subtraction               ║     (-)     ║            │");
            System.out.println("       │           ╠════════════════════════════════════╩═════════════╣            │");
            System.out.println("       │           ║            Insert the first value                ║");

            int Num1 = Keyword.nextInt();

            System.out.println("       │           ╠══════════════════════════════════════════════════╣            │");
            System.out.println("       │           ║            Insert the second value               ║");
            System.out.println("       │           ╠══════════════════════════════════════════════════╣            │");

            int Num2 = Keyword.nextInt();

            int Result = Num1 - Num2;

            System.out.println("       │           ╠══════════════════════════════════════════════════╣            │");
            System.out.println("       │           ║   Yours result of Subtraction is:    " + Result + "              ║            │");
            System.out.println("       │           ╚══════════════════════════════════════════════════╝            │");

            return true;

        } catch (Exception e) {

            System.out.println("       ├───────────────────────────────────────────────────────────────────────────┤");
            System.out.println("       │       An error was caught because you are not allowed text values         │");
            System.out.println("       │       Show you your error > " + e + "              │");
            System.out.println("       └───────────────────────────────────────────────────────────────────────────┘");

            return false;

        }

    }

    public static Boolean option_C() {

        Scanner Keyword = new Scanner(System.in);

        try {

            System.out.println("       ┌───────────────────────────────────────────────────────────────────────────┐");
            System.out.println("       │           ╔════════════════════════════════════╦═════════════╗            │");
            System.out.println("       │           ║      C ► Multiplication            ║     (*)     ║            │");
            System.out.println("       │           ╠════════════════════════════════════╩═════════════╣            │");
            System.out.println("       │           ║            Insert the first value                ║");

            int Num1 = Keyword.nextInt();

            System.out.println("       │           ╠══════════════════════════════════════════════════╣            │");
            System.out.println("       │           ║            Insert the second value               ║");
            System.out.println("       │           ╠══════════════════════════════════════════════════╣            │");

            int Num2 = Keyword.nextInt();

            int Result = Num1 * Num2;

            System.out.println("       │           ╠══════════════════════════════════════════════════╣            │");
            System.out.println("       │           ║   Yours result of Multiplication is:    " + Result + "              ║            │");
            System.out.println("       │           ╚══════════════════════════════════════════════════╝            │");

            return true;

        } catch (Exception e) {

            System.out.println("       ├───────────────────────────────────────────────────────────────────────────┤");
            System.out.println("       │       An error was caught because you are not allowed text values         │");
            System.out.println("       │       Show you your error > " + e + "              │");
            System.out.println("       └───────────────────────────────────────────────────────────────────────────┘");

            return false;

        }

    }

    public static Boolean option_D() {

        Scanner Keyword = new Scanner(System.in);

        try {

            System.out.println("       ┌───────────────────────────────────────────────────────────────────────────┐");
            System.out.println("       │           ╔════════════════════════════════════╦═════════════╗            │");
            System.out.println("       │           ║      D ► Division                  ║     (/)     ║            │");
            System.out.println("       │           ╠════════════════════════════════════╩═════════════╣            │");
            System.out.println("       │           ║            Insert the first value                ║");

            int Num1 = Keyword.nextInt();

            System.out.println("       │           ╠══════════════════════════════════════════════════╣            │");
            System.out.println("       │           ║            Insert the second value               ║");
            System.out.println("       │           ╠══════════════════════════════════════════════════╣            │");

            int Num2 = Keyword.nextInt();

            int Result = Num1 / Num2;

            System.out.println("       │           ╠══════════════════════════════════════════════════╣            │");
            System.out.println("       │           ║   Yours result of Division is:    " + Result + "              ║            │");
            System.out.println("       │           ╚══════════════════════════════════════════════════╝            │");

            return true;

        } catch (Exception e) {

            System.out.println("       ├───────────────────────────────────────────────────────────────────────────┤");
            System.out.println("       │  An error was caught because you are not allowed text values or zero      │");
            System.out.println("       │       Show you your error > " + e + "              │");
            System.out.println("       └───────────────────────────────────────────────────────────────────────────┘");

            return false;

        }

    }

    public static Boolean option_E() {

        DecimalFormat df = new DecimalFormat("0,00");
        Scanner Keyword = new Scanner(System.in);

        try {

            System.out.println("       ┌───────────────────────────────────────────────────────────────────────────┐");
            System.out.println("       │           ╔════════════════════════════════════╦═════════════╗            │");
            System.out.println("       │           ║      E ► Exponentiation            ║    (b,e)    ║            │");
            System.out.println("       │           ╠════════════════════════════════════╩═════════════╣            │");
            System.out.println("       │           ║            Insert the base value                 ║");

            int Num1 = Keyword.nextInt();

            System.out.println("       │           ╠══════════════════════════════════════════════════╣            │");
            System.out.println("       │           ║            Insert the exponent value             ║");
            System.out.println("       │           ╠══════════════════════════════════════════════════╣            │");

            int Num2 = Keyword.nextInt();
            double Result  = Math.pow(Num1,Num2);

            System.out.println("       │           ╠══════════════════════════════════════════════════╣            │");
            System.out.println("       │           ║   Yours result of Exponentiation is:    " +   df.format(Result) + "              ║            │");
            System.out.println("       │           ╚══════════════════════════════════════════════════╝            │");

            return true;

        } catch (Exception e) {

            System.out.println("       ├───────────────────────────────────────────────────────────────────────────┤");
            System.out.println("       │       An error was caught because you are not allowed text values         │");
            System.out.println("       │       Show you your error > " + e + "              │");
            System.out.println("       └───────────────────────────────────────────────────────────────────────────┘");

            return false;

        }

    }

    public static Boolean option_F() {

        DecimalFormat df = new DecimalFormat("0,00");
        Scanner Keyword = new Scanner(System.in);

        try {

            System.out.println("       ┌───────────────────────────────────────────────────────────────────────────┐");
            System.out.println("       │           ╔════════════════════════════════════╦═════════════╗            │");
            System.out.println("       │           ║      F ► Radicalising              ║     (√)     ║            │");
            System.out.println("       │           ╠════════════════════════════════════╩═════════════╣            │");
            System.out.println("       │           ║            Insert the base value                 ║");

            int Num1 = Keyword.nextInt();

            System.out.println("       │           ╠══════════════════════════════════════════════════╣            │");
            System.out.println("       │           ║         Insert the elevation value               ║");
            System.out.println("       │           ╠══════════════════════════════════════════════════╣            │");

            int Num2 = Keyword.nextInt();

            double Result = Math.pow(Num1,(double) 1/Num2);

            System.out.println("       │           ╠══════════════════════════════════════════════════╣            │");
            System.out.println("       │           ║   Yours result of Radicalising is:    " + df.format(Result) + "              ║            │");
            System.out.println("       │           ╚══════════════════════════════════════════════════╝            │");

            return true;

        } catch (Exception e) {

            System.out.println("       ├───────────────────────────────────────────────────────────────────────────┤");
            System.out.println("       │       An error was caught because you are not allowed text values         │");
            System.out.println("       │       Show you your error > " + e + "              │");
            System.out.println("       └───────────────────────────────────────────────────────────────────────────┘");

            return false;

        }

    }

    public static Boolean option_G() {

        Scanner Keyword = new Scanner(System.in);

        try {

            System.out.println("       ┌───────────────────────────────────────────────────────────────────────────┐");
            System.out.println("       │           ╔══════════════════════════════════════════════════╗            │");
            System.out.println("       │           ║        G ► Even number or Odd number             ║            │");
            System.out.println("       │           ╠══════════════════════════════════════════════════╣            │");
            System.out.println("       │           ║      insert the number you want to verify        ║            │");

            int Num1 = Keyword.nextInt();

            int Result = Num1 % 2;

            if (Result == 0){

                System.out.println("       │           ╠══════════════════════════════════════════════════╣            │");
                System.out.println("       │           ║        Yours numbers ("+Num1+") is Even          ║            │");
                System.out.println("       │           ╚══════════════════════════════════════════════════╝            │");

            } else {

                System.out.println("       │           ╠══════════════════════════════════════════════════╣            │");
                System.out.println("       │           ║        Yours numbers ("+Num1+") is Odd           ║            │");
                System.out.println("       │           ╚══════════════════════════════════════════════════╝            │");

            }

            return true;

        } catch (Exception e) {

            System.out.println("       ├───────────────────────────────────────────────────────────────────────────┤");
            System.out.println("       │       An error was caught because you are not allowed text values         │");
            System.out.println("       │       Show you your error > " + e + "              │");
            System.out.println("       └───────────────────────────────────────────────────────────────────────────┘");

            return false;

        }

    }

    public static Boolean option_H() {

        int cont = 0;
        Scanner Keyword = new Scanner(System.in);

        try {

            System.out.println("       ┌───────────────────────────────────────────────────────────────────────────┐");
            System.out.println("       │           ╔══════════════════════════════════════════════════╗            │");
            System.out.println("       │           ║         H ► Single primes numbers                ║            │");
            System.out.println("       │           ╠══════════════════════════════════════════════════╣            │");
            System.out.println("       │           ║       insert the number you want to verify       ║            │");

            int Num1 = Keyword.nextInt();

            if (Num1 == 1) {

                System.out.println("       │           ╠══════════════════════════════════════════════════╣            │");
                System.out.println("       │           ║        Yours number (" + Num1 + ") is not in the list of primes          ║            │");
                System.out.println("       │           ╚══════════════════════════════════════════════════╝            │");

            } else if (Num1 > 1) {

                for (int i = 2; i < Num1; i++) {

                    int Result = Num1 % i;

                    if (Result == 0) {

                        cont++;
                    }
                }

                if (cont != 0) {

                    System.out.println("       │           ╠══════════════════════════════════════════════════╣            │");
                    System.out.println("       │           ║  Yours number (" + Num1 + ") is not in the list of primes  ║            │");
                    System.out.println("       │           ╚══════════════════════════════════════════════════╝            │");

                } else {

                    System.out.println("       │           ╠══════════════════════════════════════════════════╣            │");
                    System.out.println("       │           ║    Yours number (" + Num1 + ") is in the list of primes    ║            │");
                    System.out.println("       │           ╚══════════════════════════════════════════════════╝            │");

                }
            }

            return true;

        } catch (Exception e) {

            System.out.println("       ├───────────────────────────────────────────────────────────────────────────┤");
            System.out.println("       │       An error was caught because you are not allowed text values         │");
            System.out.println("       │       Show you your error > " + e + "              │");
            System.out.println("       └───────────────────────────────────────────────────────────────────────────┘");

            return false;

        }
    }
        public static Boolean option_I() {

            int cont = 0;
            Scanner Keyword = new Scanner(System.in);
            ArrayList Nprimes = new ArrayList<String>();

            try {

                System.out.println("       ┌───────────────────────────────────────────────────────────────────────────┐");
                System.out.println("       │           ╔══════════════════════════════════════════════════╗            │");
                System.out.println("       │           ║         I ► Group primes numbers                 ║            │");
                System.out.println("       │           ╠══════════════════════════════════════════════════╣            │");
                System.out.println("       │           ║   insert the range number you want to receive    ║            │");

                int Range = Keyword.nextInt();

                System.out.println("Continue soon....");

                return true;

            } catch (Exception e) {

                System.out.println("       ├───────────────────────────────────────────────────────────────────────────┤");
                System.out.println("       │       An error was caught because you are not allowed text values         │");
                System.out.println("       │       Show you your error > " + e + "              │");
                System.out.println("       └───────────────────────────────────────────────────────────────────────────┘");

                return false;

            }

        }
    }