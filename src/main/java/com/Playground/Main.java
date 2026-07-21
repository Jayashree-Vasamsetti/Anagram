package com.Playground;

import java.util.Arrays;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Main object= new Main();
        System.out.println(object.Anagram("listen","silent"));
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }

//    public boolean Anagram(String s1, String S2){
//
//        char[] ch1=s1.toCharArray();
//        char[] ch2=S2.toCharArray();
//        Arrays.sort(ch1);
//        Arrays.sort(ch2);
//        if(Arrays.equals(ch1,ch2)){
//            return true;}
//        else{return false;}
//    }

    public boolean Anagram(String s1, String s2){

        if(s1.length()!=s2.length()){
            return false;
        }

        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char c1=s1.charAt(i);
            char c2=s2.charAt(i);

            map.put(c1,map.getOrDefault(c1,0)+1);
            map.put(c2,map.getOrDefault(c2,0)-1);

            

        }
        for(int c:map.values()){
            if(c!=0){
                return false;
            }
        }

        return true;
    }
}