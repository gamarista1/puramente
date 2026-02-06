package qe;

import Ff.p;
import Ff.r;
import ae.C4464a;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.types.EitherOfThree;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.C6565s;

/* renamed from: qe.y  reason: case insensitive filesystem */
public final class C5177y extends S {

    /* renamed from: b  reason: collision with root package name */
    private final p f61462b;

    /* renamed from: c  reason: collision with root package name */
    private final p f61463c;

    /* renamed from: d  reason: collision with root package name */
    private final p f61464d;

    /* renamed from: e  reason: collision with root package name */
    private final Y f61465e;

    /* renamed from: f  reason: collision with root package name */
    private final Y f61466f;

    /* renamed from: g  reason: collision with root package name */
    private final Y f61467g;

    /* renamed from: h  reason: collision with root package name */
    private final ExpectedType f61468h;

    /* renamed from: i  reason: collision with root package name */
    private final ExpectedType f61469i;

    /* renamed from: j  reason: collision with root package name */
    private final ExpectedType f61470j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5177y(Z z10, p pVar) {
        super(pVar.e());
        p pVar2;
        p pVar3;
        C6496s.h(z10, "converterProvider");
        C6496s.h(pVar, "eitherType");
        r rVar = (r) C6565s.r0(pVar.c(), 0);
        p pVar4 = null;
        if (rVar != null) {
            pVar2 = rVar.c();
        } else {
            pVar2 = null;
        }
        if (pVar2 != null) {
            this.f61462b = pVar2;
            r rVar2 = (r) C6565s.r0(pVar.c(), 1);
            if (rVar2 != null) {
                pVar3 = rVar2.c();
            } else {
                pVar3 = null;
            }
            if (pVar3 != null) {
                this.f61463c = pVar3;
                r rVar3 = (r) C6565s.r0(pVar.c(), 2);
                pVar4 = rVar3 != null ? rVar3.c() : pVar4;
                if (pVar4 != null) {
                    this.f61464d = pVar4;
                    Y a10 = z10.a(pVar2);
                    this.f61465e = a10;
                    Y a11 = z10.a(pVar3);
                    this.f61466f = a11;
                    Y a12 = z10.a(pVar4);
                    this.f61467g = a12;
                    this.f61468h = a10.b();
                    this.f61469i = a11.b();
                    this.f61470j = a12.b();
                    return;
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public ExpectedType b() {
        return this.f61468h.a(this.f61469i).a(this.f61470j);
    }

    /* renamed from: e */
    public EitherOfThree d(Object obj, C4464a aVar) {
        C6496s.h(obj, "value");
        List q10 = C6565s.q(this.f61462b, this.f61463c, this.f61464d);
        return new EitherOfThree(obj, C6565s.h1(B.d(obj, aVar, C6565s.q(C6502A.a(this.f61468h, this.f61465e), C6502A.a(this.f61469i, this.f61466f), C6502A.a(this.f61470j, this.f61467g)), q10)), q10);
    }
}
