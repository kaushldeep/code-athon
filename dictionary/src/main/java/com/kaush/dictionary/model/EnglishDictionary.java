package com.kaush.dictionary.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"word"})
public class EnglishDictionary implements Comparable<String>{
    private String word;

    public EnglishDictionary(){

    }

    public EnglishDictionary(String word){
        this.word = word;
    }
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public int compareTo(String word2) {
        return this.word.compareTo(word2);
    }

}
