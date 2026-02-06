package androidx.work.impl;

import android.content.ContentValues;
import kotlin.jvm.internal.C6496s;
import v3.C2755a;
import y3.g;

/* renamed from: androidx.work.impl.b  reason: case insensitive filesystem */
public final class C1842b implements C2755a {
    public void a(g gVar) {
        C6496s.h(gVar, "db");
        gVar.z("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        gVar.S0("WorkSpec", 3, contentValues, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }
}
