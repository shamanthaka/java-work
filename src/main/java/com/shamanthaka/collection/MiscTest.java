package com.shamanthaka.collection;

import java.util.*;

public class MiscTest {

    private void printSomeNumbers(){
        System.out.println("Enter 12 numbers: ");
        int[] numbers = new int[12];

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 12; i++){
            numbers[i] = scanner.nextInt();
        }
        int counter = 0;
        /*while (numbers.length > 0){

            if(counter == 8 ){
                break;
            }
            System.out.println(numbers[counter]);
            counter++;
        }*/
        while(numbers.length > 0){
            if(counter < 8){
                System.out.println(numbers[counter]);
                counter++;
                continue;
            }
            if(counter > 8){
                break;
            }
        }
    }

    private void numberOccurrance(){
        int[] numbers = {5,6,7,5,8,9,7,6,4,7};
        Map<Integer,Integer> occurances = new HashMap<>();

        for(int i = 0; i < numbers.length; i++){
            //check numbers[i] in Map, if not found add to map else increment
            Integer occured = occurances.get(numbers[i]);
            int occ = 1;
            if(occured != null){
                int value = occured.intValue() + 1;
                occurances.put(numbers[i],value);
            }else{
                occurances.put(numbers[i],occ);
            }
        }

        //printing hasmap
        Set<Integer> keySet = occurances.keySet();
        Iterator<Integer> iter = keySet.iterator();

        while (iter.hasNext()){
            int key = iter.next();
            System.out.println("Key :" + key);
            System.out.println("Occurance " + occurances.get(key));
        }
    }

    public static void main(String[] args) {
       // new MiscTest().printSomeNumbers();
        MiscTest test = new MiscTest();
        //test.printSomeNumbers();
        test.numberOccurrance();
    }
}
