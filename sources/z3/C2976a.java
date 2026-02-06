package z3;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import y3.j;

/* renamed from: z3.a  reason: case insensitive filesystem */
public final /* synthetic */ class C2976a implements SQLiteDatabase.CursorFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f29296a;

    public /* synthetic */ C2976a(j jVar) {
        this.f29296a = jVar;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return C2978c.o(this.f29296a, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }
}
