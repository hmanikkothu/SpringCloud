package com.hk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

/**
 * Created by hmanikkothu on 1/21/2017.
 */

@RestController
public class SentenceBuilderController {

    @Autowired
    DiscoveryClient client;

    @RequestMapping("/sentence")
    public @ResponseBody
    String getSentence() {
        return
                getWord("EURKCLIENT-SUBJECT") + " "
                        + getWord("EURKCLIENT-VERB") + " "
                        + getWord("EURKCLIENT-ARTICLE") + " "
                        + getWord("EURKCLIENT-ADJECTIVE") + " "
                        + getWord("EURKCLIENT-NOUN") + "."
                ;
    }

    public String getWord(String service) {
        List<ServiceInstance> list = client.getInstances(service);
        if (list != null && list.size() > 0 ) {
            URI uri = list.get(0).getUri();
            if (uri !=null ) {
                return (new RestTemplate()).getForObject(uri,String.class);
            }
        }
        return null;
    }
}
