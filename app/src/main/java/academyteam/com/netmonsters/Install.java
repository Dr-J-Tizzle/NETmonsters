package academyteam.com.netmonsters;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.sql.SQLException;

/**
 * Created by James on 24/07/2015.
 */
public class Install {
    private DatabaseHelper databaseHelper;
    private SQLiteDatabase database;
    private Context context;

    public Install(Context context) {
        this.context = context;
        databaseHelper = new DatabaseHelper(context);
    }

    public void open() throws SQLException {
        database = databaseHelper.getWritableDatabase();
    }

    public long insertMonster(Monster monster) {
        ContentValues values = new ContentValues();
        values.put(NETmonstersContract.FeedMonsters.COULMN_NAME_MONSTER, monster.getName());
        values.put(NETmonstersContract.FeedMonsters.COULMN_NAME_BODYELEMENT, monster.getBodyElement().toString());
        values.put(NETmonstersContract.FeedMonsters.COULMN_NAME_ATTACKELEMENT, monster.getAttackElement().toString());
        values.put(NETmonstersContract.FeedMonsters.COULMN_NAME_DOB, monster.getDob());
        values.put(NETmonstersContract.FeedMonsters.COULMN_NAME_POWER, monster.getPower());
        values.put(NETmonstersContract.FeedMonsters.COULMN_NAME_MAXHEALTH, monster.getMaxhealth());
        values.put(NETmonstersContract.FeedMonsters.COULMN_NAME_CURRENTHEALTH, monster.getCurrenthealth());
        values.put(NETmonstersContract.FeedMonsters.COULMN_NAME_SPEED, monster.getSpeed());
        values.put(NETmonstersContract.FeedMonsters.COULMN_NAME_INTELIGENCE, monster.getInteligence());
        values.put(NETmonstersContract.FeedMonsters.COULMN_NAME_EXPERIENCE, monster.getExperience());
        values.put(NETmonstersContract.FeedMonsters.COULMN_NAME_LEVEL, monster.getLevel());
        values.put(NETmonstersContract.FeedMonsters.COULMN_NAME_RARITY, monster.getRareity());
        values.put(NETmonstersContract.FeedMonsters.COULMN_NAME_EVOLVELEVEL, monster.getEvolvelevel());
        values.put(NETmonstersContract.FeedMonsters.COULMN_NAME_OBEDIENCE, monster.getObedience());
        values.put(NETmonstersContract.FeedMonsters.COULMN_NAME_MORALITY, monster.getMorality());
        values.put(NETmonstersContract.FeedMonsters.COULMN_NAME_WINRATIO, monster.getWinratio());
        values.put(NETmonstersContract.FeedMonsters.COULMN_NAME_IMAGAGEFRONT, monster.getImageFront());
        values.put(NETmonstersContract.FeedMonsters.COULMN_NAME_IMAGEBACK, monster.getImageBack());
        return database.insert(NETmonstersContract.FeedMonsters.TABLE_NAME, null, values);
    }

    public long insertAttack(Attack attack) {
        //TODO
        return 0;
    }

    public long buryMonster(Monster monster) {
        //TODO
        return 0;
    }

    public Monster[] findMyMonsters() {
        String[] result = {NETmonstersContract.FeedMonsters.COULMN_NAME_MONSTER, NETmonstersContract.FeedMonsters.COULMN_NAME_BODYELEMENT, NETmonstersContract.FeedMonsters.COULMN_NAME_ATTACKELEMENT, NETmonstersContract.FeedMonsters.COULMN_NAME_RARITY, NETmonstersContract.FeedMonsters.COULMN_NAME_EVOLVELEVEL, NETmonstersContract.FeedMonsters.COULMN_NAME_IMAGAGEFRONT, NETmonstersContract.FeedMonsters.COULMN_NAME_IMAGEBACK, NETmonstersContract.FeedMonsters.COULMN_NAME_MAXHEALTH, NETmonstersContract.FeedMonsters.COULMN_NAME_CURRENTHEALTH, NETmonstersContract.FeedMonsters.COULMN_NAME_DOB, NETmonstersContract.FeedMonsters.COULMN_NAME_POWER, NETmonstersContract.FeedMonsters.COULMN_NAME_SPEED, NETmonstersContract.FeedMonsters.COULMN_NAME_INTELIGENCE, NETmonstersContract.FeedMonsters.COULMN_NAME_OBEDIENCE, NETmonstersContract.FeedMonsters.COULMN_NAME_MORALITY, NETmonstersContract.FeedMonsters.COULMN_NAME_EXPERIENCE, NETmonstersContract.FeedMonsters.COULMN_NAME_LEVEL,NETmonstersContract.FeedMonsters.COULMN_NAME_WINRATIO};
        Cursor cursor = database.rawQuery("SELECT * FROM " + NETmonstersContract.FeedMonsters.TABLE_NAME + " WHERE " + NETmonstersContract.FeedMonsters.COULMN_NAME_OWNED + " := true", new String[]{"true"});
        cursor.moveToFirst();
        Monster monster1 = new Monster(cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getInt(3),  cursor.getInt(4), cursor.getString(5), cursor.getString(6), cursor.getInt(7), cursor.getInt(8), cursor.getLong(9), cursor.getInt(10), cursor.getInt(11), cursor.getInt(12), cursor.getInt(13), cursor.getInt(14), cursor.getInt(15), cursor.getInt(16), cursor.getInt(17));
        cursor.moveToNext();
        Monster monster2 = new Monster(cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getInt(3),  cursor.getInt(4), cursor.getString(5), cursor.getString(6), cursor.getInt(7), cursor.getInt(8), cursor.getLong(9), cursor.getInt(10), cursor.getInt(11), cursor.getInt(12), cursor.getInt(13), cursor.getInt(14), cursor.getInt(15), cursor.getInt(16), cursor.getInt(17));
        cursor.moveToNext();
        Monster monster3 = new Monster(cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getInt(3),  cursor.getInt(4), cursor.getString(5), cursor.getString(6), cursor.getInt(7), cursor.getInt(8), cursor.getLong(9), cursor.getInt(10), cursor.getInt(11), cursor.getInt(12), cursor.getInt(13), cursor.getInt(14), cursor.getInt(15), cursor.getInt(16), cursor.getInt(17));
        Monster[] m = {monster1, monster2, monster3};
        return  m;
    }

    private static class DatabaseHelper extends SQLiteOpenHelper {
        DatabaseHelper(Context context) {
            super(context, "0NETmonstersDB", null, 1);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            try {
                db.execSQL(NETmonstersContract.CREATE_MONSTER_TABLE);
                db.execSQL(NETmonstersContract.CREATE_ATTACK_TABLE);
                db.execSQL(NETmonstersContract.CREATE_GRAVEYARD_TABLE);
            } catch(Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            onCreate(db);
        }

        @Override
        public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            onCreate(db);
        }
    }
}