package com.clouway;

import java.util.*;

public class FrequencyAnalyser {
    public FrequencyAnalyser() {
    }

    public Map<String, Integer> frequencyAnalysis(String word, ListForAnalysisDataSource dataSource){
        Map<String, Integer> dataMap = new LinkedHashMap<>();
        dataSource.cut(word);
        for (String fragment: dataSource.cut(word)) {
            if (!dataMap.containsKey(fragment)) {
                dataMap.put(fragment, 1);
            } else {
                dataMap.replace(fragment, dataMap.get(fragment) + 1);
            }
        }
        return dataMap;
    }

    public String formatMap(String word, ListForAnalysisDataSource dataSource){
        String output = "";
        for (Map.Entry<String,Integer> entry : frequencyAnalysis(word,dataSource).entrySet()){
            output += entry.getKey() + ":";
            output += entry.getValue() + ", ";
        }
        return output;
    }

    public String filterMostFrequent(String word, ListForAnalysisDataSource dataSource){
        Map<String,Integer> data = frequencyAnalysis(word,dataSource);
        int maxValue = Collections.max(data.values());
        StringBuilder output = new StringBuilder();

        for(Map.Entry<String,Integer> entry : data.entrySet()) {
            if(entry.getValue()==maxValue){
                output.append(entry.getKey()).append(" ");
            }
        }
        return output.toString();
    }
}
