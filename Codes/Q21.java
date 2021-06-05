// Rename the filename.java to be same as public class name.

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samarth Gupta
 */

import java.util.*;
public class Collection {
    public static void main(String[] args) {
        HashMap<String, List<String>> h1 = new LinkedHashMap<>();
        HashMap<String, String> h2 = new LinkedHashMap<>();
        List<String> subjects = Arrays.asList("Python", "Math", "C");
        h1.put("A",subjects);
        subjects = Arrays.asList("Python","Maths","C");
        h1.put("B",subjects);
        subjects = Arrays.asList("C","C++");
        h1.put("C",subjects);
        subjects = Arrays.asList("C++","Physics","Chemistry");
        h2.put("Python","111");
        h2.put("Math","222");
        h2.put("C","333");
        h2.put("C++","444");
        h2.put("Physics","555");
        h2.put("Chemistry","666");
        h2.put("Digital Electronics","777");
        for(Map.Entry j:h1.entrySet()){
            System.out.println(j.getKey());
            subjects = (List<String>)j.getValue();
            for(String s:subjects)
                System.out.print(s + " ");
            System.out.println();}
        for(Map.Entry j:h2.entrySet()){
            System.out.println(j.getKey()+" "+j.getValue());}
        String s = "A";    // TYPE LETTER FOR WHICH DETAILS ARE TO BE PRINTED
        System.out.println(" ");
        System.out.println("FACULTY : ");
        for(Map.Entry j:h1.entrySet()){
            if(j.getKey().equals(s)){
                for(Map.Entry j2:h2.entrySet()){
                    subjects = (List<String>)j.getValue();
                    if(subjects.contains(j2.getKey()))
                        System.out.println(j2.getValue());
                }}}}}