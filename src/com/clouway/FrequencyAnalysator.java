package com.clouway;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyAnalysator {
    public FrequencyAnalysator() {
    }

    public String frequencyAnalysis(String word, ListForAnalysisDataSource dataSource){
        Map<String, Integer> dataMap = new LinkedHashMap<>();
        dataSource.cut(word);
        String output = "";
        for (String fragment: dataSource.cut(word)) {
            if (!dataMap.containsKey(fragment)) {
                dataMap.put(fragment, 1);
            } else {
                dataMap.replace(fragment, dataMap.get(fragment) + 1);
            }
        }
        for (Map.Entry<String,Integer> entry : dataMap.entrySet()){
            output += entry.getKey() + ": ";
            output += entry.getValue() + ", ";
        }
        return output;
    }
}
