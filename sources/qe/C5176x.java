package qe;

import Ff.p;
import Ff.r;
import ae.C4464a;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.types.EitherOfFour;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.C6565s;

/* renamed from: qe.x  reason: case insensitive filesystem */
public final class C5176x extends S {

    /* renamed from: b  reason: collision with root package name */
    private final p f61450b;

    /* renamed from: c  reason: collision with root package name */
    private final p f61451c;

    /* renamed from: d  reason: collision with root package name */
    private final p f61452d;

    /* renamed from: e  reason: collision with root package name */
    private final p f61453e;

    /* renamed from: f  reason: collision with root package name */
    private final Y f61454f;

    /* renamed from: g  reason: collision with root package name */
    private final Y f61455g;

    /* renamed from: h  reason: collision with root package name */
    private final Y f61456h;

    /* renamed from: i  reason: collision with root package name */
    private final Y f61457i;

    /* renamed from: j  reason: collision with root package name */
    private final ExpectedType f61458j;

    /* renamed from: k  reason: collision with root package name */
    private final ExpectedType f61459k;

    /* renamed from: l  reason: collision with root package name */
    private final ExpectedType f61460l;

    /* renamed from: m  reason: collision with root package name */
    private final ExpectedType f61461m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5176x(Z z10, p pVar) {
        super(pVar.e());
        p pVar2;
        p pVar3;
        p pVar4;
        C6496s.h(z10, "converterProvider");
        C6496s.h(pVar, "eitherType");
        r rVar = (r) C6565s.r0(pVar.c(), 0);
        p pVar5 = null;
        if (rVar != null) {
            pVar2 = rVar.c();
        } else {
            pVar2 = null;
        }
        if (pVar2 != null) {
            this.f61450b = pVar2;
            r rVar2 = (r) C6565s.r0(pVar.c(), 1);
            if (rVar2 != null) {
                pVar3 = rVar2.c();
            } else {
                pVar3 = null;
            }
            if (pVar3 != null) {
                this.f61451c = pVar3;
                r rVar3 = (r) C6565s.r0(pVar.c(), 2);
                if (rVar3 != null) {
                    pVar4 = rVar3.c();
                } else {
                    pVar4 = null;
                }
                if (pVar4 != null) {
                    this.f61452d = pVar4;
                    r rVar4 = (r) C6565s.r0(pVar.c(), 3);
                    pVar5 = rVar4 != null ? rVar4.c() : pVar5;
                    if (pVar5 != null) {
                        this.f61453e = pVar5;
                        Y a10 = z10.a(pVar2);
                        this.f61454f = a10;
                        Y a11 = z10.a(pVar3);
                        this.f61455g = a11;
                        Y a12 = z10.a(pVar4);
                        this.f61456h = a12;
                        Y a13 = z10.a(pVar5);
                        this.f61457i = a13;
                        this.f61458j = a10.b();
                        this.f61459k = a11.b();
                        this.f61460l = a12.b();
                        this.f61461m = a13.b();
                        return;
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public ExpectedType b() {
        return this.f61458j.a(this.f61459k).a(this.f61460l);
    }

    /* renamed from: e */
    public EitherOfFour d(Object obj, C4464a aVar) {
        C6496s.h(obj, "value");
        return new EitherOfFour(obj, C6565s.h1(B.d(obj, aVar, C6565s.q(C6502A.a(this.f61458j, this.f61454f), C6502A.a(this.f61459k, this.f61455g), C6502A.a(this.f61460l, this.f61456h), C6502A.a(this.f61461m, this.f61457i)), C6565s.q(this.f61450b, this.f61451c, this.f61452d, this.f61453e))), C6565s.q(this.f61450b, this.f61451c, this.f61452d, this.f61453e));
    }
}
