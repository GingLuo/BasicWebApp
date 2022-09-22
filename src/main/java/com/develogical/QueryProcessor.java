package com.develogical;

import java.util.Arrays;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }else if (query.toLowerCase().contains("name")){
            return "ssggggghih";
        }else if (query.toLowerCase().contains("number")){
            // Pattern regex = Pattern.compile("(\\d+)(, \\d+)*");
            // Matcher matcher = regex.matcher(query);
            // int res = Math.max.apply(null, query.match(/\d+/g));
            // System.out.println(matcher.find());

            // System.out.println(matcher.group(0));
            // System.out.println(matcher.group(1));
            // System.out.println(matcher.group(2));
            // System.out.println(matcher.group(3));
            String[] parts = query.split(",");
            String[] newParts = Arrays.copyOfRange(parts, 1, parts.length);
            String[] colons = parts[0].split(":");
            int res = Integer.parseInt(colons[1].trim());
            for (String s : newParts){
                res = Integer.max(res, Integer.parseInt(s.trim()));
            }
            return Integer.toString(res);
        }
        return "";
    }
}
