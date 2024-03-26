//package com.davidson.MyFirstSpringBoot.classes;

import org.springframework.stereotype.Component;

import java.io.*;

@Component
public class RestService {

    private final File file = new File("file.txt");

    public String postToFile(String string){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))){
            writer.write(string + "\n");
            return "Item saved to file correctly";
        } catch (IOException exception){
            System.out.println(exception.getMessage());
            return "Can not be saved";
        }
    }

    public String readFromFile(){
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            StringBuilder builder = new StringBuilder();
            while( (line = reader.readLine()) != null){
                builder.append(line);
            }
            return builder.toString();
        } catch (IOException exception){
            System.out.println(exception.getMessage());
            return "Can not read from file";
        }
    }
}