package androidx.work;

import android.net.Uri;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

/* renamed from: androidx.work.e  reason: case insensitive filesystem */
public final class C1838e {

    /* renamed from: i  reason: collision with root package name */
    public static final b f18715i = new b((DefaultConstructorMarker) null);

    /* renamed from: j  reason: collision with root package name */
    public static final C1838e f18716j = new C1838e((t) null, false, false, false, 15, (DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final t f18717a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f18718b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f18719c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f18720d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f18721e;

    /* renamed from: f  reason: collision with root package name */
    private final long f18722f;

    /* renamed from: g  reason: collision with root package name */
    private final long f18723g;

    /* renamed from: h  reason: collision with root package name */
    private final Set f18724h;

    /* renamed from: androidx.work.e$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f18725a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f18726b;

        /* renamed from: c  reason: collision with root package name */
        private t f18727c = t.NOT_REQUIRED;

        /* renamed from: d  reason: collision with root package name */
        private boolean f18728d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f18729e;

        /* renamed from: f  reason: collision with root package name */
        private long f18730f = -1;

        /* renamed from: g  reason: collision with root package name */
        private long f18731g = -1;

        /* renamed from: h  reason: collision with root package name */
        private Set f18732h = new LinkedHashSet();

        public final C1838e a() {
            Set j12 = C6565s.j1(this.f18732h);
            long j10 = this.f18730f;
            long j11 = this.f18731g;
            return new C1838e(this.f18727c, this.f18725a, this.f18726b, this.f18728d, this.f18729e, j10, j11, j12);
        }

        public final a b(t tVar) {
            C6496s.h(tVar, "networkType");
            this.f18727c = tVar;
            return this;
        }
    }

    /* renamed from: androidx.work.e$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: androidx.work.e$c */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f18733a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f18734b;

        public c(Uri uri, boolean z10) {
            C6496s.h(uri, "uri");
            this.f18733a = uri;
            this.f18734b = z10;
        }

        public final Uri a() {
            return this.f18733a;
        }

        public final boolean b() {
            return this.f18734b;
        }

        public boolean equals(Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!C6496s.c(c.class, cls)) {
                return false;
            }
            C6496s.f(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            c cVar = (c) obj;
            if (C6496s.c(this.f18733a, cVar.f18733a) && this.f18734b == cVar.f18734b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f18733a.hashCode() * 31) + Boolean.hashCode(this.f18734b);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1838e(t tVar, boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? t.NOT_REQUIRED : tVar, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12);
    }

    public final long a() {
        return this.f18723g;
    }

    public final long b() {
        return this.f18722f;
    }

    public final Set c() {
        return this.f18724h;
    }

    public final t d() {
        return this.f18717a;
    }

    public final boolean e() {
        return !this.f18724h.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!C6496s.c(C1838e.class, obj.getClass())) {
            return false;
        }
        C1838e eVar = (C1838e) obj;
        if (this.f18718b == eVar.f18718b && this.f18719c == eVar.f18719c && this.f18720d == eVar.f18720d && this.f18721e == eVar.f18721e && this.f18722f == eVar.f18722f && this.f18723g == eVar.f18723g && this.f18717a == eVar.f18717a) {
            return C6496s.c(this.f18724h, eVar.f18724h);
        }
        return false;
    }

    public final boolean f() {
        return this.f18720d;
    }

    public final boolean g() {
        return this.f18718b;
    }

    public final boolean h() {
        return this.f18719c;
    }

    public int hashCode() {
        long j10 = this.f18722f;
        long j11 = this.f18723g;
        return (((((((((((((this.f18717a.hashCode() * 31) + (this.f18718b ? 1 : 0)) * 31) + (this.f18719c ? 1 : 0)) * 31) + (this.f18720d ? 1 : 0)) * 31) + (this.f18721e ? 1 : 0)) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f18724h.hashCode();
    }

    public final boolean i() {
        return this.f18721e;
    }

    public String toString() {
        return "Constraints{requiredNetworkType=" + this.f18717a + ", requiresCharging=" + this.f18718b + ", requiresDeviceIdle=" + this.f18719c + ", requiresBatteryNotLow=" + this.f18720d + ", requiresStorageNotLow=" + this.f18721e + ", contentTriggerUpdateDelayMillis=" + this.f18722f + ", contentTriggerMaxDelayMillis=" + this.f18723g + ", contentUriTriggers=" + this.f18724h + ", }";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1838e(t tVar, boolean z10, boolean z11, boolean z12) {
        this(tVar, z10, false, z11, z12);
        C6496s.h(tVar, "requiredNetworkType");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1838e(t tVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this(tVar, z10, z11, z12, z13, -1, 0, (Set) null, 192, (DefaultConstructorMarker) null);
        C6496s.h(tVar, "requiredNetworkType");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C1838e(androidx.work.t r12, boolean r13, boolean r14, boolean r15, boolean r16, long r17, long r19, java.util.Set r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            androidx.work.t r1 = androidx.work.t.NOT_REQUIRED
            goto L_0x000a
        L_0x0009:
            r1 = r12
        L_0x000a:
            r2 = r0 & 2
            r3 = 0
            if (r2 == 0) goto L_0x0011
            r2 = r3
            goto L_0x0012
        L_0x0011:
            r2 = r13
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r3
            goto L_0x0019
        L_0x0018:
            r4 = r14
        L_0x0019:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001f
            r5 = r3
            goto L_0x0020
        L_0x001f:
            r5 = r15
        L_0x0020:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r3 = r16
        L_0x0027:
            r6 = r0 & 32
            r7 = -1
            if (r6 == 0) goto L_0x002f
            r9 = r7
            goto L_0x0031
        L_0x002f:
            r9 = r17
        L_0x0031:
            r6 = r0 & 64
            if (r6 == 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r7 = r19
        L_0x0038:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0041
            java.util.Set r0 = mf.Y.e()
            goto L_0x0043
        L_0x0041:
            r0 = r21
        L_0x0043:
            r12 = r11
            r13 = r1
            r14 = r2
            r15 = r4
            r16 = r5
            r17 = r3
            r18 = r9
            r20 = r7
            r22 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r20, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.C1838e.<init>(androidx.work.t, boolean, boolean, boolean, boolean, long, long, java.util.Set, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public C1838e(t tVar, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set set) {
        C6496s.h(tVar, "requiredNetworkType");
        C6496s.h(set, "contentUriTriggers");
        this.f18717a = tVar;
        this.f18718b = z10;
        this.f18719c = z11;
        this.f18720d = z12;
        this.f18721e = z13;
        this.f18722f = j10;
        this.f18723g = j11;
        this.f18724h = set;
    }

    public C1838e(C1838e eVar) {
        C6496s.h(eVar, "other");
        this.f18718b = eVar.f18718b;
        this.f18719c = eVar.f18719c;
        this.f18717a = eVar.f18717a;
        this.f18720d = eVar.f18720d;
        this.f18721e = eVar.f18721e;
        this.f18724h = eVar.f18724h;
        this.f18722f = eVar.f18722f;
        this.f18723g = eVar.f18723g;
    }
}
