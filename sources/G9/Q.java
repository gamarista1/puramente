package g9;

import android.database.sqlite.SQLiteDatabase;
import g9.U;

public final /* synthetic */ class Q implements U.a {
    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
