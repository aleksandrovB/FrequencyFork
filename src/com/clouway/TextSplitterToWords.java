package com.clouway;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TextSplitterToWords implements ListForAnalysisDataSource {
    @Override
    public List<String> cut(String word) {
        List<String> out = new LinkedList<>(Arrays.asList(word.trim().split(" ")));
        return out;
    }
}
