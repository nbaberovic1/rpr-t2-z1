package ba.unsa.etf.rpr;

import ba.unsa.etf.rpr.t2.Math;

public class App {
    public static void main( String[] args ) {
        if(args.length != 2){
            System.out.println("Nedovoljan broj argumenata java -jar rpr-t2-z1.jar [funkcija] [argument]");
        }
        else if (!args[0].equals("sinus") && !args[0].equals("faktorijel")){
            System.out.println("Nevalidna funkcija, sinus i faktorijel su podrzane funkcije!");
        }else{
            try{
                String funkcija = args[0];
                double broj = Double.parseDouble(args[1]);
                switch (funkcija) {
                    case "sinus":
                        System.out.println("sinus(" + broj + ")= " + Math.sin(broj));
                        break;
                    case "faktorijel":
                        System.out.println("faktorijel(" + broj + ")= " + Math.faktorijel((int)broj));
                    break;
                }
            }catch (Exception e){
                System.err.println("Nevalidan drugi argument, mora biti broj!");
            }
        }
    }
}
