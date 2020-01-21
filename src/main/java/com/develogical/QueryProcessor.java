package com.develogical;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        else if (query.toLowerCase().contains("hi")) {
            return "yes";

        }
        else if (query.toLowerCase().contains(("name")))
            return "MTM";
        else if (query.toLowerCase().contains("is the largest")) {
            String[] arr = query.split(":");
            String[] nums = arr[1].split(" ");
            List<Integer> parsedNums = new ArrayList<>();
            for ( String num : nums) {
                parsedNums.add(Integer.parseInt(num));
            }
            Collections.sort(parsedNums);
            return "" + parsedNums.get(parsedNums.size() - 1 );
        }
        return "";

    }
}
