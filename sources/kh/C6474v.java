package kh;

import Tg.a;
import gh.C5978b;
import ih.e;
import ih.f;
import kotlin.jvm.internal.C6496s;

/* renamed from: kh.v  reason: case insensitive filesystem */
public final class C6474v implements C5978b {

    /* renamed from: a  reason: collision with root package name */
    public static final C6474v f71710a = new C6474v();

    /* renamed from: b  reason: collision with root package name */
    private static final f f71711b = new p0("kotlin.time.Duration", e.i.f68482a);

    private C6474v() {
    }

    public long a(jh.e eVar) {
        C6496s.h(eVar, "decoder");
        return a.f65168b.c(eVar.B());
    }

    public void b(jh.f fVar, long j10) {
        C6496s.h(fVar, "encoder");
        fVar.F(a.R(j10));
    }

    public /* bridge */ /* synthetic */ Object deserialize(jh.e eVar) {
        return a.f(a(eVar));
    }

    public f getDescriptor() {
        return f71711b;
    }

    public /* bridge */ /* synthetic */ void serialize(jh.f fVar, Object obj) {
        b(fVar, ((a) obj).X());
    }
}
