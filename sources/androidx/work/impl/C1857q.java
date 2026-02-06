package androidx.work.impl;

import androidx.lifecycle.D;
import androidx.work.impl.utils.futures.c;
import androidx.work.w;

/* renamed from: androidx.work.impl.q  reason: case insensitive filesystem */
public class C1857q implements w {

    /* renamed from: c  reason: collision with root package name */
    private final D f18942c = new D();

    /* renamed from: d  reason: collision with root package name */
    private final c f18943d = c.t();

    public C1857q() {
        a(w.f19042b);
    }

    public void a(w.b bVar) {
        this.f18942c.l(bVar);
        if (bVar instanceof w.b.c) {
            this.f18943d.p((w.b.c) bVar);
        } else if (bVar instanceof w.b.a) {
            this.f18943d.q(((w.b.a) bVar).a());
        }
    }
}
