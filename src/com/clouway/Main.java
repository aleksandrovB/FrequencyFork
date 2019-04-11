package com.clouway;

public class Main {

    public static void main(String[] args) {
        TextSplitterToSymbols symbols = new TextSplitterToSymbols();

        System.out.println(symbols.cut("asd fa").size());

        System.out.println(new TextSplitterToWords().cut("as das bas fas"));

        FrequencyAnalyser fq = new FrequencyAnalyser();
        String symbol = "Niki Ileieve";
        String word = "aa ss dd ff aa";
        System.out.println("Raw Niki Iliev: "+fq.frequencyAnalysis(symbol,new TextSplitterToSymbols()));

        System.out.println("Raw aa ss dd ff aa: "+fq.frequencyAnalysis(word, new TextSplitterToWords()));

        System.out.println("Formatted aa ss: "+new MapFormatter().formatMap(word,new TextSplitterToWords()));

        System.out.println("Most frequent: "+new FilterMostFrequent().filterMostFrequent(symbol,
                new TextSplitterToSymbols()));
    }
}
