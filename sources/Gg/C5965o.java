package gg;

import Bg.C5323i;
import Bg.C5324j;
import Pg.c;
import kotlin.jvm.internal.C6496s;
import ng.b;

/* renamed from: gg.o  reason: case insensitive filesystem */
public final class C5965o implements C5324j {

    /* renamed from: a  reason: collision with root package name */
    private final C5972v f67801a;

    /* renamed from: b  reason: collision with root package name */
    private final C5964n f67802b;

    public C5965o(C5972v vVar, C5964n nVar) {
        C6496s.h(vVar, "kotlinClassFinder");
        C6496s.h(nVar, "deserializedDescriptorResolver");
        this.f67801a = vVar;
        this.f67802b = nVar;
    }

    public C5323i a(b bVar) {
        C6496s.h(bVar, "classId");
        C5974x b10 = C5973w.b(this.f67801a, bVar, c.a(this.f67802b.f().g()));
        if (b10 == null) {
            return null;
        }
        C6496s.c(b10.d(), bVar);
        return this.f67802b.l(b10);
    }
}
