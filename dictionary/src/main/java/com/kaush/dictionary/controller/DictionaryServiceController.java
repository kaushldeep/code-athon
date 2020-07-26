package com.kaush.dictionary.controller;

import com.kaush.dictionary.model.DictionaryData;
import com.kaush.dictionary.model.EnglishDictionary;
import com.kaush.dictionary.service.DictionaryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dictionary")
public class DictionaryServiceController {

    @Autowired
    private DictionaryServiceImpl dictionaryServiceImpl;

    @RequestMapping(value = "word/{word}", method = RequestMethod.GET, produces = "application/json")
    public DictionaryData getWord(@PathVariable String word) {
        return dictionaryServiceImpl.getWord(word);
    }

    @RequestMapping(value = "allWords", method = RequestMethod.GET, produces = "application/json")
    public DictionaryData getAllWord() {
        return dictionaryServiceImpl.getAllWord();
    }

    @RequestMapping(value = "addWord/{word}", method = RequestMethod.GET, produces = "application/json")
    public DictionaryData addWord(@PathVariable String word) {
        dictionaryServiceImpl.saveWord(word);
        return dictionaryServiceImpl.getWord(word);
    }

    @RequestMapping(value = "deleteWord/{word}", method = RequestMethod.GET, produces = "application/json")
    public DictionaryData deleteWord(@PathVariable String word) {
        dictionaryServiceImpl.deleteWord(word);
        DictionaryData dictionaryData = new DictionaryData();
        dictionaryData.getWordList().add(new EnglishDictionary("Word Deleted !!"));
        return dictionaryData;
    }

}
