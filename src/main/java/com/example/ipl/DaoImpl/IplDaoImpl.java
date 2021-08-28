package com.example.ipl.DaoImpl;

import com.example.ipl.InterDao.IplInter;
import com.example.ipl.Pojo.Score;
import org.springframework.stereotype.Repository;

@Repository
public class IplDaoImpl implements IplInter {
    @Override
    public Score getScoreCard() {
        Score score=new Score();
        score.setRuns(324);
        score.setTeam("Aus");
        score.setWickets(2);
        score.setOvers(42.2);
        return score;
    }
}
