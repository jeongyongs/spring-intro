package com.jeongyongs.keyword;

import jakarta.inject.Inject;
import jakarta.inject.Named;

public class Searcher {

    @Inject
    @Named(value = "keywordDao1")
    private KeywordDao keywordDao;

    public Searcher() {
    }

    public Searcher(KeywordDao keywordDao) {
        this.keywordDao = keywordDao;
        System.out.println("SER: searcher has been created.");
    }

    public String search(String key) {
        System.out.println("SER: retrieving the value of " + key + " from the db.");
        return keywordDao.select(key);
    }
}
