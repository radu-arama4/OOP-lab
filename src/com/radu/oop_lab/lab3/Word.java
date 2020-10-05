package com.radu.oop_lab.lab3;

public class Word{
    private String word;
    private int nr = 0;

    public Word(String word){
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public int getNr(){
        return nr;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Word){
            Word w2 = (Word) obj;
            return this.word.toLowerCase().equals(w2.getWord().toLowerCase());
        }else{
            return false;
        }
    }
}
