package com.clouway;

public class Main {

    public static void main(String[] args) {
        TextSplitterToSymbols symbols = new TextSplitterToSymbols();

        System.out.println(symbols.cut("asd fa").size());

        System.out.println(new TextSplitterToWords().cut("as das bas fas"));

        FrequencyAnalysator fq = new FrequencyAnalysator();
        System.out.println(fq.frequencyAnalysis("Niki Iliev",new TextSplitterToSymbols()));

        System.out.println(fq.frequencyAnalysis("aa ss dd ff aa", new TextSplitterToWords()));
    }
}
