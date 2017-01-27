package com.hk;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hmanikkothu on 1/20/2017.
 */

@RestController
@ConfigurationProperties(prefix = "wordConfig")
public class WordController {

//    @Value("${word-of-the-day}") String wordOfTheDay;
    String wordOfTheDay;
    String preamble;

    public void setWordOfTheDay(String wordOfTheDay) {
        this.wordOfTheDay = wordOfTheDay;
    }

    public void setPreamble(String preamble) {
        this.preamble = preamble;
    }

    @RequestMapping("/word-of-the-day")
    public String showWordOfTheDay() {
        return preamble + wordOfTheDay;
    }


}
