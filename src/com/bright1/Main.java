package com.bright1;

import com.bright1.programmers.MediaInfo;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MediaInfo mediaInfo = new MediaInfo();

        mediaInfo.test1 = "test1";
        mediaInfo.test2 = "test2";
        mediaInfo.test3 = "test3";

        setMediaTest(mediaInfo);
        setMediaTest2(mediaInfo);

        System.out.println(mediaInfo.toString());
    }

    private static void setMediaTest(MediaInfo mediaInfo) {
        mediaInfo.test4 = "test4";
    }

    private static void setMediaTest2(MediaInfo mediaInfo) {
        mediaInfo.test5 = "test5";
    }


}
