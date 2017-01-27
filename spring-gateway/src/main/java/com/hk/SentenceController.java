package com.hk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

/**
 * Created by hmanikkothu on 1/27/2017.
 */

@Controller
public class SentenceController {

    @RequestMapping("/sentence")
    public String getSentence() {
        return "sentence";
    }
}
