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
        else if (query.toLowerCase().contains(("name")))
            return "MTM";
        else if (query.toLowerCase().contains("is the largest")) {
            String[] arr = query.split(":");
            String[] nums = arr[1].split(", ");
            List<Integer> parsedNums = new ArrayList<>();
            for ( String num : nums) {
                parsedNums.add(Integer.parseInt(num.trim()));
            }
            Collections.sort(parsedNums);
            return "" + parsedNums.get(parsedNums.size() - 1 );
        } else if(query.toLowerCase().contains(("what is "))){
            String[] arr = query.split("is");
            String[] nums = arr[1].split("plus");
            return "" + (Integer.parseInt(nums[0].trim()) + Integer.parseInt(nums[1].trim()));
        } else if (query.toLowerCase().contains("James Bond")){
            return "Sean Connery";
        } else if(query.toLowerCase().contains(("multiplied by "))){
            String[] arr = query.split("is");
            String[] nums = arr[1].split("multiplied by ");
            return "" + (Integer.parseInt(nums[0].trim()) * Integer.parseInt(nums[1].trim()));
        }
        else if(query.toLowerCase().contains("Eiffel")) {
            return "Paris";
        } else if(query.toLowerCase().contains("Theresa May")) {
            return "2016";
        } else if(query.toLowerCase().contains("Fibonacci")) {
            String[] arr = query.split("the");
            String[] arr1 = query.split(" ");
            String n = arr1[0].substring(0, arr1[0].length() - 2);
            int N = Integer.parseInt(n);
            if (N <= 1) {
                return "" + N;
            }
            if (N == 2) {
                return "1";
            }

            int current = 0;
            int prev1 = 1;
            int prev2 = 1;

            for (int i = 3; i <= N; i++) {
                current = prev1 + prev2;
                prev2 = prev1;
                prev1 = current;
            }
            return "" + current;
        }
        return "";

    }
}
