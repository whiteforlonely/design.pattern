package com.ake.designpattern.creator.builder;

import java.awt.*;

/**
 * 文档转换器
 *
 * @author : Saturday
 * date 2021/7/16
 * @version V1.0
 */
public interface TextConverter {

    void convertCharacter(char a);
    void convertFontChanged(Font f);
    void convertParagraph();
}
