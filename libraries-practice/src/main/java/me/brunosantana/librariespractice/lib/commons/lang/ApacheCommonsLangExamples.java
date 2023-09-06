package me.brunosantana.librariespractice.lib.commons.lang;

import org.apache.commons.lang3.StringUtils;
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

    public String testStringUtils(){
        return StringUtils.leftPad("1", 4, "0")
                .concat("\n")
                .concat(StringUtils.substring("Java 17 LTS", 0, 7))
                .concat("\n")
                .concat(StringUtils.substring("abc", -2, -1))
                .concat("\n")
                .concat(StringUtils.substring("abc", -4, 2))
                .concat("\n")
                .concat(StringUtils.substringAfter("Oracle Java 21", "Oracle "))
                .concat("\n")
                .concat(Boolean.toString(StringUtils.isAllBlank("   ")))
                .concat("\n")
                .concat(Boolean.toString(StringUtils.isAllBlank("")))
                .concat("\n")
                .concat(Boolean.toString(StringUtils.isAllBlank(null)))
                .concat("\n")
                .concat(Boolean.toString(StringUtils.isEmpty("   ")))
                .concat("\n")
                .concat(Boolean.toString(StringUtils.isEmpty("")))
                .concat("\n")
                .concat(Boolean.toString(StringUtils.isEmpty(null)));
    }

}
