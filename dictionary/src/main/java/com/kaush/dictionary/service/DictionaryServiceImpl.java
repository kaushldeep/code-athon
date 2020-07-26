package com.kaush.dictionary.service;

import com.kaush.dictionary.model.DictionaryData;
import com.kaush.dictionary.model.EnglishDictionary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class DictionaryServiceImpl {

    Map<Character, List> wordMap;

    @PostConstruct
    private void createWordMap() {
        this.wordMap = writeWordMap();
    }

    public void saveWord(String word) {
        Character character = word.toUpperCase().charAt(0);

        if (Objects.nonNull((ArrayList) this.wordMap.get(character))
                && !this.wordMap.get(character).contains(new EnglishDictionary(word))) {
            this.wordMap.get(character).add(new EnglishDictionary(word));
        }
    }

    public DictionaryData getWord(String word) {
        DictionaryData dictionaryData = new DictionaryData();
        Character character = word.toUpperCase().charAt(0);

        ArrayList<EnglishDictionary> wordList = (ArrayList<EnglishDictionary>) this.wordMap.get(character);

        dictionaryData.getWordList().addAll(wordList.stream().filter(
                englishDictionary -> englishDictionary.getWord().contains(word)).collect(Collectors.toList()));
        return dictionaryData;
    }

    public DictionaryData getAllWord() {
        DictionaryData dictionaryData = new DictionaryData();
        Iterator<Map.Entry<Character, List>> iterator = this.wordMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Character, List> entry = iterator.next();
            dictionaryData.getWordList().addAll(entry.getValue());
        }
        return dictionaryData;
    }

    public void deleteWord(String word) {
        Character character = word.toUpperCase().charAt(0);
        if (Objects.nonNull((ArrayList) this.wordMap.get(character))
                && this.wordMap.get(character).contains(new EnglishDictionary(word))) {
            this.wordMap.get(character).remove(this.wordMap.get(character).indexOf(new EnglishDictionary(word)));
        }
    }

    private Map<Character, List> writeWordMap() {
        Map<Character, List> map = new HashMap<Character, List>();

        map.put('A', new ArrayList<EnglishDictionary>());
        map.put('B', new ArrayList<EnglishDictionary>());
        map.put('C', new ArrayList<EnglishDictionary>());
        map.put('D', new ArrayList<EnglishDictionary>());
        map.put('E', new ArrayList<EnglishDictionary>());
        map.put('F', new ArrayList<EnglishDictionary>());
        map.put('G', new ArrayList<EnglishDictionary>());
        map.put('H', new ArrayList<EnglishDictionary>());
        map.put('I', new ArrayList<EnglishDictionary>());
        map.put('J', new ArrayList<EnglishDictionary>());
        map.put('K', new ArrayList<EnglishDictionary>());
        map.put('L', new ArrayList<EnglishDictionary>());
        map.put('M', new ArrayList<EnglishDictionary>());
        map.put('N', new ArrayList<EnglishDictionary>());
        map.put('O', new ArrayList<EnglishDictionary>());
        map.put('P', new ArrayList<EnglishDictionary>());
        map.put('Q', new ArrayList<EnglishDictionary>());
        map.put('R', new ArrayList<EnglishDictionary>());
        map.put('S', new ArrayList<EnglishDictionary>());
        map.put('T', new ArrayList<EnglishDictionary>());
        map.put('U', new ArrayList<EnglishDictionary>());
        map.put('V', new ArrayList<EnglishDictionary>());
        map.put('W', new ArrayList<EnglishDictionary>());
        map.put('X', new ArrayList<EnglishDictionary>());
        map.put('Y', new ArrayList<EnglishDictionary>());
        map.put('Z', new ArrayList<EnglishDictionary>());

        return map;
    }
}
