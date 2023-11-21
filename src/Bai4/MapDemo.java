/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;

import java.util.HashMap;
import java.util.*;
import model.Student;

/**
 *
 * @author quans
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, Student> map = new HashMap<>(); 
        Student sv1 = new Student();
        sv1.name = "Tuấn";  
        sv1.major = "CNTT";  
        sv1.marks = 7.0;  
        map.put(sv1.name, sv1);
        Student sv2 = new Student();
        sv2.name = "Quân";  
        sv2.major = "CNTT";  
        sv2.marks = 8.0;  
        map.put(sv2.name, sv2);
        Student sv3 = new Student();
        sv3.name = "Sang";  
        sv3.major = "CNTT";  
        sv3.marks = 2.0;  
        map.put(sv3.name, sv3); 
        Set<String> keys = map.keySet(); 
        for(String name : keys){ 
            Student sv = map.get(name);  
            System.out.println(">Họ và tên: " + sv.name); 
            System.out.println(">Học lực: " + sv.getGrade()); 
        }

    }
}
