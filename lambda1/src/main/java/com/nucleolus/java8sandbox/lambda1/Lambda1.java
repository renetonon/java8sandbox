/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nucleolus.java8sandbox.lambda1;

/**
 *
 * @author rene
 */
public class Lambda1 {

    private void run() {
        System.out.println("hello from "+this.getClass().toString());
    }
    public static void main(String[] args) {
        new Lambda1().run();
    }
}
