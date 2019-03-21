package com.minesummit.plugin;

public class Arena {

    SpawnPosition pos1;
    SpawnPosition pos2;
    SpawnPosition pos3;
    SpawnPosition pos4;

    SpawnPosition[] spawns = {pos1, pos2, pos3, pos4};

    boolean isFull;

    public Arena(SpawnPosition pos1, SpawnPosition pos2, SpawnPosition pos3, SpawnPosition pos4, SpawnPosition[] spawns, boolean isFull) {
        this.pos1 = pos1;
        this.pos2 = pos2;
        this.pos3 = pos3;
        this.pos4 = pos4;
        this.isFull = isFull;
    }

}
