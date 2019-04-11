package com.clouway;

public class Main {

    public static void main(String[] args) {
        TextSplitterToSymbols symbols = new TextSplitterToSymbols();

        System.out.println(symbols.cut("asd fa").size());

        System.out.println(new TextSplitterToWords().cut("as das bas fas"));

    }
}
