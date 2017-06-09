package database;

/**
 * Created by Giancarlo on 6/7/2017.
 */
import android.content.Context;
import android.database.sqlite.*;

public class DataBase extends SQLiteOpenHelper{

    public DataBase(Context context)
    {
        super(context, "EVENTOS", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL( ScriptSQL.getCreateEvent() );

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
