package com.jeongyongs.keyword;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Register {

    private KeywordDao keywordDao;

    @Autowired
    public Register(@Qualifier("usedDao") KeywordDao keywordDao) {
        this.keywordDao = keywordDao;
    }

    public void newKeyword(String key, String value) {
        if (isAvailable(key)) {
            keywordDao.insert(key, value);
            System.out.println("REG: saved {" + key + " : " + value + "} in the db.");
            return;
        }
        System.out.println("REG: fail! invalid key value.");
    }

    private boolean isAvailable(String key) {
        System.out.println("REG: checking for duplicates of " + key + " in the db.");
        return keywordDao.select(key) == null;
    }
}
