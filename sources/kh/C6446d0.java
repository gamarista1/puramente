package kh;

import gh.C5978b;
import ih.f;
import jh.e;
import kotlin.jvm.internal.C6496s;

/* renamed from: kh.d0  reason: case insensitive filesystem */
public final class C6446d0 implements C5978b {

    /* renamed from: a  reason: collision with root package name */
    private final C5978b f71647a;

    /* renamed from: b  reason: collision with root package name */
    private final f f71648b;

    public C6446d0(C5978b bVar) {
        C6496s.h(bVar, "serializer");
        this.f71647a = bVar;
        this.f71648b = new s0(bVar.getDescriptor());
    }

    public Object deserialize(e eVar) {
        C6496s.h(eVar, "decoder");
        if (eVar.D()) {
            return eVar.n(this.f71647a);
        }
        return eVar.j();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6446d0.class != obj.getClass() || !C6496s.c(this.f71647a, ((C6446d0) obj).f71647a)) {
            return false;
        }
        return true;
    }

    public f getDescriptor() {
        return this.f71648b;
    }

    public int hashCode() {
        return this.f71647a.hashCode();
    }

    public void serialize(jh.f fVar, Object obj) {
        C6496s.h(fVar, "encoder");
        if (obj != null) {
            fVar.z();
            fVar.m(this.f71647a, obj);
            return;
        }
        fVar.r();
    }
}
