package v;

import java.util.Map;
import kotlin.jvm.internal.C6496s;

/* renamed from: v.z  reason: case insensitive filesystem */
public final class C2743z {

    /* renamed from: a  reason: collision with root package name */
    private final C2729l f26903a;

    /* renamed from: b  reason: collision with root package name */
    private final C2739v f26904b;

    /* renamed from: c  reason: collision with root package name */
    private final C2724g f26905c;

    /* renamed from: d  reason: collision with root package name */
    private final C2736s f26906d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f26907e;

    /* renamed from: f  reason: collision with root package name */
    private final Map f26908f;

    public C2743z(C2729l lVar, C2739v vVar, C2724g gVar, C2736s sVar, boolean z10, Map map) {
        this.f26903a = lVar;
        this.f26904b = vVar;
        this.f26905c = gVar;
        this.f26906d = sVar;
        this.f26907e = z10;
        this.f26908f = map;
    }

    public final C2724g a() {
        return this.f26905c;
    }

    public final Map b() {
        return this.f26908f;
    }

    public final C2729l c() {
        return this.f26903a;
    }

    public final boolean d() {
        return this.f26907e;
    }

    public final C2736s e() {
        return this.f26906d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2743z)) {
            return false;
        }
        C2743z zVar = (C2743z) obj;
        if (C6496s.c(this.f26903a, zVar.f26903a) && C6496s.c(this.f26904b, zVar.f26904b) && C6496s.c(this.f26905c, zVar.f26905c) && C6496s.c(this.f26906d, zVar.f26906d) && this.f26907e == zVar.f26907e && C6496s.c(this.f26908f, zVar.f26908f)) {
            return true;
        }
        return false;
    }

    public final C2739v f() {
        return this.f26904b;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        C2729l lVar = this.f26903a;
        int i13 = 0;
        if (lVar == null) {
            i10 = 0;
        } else {
            i10 = lVar.hashCode();
        }
        int i14 = i10 * 31;
        C2739v vVar = this.f26904b;
        if (vVar == null) {
            i11 = 0;
        } else {
            i11 = vVar.hashCode();
        }
        int i15 = (i14 + i11) * 31;
        C2724g gVar = this.f26905c;
        if (gVar == null) {
            i12 = 0;
        } else {
            i12 = gVar.hashCode();
        }
        int i16 = (i15 + i12) * 31;
        C2736s sVar = this.f26906d;
        if (sVar != null) {
            i13 = sVar.hashCode();
        }
        return ((((i16 + i13) * 31) + Boolean.hashCode(this.f26907e)) * 31) + this.f26908f.hashCode();
    }

    public String toString() {
        return "TransitionData(fade=" + this.f26903a + ", slide=" + this.f26904b + ", changeSize=" + this.f26905c + ", scale=" + this.f26906d + ", hold=" + this.f26907e + ", effectsMap=" + this.f26908f + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C2743z(v.C2729l r5, v.C2739v r6, v.C2724g r7, v.C2736s r8, boolean r9, java.util.Map r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            r0 = 0
            if (r12 == 0) goto L_0x0007
            r12 = r0
            goto L_0x0008
        L_0x0007:
            r12 = r5
        L_0x0008:
            r5 = r11 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r11 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r11 & 8
            if (r5 == 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r0 = r8
        L_0x001c:
            r5 = r11 & 16
            if (r5 == 0) goto L_0x0021
            r9 = 0
        L_0x0021:
            r3 = r9
            r5 = r11 & 32
            if (r5 == 0) goto L_0x002a
            java.util.Map r10 = mf.O.i()
        L_0x002a:
            r11 = r10
            r5 = r4
            r6 = r12
            r7 = r1
            r8 = r2
            r9 = r0
            r10 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.C2743z.<init>(v.l, v.v, v.g, v.s, boolean, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
