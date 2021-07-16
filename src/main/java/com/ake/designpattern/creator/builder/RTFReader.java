package com.ake.designpattern.creator.builder;

import java.awt.*;
import java.io.File;
import java.util.List;

/**
 * TODO
 *
 * @author : Saturday
 * date 2021/7/16
 * @version V1.0
 */
public class RTFReader {

    private TextConverter build;
    List<RTFToken> tokenList;

    public void parseRTF(File file){
        for (RTFToken rtfToken : tokenList) {
            switch (rtfToken.t) {
                case 1:
                    build.convertCharacter(rtfToken.c);
                case 2:
                    build.convertFontChanged(rtfToken.f);
                case 3:
                    build.convertParagraph();
                default:
                    break;
            }
        }

    }

    class RTFToken{
        int t;
        char c;
        Font f;
    }
}
