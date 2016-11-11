/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nucleolus.java8sandbox.lambda1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author rene
 */
public class Lambda1Consumer {

    private void run() {
        System.out.println("hello from " + this.getClass().toString());
        List l = Arrays.asList("c", "b");
        Consumer f = x -> System.out.println(x);
        l.forEach(f);        
    }

    public static void main(String[] args) {
        new Lambda1Consumer().run();
    }
}
