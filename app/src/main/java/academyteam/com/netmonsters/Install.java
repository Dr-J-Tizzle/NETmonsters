package academyteam.com.netmonsters;

import android.content.ContentValues;
import android.content.Context;
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
        values.put(NETmonstersContract.FeedMonsters.COULMN_NAME_MONSTER, monster.getName());
        values.put(NETmonstersContract.FeedMonsters.COULMN_NAME_MONSTER, monster.getName());
        values.put(NETmonstersContract.FeedMonsters.COULMN_NAME_MONSTER, monster.getName());
        values.put(NETmonstersContract.FeedMonsters.COULMN_NAME_MONSTER, monster.getName());
        values.put(NETmonstersContract.FeedMonsters.COULMN_NAME_MONSTER, monster.getName());
        values.put(NETmonstersContract.FeedMonsters.COULMN_NAME_MONSTER, monster.getName());
        values.put(NETmonstersContract.FeedMonsters.COULMN_NAME_MONSTER, monster.getName());
        values.put(NETmonstersContract.FeedMonsters.COULMN_NAME_MONSTER, monster.getName());
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