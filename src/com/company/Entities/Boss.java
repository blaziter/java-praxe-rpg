package com.company.Entities;

import com.company.Game.Game;
import com.company.Items.Armors;
import com.company.Items.Swords;

public enum Boss {
    DARIUS(new Enemy("Darius", Game.getDifficulty(), Races.HUMAN, Races.HUMAN.getRole()[0], Races.HUMAN.getHp()[0], Races.HUMAN.getDmg()[0], Swords.DD.getItem(), Armors.WA.getItem())),
    ZED(new Enemy("Zed", Game.getDifficulty(), Races.HUMAN, Races.HUMAN.getRole()[2], Races.HUMAN.getHp()[2], Races.HUMAN.getDmg()[2], Swords.DB.getItem(), Armors.RO.getItem())),
    JARVANIV(new Enemy("Jarvan IV", Game.getDifficulty(), Races.HUMAN, Races.HUMAN.getRole()[0], Races.HUMAN.getHp()[0], Races.HUMAN.getDmg()[0], Swords.DD.getItem(), Armors.SA.getItem())),
    KHAZIX(new Enemy("Kha'Zix", Game.getDifficulty(), Races.VOIDBORN, Races.VOIDBORN.getRole()[2], Races.VOIDBORN.getHp()[2], Races.VOIDBORN.getDmg()[2], Swords.DB.getItem(), Armors.RO.getItem())),
    CHOGATH(new Enemy("Cho'Gath", Game.getDifficulty(), Races.VOIDBORN, Races.VOIDBORN.getRole()[0], Races.VOIDBORN.getHp()[0], Races.VOIDBORN.getDmg()[0], Swords.DD.getItem(), Armors.FG.getItem())),
    KOGMAW(new Enemy("Kog'Maw", Game.getDifficulty(), Races.VOIDBORN, Races.VOIDBORN.getRole()[1], Races.VOIDBORN.getHp()[1], Races.VOIDBORN.getDmg()[1], Swords.BOTRK.getItem(), Armors.FN.getItem())),
    REKSAI(new Enemy("Rek'Sai", Game.getDifficulty(), Races.VOIDBORN, Races.VOIDBORN.getRole()[0], Races.VOIDBORN.getHp()[0], Races.VOIDBORN.getDmg()[0], Swords.DD.getItem(), Armors.SA.getItem())),
    MALPHITE(new Enemy("Malphite", Game.getDifficulty(), Races.GOLEM, Races.GOLEM.getRole()[0], Races.GOLEM.getHp()[0], Races.GOLEM.getDmg()[0] + Armors.FG.getItem().getArmor() / 2, Swords.DD.getItem(), Armors.FG.getItem())),
    TAHMKENCH(new Enemy("Tahm Kench", Game.getDifficulty(), Races.DEMON, Races.DEMON.getRole()[0], Races.DEMON.getHp()[0], Races.DEMON.getDmg()[0] + ((Armors.WA.getItem().getHp() / 100) * 2.5) + ((Races.DEMON.getHp()[0] / 100) * 1.5), Swords.WE.getItem(), Armors.WA.getItem())),
    TEEMO(new Enemy("Teemo", Game.getDifficulty(), Races.YORDLE, Races.YORDLE.getRole()[1], Races.YORDLE.getHp()[1], Races.YORDLE.getDmg()[0], Swords.BOTRK.getItem(), Armors.DP.getItem())),
    RENGAR(new Enemy("Rengar", Game.getDifficulty(), Races.VASTAYA, Races.VASTAYA.getRole()[1], Races.VASTAYA.getHp()[1], Races.VASTAYA.getDmg()[1], Swords.IE.getItem(), Armors.TC.getItem()))
    ;

    Enemy enemy;

    Boss(Enemy enemy) {
        this.enemy = enemy;
    }

    public Enemy getBoss() {
        return enemy;
    }
}
