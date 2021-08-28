package com.example.ipl.Service;

import com.example.ipl.InterDao.IplInter;
import com.example.ipl.Pojo.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IplService {

    @Autowired
    IplInter iplDao;

    public Score getScoreCard(){
        return iplDao.getScoreCard();
    }
}
