package me.brunosantana.librariespractice.lib.commons.lang;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ApacheCommonsLangExamples {

    public String testPersonToString(){
        return new Person("Bruno", 37).toString();
    }

    public String testPetToString(){
        Pet myDog = new Pet("Jhully", PetTypes.CAT, 15);
        return "TO_STRING_STYLES"
                .concat("\n\nSIMPLE_STYLE\n")
                .concat(ToStringBuilder.reflectionToString(myDog, ToStringStyle.SIMPLE_STYLE))
                .concat("\n\nJSON_STYLE\n")
                .concat(ToStringBuilder.reflectionToString(myDog, ToStringStyle.JSON_STYLE))
                .concat("\n\nDEFAULT_STYLE\n")
                .concat(ToStringBuilder.reflectionToString(myDog, ToStringStyle.DEFAULT_STYLE))
                .concat("\n\nMULTI_LINE_STYLE\n")
                .concat(ToStringBuilder.reflectionToString(myDog, ToStringStyle.MULTI_LINE_STYLE))
                .concat("\n\nSHORT_PREFIX_STYLE\n")
                .concat(ToStringBuilder.reflectionToString(myDog, ToStringStyle.SHORT_PREFIX_STYLE))
                .concat("\n\nNO_CLASS_NAME_STYLE\n")
                .concat(ToStringBuilder.reflectionToString(myDog, ToStringStyle.NO_CLASS_NAME_STYLE))
                .concat("\n\nNO_FIELD_NAMES_STYLE\n")
                .concat(ToStringBuilder.reflectionToString(myDog, ToStringStyle.NO_FIELD_NAMES_STYLE));
    }

}
