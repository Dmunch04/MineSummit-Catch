package com.minesummit.plugin;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class PrepareMatch {

    Vector3f arena1pos1 = new Vector3f(0, 0, 10);
    boolean arena1pos1isFull = false;
    SpawnPosition arena1pos1spawn = new SpawnPosition(arena1pos1, arena1pos1isFull);
    Vector3f arena1pos2 = new Vector3f(0, 10, 10);
    boolean arena1pos2isFull = false;
    SpawnPosition arena1pos2spawn = new SpawnPosition(arena1pos2, arena1pos2isFull);
    Vector3f arena1pos3 = new Vector3f(10, 0, 10);
    boolean arena1pos3isFull = false;
    SpawnPosition arena1pos3spawn = new SpawnPosition(arena1pos1, arena1pos3isFull);
    Vector3f arena1pos4 = new Vector3f(10, 10, 10);
    boolean arena1pos4isFull = false;
    SpawnPosition arena1pos4spawn = new SpawnPosition(arena1pos1, arena1pos4isFull);
    SpawnPosition[] arena1spawns = {arena1pos1spawn, arena1pos2spawn, arena1pos3spawn, arena1pos4spawn};
    boolean arena1isFull = false;

    Vector3f arena2pos1 = new Vector3f(0, 0, 10);
    boolean arena2pos1isFull = false;
    SpawnPosition arena2pos1spawn = new SpawnPosition(arena2pos1, arena2pos1isFull);
    Vector3f arena2pos2 = new Vector3f(0, 10, 10);
    boolean arena2pos2isFull = false;
    SpawnPosition arena2pos2spawn = new SpawnPosition(arena2pos2, arena2pos2isFull);
    Vector3f arena2pos3 = new Vector3f(10, 0, 10);
    boolean arena2pos3isFull = false;
    SpawnPosition arena2pos3spawn = new SpawnPosition(arena2pos1, arena2pos3isFull);
    Vector3f arena2pos4 = new Vector3f(10, 10, 10);
    boolean arena2pos4isFull = false;
    SpawnPosition arena2pos4spawn = new SpawnPosition(arena2pos1, arena2pos4isFull);
    SpawnPosition[] arena2spawns = {arena2pos1spawn, arena2pos2spawn, arena2pos3spawn, arena2pos4spawn};
    boolean arena2isFull = false;

    Vector3f arena3pos1 = new Vector3f(0, 0, 10);
    boolean arena3pos1isFull = false;
    SpawnPosition arena3pos1spawn = new SpawnPosition(arena3pos1, arena3pos1isFull);
    Vector3f arena3pos2 = new Vector3f(0, 10, 10);
    boolean arena3pos2isFull = false;
    SpawnPosition arena3pos2spawn = new SpawnPosition(arena3pos2, arena3pos2isFull);
    Vector3f arena3pos3 = new Vector3f(10, 0, 10);
    boolean arena3pos3isFull = false;
    SpawnPosition arena3pos3spawn = new SpawnPosition(arena3pos1, arena3pos3isFull);
    Vector3f arena3pos4 = new Vector3f(10, 10, 10);
    boolean arena3pos4isFull = false;
    SpawnPosition arena3pos4spawn = new SpawnPosition(arena3pos1, arena3pos4isFull);
    SpawnPosition[] arena3spawns = {arena3pos1spawn, arena3pos2spawn, arena3pos3spawn, arena3pos4spawn};
    boolean arena3isFull = false;

    Vector3f arena4pos1 = new Vector3f(0, 0, 10);
    boolean arena4pos1isFull = false;
    SpawnPosition arena4pos1spawn = new SpawnPosition(arena4pos1, arena4pos1isFull);
    Vector3f arena4pos2 = new Vector3f(0, 10, 10);
    boolean arena4pos2isFull = false;
    SpawnPosition arena4pos2spawn = new SpawnPosition(arena4pos2, arena4pos2isFull);
    Vector3f arena4pos3 = new Vector3f(10, 0, 10);
    boolean arena4pos3isFull = false;
    SpawnPosition arena4pos3spawn = new SpawnPosition(arena4pos1, arena4pos3isFull);
    Vector3f arena4pos4 = new Vector3f(10, 10, 10);
    boolean arena4pos4isFull = false;
    SpawnPosition arena4pos4spawn = new SpawnPosition(arena4pos1, arena4pos4isFull);
    SpawnPosition[] arena4spawns = {arena4pos1spawn, arena4pos2spawn, arena4pos3spawn, arena4pos4spawn};
    boolean arena4isFull = false;

    public Arena arena1 = new Arena(arena1pos1spawn, arena1pos2spawn, arena1pos3spawn, arena1pos4spawn, arena1spawns, arena1isFull);
    public Arena arena2 = new Arena(arena2pos1spawn, arena2pos2spawn, arena2pos3spawn, arena2pos4spawn, arena2spawns, arena2isFull);
    public Arena arena3 = new Arena(arena3pos1spawn, arena3pos2spawn, arena3pos3spawn, arena3pos4spawn, arena3spawns, arena3isFull);
    public Arena arena4 = new Arena(arena4pos1spawn, arena4pos2spawn, arena4pos3spawn, arena4pos4spawn, arena4spawns, arena4isFull);

    public Arena[] Arenas = {arena1, arena2, arena3, arena4};

    public void CheckArenas(Player player) {
        float posX = arena1.spawns[0].pos.GetX();
        System.out.print(posX);
        String posXmsg = String.valueOf(posX);

        //player.sendMessage("Noget: " + Float.toString(arena1.spawns.length));
        player.sendMessage("Starting");
        player.sendMessage(posXmsg);
        player.sendMessage(Float.toString(arena1.spawns[0].pos.GetX()));
        player.sendMessage(Float.toString(arena1.spawns.length));
        for (int i = 0; i < Arenas.length; i++) {
            player.sendMessage("1");
            if (!Arenas[i].isFull) {
                player.sendMessage("2");
                Arena arena = Arenas[i];
                for (int a = 0; a < arena.spawns.length; a++) {
                    player.sendMessage("3");
                    if (!arena.spawns[a].isPosFull) {
                        player.sendMessage("4");
                        SpawnPosition spawn = arena.spawns[a];
                        player.sendMessage("We're moving you!");
                        MovePlayer(player, spawn.pos);
                        spawn.isPosFull = true;
                        return;
                    }
                }
            }
        }
    }

    public void MovePlayer(Player player, Vector3f pos) {
        //player.teleport(new Location(player.getWorld(), arena.pos1.x, arena.pos1.y, arena.pos1.z));
        player.sendMessage("We're now teleportning you");
        player.teleport(new Location(player.getWorld(), pos.GetX(), pos.GetY(), pos.GetZ()));
        player.sendMessage("You have been teleported");
    }

}
