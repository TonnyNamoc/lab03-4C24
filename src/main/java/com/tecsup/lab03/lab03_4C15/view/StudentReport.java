package com.tecsup.lab03.lab03_4C15.view;

import com.tecsup.lab03.lab03_4C15.model.Student;

public class StudentReport {
	public static void main(String[] args) {
        Student student = new Student("Juan", 20);
        System.out.println("Estudiante: " + student.getName());
    }
}
