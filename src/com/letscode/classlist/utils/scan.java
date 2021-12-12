package com.letscode.classlist.utils;

import com.letscode.classlist.basis.quests;
import com.letscode.classlist.core.list03;

import static java.lang.System.*;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class scan {

        private static Scanner UserEntry;

        public scan(){

        }

        public static String scanUserEntry(){
            UserEntry = new Scanner(System.in);
            printer.printStartMsg();
            String UserOption = UserEntry.nextLine();

            switch (UserOption) {
                case "1":
                    quests DesiredQuestion01 = quests.Question01;
                    out.println("Você escolheu:" + UserOption);
                    out.println(printer.DisplayLine10);
                    String fruit1 = UserEntry.nextLine();
                    String fruit2 = UserEntry.nextLine();
                    String fruit3 = UserEntry.nextLine();
                    String fruit4 = UserEntry.nextLine();
                    String fruit5 = UserEntry.nextLine();
                    out.println("As frutas para o mercado são:");
                    out.println(List.of(list03.Question01(fruit1, fruit2, fruit3,
                            fruit4, fruit5 )));
                    break;
                case "2":
                    quests DesiredQuestion02 = quests.Question02;
                    out.println("Você escolheu:" + UserOption);
                    out.println(printer.DisplayLine11);
                    String word = UserEntry.nextLine();
                    out.println(List.of(list03.Question02(word)));
                    break;
                case "3":
                    quests DesiredQuestion03 = quests.Question03;
                    out.println("Você escolheu:" + UserOption);
                    out.println(printer.DisplayLine12);
                    int number1 = UserEntry.nextInt();
                    int number2 = UserEntry.nextInt();
                    int number3 = UserEntry.nextInt();
                    int number4 = UserEntry.nextInt();
                    int number5 = UserEntry.nextInt();
                    int number6 = UserEntry.nextInt();
                    int number7 = UserEntry.nextInt();
                    int number8 = UserEntry.nextInt();
                    int number9 = UserEntry.nextInt();
                    int number10 = UserEntry.nextInt();
                    out.println("A list de numeros é:");
                    out.println(List.of(list03.Question03(number1,number2,number3,
                                                          number4,number5,number6,
                                                          number7,number8,number9,
                                                          number10)));
                    break;
                case "4":
                    quests DesiredQuestion04 = quests.Question04;
                    out.println("Você escolheu:" + UserOption);
                    out.println(printer.DisplayLine13);
                    int num1 = UserEntry.nextInt();
                    int num2 = UserEntry.nextInt();
                    int num3 = UserEntry.nextInt();
                    int num4 = UserEntry.nextInt();
                    int num5 = UserEntry.nextInt();
                    out.println("A list de numeros é:");
                    out.println(List.of(list03.Question04(num1,num2,num3,
                            num4,num5)));
                    break;
                case "5":
                    quests DesiredQuestion05 = quests.Question05;
                    out.println("Você escolheu" + UserOption);
                    out.println(printer.DisplayLine14);
                    String conv1 = UserEntry.nextLine();
                    String conv2 = UserEntry.nextLine();
                    String conv3 = UserEntry.nextLine();
                    String conv4 = UserEntry.nextLine();
                    String conv5 = UserEntry.nextLine();
                    out.println(List.of(list03.Question05(conv1,conv2,conv3,
                            conv4,conv5)));
                    break;
                case "6":
                    quests DesiredQuestion06 = quests.Question06;
                    out.println("Você escolheu:" + UserOption);
                    out.println(printer.DisplayLine15);
                    String longword = UserEntry.nextLine();
                    out.println(List.of(list03.Question06(longword)));
                    break;
                case "7":
                    quests DesiredQuestion07 = quests.Question07;
                    out.println("Você escolheu:" + UserOption);
                    out.println(printer.DisplayLine16);
                    String person1 = UserEntry.nextLine();
                    String person2 = UserEntry.nextLine();
                    String person3 = UserEntry.nextLine();
                    String person4 = UserEntry.nextLine();
                    String person5 = UserEntry.nextLine();
                    int age1 =  UserEntry.nextInt();
                    int age2 =  UserEntry.nextInt();
                    int age3 =  UserEntry.nextInt();
                    int age4 =  UserEntry.nextInt();
                    int age5 =  UserEntry.nextInt();
                    out.println(List.of(list03.Question07(person1,age1,person2,age2,
                                                          person3,age3,person4,age4,
                                                          person5,age5)));
                    break;
                case "8":
                    quests DesiredQuestion08 = quests.Question08;
                    out.println("Você escolheu:" + UserOption);
                    out.println(printer.DisplayLine17);
                    String act1 = UserEntry.nextLine();
                    String act2 = UserEntry.nextLine();
                    String act3 = UserEntry.nextLine();
                    String act4 = UserEntry.nextLine();
                    String act5 = UserEntry.nextLine();
                    float alt1 =  UserEntry.nextFloat();
                    float alt2 =  UserEntry.nextFloat();
                    float alt3 =  UserEntry.nextFloat();
                    float alt4 =  UserEntry.nextFloat();
                    float alt5 =  UserEntry.nextFloat();
                    float pes1 =  UserEntry.nextFloat();
                    float pes2 =  UserEntry.nextFloat();
                    float pes3 =  UserEntry.nextFloat();
                    float pes4 =  UserEntry.nextFloat();
                    float pes5 =  UserEntry.nextFloat();
                    out.println(List.of(list03.Question08(act1,alt1,pes1,
                                                          act2,alt2,pes2,
                                                          act3,alt3,pes3,
                                                          act4,alt4,pes4,
                                                          act5,alt5,pes5
                    )));
                    break;
                default:
                    throw new IllegalStateException("Por favor digite uma opção válida");
            }
            return ("Processando");
        }

    }

