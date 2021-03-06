package com.skyerzz.hypixellib.util.games.copsandcrims;

import com.skyerzz.hypixellib.util.network.Currency;

/**
 * Created by sky on 10-8-2016.
 */
public class Knife {

    private int damageIncrease, attackDelay;
    private KnifeSkin knifeSkin;

    public Knife(KnifeSkin knifeSkin, int damageIncrease, int attackDelay){
        this.knifeSkin = knifeSkin;
        this.damageIncrease = damageIncrease;
        this.attackDelay = attackDelay;
    }

    public int getDamageIncrease() {
        return damageIncrease;
    }

    public int getCost(int level){
        double multiplier = 2;
        switch(level){
            case 1:
                return (int) (50*multiplier);
            case 2:
                return (int) (100*multiplier);
            case 3:
                return (int) (250*multiplier);
            case 4:
                return (int) (625*multiplier);
            case 5:
                return (int) (1550*multiplier);
            case 6:
                return (int) (4000*multiplier);
            case 7:
                return (int) (10000*multiplier);
            case 8:
                return (int) (25000*multiplier);
            case 9:
                return (int) (90000*multiplier);
            default: return 0;
        }
    }

    public Currency getCurrencyType(){
        return Currency.COINS;
    }

    public int getAttackDelay() {
        return attackDelay;
    }

    public KnifeSkin getKnifeSkin() {
        return knifeSkin;
    }
}
