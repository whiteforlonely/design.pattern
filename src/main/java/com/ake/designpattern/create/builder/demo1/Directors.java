package com.ake.designpattern.create.builder.demo1;

/**
 * TODO
 *
 * @author : Saturday
 * date 2022/3/9
 * @version V1.0
 */
public class Directors {

    public Computer createMacBook(){
        return new MacBook.Builder().create1("mak1");
    }

    public Computer createWindow(){
        return new Windows.Builder().create1("window");
    }

    public static void main(String[] args) {
        Directors directors = new Directors();
        directors.createMacBook();
        directors.createWindow();
    }
}
