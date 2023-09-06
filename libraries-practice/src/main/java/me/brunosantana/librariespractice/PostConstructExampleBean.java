package me.brunosantana.librariespractice;

import jakarta.annotation.PostConstruct;
import me.brunosantana.librariespractice.lib.commons.lang.ApacheCommonsLangExamples;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class PostConstructExampleBean {

    private static final Logger logger
            = LoggerFactory.getLogger(PostConstructExampleBean.class);

    @PostConstruct
    public void init() {
        ApacheCommonsLangExamples apacheCommonsLangExamples = new ApacheCommonsLangExamples();
        logger.info(apacheCommonsLangExamples.testPersonToString());
        logger.info(apacheCommonsLangExamples.testPetToString());
        logger.info(apacheCommonsLangExamples.testStringUtils());
    }
}
