package w3;

import Sg.p;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import u3.u;
import wf.C6763c;
import y3.g;
import y3.j;

/* renamed from: w3.b  reason: case insensitive filesystem */
public abstract class C2833b {
    public static final void a(g gVar) {
        C6496s.h(gVar, "db");
        List c10 = C6565s.c();
        Cursor a12 = gVar.a1("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (a12.moveToNext()) {
            try {
                c10.add(a12.getString(0));
            } catch (Throwable th2) {
                C6763c.a(a12, th);
                throw th2;
            }
        }
        C6514M m10 = C6514M.f71813a;
        C6763c.a(a12, (Throwable) null);
        for (String str : C6565s.a(c10)) {
            C6496s.g(str, "triggerName");
            if (p.J(str, "room_fts_content_sync_", false, 2, (Object) null)) {
                gVar.z("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static final Cursor b(u uVar, j jVar, boolean z10, CancellationSignal cancellationSignal) {
        int i10;
        C6496s.h(uVar, "db");
        C6496s.h(jVar, "sqLiteQuery");
        Cursor x10 = uVar.x(jVar, cancellationSignal);
        if (!z10 || !(x10 instanceof AbstractWindowedCursor)) {
            return x10;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) x10;
        int count = abstractWindowedCursor.getCount();
        if (abstractWindowedCursor.hasWindow()) {
            i10 = abstractWindowedCursor.getWindow().getNumRows();
        } else {
            i10 = count;
        }
        if (i10 < count) {
            return C2832a.a(x10);
        }
        return x10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        wf.C6763c.a(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int c(java.io.File r8) {
        /*
            java.lang.String r0 = "databaseFile"
            kotlin.jvm.internal.C6496s.h(r8, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r8)
            java.nio.channels.FileChannel r8 = r0.getChannel()
            r0 = 4
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r0)     // Catch:{ all -> 0x0033 }
            r4 = 4
            r6 = 1
            r2 = 60
            r1 = r8
            r1.tryLock(r2, r4, r6)     // Catch:{ all -> 0x0033 }
            r1 = 60
            r8.position(r1)     // Catch:{ all -> 0x0033 }
            int r1 = r8.read(r7)     // Catch:{ all -> 0x0033 }
            if (r1 != r0) goto L_0x0035
            r7.rewind()     // Catch:{ all -> 0x0033 }
            int r0 = r7.getInt()     // Catch:{ all -> 0x0033 }
            r1 = 0
            wf.C6763c.a(r8, r1)
            return r0
        L_0x0033:
            r0 = move-exception
            goto L_0x003d
        L_0x0035:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = "Bad database header, unable to read 4 bytes at offset 60"
            r0.<init>(r1)     // Catch:{ all -> 0x0033 }
            throw r0     // Catch:{ all -> 0x0033 }
        L_0x003d:
            throw r0     // Catch:{ all -> 0x003e }
        L_0x003e:
            r1 = move-exception
            wf.C6763c.a(r8, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.C2833b.c(java.io.File):int");
    }
}
