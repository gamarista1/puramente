package androidx.compose.ui.window;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    private final int f14330a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f14331b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f14332c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f14333d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f14334e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f14335f;

    public s(int i10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f14330a = i10;
        this.f14331b = z10;
        this.f14332c = z11;
        this.f14333d = z12;
        this.f14334e = z13;
        this.f14335f = z14;
    }

    public final boolean a() {
        return this.f14332c;
    }

    public final boolean b() {
        return this.f14333d;
    }

    public final boolean c() {
        return this.f14334e;
    }

    public final int d() {
        return this.f14330a;
    }

    public final boolean e() {
        return this.f14331b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f14330a == sVar.f14330a && this.f14331b == sVar.f14331b && this.f14332c == sVar.f14332c && this.f14333d == sVar.f14333d && this.f14334e == sVar.f14334e && this.f14335f == sVar.f14335f) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f14335f;
    }

    public int hashCode() {
        return (((((((((this.f14330a * 31) + Boolean.hashCode(this.f14331b)) * 31) + Boolean.hashCode(this.f14332c)) * 31) + Boolean.hashCode(this.f14333d)) * 31) + Boolean.hashCode(this.f14334e)) * 31) + Boolean.hashCode(this.f14335f);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ s(int r6, boolean r7, boolean r8, boolean r9, boolean r10, boolean r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r5 = this;
            r0 = r12 & 2
            r1 = 1
            if (r0 == 0) goto L_0x0007
            r0 = r1
            goto L_0x0008
        L_0x0007:
            r0 = r7
        L_0x0008:
            r2 = r12 & 4
            if (r2 == 0) goto L_0x000e
            r2 = r1
            goto L_0x000f
        L_0x000e:
            r2 = r8
        L_0x000f:
            r3 = r12 & 8
            if (r3 == 0) goto L_0x0015
            r3 = r1
            goto L_0x0016
        L_0x0015:
            r3 = r9
        L_0x0016:
            r4 = r12 & 16
            if (r4 == 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r1 = r10
        L_0x001c:
            r4 = r12 & 32
            if (r4 == 0) goto L_0x0022
            r4 = 0
            goto L_0x0023
        L_0x0022:
            r4 = r11
        L_0x0023:
            r7 = r5
            r8 = r6
            r9 = r0
            r10 = r2
            r11 = r3
            r12 = r1
            r13 = r4
            r7.<init>((int) r8, (boolean) r9, (boolean) r10, (boolean) r11, (boolean) r12, (boolean) r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.s.<init>(int, boolean, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(boolean z10, boolean z11, boolean z12, boolean z13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12, (i10 & 8) != 0 ? true : z13);
    }

    public s(boolean z10, boolean z11, boolean z12, boolean z13) {
        this(z10, z11, z12, t.Inherit, true, z13);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ s(boolean r5, boolean r6, boolean r7, androidx.compose.ui.window.t r8, boolean r9, boolean r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0005
            r5 = 0
        L_0x0005:
            r12 = r11 & 2
            r0 = 1
            if (r12 == 0) goto L_0x000c
            r12 = r0
            goto L_0x000d
        L_0x000c:
            r12 = r6
        L_0x000d:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0013
            r1 = r0
            goto L_0x0014
        L_0x0013:
            r1 = r7
        L_0x0014:
            r6 = r11 & 8
            if (r6 == 0) goto L_0x001a
            androidx.compose.ui.window.t r8 = androidx.compose.ui.window.t.Inherit
        L_0x001a:
            r2 = r8
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0021
            r3 = r0
            goto L_0x0022
        L_0x0021:
            r3 = r9
        L_0x0022:
            r6 = r11 & 32
            if (r6 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = r10
        L_0x0028:
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r0
            r6.<init>((boolean) r7, (boolean) r8, (boolean) r9, (androidx.compose.ui.window.t) r10, (boolean) r11, (boolean) r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.s.<init>(boolean, boolean, boolean, androidx.compose.ui.window.t, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public s(boolean z10, boolean z11, boolean z12, t tVar, boolean z13, boolean z14) {
        this(z10, z11, z12, tVar, z13, z14, false);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public s(boolean z10, boolean z11, boolean z12, t tVar, boolean z13, boolean z14, boolean z15) {
        this(b.g(z10, tVar, z14), tVar == t.Inherit, z11, z12, z13, z15);
    }
}
