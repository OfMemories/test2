package com.zzf.demo;

public class TestDemo {

    public static void printResult(long loopCount) {
        System.out.println("循环次数:" + loopCount);
        stringAppend(loopCount);
        stringBuilderAppend(loopCount);
        stringBufferAppend(loopCount);
    }
    public static long stringAppend(long loopCount) {
        long beginTime = System.currentTimeMillis();
        String str = "hello,world!";
        String result = "";

        for (int i = 0; i < loopCount; i++) {
            result += str;
        }
        long consumeTime = System.currentTimeMillis()-beginTime;
        System.out.println("StringAppend 用时:" + consumeTime +"毫秒");
        return consumeTime;
    }

    public static long stringBuilderAppend(long loopCount) {
        long beginTime = System.currentTimeMillis();
        String str = "hello, world!";
        String result = "";
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < loopCount; i++) {
            stringBuilder.append(str);
        }
        result = stringBuilder.toString();
        long consumeTime = System.currentTimeMillis()-beginTime;
        System.out.println("StringBuilder append 用时:" + consumeTime +"毫秒");
        return consumeTime;

    }

    public static long stringBufferAppend(long loopCount) {
        long beginTime = System.currentTimeMillis();
        String str = "hello, world!";
        String result = "";
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < loopCount; i++) {
            stringBuffer.append(str);
        }
        result = stringBuffer.toString();
        long consumeTime = System.currentTimeMillis()-beginTime;
        System.out.println("StringBuffer append 用时:" + consumeTime +"毫秒");
        return consumeTime;
    }


    public static void main(String[] args) {
        printResult(100);
        System.out.println("===============================================");
        printResult(1000);
        System.out.println("===============================================");
        printResult(10000);
        System.out.println("===============================================");
        printResult(100000);



    }

}
