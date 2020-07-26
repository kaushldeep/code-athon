package com.kaush.dictionary.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonPropertyOrder({ "dictionary" })
public class DictionaryData {
    public List<EnglishDictionary> getWordList() {
        if (Objects.isNull(wordList)){
            wordList = new ArrayList<EnglishDictionary>();
        }
        return wordList;
    }

    public void setWordList(List<EnglishDictionary> wordList) {
        this.wordList = wordList;
    }

    private List<EnglishDictionary> wordList;
}
