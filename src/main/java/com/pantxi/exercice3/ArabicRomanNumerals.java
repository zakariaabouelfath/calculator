package com.pantxi.exercice3;

public class ArabicRomanNumerals {
//    public String convert(int nbr){
//        String ch="NULL";
//        if(nbr>50 || nbr<1)
//            ch="NULL";
//        return ch;
//    }
//}
//public String convert(int nbr) {
//    String chaine = "I";
//    if (nbr == 1) {
//        chaine="I"; }
//        return chaine;
//
//}
//    }
//public String convert(int nbr) {
//    String chaine = "V";
//    if (nbr == 5) {
//        chaine="V"; }
//    return chaine;
//
//}
//}
//public String convert(int nbr) {
//    String chaine = "XXXIX";
//    if (nbr == 39) {
//        chaine="XXXIX"; }
//    return chaine;
//
//}
//}
//public String convert(int nbr) {
//    String chaine = "X";
//    if (nbr == 10) {
//        chaine="X"; }
//    return chaine;
//
//}
//}

    public static String convert(int nbr){
        String[] testrom = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] nombre = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        String res = "";

        for(int i=0;i<testrom.length;i++){
            while(nbr>=nombre[i]){
                res = res + testrom[i];
//                nbr = nbr - testrom[i];
                nbr = nbr - testrom[i];

            }
        }
        return res;

}

