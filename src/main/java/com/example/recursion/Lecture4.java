package com.example.recursion;

public class Lecture4 {
    public static void main(String[] args) {
        new Lecture4().getAAA();
        System.out.println("bin ========== ");
        new Lecture4().printBin("", 2);
    }
    /**
     * Given an empty string, concat a letter to it until it equals AAA
     */
    public void getAAA(String str) {
        // base case
        if (str.length() == 3) {
            System.out.println(str);
            return;
        }
        getAAA(str + 'A');
    }

   public void getAAA() {
        getAAA("");
   }

    /**
     * get all combinations bin for x count
     */
    private void printBin(String bin, int lenght){
        if (bin.length() == lenght) {
            System.out.println(bin);
            return;
        }
        printBin(bin + "0", lenght);
        printBin(bin + "1", lenght);

    }
}
