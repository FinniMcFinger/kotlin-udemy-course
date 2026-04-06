package com.finnimcfinger;

import com.finnimcfinger.classes.*;

public class InvokeKotlinFromJava {
    public static void main(String[] args) {
        // Kotlin defined object
        Course course = new Course(1, "Course Name", "Author C. Clarke", CourseCategory.DESIGN);
        System.out.println(course);
    }
}
