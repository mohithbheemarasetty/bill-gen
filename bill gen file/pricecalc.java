package com.company;


public class pricecalc{
    private int pvegburger;
    private int pchickenburger;
    private int pburgerspl;
    private int pcoke;
    private int pfries;
    private int pmilkshake;

    public pricecalc() {

        this.pvegburger = 60;
        this.pchickenburger = 75;
        this.pburgerspl = 105;
        this.pcoke = 25;
        this.pfries = 40;
        this.pmilkshake = 50;
    }
    public int price(boolean vegburger,int vegbcount,boolean chickenburger,int chickenbcount, boolean burgerspl,
                      int burgersplcount, boolean coke,int cokecount,boolean fries,
                      int friescount,int milkshakecount,boolean milkshake){
        int[] pricearray = new int[6];
        int price = 0;
        if (vegburger){
            price+=(pvegburger*vegbcount);
            pricearray[0] = pvegburger;
        }
        if (chickenburger){
            price+=(pchickenburger*chickenbcount);
            pricearray[1]= pchickenburger;
        }
        if (burgerspl){
            price+=(pburgerspl*burgersplcount);
            pricearray[2] = pburgerspl;
        }
        if (coke){
            price+=(pcoke*cokecount);
            pricearray[3]=pcoke;
        }
        if (fries){
          price+=(pfries*friescount);
          pricearray[4]=pfries;

        }
        if (milkshake){
            price+=(pfries*milkshakecount);
            pricearray[5]=pmilkshake;
        }
        System.out.println("total price is "+ price);


        return price;
    }
    public void bill(boolean vegburger,boolean chickenburger, boolean burgerspl,
                     boolean coke,int cokecount,boolean fries,int burgercount,
                     int friescount,int milkshakecount,boolean milkshake){
        System.out.println("your bill is : ");
        int g = 0;
        int h = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        if (vegburger){
            String a ="vegburger";
            g = pvegburger*burgercount;
            if (burgercount>1){
                a+="'s";
            }
            System.out.println(burgercount+" "+a +" costing : "+g+"/-");
        }
        if (chickenburger){
            String b = "chickenburger";
            h = pchickenburger*burgercount;
            if (burgercount>1){
                b+="'s";
            }
            System.out.println(burgercount+" "+b +" costing : "+h+"/-");
        }
        if (burgerspl){
            String c = "burgerspl";
            i = pburgerspl*burgercount;
            if (burgercount>1){
                c+="'s";
            }
            System.out.println(burgercount+" "+c +" costing : "+i+"/-");
        }
        if (coke){
             String d = "coke";
             j = pcoke*cokecount;
            if (cokecount>1){
                d+="'s";
            }
            System.out.println(cokecount+" "+ d +" costing : "+j+"/-");
        }
        if (fries){
             String e = "fries";
             k = pfries*friescount;
            if (friescount>1){
                e += "'s";
            }
            System.out.println(friescount+" "+ e +" costing : "+k+"/-");
        }
        if (milkshake){
             String f = "milkshake";
             l = pmilkshake*milkshakecount;
            if (milkshakecount>1){
                f+="'s";
            }
            System.out.println(milkshakecount+" "+f +" costing : "+l+"/-");
        }
    }
}

