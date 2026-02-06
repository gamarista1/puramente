package qe;

import Ff.p;
import Ff.r;
import ae.C4464a;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.types.Either;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.C6565s;

/* renamed from: qe.z  reason: case insensitive filesystem */
public final class C5178z extends S {

    /* renamed from: b  reason: collision with root package name */
    private final p f61471b;

    /* renamed from: c  reason: collision with root package name */
    private final p f61472c;

    /* renamed from: d  reason: collision with root package name */
    private final Y f61473d;

    /* renamed from: e  reason: collision with root package name */
    private final Y f61474e;

    /* renamed from: f  reason: collision with root package name */
    private final ExpectedType f61475f;

    /* renamed from: g  reason: collision with root package name */
    private final ExpectedType f61476g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5178z(Z z10, p pVar) {
        super(pVar.e());
        p pVar2;
        C6496s.h(z10, "converterProvider");
        C6496s.h(pVar, "eitherType");
        r rVar = (r) C6565s.r0(pVar.c(), 0);
        p pVar3 = null;
        if (rVar != null) {
            pVar2 = rVar.c();
        } else {
            pVar2 = null;
        }
        if (pVar2 != null) {
            this.f61471b = pVar2;
            r rVar2 = (r) C6565s.r0(pVar.c(), 1);
            pVar3 = rVar2 != null ? rVar2.c() : pVar3;
            if (pVar3 != null) {
                this.f61472c = pVar3;
                Y a10 = z10.a(pVar2);
                this.f61473d = a10;
                Y a11 = z10.a(pVar3);
                this.f61474e = a11;
                this.f61475f = a10.b();
                this.f61476g = a11.b();
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public ExpectedType b() {
        return this.f61475f.a(this.f61476g);
    }

    public boolean c() {
        return false;
    }

    /* renamed from: e */
    public Either d(Object obj, C4464a aVar) {
        C6496s.h(obj, "value");
        List q10 = C6565s.q(this.f61471b, this.f61472c);
        return new Either(obj, C6565s.h1(B.d(obj, aVar, C6565s.q(C6502A.a(this.f61475f, this.f61473d), C6502A.a(this.f61476g, this.f61474e)), q10)), q10);
    }
}
