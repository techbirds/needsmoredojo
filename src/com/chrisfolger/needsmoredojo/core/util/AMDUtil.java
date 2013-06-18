package com.chrisfolger.needsmoredojo.core.util;

public class AMDUtil
{
    public static String defineToParameter(String define)
    {
        if(define.startsWith("dojo/text") || define.startsWith("dojo/i18n"))
        {
            return define.substring(define.indexOf('!') + 1);
        }

        String result = define.substring(define.lastIndexOf("/") + 1);
        if(result.contains("-"))
        {
            int index = result.indexOf('-');
            result = result.replace("-", "");
            result = result.substring(0,index)+ ("" +result.charAt(index)).toUpperCase() +result.substring(index+1);
        }

        result = result.replaceAll("_", "");

        return result;
    }
}