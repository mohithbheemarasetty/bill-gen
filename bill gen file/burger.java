package com.company;
import java.util.Scanner;

public class burger {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        while ( true) {
            boolean k = false;
            boolean l = false;
            boolean m = false;
            boolean h = false;
            boolean i = false;
            boolean j = false;
            pricecalc price = new pricecalc();
            System.out.println("enter the type of burger :" + "\n" + " 1 for veg burger " + "\n" + " 2 for chicken burger " + "\n" + " 3 for  extravaganza");
            int type = scanner.nextInt();
            if (type == 1) {
                k = true;
            }
            if (type == 2) {
                l = true;
            }
            if (type == 3) {
                m = true;
            }
            if ((type != 1) && (type != 2) && (type != 3)) {
                System.out.println("did not enter a valid number ");
                return;
            }
            System.out.println("how many burgers? ");
            int n = scanner.nextInt();
            scanner.nextLine();
            System.out.println("do you want a coke? - yes or no");
            String a = scanner.nextLine();
            int e = 0;
            if (a.toLowerCase().equals("yes")) {
                h = true;
                System.out.println("how many ?");
                e = scanner.nextInt();
                scanner.nextLine();
            }
            else if (a.toLowerCase().equals("no")) {
                System.out.println("so no coke... sad :/");
            }
            else {
                System.out.println("invalid entry..... i'll take that as a no");
            }
            System.out.println("do you want fries? - yes or no");
            String b = scanner.nextLine();
            int f = 0;
            if (b.toLowerCase().equals("yes")) {
                i = true;
                System.out.println("how many ?");
                f = scanner.nextInt();
                scanner.nextLine();
            } else if (b.toLowerCase().equals("no")) {
                System.out.println("so no fries... way too sad");
            } else {
                System.out.println("invalid entry..i'll take that as a no");
            }
            System.out.println("do you want milkshake? - yes or no");
            String c = scanner.nextLine();
            int g = 0;
            if (c.toLowerCase().equals("yes")) {
                j = true;
                System.out.println("how many ?");
                g = scanner.nextInt();
                System.out.println(g);
                scanner.nextLine();
            } else if (c.toLowerCase().equals("no")) {
                System.out.println("no milk shake...");
            } else {
                System.out.println("invalid entry..i'll take that as a no");
            }

            int total = price.price(k, n, l, n, m, n, h, e, i, f, g, j);
            price.bill(k, l, m, h, e, i, n, f, g, j);
            System.out.println("summing to a total of :" + total);
            System.out.println("do you want to order again?? -yes or no");
            String wow =scanner.nextLine();
            if (wow.toLowerCase().equals("no")){
                System.out.println("exiting");
                return;
            }
        }


    }
    }