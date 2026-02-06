package z3;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import y3.h;
import z3.C2979d;

/* renamed from: z3.e  reason: case insensitive filesystem */
public final /* synthetic */ class C2980e implements DatabaseErrorHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h.a f29331a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C2979d.b f29332b;

    public /* synthetic */ C2980e(h.a aVar, C2979d.b bVar) {
        this.f29331a = aVar;
        this.f29332b = bVar;
    }

    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        C2979d.c.b(this.f29331a, this.f29332b, sQLiteDatabase);
    }
}
