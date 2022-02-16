package ru.skypro;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        task();


    }


    public static void task() {

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName+ " " +firstName + " " + middleName  ;
        System.out.println("ФИО сотрудника — "+fullName);
        System.out.println("Данные ФИО сотрудника для заполнения отчета —"+fullName.toUpperCase());
        fullName ="Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника —"+fullName.replace("ё","е"));


    }
}