package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

final class S1 extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ P1 f54857a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    S1(P1 p12, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.f54857a = p12;
    }

    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e10) {
            throw e10;
        } catch (SQLiteException unused) {
            this.f54857a.zzj().B().a("Opening the local database failed, dropping and recreating it");
            if (!this.f54857a.zza().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f54857a.zzj().B().b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e11) {
                this.f54857a.zzj().B().b("Failed to open local database. Events will bypass local storage", e11);
                return null;
            }
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C4695t.b(this.f54857a.zzj(), sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        C4695t.c(this.f54857a.zzj(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", (String[]) null);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
