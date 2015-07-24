package academyteam.com.netmonsters;

import android.provider.BaseColumns;

/**
 * Created by James on 24/07/2015.
 */
public final class NETmonstersContract {
    public static final String CREATE_MONSTER_TABLE = "CREATE TABLE " + FeedMonsters.TABLE_NAME + " (" + FeedMonsters.COULMN_NAME_MONSTERID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + FeedMonsters.COULMN_NAME_MONSTER + " TEXT, " + FeedMonsters.COULMN_NAME_BODYELEMENT  + " TEXT, " + FeedMonsters.COULMN_NAME_ATTACKELEMENT + " TEXT, " + FeedMonsters.COULMN_NAME_DOB + " BIGINT, " + FeedMonsters.COULMN_NAME_POWER + " FLOAT, " + FeedMonsters.COULMN_NAME_MAXHEALTH + " FLOAT, " + FeedMonsters.COULMN_NAME_CURRENTHEALTH + " FLOAT, " + FeedMonsters.COULMN_NAME_SPEED + " FLOAT, " + FeedMonsters.COULMN_NAME_INTELIGENCE + " FLOAT, " + FeedMonsters.COULMN_NAME_EXPERIENCE + " FLOAT, " + FeedMonsters.COULMN_NAME_LEVEL + " INTEGER, " + FeedMonsters.COULMN_NAME_EVOLVELEVEL + " TEXT " + FeedMonsters.COULMN_NAME_RARITY + " INTEGER, " + FeedMonsters.COULMN_NAME_OBEDIENCE + " FLOAT, " + FeedMonsters.COULMN_NAME_MORALITY + " FLOAT, " + FeedMonsters.COULMN_NAME_WINRATIO + " FLOAT " + FeedMonsters.COULMN_NAME_OWNED + " BOOLEAN " + FeedMonsters.COULMN_NAME_IMAGAGEFRONT + " TEXT " + FeedMonsters.COULMN_NAME_IMAGEBACK + " TEXT )";
    public static final String CREATE_ATTACK_TABLE = "CREATE TABLE " + FeedAttacks.TABLE_NAME + " (" + FeedAttacks.COULMN_NAME_ATTACKID +  " INTEGER PRIMARY KEY AUTOINCREMENT, " + FeedAttacks.COULMN_NAME_ATTACKNAME + " TEXT, "  + FeedAttacks.COULMN_NAME_TYPE + " TEXT " + FeedAttacks.COULMN_NAME_MAXDAMAGE + " FLOAT " + FeedAttacks.COULMN_NAME_MINDAMAGE + " FLOAT " + FeedAttacks.COULMN_NAME_HITS + " INTEGER " + FeedAttacks.COULMN_NAME_EFFECT + "TEXT )";
    public static final String CREATE_GRAVEYARD_TABLE = "CREATE TABLE " + FeedGraveyard.TABLE_NAME + " (" + FeedGraveyard.COULMN_NAME_GRAVESTONEID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + FeedGraveyard.COULMN_NAME_MONSTERNAME + " TEXT " + FeedGraveyard.COULMN_NAME_BODYELEMENT + " TEXT " + FeedGraveyard.COULMN_NAME_ATTACKELEMENT + " TEXT " + FeedGraveyard.COULMN_NAME_DOB + " BIGINT " + FeedGraveyard.COULMN_NAME_DOD + " BIGINT " + FeedGraveyard.COULMN_NAME_LEVEL + " INTEGER " + FeedGraveyard.COULMN_NAME_MORALITY + " FLOAT " + FeedGraveyard.COULMN_NAME_RARITY + " INTEGER " + FeedGraveyard.COULMN_NAME_WINRATIO + " FLOAT )";

    public static  abstract class FeedMonsters implements BaseColumns {
        public static final String TABLE_NAME = "monsters";
        public static final String COULMN_NAME_MONSTERID = "mid";
        public static final String COULMN_NAME_MONSTER = "name";
        public static final String COULMN_NAME_BODYELEMENT = "bodyelement";
        public static final String COULMN_NAME_ATTACKELEMENT = "attackelement";
        public static final String COULMN_NAME_DOB = "dob";
        public static final String COULMN_NAME_EXPERIENCE = "experience";
        public static final String COULMN_NAME_LEVEL = "level";
        public static final String COULMN_NAME_RARITY = "rareity";
        public static final String COULMN_NAME_EVOLVELEVEL = "evolvelevel";
        public static final String COULMN_NAME_IMAGAGEFRONT = "imagefront";
        public static final String COULMN_NAME_IMAGEBACK = "imageback";
        public static final String COULMN_NAME_MAXHEALTH = "maxhealth";
        public static final String COULMN_NAME_CURRENTHEALTH = "currenthealth";
        public static final String COULMN_NAME_POWER = "power";
        public static final String COULMN_NAME_SPEED = "speed";
        public static final String COULMN_NAME_INTELIGENCE = "inteligence";
        public static final String COULMN_NAME_OBEDIENCE = "obedience";
        public static final String COULMN_NAME_MORALITY = "morality";
        public static final String COULMN_NAME_WINRATIO = "winratio";
        public static final String COULMN_NAME_OWNED = "owned";
    }

    public static abstract class FeedAttacks implements BaseColumns {
        public static final String TABLE_NAME = "attacks";
        public static final String COULMN_NAME_ATTACKID = "aid";
        public static final String COULMN_NAME_ATTACKNAME = "name";
        public static final String COULMN_NAME_MAXDAMAGE = "maxdamage";
        public static final String COULMN_NAME_MINDAMAGE = "mindamage";
        public static final String COULMN_NAME_HITS = "hits";
        public static final String COULMN_NAME_TYPE = "type";
        public static final String COULMN_NAME_EFFECT = "effect";
    }

    public static abstract class FeedGraveyard implements BaseColumns {
        public static final String TABLE_NAME = "graveyard";
        public static final String COULMN_NAME_GRAVESTONEID = "gid";
        public static final String COULMN_NAME_MONSTERNAME = "name";
        public static final String COULMN_NAME_WINRATIO = "winratio";
        public static final String COULMN_NAME_DOD = "dod";
        public static final String COULMN_NAME_DOB = "dob";
        public static final String COULMN_NAME_MORALITY = "morality";
        public static final String COULMN_NAME_LEVEL = "level";
        public static final String COULMN_NAME_RARITY = "rareity";
        public static final String COULMN_NAME_BODYELEMENT = "bodyelement";
        public static final String COULMN_NAME_ATTACKELEMENT = "attackelement";
    }
}
