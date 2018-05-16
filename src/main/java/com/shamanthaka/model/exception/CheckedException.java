package com.shamanthaka.model.exception;

//https://www.geeksforgeeks.org/checked-vs-unchecked-exceptions-in-java/

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

    public void readFile(){
        try {
            String line = null;
            FileReader fileReader = new FileReader("C:\\vinny-work\\javawork\\src\\main\\java\\com\\shamanthaka\\model\\exception\\CheckedException.java");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        }catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }catch (IOException io){
            io.printStackTrace();
        }
    }

    public void readFile2(){
        try {
            String line = null;
            FileReader fileReader = new FileReader("C:\\vinny-work\\javawork\\src\\main\\java\\com\\shamanthaka\\model\\exception\\CheckedException.java");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException io){
            io.printStackTrace();
        }
    }

    public void readFile3() throws FileNotFoundException, IOException{
        String line = null;
        FileReader fileReader = new FileReader("C:\\vinny-work\\javawork\\src\\main\\java\\com\\shamanthaka\\model\\exception\\CheckedException.java");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
    }

    public static void main(String[] args){
        CheckedException checkedException = new CheckedException();
        //checkedException.readFile();
        //checkedException.readFile2();
        try {
            checkedException.readFile3();
        }catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }catch (IOException io){
            io.printStackTrace();
        }
    }
}
