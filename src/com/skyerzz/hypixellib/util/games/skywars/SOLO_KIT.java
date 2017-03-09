package com.skyerzz.hypixellib.util.games.skywars;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.items.all.Item;
import com.skyerzz.hypixellib.util.items.all.ItemStack;
import com.skyerzz.hypixellib.util.items.all.Material;

import java.util.ArrayList;

/**
 * Created by Skyerzz-LAPOTOP on 20/12/2016.
 */
public enum SOLO_KIT {
    DEFAULT("Default", null),
    ARMORER("Armorer", RARITY.RARE),
    ARMORSMITH("Armorsmith", RARITY.COMMON),
    CANNONEER("Cannoneer", RARITY.LEGENDARY),
    ECOLOGIST("Ecologist", RARITY.COMMON),
    ENCHANTER("Enchanter", RARITY.COMMON),
    ENDERCHEST("Enderchest", RARITY.RARE),
    ENDERMAN("Enderman", RARITY.LEGENDARY),
    FARMER("Farmer", RARITY.RARE),
    FISHERMAN("Fisherman", RARITY.RARE),
    HUNTER("Hunter", RARITY.RARE),
    KNIGHT("Knight", RARITY.RARE),
    PHARAOH("Pharaoh", RARITY.RARE),
    PYRO("Pyro", RARITY.LEGENDARY),
    ROOKIE("Rookie", RARITY.COMMON),
    SNOWMAN("Snowman", RARITY.RARE),
    SPELEOLOGIST("Speleologist", RARITY.RARE),
    TROLL("Troll", RARITY.LEGENDARY),
    BATGUY("Batguy", RARITY.COMMON),
    DISCO("Disco", RARITY.COMMON),
    ENERGIX("Energix", RARITY.COMMON),
    FROG("Frog", RARITY.COMMON),
    GRENADE("Grenade", RARITY.COMMON),
    SCOUT("Scout", RARITY.COMMON),
    PRINCESS("Princess", RARITY.RARE),
    BASEBALL_PLAYER("Baseball Player", RARITY.RARE);


    private String displayName;
    private RARITY rarity;

    SOLO_KIT(String displayName, RARITY rarity){
        this.displayName = displayName;
        this.rarity = rarity;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(SOLO_KIT item: SOLO_KIT.values()){
            list.add(item.name());
        }
        return list;
    }

    public String getDisplayName(){
        return displayName;
    }

    public int getCost(){
        switch(this.rarity){
            case COMMON:
                return 15000;
            case RARE:
                return 20000;
            case LEGENDARY:
                return 30000;
        }
        return -1;
    }

    public RARITY getRarity(){
        return rarity;
    }

    public CURRENCY getCurrencyType(){ return CURRENCY.COINS; }

    public ArrayList<ItemStack> getKitItems(){
        ArrayList<ItemStack> kit = new ArrayList<>();
        switch(this){
            //<editor-fold desc="[Kits]">
            case ARMORER:
                kit.add(Item.goldChest);
                kit.add(Item.goldLeggings);
                kit.add(Item.goldBoots);
                return kit;
            case ARMORSMITH:
                kit.add(Item.anvil);
                kit.add(new ItemStack(Item.enchantedBookProt3Sharp1, 1));
                kit.add(Item.diamondHelmet);
                return kit;
            case CANNONEER:
                kit.add(new ItemStack(Item.TNT, 16));
                kit.add(new ItemStack(Item.redstone, 32));
                kit.add(Item.ironBootsFf3Bprot3);
                kit.add(Item.waterBucket);
                return kit;
            case ECOLOGIST:
                kit.add(Item.ironAxeEff1);
                kit.add(new ItemStack(Item.oakLog, 16));
                return kit;
            case ENCHANTER:
                kit.add(Item.enchantmentTable);
                kit.add(new ItemStack(Item.bookCase, 8));
                kit.add(new ItemStack(Item.expBottle, 64));
                return kit;
            case ENDERCHEST:
                kit.add(new ItemStack(Item.goldenApple));
                kit.add(new ItemStack(new Item("Spawns a 4th chest with spawm loot below the cage", Material.CHEST)));
                return kit;
            case ENDERMAN:
                kit.add(new ItemStack(new Item("Corrupted Pearl (60s cooldown)", Material.ENDER_PEARL), 1));
                return kit;
            case FARMER:
                kit.add(Item.ironLeggingsProjProt3);
                kit.add(new ItemStack(Item.egg, 64));
                kit.add(new ItemStack(Item.goldenApple, 1));
                return kit;
            case FISHERMAN:
                kit.add(Item.fishingRodUnbreaking10Knockback1);
                kit.add(new ItemStack(Item.cookedFish, 16));
                return kit;
            case HUNTER:
                kit.add(Item.bow);
                kit.add(new ItemStack(Item.arrow, 10));
                return kit;
            case KNIGHT:
                kit.add(Item.goldSwordUnbreaking5Sharp2);
                kit.add(Item.goldHelmetProt1);
                return kit;
            case PHARAOH:
                kit.add(Item.goldHelmet);
                kit.add(Item.whiteLeatherChest);
                kit.add(new ItemStack(Item.beacon, 1));
                kit.add(new ItemStack(Item.emeraldBlock, 42));
                return kit;
            case PYRO:
                kit.add(Item.flintNSteelUnbreaking10);
                kit.add(Item.lavaBucket);
                kit.add(Item.lavaBucket);
                kit.add(Item.lavaBucket);
                kit.add(Item.lavaBucket);
                kit.add(Item.lavaBucket);
                //todo find fire res potion dureation + strength
                kit.add(Item.ironChest);
                return kit;
            case ROOKIE:
                kit.add(Item.leatherChest);
                kit.add(Item.leatherHelmet);
                kit.add(Item.leatherLeggings);
                kit.add(Item.leatherBoots);
                kit.add(new ItemStack(Item.glass, 16));
                kit.add(new ItemStack(Item.steak, 1));
                return kit;
            case SNOWMAN:
                kit.add(new ItemStack(Item.snowball, 16));
                kit.add(new ItemStack(Item.snow, 2));
                kit.add(Item.ironShovelUnbreaking3);
                kit.add(new ItemStack(Item.pumpkin, 1));
                return kit;
            case SPELEOLOGIST:
                kit.add(Item.ironPickEff3Sharp1Unbreaking3);
                kit.add(new ItemStack(Item.stone, 16));
                return kit;
            case TROLL:
                kit.add(new ItemStack(Item.cobweb, 16));
                kit.add(new ItemStack(Item.firework, 5));
                kit.add(Item.pinkLeatherHelmet);
                kit.add(Item.pinkLeatherChest);
                kit.add(Item.pinkLeatherLeggings);
                kit.add(Item.pinkLeatherBoots);
                return kit;
            case BATGUY:
                kit.add(Item.leatherHelmet);
                kit.add(Item.leatherChest);
                kit.add(Item.leatherLeggings);
                kit.add(Item.leatherBoots);
                kit.add(new ItemStack(Item.batEgg, 5));
                //todo find out what Batguy's potion is
                return kit;
            case DISCO:
                kit.add(Item.goldHelmetProjProt4);
                kit.add(Item.leatherChestProt2Thorns3);
                kit.add(Item.leatherLeggings);
                kit.add(Item.leatherBootsFf10);
                kit.add(new ItemStack(Item.jukebox, 1));
                kit.add(new ItemStack(Item.noteBlock, 12));
                kit.add(new ItemStack(new Item("Random Music Disc", Material.RECORD_3)));
                return kit;
            case ENERGIX:
                //todo find out potion of strength length + type
                return kit;
            case FROG:
                kit.add(Item.leatherChest);
                kit.add(Item.leatherLeggings);
                kit.add(Item.leatherBoots);
                //todo find frogs potion durations and effects
                //todo make a frog head (JUST DO IT)
                return kit;
            case GRENADE:
                kit.add(new ItemStack(Item.creeperEgg, 1));//todo find if powered creeper or not
                return kit;
            case SCOUT:
                //todo find out level and duration of speed potions
                return kit;
            case PRINCESS:
                kit.add(Item.goldHelmetProt1);
                kit.add(Item.bowFlame1);
                kit.add(new ItemStack(Item.arrow, 1));
                kit.add(new ItemStack(new Item("Spawns with a chest filled with the latest fashion clothes", Material.CHEST)));
                return kit;
            case BASEBALL_PLAYER:
                kit.add(Item.ironHelmetProt1);
                kit.add(Item.woodSwordKnockback1);
                return kit;
            //</editor-fold>
        }
        return kit;
    }
}
