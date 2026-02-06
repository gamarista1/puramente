package kh;

import gh.C5978b;
import ih.f;
import java.util.Iterator;
import jh.d;
import jh.e;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: kh.o0  reason: case insensitive filesystem */
public abstract class C6468o0 extends C6470q {

    /* renamed from: b  reason: collision with root package name */
    private final f f71691b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6468o0(C5978b bVar) {
        super(bVar, (DefaultConstructorMarker) null);
        C6496s.h(bVar, "primitiveSerializer");
        this.f71691b = new C6466n0(bVar.getDescriptor());
    }

    /* access modifiers changed from: protected */
    public final Iterator d(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    public final Object deserialize(e eVar) {
        C6496s.h(eVar, "decoder");
        return f(eVar, (Object) null);
    }

    public final f getDescriptor() {
        return this.f71691b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final C6464m0 a() {
        return (C6464m0) k(r());
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final int b(C6464m0 m0Var) {
        C6496s.h(m0Var, "<this>");
        return m0Var.d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void c(C6464m0 m0Var, int i10) {
        C6496s.h(m0Var, "<this>");
        m0Var.b(i10);
    }

    /* access modifiers changed from: protected */
    public abstract Object r();

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void n(C6464m0 m0Var, int i10, Object obj) {
        C6496s.h(m0Var, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public final void serialize(jh.f fVar, Object obj) {
        C6496s.h(fVar, "encoder");
        int e10 = e(obj);
        f fVar2 = this.f71691b;
        d e11 = fVar.e(fVar2, e10);
        u(e11, obj, e10);
        e11.c(fVar2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final Object l(C6464m0 m0Var) {
        C6496s.h(m0Var, "<this>");
        return m0Var.a();
    }

    /* access modifiers changed from: protected */
    public abstract void u(d dVar, Object obj, int i10);
}
