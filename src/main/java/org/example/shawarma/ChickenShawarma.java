package org.example.shawarma;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ChickenShawarma implements Shawarma {


    @Override
    public void serveShawarma() {
        System.out.println("This is Chicken Shawarma from Ingryd!");
    }

    @Override
    public Shawarma get() {
        return new ChickenShawarma();
    }
}