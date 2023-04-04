package com.jeongyongs.keyword;

import jakarta.annotation.Resource;

public class Register {

    @Resource
    private KeywordDao keywordDao;

    public Register() {
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
