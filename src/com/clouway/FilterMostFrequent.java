package com.clouway;

import java.util.Collections;
import java.util.Map;

public class FilterMostFrequent {
    public FilterMostFrequent() {
    }

    public String filterMostFrequent(String word, ListForAnalysisDataSource dataSource){
        FrequencyAnalyser freq = new FrequencyAnalyser();
        Map<String,Integer> data = freq.frequencyAnalysis(word,dataSource);
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
