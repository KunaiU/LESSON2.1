package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 9;

        switch (number) {
            case 23:
                System.out.println("Число равно двадцати трем");
                break;
            case 9:
                System.out.println("Число равно девяти");
                break;
            case 7:
                System.out.println("Число равно семи");
                break;
            default:
                System.out.println("Число неизвестно");
                break;
        }

        String name = "Константин";
        switch (name) {
            case "Михаил":
                System.out.println("Йо миша");
                break;
            case "Светлана":
                System.out.println("привет Света");
                break;
            case "Константин":
                System.out.println("Привет Костя");
                break;
            default:
                System.out.println("Привет неизвестный");
                break;
        }



       // switch - только при сравнении
	// write your code here
    }
}
