package org.example.shawarma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShawarmaController {


    @Autowired
    private Shawarma shawarma;

    public void serveShawarma(){
        shawarma.serveShawarma();
    }

}