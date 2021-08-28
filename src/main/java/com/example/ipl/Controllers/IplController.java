package com.example.ipl.Controllers;

import com.example.ipl.Pojo.Score;
import com.example.ipl.Service.IplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "ipl")
public class IplController {

    @Autowired
    IplService iplService;

    @RequestMapping(value = "score")
    public ResponseEntity<Score> getScoreCard(){
        Score score = iplService.getScoreCard();
        return new ResponseEntity<Score>(score, HttpStatus.OK);
    }
}
