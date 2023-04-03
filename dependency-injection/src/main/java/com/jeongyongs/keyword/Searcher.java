package com.jeongyongs.keyword;

import org.springframework.beans.factory.annotation.Autowired;

public class Searcher {

    private KeywordDao keywordDao;

    @Autowired
    public Searcher(KeywordDao keywordDao) {
        this.keywordDao = keywordDao;
        System.out.println("SER: searcher has been created.");
    }

    public String search(String key) {
        System.out.println("SER: retrieving the value of " + key + " from the db.");
        return keywordDao.select(key);
    }
}
