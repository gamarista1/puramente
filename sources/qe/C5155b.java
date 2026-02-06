package qe;

import Ff.p;
import ae.C4464a;
import expo.modules.kotlin.jni.ExpectedType;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import lf.C6531o;

/* renamed from: qe.b  reason: case insensitive filesystem */
public final class C5155b {

    /* renamed from: a  reason: collision with root package name */
    private final p f61414a;

    /* renamed from: b  reason: collision with root package name */
    private final Lazy f61415b = C6531o.b(new C5154a(this));

    public C5155b(p pVar) {
        C6496s.h(pVar, "kType");
        this.f61414a = pVar;
    }

    /* access modifiers changed from: private */
    public static final Y c(C5155b bVar) {
        return b0.f61416a.a(bVar.f61414a);
    }

    private final Y d() {
        return (Y) this.f61415b.getValue();
    }

    public final Object b(Object obj, C4464a aVar) {
        return d().a(obj, aVar);
    }

    public final ExpectedType e() {
        return d().b();
    }

    public final p f() {
        return this.f61414a;
    }
}
