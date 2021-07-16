package com.ake.designpattern.creator.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author : Saturday
 * date 2021/7/15
 * @version V1.0
 */
public class Room implements MapSite{

    private int roomNumber;
    private List<MapSite> sides;

    public Room(int room) {
        this.roomNumber = room;
        this.sides = new ArrayList<MapSite>();
    }

    public void enter() {

    }
}
