package m3;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: m3.g  reason: case insensitive filesystem */
public final class C2208g {

    /* renamed from: a  reason: collision with root package name */
    private final r f24001a;

    /* renamed from: b  reason: collision with root package name */
    private final r f24002b;

    /* renamed from: c  reason: collision with root package name */
    private final r f24003c;

    /* renamed from: d  reason: collision with root package name */
    private final C2219s f24004d;

    /* renamed from: e  reason: collision with root package name */
    private final C2219s f24005e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f24006f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f24007g;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        if ((r6 != null ? r6.g() : false) != false) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2208g(m3.r r2, m3.r r3, m3.r r4, m3.C2219s r5, m3.C2219s r6) {
        /*
            r1 = this;
            java.lang.String r0 = "refresh"
            kotlin.jvm.internal.C6496s.h(r2, r0)
            java.lang.String r0 = "prepend"
            kotlin.jvm.internal.C6496s.h(r3, r0)
            java.lang.String r0 = "append"
            kotlin.jvm.internal.C6496s.h(r4, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.C6496s.h(r5, r0)
            r1.<init>()
            r1.f24001a = r2
            r1.f24002b = r3
            r1.f24003c = r4
            r1.f24004d = r5
            r1.f24005e = r6
            boolean r2 = r5.h()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0035
            if (r6 == 0) goto L_0x0030
            boolean r2 = r6.h()
            goto L_0x0031
        L_0x0030:
            r2 = r4
        L_0x0031:
            if (r2 == 0) goto L_0x0035
            r2 = r4
            goto L_0x0036
        L_0x0035:
            r2 = r3
        L_0x0036:
            r1.f24006f = r2
            boolean r2 = r5.g()
            if (r2 != 0) goto L_0x0048
            if (r6 == 0) goto L_0x0045
            boolean r2 = r6.g()
            goto L_0x0046
        L_0x0045:
            r2 = r3
        L_0x0046:
            if (r2 == 0) goto L_0x0049
        L_0x0048:
            r3 = r4
        L_0x0049:
            r1.f24007g = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.C2208g.<init>(m3.r, m3.r, m3.r, m3.s, m3.s):void");
    }

    public final r a() {
        return this.f24003c;
    }

    public final C2219s b() {
        return this.f24005e;
    }

    public final r c() {
        return this.f24002b;
    }

    public final r d() {
        return this.f24001a;
    }

    public final C2219s e() {
        return this.f24004d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2208g.class != obj.getClass()) {
            return false;
        }
        C2208g gVar = (C2208g) obj;
        if (C6496s.c(this.f24001a, gVar.f24001a) && C6496s.c(this.f24002b, gVar.f24002b) && C6496s.c(this.f24003c, gVar.f24003c) && C6496s.c(this.f24004d, gVar.f24004d) && C6496s.c(this.f24005e, gVar.f24005e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = ((((((this.f24001a.hashCode() * 31) + this.f24002b.hashCode()) * 31) + this.f24003c.hashCode()) * 31) + this.f24004d.hashCode()) * 31;
        C2219s sVar = this.f24005e;
        if (sVar != null) {
            i10 = sVar.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "CombinedLoadStates(refresh=" + this.f24001a + ", prepend=" + this.f24002b + ", append=" + this.f24003c + ", source=" + this.f24004d + ", mediator=" + this.f24005e + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2208g(r rVar, r rVar2, r rVar3, C2219s sVar, C2219s sVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(rVar, rVar2, rVar3, sVar, (i10 & 16) != 0 ? null : sVar2);
    }
}
