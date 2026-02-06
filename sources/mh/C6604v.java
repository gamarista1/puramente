package mh;

import kotlin.jvm.internal.C6496s;
import lh.C6538b;

/* renamed from: mh.v  reason: case insensitive filesystem */
public final class C6604v extends C6596m {

    /* renamed from: c  reason: collision with root package name */
    private final C6538b f72222c;

    /* renamed from: d  reason: collision with root package name */
    private int f72223d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6604v(C6608z zVar, C6538b bVar) {
        super(zVar);
        C6496s.h(zVar, "writer");
        C6496s.h(bVar, "json");
        this.f72222c = bVar;
    }

    public void b() {
        o(true);
        this.f72223d++;
    }

    public void c() {
        o(false);
        k("\n");
        int i10 = this.f72223d;
        for (int i11 = 0; i11 < i10; i11++) {
            k(this.f72222c.f().m());
        }
    }

    public void d() {
        if (a()) {
            o(false);
        } else {
            c();
        }
    }

    public void p() {
        f(' ');
    }

    public void q() {
        this.f72223d--;
    }
}
