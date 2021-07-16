package com.ake.designpattern.creator.demo1.factory;

import com.ake.designpattern.creator.demo1.Maze;

/**
 * TODO
 *
 * @author : Saturday
 * date 2021/7/16
 * @version V1.0
 */
public class EnchantMazeFactory extends MazeFactory{

    @Override
    public Maze makeMaze() {
        // 这里，你可以有另外的创建迷宫的方式
        return super.makeMaze();
    }
}
