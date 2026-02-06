package Bg;

import Dg.C5357s;
import Eg.n;
import Gg.p;
import Of.C5487e;
import Of.H;
import Of.M;
import Of.N;
import Of.O;
import Qf.a;
import Wf.c;
import java.util.List;
import kg.C6434a;
import kg.C6436c;
import kg.g;
import kg.h;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import ng.b;
import pg.C6645g;
import xg.C6783a;

/* renamed from: Bg.n  reason: case insensitive filesystem */
public final class C5328n {

    /* renamed from: a  reason: collision with root package name */
    private final n f62545a;

    /* renamed from: b  reason: collision with root package name */
    private final H f62546b;

    /* renamed from: c  reason: collision with root package name */
    private final C5329o f62547c;

    /* renamed from: d  reason: collision with root package name */
    private final C5324j f62548d;

    /* renamed from: e  reason: collision with root package name */
    private final C5319e f62549e;

    /* renamed from: f  reason: collision with root package name */
    private final O f62550f;

    /* renamed from: g  reason: collision with root package name */
    private final B f62551g;

    /* renamed from: h  reason: collision with root package name */
    private final C5336w f62552h;

    /* renamed from: i  reason: collision with root package name */
    private final c f62553i;

    /* renamed from: j  reason: collision with root package name */
    private final C5337x f62554j;

    /* renamed from: k  reason: collision with root package name */
    private final Iterable f62555k;

    /* renamed from: l  reason: collision with root package name */
    private final M f62556l;

    /* renamed from: m  reason: collision with root package name */
    private final C5327m f62557m;

    /* renamed from: n  reason: collision with root package name */
    private final a f62558n;

    /* renamed from: o  reason: collision with root package name */
    private final Qf.c f62559o;

    /* renamed from: p  reason: collision with root package name */
    private final C6645g f62560p;

    /* renamed from: q  reason: collision with root package name */
    private final p f62561q;

    /* renamed from: r  reason: collision with root package name */
    private final C6783a f62562r;

    /* renamed from: s  reason: collision with root package name */
    private final List f62563s;

    /* renamed from: t  reason: collision with root package name */
    private final C5335v f62564t;

    /* renamed from: u  reason: collision with root package name */
    private final C5326l f62565u;

    public C5328n(n nVar, H h10, C5329o oVar, C5324j jVar, C5319e eVar, O o10, B b10, C5336w wVar, c cVar, C5337x xVar, Iterable iterable, M m10, C5327m mVar, a aVar, Qf.c cVar2, C6645g gVar, p pVar, C6783a aVar2, List list, C5335v vVar) {
        n nVar2 = nVar;
        H h11 = h10;
        C5329o oVar2 = oVar;
        C5324j jVar2 = jVar;
        C5319e eVar2 = eVar;
        O o11 = o10;
        B b11 = b10;
        C5336w wVar2 = wVar;
        c cVar3 = cVar;
        C5337x xVar2 = xVar;
        Iterable iterable2 = iterable;
        M m11 = m10;
        C5327m mVar2 = mVar;
        a aVar3 = aVar;
        C6645g gVar2 = gVar;
        C6496s.h(nVar2, "storageManager");
        C6496s.h(h11, "moduleDescriptor");
        C6496s.h(oVar2, "configuration");
        C6496s.h(jVar2, "classDataFinder");
        C6496s.h(eVar2, "annotationAndConstantLoader");
        C6496s.h(o11, "packageFragmentProvider");
        C6496s.h(b11, "localClassifierTypeSettings");
        C6496s.h(wVar2, "errorReporter");
        C6496s.h(cVar3, "lookupTracker");
        C6496s.h(xVar2, "flexibleTypeDeserializer");
        C6496s.h(iterable2, "fictitiousClassDescriptorFactories");
        C6496s.h(m11, "notFoundClasses");
        C6496s.h(mVar2, "contractDeserializer");
        C6496s.h(aVar3, "additionalClassPartsProvider");
        C6496s.h(cVar2, "platformDependentDeclarationFilter");
        C6496s.h(gVar, "extensionRegistryLite");
        C6496s.h(pVar, "kotlinTypeChecker");
        C6496s.h(aVar2, "samConversionResolver");
        C6496s.h(list, "typeAttributeTranslators");
        C6496s.h(vVar, "enumEntriesDeserializationSupport");
        this.f62545a = nVar2;
        this.f62546b = h11;
        this.f62547c = oVar2;
        this.f62548d = jVar2;
        this.f62549e = eVar2;
        this.f62550f = o11;
        this.f62551g = b11;
        this.f62552h = wVar2;
        this.f62553i = cVar3;
        this.f62554j = xVar2;
        this.f62555k = iterable2;
        this.f62556l = m11;
        this.f62557m = mVar2;
        this.f62558n = aVar3;
        this.f62559o = cVar2;
        this.f62560p = gVar;
        this.f62561q = pVar;
        this.f62562r = aVar2;
        this.f62563s = list;
        this.f62564t = vVar;
        this.f62565u = new C5326l(this);
    }

    public final C5330p a(N n10, C6436c cVar, g gVar, h hVar, C6434a aVar, C5357s sVar) {
        C6496s.h(n10, "descriptor");
        C6436c cVar2 = cVar;
        C6496s.h(cVar, "nameResolver");
        C6496s.h(gVar, "typeTable");
        C6496s.h(hVar, "versionRequirementTable");
        C6434a aVar2 = aVar;
        C6496s.h(aVar2, "metadataVersion");
        return new C5330p(this, cVar2, n10, gVar, hVar, aVar2, sVar, (X) null, C6565s.n());
    }

    public final C5487e b(b bVar) {
        C6496s.h(bVar, "classId");
        return C5326l.f(this.f62565u, bVar, (C5323i) null, 2, (Object) null);
    }

    public final a c() {
        return this.f62558n;
    }

    public final C5319e d() {
        return this.f62549e;
    }

    public final C5324j e() {
        return this.f62548d;
    }

    public final C5326l f() {
        return this.f62565u;
    }

    public final C5329o g() {
        return this.f62547c;
    }

    public final C5327m h() {
        return this.f62557m;
    }

    public final C5335v i() {
        return this.f62564t;
    }

    public final C5336w j() {
        return this.f62552h;
    }

    public final C6645g k() {
        return this.f62560p;
    }

    public final Iterable l() {
        return this.f62555k;
    }

    public final C5337x m() {
        return this.f62554j;
    }

    public final p n() {
        return this.f62561q;
    }

    public final B o() {
        return this.f62551g;
    }

    public final c p() {
        return this.f62553i;
    }

    public final H q() {
        return this.f62546b;
    }

    public final M r() {
        return this.f62556l;
    }

    public final O s() {
        return this.f62550f;
    }

    public final Qf.c t() {
        return this.f62559o;
    }

    public final n u() {
        return this.f62545a;
    }

    public final List v() {
        return this.f62563s;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C5328n(Eg.n r24, Of.H r25, Bg.C5329o r26, Bg.C5324j r27, Bg.C5319e r28, Of.O r29, Bg.B r30, Bg.C5336w r31, Wf.c r32, Bg.C5337x r33, java.lang.Iterable r34, Of.M r35, Bg.C5327m r36, Qf.a r37, Qf.c r38, pg.C6645g r39, Gg.p r40, xg.C6783a r41, java.util.List r42, Bg.C5335v r43, int r44, kotlin.jvm.internal.DefaultConstructorMarker r45) {
        /*
            r23 = this;
            r0 = r44
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x000b
            Qf.a$a r1 = Qf.a.C0950a.f64719a
            r16 = r1
            goto L_0x000d
        L_0x000b:
            r16 = r37
        L_0x000d:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0016
            Qf.c$a r1 = Qf.c.a.f64720a
            r17 = r1
            goto L_0x0018
        L_0x0016:
            r17 = r38
        L_0x0018:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0026
            Gg.p$a r1 = Gg.p.f63198b
            Gg.q r1 = r1.a()
            r19 = r1
            goto L_0x0028
        L_0x0026:
            r19 = r40
        L_0x0028:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0036
            Fg.x r1 = Fg.C5396x.f63077a
            java.util.List r1 = mf.C6565s.e(r1)
            r21 = r1
            goto L_0x0038
        L_0x0036:
            r21 = r42
        L_0x0038:
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0042
            Bg.v$a r0 = Bg.C5335v.a.f62586a
            r22 = r0
            goto L_0x0044
        L_0x0042:
            r22 = r43
        L_0x0044:
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r27
            r7 = r28
            r8 = r29
            r9 = r30
            r10 = r31
            r11 = r32
            r12 = r33
            r13 = r34
            r14 = r35
            r15 = r36
            r18 = r39
            r20 = r41
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Bg.C5328n.<init>(Eg.n, Of.H, Bg.o, Bg.j, Bg.e, Of.O, Bg.B, Bg.w, Wf.c, Bg.x, java.lang.Iterable, Of.M, Bg.m, Qf.a, Qf.c, pg.g, Gg.p, xg.a, java.util.List, Bg.v, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
