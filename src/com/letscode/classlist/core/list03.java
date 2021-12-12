//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.letscode.classlist.core;

import java.util.ArrayList;
import java.util.List;

public class list03 {
    public list03(){

    }

    public static <cart> List Question01(String fruit1, String fruit2, String fruit3,
                String fruit4, String fruit5) {

            List<String> cart = new ArrayList<>();

                cart.add("1:" + fruit1);
                cart.add("2:" + fruit2);
                cart.add("3:" + fruit3);
                cart.add("4:" + fruit4);
                cart.add("5:" + fruit5);

            return cart;

        }
    public static <mirror> List Question02(String word) {

        int mirrorLength = word.length();
        int mirrorRun = mirrorLength -1;
        int position;

        List<Character> mirrorResult = new ArrayList<>(mirrorLength);
        List<String>   display = new ArrayList<>();

        for (int i = 0; i < mirrorLength; i++) {
            position = mirrorRun - i;
            mirrorResult.add(word.charAt(position));
        }

        display.add("Numero de caracteres na palavra:" + mirrorLength);
        display.add("Posições no Array:" + mirrorRun);
        display.add("Palavra espelho:" + mirrorResult);

        return display;
    }

    public static List<String> Question03(  int number1, int number2, int number3,
                                            int number4, int number5, int number6,
                                            int number7, int number8, int number9,
                                            int number10){

        int[] matrix = {number1,number2,number3,
                        number4,number5,number6,
                        number7,number8,number9,
                        number10};

        List<Integer> Evens = new ArrayList<>();
        List<Integer> Odds  = new ArrayList<>();
        List<String>   display = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            if (matrix[i] % 2 == 0) {
                Evens.add(matrix[i]);
            } else {
                Odds.add(matrix[i]);
            }
        }

        display.add("Os numeros pares foram:" + Evens);
        display.add("Os numeros impares foram:" + Odds);

        return display;
    }

    public static List<String> Question04( int number1, int number2, int number3,
                                           int number4, int number5) {

        int count = 0;
        int[] matrix = {number1, number2, number3,
                number4, number5};
        List<String> display = new ArrayList<>();

        int higher  = 0;
        int shorter = 15000;
        float media = (number1 + number2 + number3 + number4 + number5) / 5;

        while (count < 5) {
             higher  = Math.max(higher,  matrix[count]);
             shorter = Math.min(shorter, matrix[count]);
             count = count +1;
            }

            display.add("O maior número é:" + higher);
            display.add("O menor número é:" + shorter);
            display.add("A média é:" + media);

            return display;
        }
    public static List<String> Question05( String conv1, String conv2, String conv3,
                                           String conv4, String conv5) {
        int count = 0;

        String[] matrix = {conv1, conv2, conv3,
                           conv4, conv5};

        List<String> display = new ArrayList<>();

        int bigger  = 0;
        String theName = "";
        int theLength = 0;

        while (count < 5) {
            String convName = matrix[count];
            if (bigger < convName.length()){
                theName = convName;
                theLength = convName.length();
                bigger = convName.length();
        }
            count = count +1;}

        display.add("O maior nome possui:"+" "+ theLength +" "+ "caracteres");
        display.add("O maior nome é:"+" " + theName);

        return display;
    }

    public static <camel> List Question06(String longword) {

        List<String>   display = new ArrayList<>();

        char[] camel = longword.toCharArray();
        String camelResult = "";

        for (int i = 0; i < longword.length(); i++) {
            if (i % 2 !=0) {
                camelResult += Character.toUpperCase(camel[i]);
            }
            else{
                camelResult += camel[i];
            }
        }
        display.add("Palavra espelho:" + camelResult);

        return display;
    }

    public static <persons> List Question07(String person1,int age1,String person2,int age2,
                                            String person3,int age3,String person4,int age4,
                                            String person5,int age5) {

        String[] names = {person1,person2,person3,person4,person5};
        int[] ages = {age1,age2,age3,age4,age5};

        int counter = 0;
        int youngerPosition = 1500;
        int olderPosition   = 0;
        String older = "";
        String younger = "";
        float media = (age1+age2+age3+age4+age5)/5;

        List<String> display = new ArrayList<>();

        while (counter < 5) {
            if(olderPosition < ages[counter]) {
                olderPosition = Math.max(olderPosition, ages[counter]);
                older = names[counter];
            }
            if(youngerPosition > ages[counter]){
                youngerPosition = Math.min(youngerPosition, ages[counter]);
                younger = names[counter];
            }
            counter = counter +1;
        }

        display.add("A pessoa mais antiga é:"+" "+older +" "+"e sua idade é:"+olderPosition);
        display.add("A pessoa mais nova é:"  +" "+younger +" "+"e sua idade é:"+youngerPosition);
        display.add("A média etária é:" + media);

        return display;
     }

    public static <persons> List Question08(String act1,float alt1,float pes1,
                                            String act2,float alt2,float pes2,
                                            String act3,float alt3,float pes3,
                                            String act4,float alt4,float pes4,
                                            String act5,float alt5,float pes5 ) {

        String[] actuantes = {act1,act2,act3,act4,act5};
        float[] alturas    = {alt1, alt2, alt3,alt4,alt5};
        float[] pesos      = {pes1,pes2,pes3,pes4,pes5};

        int contador = 0;
        int IMC = 0;

        List<String> imcOut = new ArrayList<>();
        List<String> display = new ArrayList<>();

        while (contador < 5) {
            if(25 < (pesos[contador]/(alturas[contador]*alturas[contador]))) {
                imcOut.add (actuantes[contador]);
            }

            contador = contador +1;
        }

        display.add("As pessoas acima do peso recomendado são:"+" " +  imcOut);

        return display;
    }
    }




