package Main;

import java.util.Scanner;
import java.util.regex.Pattern;

import static Functions.Functions.*;


public class Main {
    public static void main(String[] args) {

        Scanner Keyword = new Scanner(System.in);
        String name,capitalize;
        char question,option;
        Boolean Search, status_A, status_B, status_C, status_D, status_E, status_F, status_G, status_H, status_I;

        try {

            do{

                System.out.println("\n\n");

                System.out.println("       ┌───────────────────────────────────────────────────────────────────────────┐");
                System.out.println("       │                                                                           │");
                System.out.println("       │        Welcome user to my program, Please insert your name here           │");
                System.out.println("       └───────────────────────────────────────────────────────────────────────────┘");

                name = Keyword.nextLine();
                capitalize = name.substring(0,1).toUpperCase()+name.substring(1);
                Search = Pattern.compile("[^0-9]+").matcher(capitalize).matches();

                ANSWER:
                while (Search == false) {

                    System.out.println("       ┌───────────────────────────────────────────────────────────────────────────┐");
                    System.out.println("       │                                                                           │");
                    System.out.println("       │       ╔════════════════════════════════════════════╦═══════════╗          │");
                    System.out.println("       │       ║ The format of name is invalid or is empty  ║ ⚠ Error ⚠ ║          │");
                    System.out.println("       │       ╠══════════════════════════════╦═════════════╩═══════════╣          │");
                    System.out.println("       │       ║     Exit the program < L >   ║   < T >   Try again     ║          │");
                    System.out.println("       │       ╚══════════════════════════════╩═════════════════════════╝          │");
                    question = Keyword.nextLine().toUpperCase().charAt(0);

                    if (question == 'L') {

                        System.exit(0);

                    } else if (question == 'T') {

                        break;

                    } else {

                        do {

                            System.out.println("       │                                                                           │");
                            System.out.println("       │       ╔════════════════════════════════════════════╦═══════════╗          │");
                            System.out.println("       │       ║ Your answer is invalid expected <L> or <T> ║ ⚠ Error ⚠ ║          │");
                            System.out.println("       │       ╠══════════════════════════════╦═════════════╩═══════════╣          │");
                            System.out.println("       │       ║     Exit the program < L >   ║   < T >   Try again     ║          │");
                            System.out.println("       │       ╚══════════════════════════════╩═════════════════════════╝          │");
                            question = Keyword.nextLine().toUpperCase().charAt(0);

                            if (question == 'L') {

                                System.exit(0);

                            } else if (question == 'T') {

                                break ANSWER;
                            }
                        }while (question != 'L' || question != 'T');
                    }

                }

                if (Search) {

                    do {

                        System.out.println("       │    ╔══════════════════════════════════════════════════════════════════╗   │");
                        System.out.println("       │    ║   Hello " + capitalize + ", ¿Do you want to save yours history operations?    ║   │");
                        System.out.println("       │    ╠═════════════════════════════════╦════════════════════════════════╣   │");
                        System.out.println("       │    ║      Yes, I want  < Y >         ║      < N >  No, i want not     ║   │");
                        System.out.println("       │    ╚═════════════════════════════════╩════════════════════════════════╝   │");

                        question = Keyword.nextLine().toUpperCase().charAt(0);

                        if (question == 'Y') {

                            System.out.println("se conecta a la base de datos");

                            break;


                        } else if (question == 'N') {

                            break;

                        } else {

                            System.out.println("       │                                                                           │");
                            System.out.println("       │       ╔════════════════════════════════════════════╦═══════════╗          │");
                            System.out.println("       │       ║ Your answer is invalid expected <Y> or <N> ║ ⚠ Error ⚠ ║          │");
                            System.out.println("       │       ╠══════════════════════════════╦═════════════╩═══════════╣          │");
                            System.out.println("       │       ║     Exit the program < L >   ║   < T >   Try again     ║          │");
                            System.out.println("       │       ╚══════════════════════════════╩═════════════════════════╝          │");
                            question = Keyword.nextLine().toUpperCase().charAt(0);

                            if (question == 'L') {

                                System.exit(0);

                            } else if (question == 'T') {

                                continue;

                            } else {

                                ANSWER2:
                                do {

                                    System.out.println("       │                                                                           │");
                                    System.out.println("       │       ╔════════════════════════════════════════════╦═══════════╗          │");
                                    System.out.println("       │       ║ Your answer is invalid expected <L> or <T> ║ ⚠ Error ⚠ ║          │");
                                    System.out.println("       │       ╠══════════════════════════════╦═════════════╩═══════════╣          │");
                                    System.out.println("       │       ║     Exit the program < L >   ║   < T >   Try again     ║          │");
                                    System.out.println("       │       ╚══════════════════════════════╩═════════════════════════╝          │");
                                    question = Keyword.nextLine().toUpperCase().charAt(0);

                                    if (question == 'L') {

                                        System.exit(0);

                                    } else if (question == 'T') {

                                        break ANSWER2;
                                    }

                                } while (question != 'L' || question != 'T');

                            }
                        }

                    } while (question != 'Y' || question != 'N');

                    do{

                        System.out.println("             ┌───────────────────────────────────────────────────────────────┐      ");
                        System.out.println("       ┌─────┤              CALCULATOR INTERACTIVE WITH JAVA                 ├─────┐");
                        System.out.println("       │     └───────────────────────────────────────────────────────────────┘     │");
                        System.out.println("       │                                                                           │");
                        System.out.println("       │              ╔═══════════════════════════════╦═════════════╗              │");
                        System.out.println("       │              ║ A ► Addition                  ║     (+)     ║              │");
                        System.out.println("       │              ╠═══════════════════════════════╬═════════════╣              │");
                        System.out.println("       │              ║ B ► Subtraction               ║     (-)     ║              │");
                        System.out.println("       │              ╠═══════════════════════════════╬═════════════╣              │");
                        System.out.println("       │              ║ C ► Multiplication            ║     (*)     ║              │");
                        System.out.println("       │              ╠═══════════════════════════════╬═════════════╣              │");
                        System.out.println("       │              ║ D ► Division                  ║     (/)     ║              │");
                        System.out.println("       │              ╠═══════════════════════════════╬═════════════╣              │");
                        System.out.println("       │              ║ E ► Exponentiation            ║    (b,e)    ║              │");
                        System.out.println("       │              ╠═══════════════════════════════╬═════════════╣              │");
                        System.out.println("       │              ║ F ► Radicalising              ║     (√)     ║              │");
                        System.out.println("       │              ╠═══════════════════════════════╩═════════════╣              │");
                        System.out.println("       │              ║ G ► Even number or Odd number               ║              │");
                        System.out.println("       │              ╠═════════════════════════════════════════════╣              │");
                        System.out.println("       │              ║ H ► Single primes numbers                   ║              │");
                        System.out.println("       │              ╠═════════════════════════════════════════════╣              │");
                        System.out.println("       │              ║ I ► Group primes numbers                    ║              │");
                        System.out.println("       │              ╚═════════════════════════════════════════════╝              │");
                        System.out.println("       │        ╔═══════════════════════════════════════════════════════╗          │");
                        System.out.println("       │        ║  Hello "+capitalize+", Insert here the option what you go use  ║          │");
                        System.out.println("       │        ╚═══════════════════════════════════════════════════════╝          │");
                        option = Keyword.nextLine().toUpperCase().charAt(0);

                        switch (option) {

                            case 'A':

                                MENU:
                                do{

                                    status_A = option_A();

                                    if (status_A){

                                        System.out.println("       ├─────────────────────────────────────┬─────────────────────────────────────┤");
                                        System.out.println("       │            Back to Menu  < B >      │    < S >  Exit the program          │");
                                        System.out.println("       └─────────────────────────────────────┴─────────────────────────────────────┘");
                                        question = Keyword.nextLine().toUpperCase().charAt(0);

                                        if (question == 'B'){

                                            break MENU;

                                        } else if (question == 'S') {

                                            System.exit(0);

                                        } else {

                                            ANSWER2:
                                            do{

                                                System.out.println("       │                                                                           │");
                                                System.out.println("       │       ╔════════════════════════════════════════════╦═══════════╗          │");
                                                System.out.println("       │       ║ Your answer is invalid expected <B> or <S> ║ ⚠ Error ⚠ ║          │");
                                                System.out.println("       │       ╠══════════════════════════════╦═════════════╩═══════════╣          │");
                                                System.out.println("       │       ║     Exit the program < L >   ║   < T >   Try again     ║          │");
                                                System.out.println("       │       ╚══════════════════════════════╩═════════════════════════╝          │");
                                                question = Keyword.nextLine().toUpperCase().charAt(0);

                                                if (question == 'L') {

                                                    System.exit(0);

                                                } else if (question == 'T'){

                                                    status_A = false;
                                                    break ANSWER2;

                                                }else {

                                                    System.out.println("       │                                                                           │");
                                                    System.out.println("       │       ╔════════════════════════════════════════════╦═══════════╗          │");
                                                    System.out.println("       │       ║ Your answer is invalid expected <L> or <T> ║ ⚠ Error ⚠ ║          │");
                                                    System.out.println("       │       ╠══════════════════════════════╦═════════════╩═══════════╣          │");
                                                    System.out.println("       │       ║     Exit the program < L >   ║   < T >   Try again     ║          │");
                                                    System.out.println("       │       ╚══════════════════════════════╩═════════════════════════╝          │");
                                                    question = Keyword.nextLine().toUpperCase().charAt(0);

                                                    if (question == 'L') {

                                                        System.exit(0);

                                                    } else if (question == 'T') {

                                                        status_A = false;
                                                        break ANSWER2;
                                                    }

                                                }

                                            } while (question != 'L' || question != 'T');

                                        }

                                    }

                                }while(!status_A);

                                break;

                            case 'B':

                                MENU:
                                do{

                                    status_B = option_B();

                                    if (status_B){

                                        System.out.println("       ├─────────────────────────────────────┬─────────────────────────────────────┤");
                                        System.out.println("       │            Back to Menu  < B >      │    < S >  Exit the program          │");
                                        System.out.println("       └─────────────────────────────────────┴─────────────────────────────────────┘");
                                        question = Keyword.nextLine().toUpperCase().charAt(0);

                                        if (question == 'B'){

                                            break MENU;

                                        } else if (question == 'S') {

                                            System.exit(0);

                                        } else {

                                            ANSWER2:
                                            do{

                                                System.out.println("       │                                                                           │");
                                                System.out.println("       │       ╔════════════════════════════════════════════╦═══════════╗          │");
                                                System.out.println("       │       ║ Your answer is invalid expected <B> or <S> ║ ⚠ Error ⚠ ║          │");
                                                System.out.println("       │       ╠══════════════════════════════╦═════════════╩═══════════╣          │");
                                                System.out.println("       │       ║     Exit the program < L >   ║   < T >   Try again     ║          │");
                                                System.out.println("       │       ╚══════════════════════════════╩═════════════════════════╝          │");
                                                question = Keyword.nextLine().toUpperCase().charAt(0);

                                                if (question == 'L') {

                                                    System.exit(0);

                                                } else if (question == 'T'){

                                                    status_B = false;
                                                    break ANSWER2;

                                                }else {

                                                    System.out.println("       │                                                                           │");
                                                    System.out.println("       │       ╔════════════════════════════════════════════╦═══════════╗          │");
                                                    System.out.println("       │       ║ Your answer is invalid expected <L> or <T> ║ ⚠ Error ⚠ ║          │");
                                                    System.out.println("       │       ╠══════════════════════════════╦═════════════╩═══════════╣          │");
                                                    System.out.println("       │       ║     Exit the program < L >   ║   < T >   Try again     ║          │");
                                                    System.out.println("       │       ╚══════════════════════════════╩═════════════════════════╝          │");
                                                    question = Keyword.nextLine().toUpperCase().charAt(0);

                                                    if (question == 'L') {

                                                        System.exit(0);

                                                    } else if (question == 'T') {

                                                        status_B = false;
                                                        break ANSWER2;
                                                    }

                                                }

                                            } while (question != 'L' || question != 'T');

                                        }

                                    }

                                }while(!status_B);
                                break ;

                            case 'C':

                                MENU:
                                do{

                                    status_C = option_C();

                                    if (status_C){

                                        System.out.println("       ├─────────────────────────────────────┬─────────────────────────────────────┤");
                                        System.out.println("       │            Back to Menu  < B >      │    < S >  Exit the program          │");
                                        System.out.println("       └─────────────────────────────────────┴─────────────────────────────────────┘");
                                        question = Keyword.nextLine().toUpperCase().charAt(0);

                                        if (question == 'B'){

                                            break MENU;

                                        } else if (question == 'S') {

                                            System.exit(0);

                                        } else {

                                            ANSWER2:
                                            do{

                                                System.out.println("       │                                                                           │");
                                                System.out.println("       │       ╔════════════════════════════════════════════╦═══════════╗          │");
                                                System.out.println("       │       ║ Your answer is invalid expected <B> or <S> ║ ⚠ Error ⚠ ║          │");
                                                System.out.println("       │       ╠══════════════════════════════╦═════════════╩═══════════╣          │");
                                                System.out.println("       │       ║     Exit the program < L >   ║   < T >   Try again     ║          │");
                                                System.out.println("       │       ╚══════════════════════════════╩═════════════════════════╝          │");
                                                question = Keyword.nextLine().toUpperCase().charAt(0);

                                                if (question == 'L') {

                                                    System.exit(0);

                                                } else if (question == 'T'){

                                                    status_C = false;
                                                    break ANSWER2;

                                                }else {

                                                    System.out.println("       │                                                                           │");
                                                    System.out.println("       │       ╔════════════════════════════════════════════╦═══════════╗          │");
                                                    System.out.println("       │       ║ Your answer is invalid expected <L> or <T> ║ ⚠ Error ⚠ ║          │");
                                                    System.out.println("       │       ╠══════════════════════════════╦═════════════╩═══════════╣          │");
                                                    System.out.println("       │       ║     Exit the program < L >   ║   < T >   Try again     ║          │");
                                                    System.out.println("       │       ╚══════════════════════════════╩═════════════════════════╝          │");
                                                    question = Keyword.nextLine().toUpperCase().charAt(0);

                                                    if (question == 'L') {

                                                        System.exit(0);

                                                    } else if (question == 'T') {

                                                        status_C = false;
                                                        break ANSWER2;
                                                    }

                                                }

                                            } while (question != 'L' || question != 'T');

                                        }

                                    }

                                }while(!status_C);
                                break ;

                            case 'D':

                                MENU:
                                do{

                                    status_D = option_D();

                                    if (status_D){

                                        System.out.println("       ├─────────────────────────────────────┬─────────────────────────────────────┤");
                                        System.out.println("       │            Back to Menu  < B >      │    < S >  Exit the program          │");
                                        System.out.println("       └─────────────────────────────────────┴─────────────────────────────────────┘");
                                        question = Keyword.nextLine().toUpperCase().charAt(0);

                                        if (question == 'B'){

                                            break MENU;

                                        } else if (question == 'S') {

                                            System.exit(0);

                                        } else {

                                            ANSWER2:
                                            do{

                                                System.out.println("       │                                                                           │");
                                                System.out.println("       │       ╔════════════════════════════════════════════╦═══════════╗          │");
                                                System.out.println("       │       ║ Your answer is invalid expected <B> or <S> ║ ⚠ Error ⚠ ║          │");
                                                System.out.println("       │       ╠══════════════════════════════╦═════════════╩═══════════╣          │");
                                                System.out.println("       │       ║     Exit the program < L >   ║   < T >   Try again     ║          │");
                                                System.out.println("       │       ╚══════════════════════════════╩═════════════════════════╝          │");
                                                question = Keyword.nextLine().toUpperCase().charAt(0);

                                                if (question == 'L') {

                                                    System.exit(0);

                                                } else if (question == 'T'){

                                                    status_D = false;
                                                    break ANSWER2;

                                                }else {

                                                    System.out.println("       │                                                                           │");
                                                    System.out.println("       │       ╔════════════════════════════════════════════╦═══════════╗          │");
                                                    System.out.println("       │       ║ Your answer is invalid expected <L> or <T> ║ ⚠ Error ⚠ ║          │");
                                                    System.out.println("       │       ╠══════════════════════════════╦═════════════╩═══════════╣          │");
                                                    System.out.println("       │       ║     Exit the program < L >   ║   < T >   Try again     ║          │");
                                                    System.out.println("       │       ╚══════════════════════════════╩═════════════════════════╝          │");
                                                    question = Keyword.nextLine().toUpperCase().charAt(0);

                                                    if (question == 'L') {

                                                        System.exit(0);

                                                    } else if (question == 'T') {

                                                        status_D = false;
                                                        break ANSWER2;
                                                    }

                                                }

                                            } while (question != 'L' || question != 'T');

                                        }

                                    }

                                }while(!status_D);
                                break;

                            case 'E':

                                MENU:
                                do{

                                    status_E = option_E();

                                    if (status_E){

                                        System.out.println("       ├─────────────────────────────────────┬─────────────────────────────────────┤");
                                        System.out.println("       │            Back to Menu  < B >      │    < S >  Exit the program          │");
                                        System.out.println("       └─────────────────────────────────────┴─────────────────────────────────────┘");
                                        question = Keyword.nextLine().toUpperCase().charAt(0);

                                        if (question == 'B'){

                                            break MENU;

                                        } else if (question == 'S') {

                                            System.exit(0);

                                        } else {

                                            ANSWER2:
                                            do{

                                                System.out.println("       │                                                                           │");
                                                System.out.println("       │       ╔════════════════════════════════════════════╦═══════════╗          │");
                                                System.out.println("       │       ║ Your answer is invalid expected <B> or <S> ║ ⚠ Error ⚠ ║          │");
                                                System.out.println("       │       ╠══════════════════════════════╦═════════════╩═══════════╣          │");
                                                System.out.println("       │       ║     Exit the program < L >   ║   < T >   Try again     ║          │");
                                                System.out.println("       │       ╚══════════════════════════════╩═════════════════════════╝          │");
                                                question = Keyword.nextLine().toUpperCase().charAt(0);

                                                if (question == 'L') {

                                                    System.exit(0);

                                                } else if (question == 'T'){

                                                    status_E = false;
                                                    break ANSWER2;

                                                }else {

                                                    System.out.println("       │                                                                           │");
                                                    System.out.println("       │       ╔════════════════════════════════════════════╦═══════════╗          │");
                                                    System.out.println("       │       ║ Your answer is invalid expected <L> or <T> ║ ⚠ Error ⚠ ║          │");
                                                    System.out.println("       │       ╠══════════════════════════════╦═════════════╩═══════════╣          │");
                                                    System.out.println("       │       ║     Exit the program < L >   ║   < T >   Try again     ║          │");
                                                    System.out.println("       │       ╚══════════════════════════════╩═════════════════════════╝          │");
                                                    question = Keyword.nextLine().toUpperCase().charAt(0);

                                                    if (question == 'L') {

                                                        System.exit(0);

                                                    } else if (question == 'T') {

                                                        status_E = false;
                                                        break ANSWER2;
                                                    }

                                                }

                                            } while (question != 'L' || question != 'T');

                                        }

                                    }

                                }while(!status_E);
                                break;

                            case 'F':

                                MENU:
                                do{

                                    status_F = option_F();

                                    if (status_F){

                                        System.out.println("       ├─────────────────────────────────────┬─────────────────────────────────────┤");
                                        System.out.println("       │            Back to Menu  < B >      │    < S >  Exit the program          │");
                                        System.out.println("       └─────────────────────────────────────┴─────────────────────────────────────┘");
                                        question = Keyword.nextLine().toUpperCase().charAt(0);

                                        if (question == 'B'){

                                            break MENU;

                                        } else if (question == 'S') {

                                            System.exit(0);

                                        } else {

                                            ANSWER2:
                                            do{

                                                System.out.println("       │                                                                           │");
                                                System.out.println("       │       ╔════════════════════════════════════════════╦═══════════╗          │");
                                                System.out.println("       │       ║ Your answer is invalid expected <B> or <S> ║ ⚠ Error ⚠ ║          │");
                                                System.out.println("       │       ╠══════════════════════════════╦═════════════╩═══════════╣          │");
                                                System.out.println("       │       ║     Exit the program < L >   ║   < T >   Try again     ║          │");
                                                System.out.println("       │       ╚══════════════════════════════╩═════════════════════════╝          │");
                                                question = Keyword.nextLine().toUpperCase().charAt(0);

                                                if (question == 'L') {

                                                    System.exit(0);

                                                } else if (question == 'T'){

                                                    status_F = false;
                                                    break ANSWER2;

                                                }else {

                                                    System.out.println("       │                                                                           │");
                                                    System.out.println("       │       ╔════════════════════════════════════════════╦═══════════╗          │");
                                                    System.out.println("       │       ║ Your answer is invalid expected <L> or <T> ║ ⚠ Error ⚠ ║          │");
                                                    System.out.println("       │       ╠══════════════════════════════╦═════════════╩═══════════╣          │");
                                                    System.out.println("       │       ║     Exit the program < L >   ║   < T >   Try again     ║          │");
                                                    System.out.println("       │       ╚══════════════════════════════╩═════════════════════════╝          │");
                                                    question = Keyword.nextLine().toUpperCase().charAt(0);

                                                    if (question == 'L') {

                                                        System.exit(0);

                                                    } else if (question == 'T') {

                                                        status_F = false;
                                                        break ANSWER2;
                                                    }

                                                }

                                            } while (question != 'L' || question != 'T');

                                        }

                                    }

                                }while(!status_F);
                                break;

                            case 'G':

                                MENU:
                                do{

                                    status_G = option_G();

                                    if (status_G){

                                        System.out.println("       ├─────────────────────────────────────┬─────────────────────────────────────┤");
                                        System.out.println("       │            Back to Menu  < B >      │    < S >  Exit the program          │");
                                        System.out.println("       └─────────────────────────────────────┴─────────────────────────────────────┘");
                                        question = Keyword.nextLine().toUpperCase().charAt(0);

                                        if (question == 'B'){

                                            break MENU;

                                        } else if (question == 'S') {

                                            System.exit(0);

                                        } else {

                                            ANSWER2:
                                            do{

                                                System.out.println("       │                                                                           │");
                                                System.out.println("       │       ╔════════════════════════════════════════════╦═══════════╗          │");
                                                System.out.println("       │       ║ Your answer is invalid expected <B> or <S> ║ ⚠ Error ⚠ ║          │");
                                                System.out.println("       │       ╠══════════════════════════════╦═════════════╩═══════════╣          │");
                                                System.out.println("       │       ║     Exit the program < L >   ║   < T >   Try again     ║          │");
                                                System.out.println("       │       ╚══════════════════════════════╩═════════════════════════╝          │");
                                                question = Keyword.nextLine().toUpperCase().charAt(0);

                                                if (question == 'L') {

                                                    System.exit(0);

                                                } else if (question == 'T'){

                                                    status_G = false;
                                                    break ANSWER2;

                                                }else {

                                                    System.out.println("       │                                                                           │");
                                                    System.out.println("       │       ╔════════════════════════════════════════════╦═══════════╗          │");
                                                    System.out.println("       │       ║ Your answer is invalid expected <L> or <T> ║ ⚠ Error ⚠ ║          │");
                                                    System.out.println("       │       ╠══════════════════════════════╦═════════════╩═══════════╣          │");
                                                    System.out.println("       │       ║     Exit the program < L >   ║   < T >   Try again     ║          │");
                                                    System.out.println("       │       ╚══════════════════════════════╩═════════════════════════╝          │");
                                                    question = Keyword.nextLine().toUpperCase().charAt(0);

                                                    if (question == 'L') {

                                                        System.exit(0);

                                                    } else if (question == 'T') {

                                                        status_G = false;
                                                        break ANSWER2;
                                                    }

                                                }

                                            } while (question != 'L' || question != 'T');

                                        }

                                    }

                                }while(!status_G);
                                break;

                            case 'H':

                                MENU:
                                do{

                                    status_H = option_H();

                                    if (status_H){

                                        System.out.println("       ├─────────────────────────────────────┬─────────────────────────────────────┤");
                                        System.out.println("       │            Back to Menu  < B >      │    < S >  Exit the program          │");
                                        System.out.println("       └─────────────────────────────────────┴─────────────────────────────────────┘");
                                        question = Keyword.nextLine().toUpperCase().charAt(0);

                                        if (question == 'B'){

                                            break MENU;

                                        } else if (question == 'S') {

                                            System.exit(0);

                                        } else {

                                            ANSWER2:
                                            do{

                                                System.out.println("       │                                                                           │");
                                                System.out.println("       │       ╔════════════════════════════════════════════╦═══════════╗          │");
                                                System.out.println("       │       ║ Your answer is invalid expected <B> or <S> ║ ⚠ Error ⚠ ║          │");
                                                System.out.println("       │       ╠══════════════════════════════╦═════════════╩═══════════╣          │");
                                                System.out.println("       │       ║     Exit the program < L >   ║   < T >   Try again     ║          │");
                                                System.out.println("       │       ╚══════════════════════════════╩═════════════════════════╝          │");
                                                question = Keyword.nextLine().toUpperCase().charAt(0);

                                                if (question == 'L') {

                                                    System.exit(0);

                                                } else if (question == 'T'){

                                                    status_H = false;
                                                    break ANSWER2;

                                                }else {

                                                    System.out.println("       │                                                                           │");
                                                    System.out.println("       │       ╔════════════════════════════════════════════╦═══════════╗          │");
                                                    System.out.println("       │       ║ Your answer is invalid expected <L> or <T> ║ ⚠ Error ⚠ ║          │");
                                                    System.out.println("       │       ╠══════════════════════════════╦═════════════╩═══════════╣          │");
                                                    System.out.println("       │       ║     Exit the program < L >   ║   < T >   Try again     ║          │");
                                                    System.out.println("       │       ╚══════════════════════════════╩═════════════════════════╝          │");
                                                    question = Keyword.nextLine().toUpperCase().charAt(0);

                                                    if (question == 'L') {

                                                        System.exit(0);

                                                    } else if (question == 'T') {

                                                        status_H = false;
                                                        break ANSWER2;
                                                    }

                                                }

                                            } while (question != 'L' || question != 'T');

                                        }

                                    }

                                }while(!status_H);
                                break;

                            case 'I':

                                MENU:
                                do{

                                    status_I = option_I();

                                    if (status_I){

                                        System.out.println("       ├─────────────────────────────────────┬─────────────────────────────────────┤");
                                        System.out.println("       │            Back to Menu  < B >      │    < S >  Exit the program          │");
                                        System.out.println("       └─────────────────────────────────────┴─────────────────────────────────────┘");
                                        question = Keyword.nextLine().toUpperCase().charAt(0);

                                        if (question == 'B'){

                                            break MENU;

                                        } else if (question == 'S') {

                                            System.exit(0);

                                        } else {

                                            ANSWER2:
                                            do{

                                                System.out.println("       │                                                                           │");
                                                System.out.println("       │       ╔════════════════════════════════════════════╦═══════════╗          │");
                                                System.out.println("       │       ║ Your answer is invalid expected <B> or <S> ║ ⚠ Error ⚠ ║          │");
                                                System.out.println("       │       ╠══════════════════════════════╦═════════════╩═══════════╣          │");
                                                System.out.println("       │       ║     Exit the program < L >   ║   < T >   Try again     ║          │");
                                                System.out.println("       │       ╚══════════════════════════════╩═════════════════════════╝          │");
                                                question = Keyword.nextLine().toUpperCase().charAt(0);

                                                if (question == 'L') {

                                                    System.exit(0);

                                                } else if (question == 'T'){

                                                    status_I = false;
                                                    break ANSWER2;

                                                }else {

                                                    System.out.println("       │                                                                           │");
                                                    System.out.println("       │       ╔════════════════════════════════════════════╦═══════════╗          │");
                                                    System.out.println("       │       ║ Your answer is invalid expected <L> or <T> ║ ⚠ Error ⚠ ║          │");
                                                    System.out.println("       │       ╠══════════════════════════════╦═════════════╩═══════════╣          │");
                                                    System.out.println("       │       ║     Exit the program < L >   ║   < T >   Try again     ║          │");
                                                    System.out.println("       │       ╚══════════════════════════════╩═════════════════════════╝          │");
                                                    question = Keyword.nextLine().toUpperCase().charAt(0);

                                                    if (question == 'L') {

                                                        System.exit(0);

                                                    } else if (question == 'T') {

                                                        status_I = false;
                                                        break ANSWER2;
                                                    }

                                                }

                                            } while (question != 'L' || question != 'T');

                                        }

                                    }

                                }while(!status_I);
                                break;

                            default:

                                ANSWER2:
                                OPTION:
                                do{

                                    System.out.println("       │                                                                           │");
                                    System.out.println("       │       ╔════════════════════════════════════════════╦═══════════╗          │");
                                    System.out.println("       │       ║      Your option is not in the Menu        ║ ⚠ Error ⚠ ║          │");
                                    System.out.println("       │       ╠══════════════════════════════╦═════════════╩═══════════╣          │");
                                    System.out.println("       │       ║     Leave the program < L >  ║   < T >   Try again     ║          |");
                                    System.out.println("       │       ╚══════════════════════════════╩═════════════════════════╝          |");
                                    question = Keyword.nextLine().toUpperCase().charAt(0);

                                    if (question == 'L') {

                                        System.exit(0);

                                    } else if (question == 'T') {

                                        break OPTION;

                                    } else {

                                        do {

                                            System.out.println("       │                                                                           │");
                                            System.out.println("       │       ╔════════════════════════════════════════════╦═══════════╗          │");
                                            System.out.println("       │       ║ Your answer is invalid expected <L> or <T> ║ ⚠ Error ⚠ ║          │");
                                            System.out.println("       │       ╠══════════════════════════════╦═════════════╩═══════════╣          │");
                                            System.out.println("       │       ║     Leave the program < L >  ║   < T >   Try again     ║          |");
                                            System.out.println("       │       ╚══════════════════════════════╩═════════════════════════╝          |");
                                            question = Keyword.nextLine().toUpperCase().charAt(0);

                                            if (question == 'L') {

                                                System.exit(0);

                                            } else if (question == 'T') {

                                                break ANSWER2;
                                            }

                                        } while (question != 'L' || question != 'T');

                                    }

                                }while (option != 'A' || option != 'B' || option != 'C' || option != 'D' || option != 'E' || option != 'F' || option != 'G' || option != 'H' || option != 'I');

                        }

                    }while (true);

                }

            }while (true);

        }
        catch (Exception e){

            System.out.println("Here show you the error!."+e);
            System.out.println("The program stopped because it did not receive any data (directly Space or Enter)");

        }

    }

}