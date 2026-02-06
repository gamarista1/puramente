package androidx.work.impl;

import kotlin.jvm.internal.C6496s;
import v3.C2755a;
import y3.g;

/* renamed from: androidx.work.impl.c  reason: case insensitive filesystem */
public final class C1843c implements C2755a {
    public void a(g gVar) {
        C6496s.h(gVar, "db");
        gVar.z("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
    }
}
