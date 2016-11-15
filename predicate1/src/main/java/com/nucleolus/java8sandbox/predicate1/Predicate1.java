/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nucleolus.java8sandbox.predicate1;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author rene
 */
public class Predicate1 {

    public static boolean isSingleWord(String s) {
        return !s.contains(" \t");
    }

    public static void main(String[] args) {
        List<String> l = Arrays.asList("a b", "cd");
        l.removeIf((String x) -> !Predicate1.isSingleWord(x));
        System.out.println(l);
    }
}
