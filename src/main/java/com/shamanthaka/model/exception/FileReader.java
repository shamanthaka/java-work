package com.shamanthaka.model.exception;

import java.io.File;

public class FileReader {
    public static void main(String[] args){

        //un checked exception also known as runtime exception

        File file;

        String[] paths;

        try {

            file = new File("C:/vinny-work/javawork/src/main/java/com/shamanthaka/model/iface/");

            paths = file.list();

            for (String f : paths) {  //foreach loop
                System.out.println(f);
            }
        }catch(NullPointerException npe){
            //npe.printStackTrace();
            System.out.println("File not found "+ npe.getMessage());
        }

        System.out.println("I am here.");
    }
}
