package J;

import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6798l;

/* renamed from: J.w  reason: case insensitive filesystem */
public final class C1226w {

    /* renamed from: g  reason: collision with root package name */
    public static final a f3478g = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final C1226w f3479h = new C1226w((C6798l) null, (C6798l) null, (C6798l) null, (C6798l) null, (C6798l) null, (C6798l) null, 63, (DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C6798l f3480a;

    /* renamed from: b  reason: collision with root package name */
    private final C6798l f3481b;

    /* renamed from: c  reason: collision with root package name */
    private final C6798l f3482c;

    /* renamed from: d  reason: collision with root package name */
    private final C6798l f3483d;

    /* renamed from: e  reason: collision with root package name */
    private final C6798l f3484e;

    /* renamed from: f  reason: collision with root package name */
    private final C6798l f3485f;

    /* renamed from: J.w$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1226w a() {
            return C1226w.f3479h;
        }

        private a() {
        }
    }

    public C1226w(C6798l lVar, C6798l lVar2, C6798l lVar3, C6798l lVar4, C6798l lVar5, C6798l lVar6) {
        this.f3480a = lVar;
        this.f3481b = lVar2;
        this.f3482c = lVar3;
        this.f3483d = lVar4;
        this.f3484e = lVar5;
        this.f3485f = lVar6;
    }

    public final C6798l b() {
        return this.f3480a;
    }

    public final C6798l c() {
        return this.f3481b;
    }

    public final C6798l d() {
        return this.f3482c;
    }

    public final C6798l e() {
        return this.f3483d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1226w)) {
            return false;
        }
        C1226w wVar = (C1226w) obj;
        if (this.f3480a == wVar.f3480a && this.f3481b == wVar.f3481b && this.f3482c == wVar.f3482c && this.f3483d == wVar.f3483d && this.f3484e == wVar.f3484e && this.f3485f == wVar.f3485f) {
            return true;
        }
        return false;
    }

    public final C6798l f() {
        return this.f3484e;
    }

    public final C6798l g() {
        return this.f3485f;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        C6798l lVar = this.f3480a;
        int i15 = 0;
        if (lVar != null) {
            i10 = lVar.hashCode();
        } else {
            i10 = 0;
        }
        int i16 = i10 * 31;
        C6798l lVar2 = this.f3481b;
        if (lVar2 != null) {
            i11 = lVar2.hashCode();
        } else {
            i11 = 0;
        }
        int i17 = (i16 + i11) * 31;
        C6798l lVar3 = this.f3482c;
        if (lVar3 != null) {
            i12 = lVar3.hashCode();
        } else {
            i12 = 0;
        }
        int i18 = (i17 + i12) * 31;
        C6798l lVar4 = this.f3483d;
        if (lVar4 != null) {
            i13 = lVar4.hashCode();
        } else {
            i13 = 0;
        }
        int i19 = (i18 + i13) * 31;
        C6798l lVar5 = this.f3484e;
        if (lVar5 != null) {
            i14 = lVar5.hashCode();
        } else {
            i14 = 0;
        }
        int i20 = (i19 + i14) * 31;
        C6798l lVar6 = this.f3485f;
        if (lVar6 != null) {
            i15 = lVar6.hashCode();
        }
        return i20 + i15;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C1226w(yf.C6798l r6, yf.C6798l r7, yf.C6798l r8, yf.C6798l r9, yf.C6798l r10, yf.C6798l r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0007
            r13 = r0
            goto L_0x0008
        L_0x0007:
            r13 = r6
        L_0x0008:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r7
        L_0x000f:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r8
        L_0x0016:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r9
        L_0x001d:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r10
        L_0x0024:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002a
            r12 = r0
            goto L_0x002b
        L_0x002a:
            r12 = r11
        L_0x002b:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J.C1226w.<init>(yf.l, yf.l, yf.l, yf.l, yf.l, yf.l, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
