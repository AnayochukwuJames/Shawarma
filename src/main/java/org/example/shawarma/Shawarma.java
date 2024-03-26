package org.example.shawarma;

import org.springframework.stereotype.Repository;

@Repository
public interface Shawarma {

    void serveShawarma();
    Shawarma get();

}