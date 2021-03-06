package com.skyerzz.hypixellib.util.hypixelapi.playerstats;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.skyerzz.hypixellib.Logger;
import com.skyerzz.hypixellib.OutDated;
import com.skyerzz.hypixellib.util.games.walls.AdvancedStarter;
import com.skyerzz.hypixellib.util.games.walls.BasicStarter;
import com.skyerzz.hypixellib.util.games.walls.Perk;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Skyerzz-LAPOTOP on 13/12/2016.
 */
public class PlayerWallsStats extends PlayerGameStats {

    public PlayerWallsStats(JsonObject json) {
        super(json);
    }

    //<editor-fold desc="[Globals]">
    private boolean blood;

    private int coins, wins, deaths, kills, losses;

    private HashMap<AdvancedStarter, Integer> advancedStarters = new HashMap<>();
    private HashMap<Perk, Integer> perks = new HashMap<>();
    private HashMap<BasicStarter, Integer> basicStarters = new HashMap<>();

    @OutDated
    private int monthly_wins_a, monthly_wins_b, weekly_wins_a, weekly_wins_b, monthly_kills_a, monthly_kills_b, weekly_kills_a, weekly_kills_b;
    //</editor-fold>

    private void initialize() {
        for (Map.Entry<String, JsonElement> e : json.entrySet()) {

            String key = e.getKey().toUpperCase();
            if (setValue(key, e.getValue())) {
                continue;
            } else if (setSpecialValue(key, e.getValue())) {
                continue;
            }

            Logger.logWarn("[PlayerAPI.Walls.initialize] Unknown value: " + key);
        }
    }

    private boolean setValue(String key, JsonElement element) {
        switch (key.trim()) {
            //<editor-fold desc="[standards]">
            case "COINS":
                this.coins = element.getAsInt();
                return true;
            case "WINS":
                this.wins = element.getAsInt();
                return true;
            case "LOSSES":
                this.losses = element.getAsInt();
                return true;
            case "KILLS":
                this.kills = element.getAsInt();
                return true;
            case "DEATHS":
                this.deaths = element.getAsInt();
                return true;
            //</editor-fold>


            //<editor-fold desc="[Outdated Items]">
            case "WEEKLY_KILLS_A":
                this.weekly_kills_a = element.getAsInt();
                return true;
            case "WEEKLY_KILLS_B":
                this.weekly_kills_b = element.getAsInt();
                return true;
            case "MONTHLY_KILLS_A":
                this.monthly_kills_a = element.getAsInt();
                return true;
            case "MONTHLY_KILLS_B":
                this.monthly_kills_b = element.getAsInt();
                return true;
            case "WEEKLY_WINS_A":
                this.weekly_wins_a = element.getAsInt();
                return true;
            case "WEEKLY_WINS_B":
                this.weekly_wins_b = element.getAsInt();
                return true;
            case "MONTHLY_WINS_A":
                this.monthly_wins_a = element.getAsInt();
                return true;
            case "MONTHLY_WINS_B":
                this.monthly_wins_b = element.getAsInt();
                return true;
            //</editor-fold>
        }
        return false;
    }

    private boolean setSpecialValue(String key, JsonElement element){
        if(key.equals("PACKAGES")){
            setPackageValues(element.getAsJsonArray());
            return true;
        }
        if(AdvancedStarter.mapping.contains(key)){
            advancedStarters.put(AdvancedStarter.valueOf(key), element.getAsInt());
            return true;
        }
        if(BasicStarter.mapping.contains(key)){
            basicStarters.put(BasicStarter.valueOf(key), element.getAsInt());
            return true;
        }
        if(Perk.mapping.contains(key)){
            perks.put(Perk.valueOf(key), element.getAsInt());
        }
        return false;
    }

    private void setPackageValues(JsonArray array){

    }

    public boolean isBlood() {
        return blood;
    }

    public int getCoins() {
        return coins;
    }

    public int getWins() {
        return wins;
    }

    public int getDeaths() {
        return deaths;
    }

    public int getKills() {
        return kills;
    }

    public int getLosses() {
        return losses;
    }

    public HashMap<AdvancedStarter, Integer> getAdvancedStarters() {
        return advancedStarters;
    }

    public HashMap<Perk, Integer> getPerks() {
        return perks;
    }

    public HashMap<BasicStarter, Integer> getBasicStarters() {
        return basicStarters;
    }
    @OutDated
    public int getMonthly_wins_a() {
        return monthly_wins_a;
    }
    @OutDated
    public int getMonthly_wins_b() {
        return monthly_wins_b;
    }
    @OutDated
    public int getWeekly_wins_a() {
        return weekly_wins_a;
    }
    @OutDated
    public int getWeekly_wins_b() {
        return weekly_wins_b;
    }
    @OutDated
    public int getMonthly_kills_a() {
        return monthly_kills_a;
    }
    @OutDated
    public int getMonthly_kills_b() {
        return monthly_kills_b;
    }
    @OutDated
    public int getWeekly_kills_a() {
        return weekly_kills_a;
    }
    @OutDated
    public int getWeekly_kills_b() {
        return weekly_kills_b;
    }
}
