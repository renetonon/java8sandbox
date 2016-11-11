/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nucleolus.java8sandbox.lambda1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author rene
 */
public class Lambda1Comparator {

    private void run() {
        System.out.println("hello from " + this.getClass().toString());
        List l = Arrays.asList("c", "b");        
        final Comparator<Comparable> c = (Comparable x, Comparable y) -> {
            return x.compareTo(y);
        };
        l.sort(c);
        l.forEach(x -> System.out.println(x));
    }

    public static void main(String[] args) {
        new Lambda1Comparator().run();
    }
}
