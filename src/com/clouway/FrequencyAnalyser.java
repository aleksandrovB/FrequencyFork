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
}
