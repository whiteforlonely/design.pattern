package com.ake.designpattern.creator.demo1.factory;

import com.ake.designpattern.creator.demo1.Door;
import com.ake.designpattern.creator.demo1.Maze;
import com.ake.designpattern.creator.demo1.Room;
import com.ake.designpattern.creator.demo1.Wall;

/**
 * 迷宫工厂
 *
 * @author : Saturday
 * date 2021/7/16
 * @version V1.0
 */
public class MazeFactory {

    public Maze makeMaze(){
        return new Maze();
    }
    public Room makeRoom(int roomNumber){
        return new Room(roomNumber);
    }
    public Door makeDoor() {
        return new Door();
    }
    public Wall makeWall(){
        return new Wall();
    }
}
