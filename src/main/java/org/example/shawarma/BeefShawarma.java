package org.example.shawarma;

import org.springframework.stereotype.Component;

@Component
public class BeefShawarma implements Shawarma {
    @Override
    public void serveShawarma() {
        System.out.println("This is Beef Shawarma from Ingryd!");
    }

    @Override
    public Shawarma get() {
        return new BeefShawarma();
    }
}