package ru.job4j.pojo;

import java.util.Date;
import java.time.format.DateTimeFormatter;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Смолин Александр Александрович");
        student.setGroup("25ит1");
        student.setCreated(new Date());

        System.out.println(student.getName() + " поступил в группу " + student.getGroup() + " " + student.getCreated() + " числа");
    }
}
