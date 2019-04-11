package com.clouway;

import java.util.Map;

public class MapFormatter {
    public MapFormatter() {
    }

    public String formatMap(String word, ListForAnalysisDataSource dataSource){
        String output = "";
        FrequencyAnalyser freq = new FrequencyAnalyser();
        for (Map.Entry<String,Integer> entry : freq.frequencyAnalysis(word,dataSource).entrySet()){
            output += entry.getKey() + ":";
            output += entry.getValue() + ", ";
        }
        return output;
    }
}
