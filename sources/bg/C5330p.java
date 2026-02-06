package Bg;

import Dg.C5357s;
import Eg.n;
import Of.C5495m;
import java.util.List;
import kg.C6434a;
import kg.C6436c;
import kg.g;
import kg.h;
import kg.i;
import kotlin.jvm.internal.C6496s;

/* renamed from: Bg.p  reason: case insensitive filesystem */
public final class C5330p {

    /* renamed from: a  reason: collision with root package name */
    private final C5328n f62567a;

    /* renamed from: b  reason: collision with root package name */
    private final C6436c f62568b;

    /* renamed from: c  reason: collision with root package name */
    private final C5495m f62569c;

    /* renamed from: d  reason: collision with root package name */
    private final g f62570d;

    /* renamed from: e  reason: collision with root package name */
    private final h f62571e;

    /* renamed from: f  reason: collision with root package name */
    private final C6434a f62572f;

    /* renamed from: g  reason: collision with root package name */
    private final C5357s f62573g;

    /* renamed from: h  reason: collision with root package name */
    private final X f62574h;

    /* renamed from: i  reason: collision with root package name */
    private final K f62575i;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0052, code lost:
        r2 = r8.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5330p(Bg.C5328n r2, kg.C6436c r3, Of.C5495m r4, kg.g r5, kg.h r6, kg.C6434a r7, Dg.C5357s r8, Bg.X r9, java.util.List r10) {
        /*
            r1 = this;
            java.lang.String r0 = "components"
            kotlin.jvm.internal.C6496s.h(r2, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.C6496s.h(r3, r0)
            java.lang.String r0 = "containingDeclaration"
            kotlin.jvm.internal.C6496s.h(r4, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.C6496s.h(r5, r0)
            java.lang.String r0 = "versionRequirementTable"
            kotlin.jvm.internal.C6496s.h(r6, r0)
            java.lang.String r0 = "metadataVersion"
            kotlin.jvm.internal.C6496s.h(r7, r0)
            java.lang.String r0 = "typeParameters"
            kotlin.jvm.internal.C6496s.h(r10, r0)
            r1.<init>()
            r1.f62567a = r2
            r1.f62568b = r3
            r1.f62569c = r4
            r1.f62570d = r5
            r1.f62571e = r6
            r1.f62572f = r7
            r1.f62573g = r8
            Bg.X r0 = new Bg.X
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Deserializer for \""
            r2.append(r3)
            ng.f r3 = r4.getName()
            r2.append(r3)
            r3 = 34
            r2.append(r3)
            java.lang.String r6 = r2.toString()
            if (r8 == 0) goto L_0x005b
            java.lang.String r2 = r8.a()
            if (r2 != 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r7 = r2
            goto L_0x005e
        L_0x005b:
            java.lang.String r2 = "[container not found]"
            goto L_0x0059
        L_0x005e:
            r2 = r0
            r3 = r1
            r4 = r9
            r5 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r1.f62574h = r0
            Bg.K r2 = new Bg.K
            r2.<init>(r1)
            r1.f62575i = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Bg.C5330p.<init>(Bg.n, kg.c, Of.m, kg.g, kg.h, kg.a, Dg.s, Bg.X, java.util.List):void");
    }

    public static /* synthetic */ C5330p b(C5330p pVar, C5495m mVar, List list, C6436c cVar, g gVar, h hVar, C6434a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            cVar = pVar.f62568b;
        }
        C6436c cVar2 = cVar;
        if ((i10 & 8) != 0) {
            gVar = pVar.f62570d;
        }
        g gVar2 = gVar;
        if ((i10 & 16) != 0) {
            hVar = pVar.f62571e;
        }
        h hVar2 = hVar;
        if ((i10 & 32) != 0) {
            aVar = pVar.f62572f;
        }
        return pVar.a(mVar, list, cVar2, gVar2, hVar2, aVar);
    }

    public final C5330p a(C5495m mVar, List list, C6436c cVar, g gVar, h hVar, C6434a aVar) {
        C5495m mVar2 = mVar;
        C6496s.h(mVar, "descriptor");
        List list2 = list;
        C6496s.h(list, "typeParameterProtos");
        C6436c cVar2 = cVar;
        C6496s.h(cVar, "nameResolver");
        C6496s.h(gVar, "typeTable");
        h hVar2 = hVar;
        C6496s.h(hVar2, "versionRequirementTable");
        C6496s.h(aVar, "metadataVersion");
        C5328n nVar = this.f62567a;
        if (!i.b(aVar)) {
            hVar2 = this.f62571e;
        }
        return new C5330p(nVar, cVar, mVar, gVar, hVar2, aVar, this.f62573g, this.f62574h, list);
    }

    public final C5328n c() {
        return this.f62567a;
    }

    public final C5357s d() {
        return this.f62573g;
    }

    public final C5495m e() {
        return this.f62569c;
    }

    public final K f() {
        return this.f62575i;
    }

    public final C6436c g() {
        return this.f62568b;
    }

    public final n h() {
        return this.f62567a.u();
    }

    public final X i() {
        return this.f62574h;
    }

    public final g j() {
        return this.f62570d;
    }

    public final h k() {
        return this.f62571e;
    }
}
