package y3;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.CancellationSignal;
import java.io.File;
import kotlin.jvm.internal.C6496s;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f28724a = new b();

    private b() {
    }

    public static final boolean a(File file) {
        C6496s.h(file, "file");
        return SQLiteDatabase.deleteDatabase(file);
    }

    public static final boolean b(SQLiteDatabase sQLiteDatabase) {
        C6496s.h(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    public static final Cursor c(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, CancellationSignal cancellationSignal, SQLiteDatabase.CursorFactory cursorFactory) {
        C6496s.h(sQLiteDatabase, "sQLiteDatabase");
        C6496s.h(str, "sql");
        C6496s.h(strArr, "selectionArgs");
        C6496s.h(cancellationSignal, "cancellationSignal");
        C6496s.h(cursorFactory, "cursorFactory");
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, str, strArr, str2, cancellationSignal);
        C6496s.g(rawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return rawQueryWithFactory;
    }

    public static final void d(SQLiteOpenHelper sQLiteOpenHelper, boolean z10) {
        C6496s.h(sQLiteOpenHelper, "sQLiteOpenHelper");
        sQLiteOpenHelper.setWriteAheadLoggingEnabled(z10);
    }
}
