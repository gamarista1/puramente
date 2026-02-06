package z3;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import yf.r;

/* renamed from: z3.b  reason: case insensitive filesystem */
public final /* synthetic */ class C2977b implements SQLiteDatabase.CursorFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f29297a;

    public /* synthetic */ C2977b(r rVar) {
        this.f29297a = rVar;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return C2978c.n(this.f29297a, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }
}
