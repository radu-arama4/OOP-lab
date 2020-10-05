package com.radu.oop_lab.lab3;

import java.util.*;

public class Text {
    private String text = null;

    List<Word> wordsList = new ArrayList<>();

    static private String vow = "aeiou";

    public Text(String text) {
        if(text.isEmpty()){
            System.out.println("Insert a text, please!");
            return;
        }
        this.text = text;
    }

    public int nrOfWords(){
        //String[] words = text.split("\\s+");
        String[] words = text.split("[\\W+]");
        return words.length;
    }

    public int nrOfSentences(){
        int count=(int)text.chars().filter(ch->ch=='.').count();
        count+=(int)text.chars().filter(ch->ch=='?').count();
        count+=(int)text.chars().filter(ch->ch=='!').count();
        if(count==0){
            count=1;
        }
        return count;
    }

    public int nrOfVowels(){
        int count=0;
        for(int i=0;i<text.length();i++){
            if(vow.contains(text.toLowerCase().charAt(i)+"")){
                count++;
            }
        }
        return count;
    }

    public int nrOfConsonants(){
        int count=0;
        for(int i=0;i<text.length();i++){
            if(!vow.contains(text.toLowerCase().charAt(i)+"") &&
                    (text.charAt(i)>'a' && text.charAt(i)<'z')){
                count++;
            }
        }
        return count;
    }

    public int nrOfLetters(){
        return nrOfConsonants()+nrOfVowels();
    }

    public void topFiveWords(){
        String[] words = text.split("\\W+");
        for(String word:words){
            Word newWord = new Word(word);
            if(Collections.frequency(wordsList, newWord)==0){
                wordsList.add(newWord);
                int count = 0;
                for(String word2:words){
                    if(word.equals(word2)){
                        count++;
                    }
                }
                newWord.setNr(count);
            }
        }
        Collections.sort(wordsList, new Comparator<Word>() {
            @Override
            public int compare(Word o1, Word o2) {
                if(o1.getNr()>o2.getNr()){
                    return -1;
                }else if(o2.getNr()>o1.getNr()) {
                    return 1;
                }else{
                    return 0;
                }
            }
        });

        for(int i=0;i<5;i++){
            System.out.println(wordsList.get(i).getWord() + "  occurs " + wordsList.get(i).getNr() + " times.");
        }
    }

    public String getLongest(){
        String[] words = text.split("\\W+");
        String max="";
        for(String word:words){
            if(word.length()>max.length()){
                max=word;
            }
        }
        return max;
    }
}