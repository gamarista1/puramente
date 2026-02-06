package androidx.work.impl;

import androidx.work.C1835b;
import kotlin.jvm.internal.C6496s;
import u3.u;
import y3.g;

/* renamed from: androidx.work.impl.d  reason: case insensitive filesystem */
public final class C1844d extends u.b {

    /* renamed from: a  reason: collision with root package name */
    private final C1835b f18901a;

    public C1844d(C1835b bVar) {
        C6496s.h(bVar, "clock");
        this.f18901a = bVar;
    }

    private final long d() {
        return this.f18901a.currentTimeMillis() - E.f18761a;
    }

    private final String e() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + d() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public void c(g gVar) {
        C6496s.h(gVar, "db");
        super.c(gVar);
        gVar.g();
        try {
            gVar.z(e());
            gVar.j();
        } finally {
            gVar.k();
        }
    }
}
