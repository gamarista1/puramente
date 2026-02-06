package g9;

import android.database.sqlite.SQLiteDatabase;
import g9.M;

/* renamed from: g9.l  reason: case insensitive filesystem */
public final /* synthetic */ class C3554l implements M.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SQLiteDatabase f43735a;

    public /* synthetic */ C3554l(SQLiteDatabase sQLiteDatabase) {
        this.f43735a = sQLiteDatabase;
    }

    public final Object a() {
        return this.f43735a.beginTransaction();
    }
}
