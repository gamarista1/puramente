package androidx.work.impl;

import kotlin.jvm.internal.C6496s;
import v3.C2756b;
import y3.g;

/* renamed from: androidx.work.impl.l  reason: case insensitive filesystem */
public final class C1852l extends C2756b {

    /* renamed from: c  reason: collision with root package name */
    public static final C1852l f18937c = new C1852l();

    private C1852l() {
        super(3, 4);
    }

    public void a(g gVar) {
        C6496s.h(gVar, "db");
        gVar.z("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
