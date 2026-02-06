package Gh;

import java.util.Arrays;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;

public final class Q {

    /* renamed from: h  reason: collision with root package name */
    public static final a f63240h = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f63241a;

    /* renamed from: b  reason: collision with root package name */
    public int f63242b;

    /* renamed from: c  reason: collision with root package name */
    public int f63243c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f63244d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f63245e;

    /* renamed from: f  reason: collision with root package name */
    public Q f63246f;

    /* renamed from: g  reason: collision with root package name */
    public Q f63247g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public Q() {
        this.f63241a = new byte[8192];
        this.f63245e = true;
        this.f63244d = false;
    }

    public final void a() {
        int i10;
        Q q10 = this.f63247g;
        if (q10 != this) {
            C6496s.e(q10);
            if (q10.f63245e) {
                int i11 = this.f63243c - this.f63242b;
                Q q11 = this.f63247g;
                C6496s.e(q11);
                int i12 = 8192 - q11.f63243c;
                Q q12 = this.f63247g;
                C6496s.e(q12);
                if (q12.f63244d) {
                    i10 = 0;
                } else {
                    Q q13 = this.f63247g;
                    C6496s.e(q13);
                    i10 = q13.f63242b;
                }
                if (i11 <= i12 + i10) {
                    Q q14 = this.f63247g;
                    C6496s.e(q14);
                    g(q14, i11);
                    b();
                    S.b(this);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("cannot compact");
    }

    public final Q b() {
        Q q10 = this.f63246f;
        if (q10 == this) {
            q10 = null;
        }
        Q q11 = this.f63247g;
        C6496s.e(q11);
        q11.f63246f = this.f63246f;
        Q q12 = this.f63246f;
        C6496s.e(q12);
        q12.f63247g = this.f63247g;
        this.f63246f = null;
        this.f63247g = null;
        return q10;
    }

    public final Q c(Q q10) {
        C6496s.h(q10, "segment");
        q10.f63247g = this;
        q10.f63246f = this.f63246f;
        Q q11 = this.f63246f;
        C6496s.e(q11);
        q11.f63247g = q10;
        this.f63246f = q10;
        return q10;
    }

    public final Q d() {
        this.f63244d = true;
        return new Q(this.f63241a, this.f63242b, this.f63243c, true, false);
    }

    public final Q e(int i10) {
        Q q10;
        if (i10 <= 0 || i10 > this.f63243c - this.f63242b) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i10 >= 1024) {
            q10 = d();
        } else {
            q10 = S.c();
            byte[] bArr = this.f63241a;
            byte[] bArr2 = q10.f63241a;
            int i11 = this.f63242b;
            C6559l.n(bArr, bArr2, 0, i11, i11 + i10, 2, (Object) null);
        }
        q10.f63243c = q10.f63242b + i10;
        this.f63242b += i10;
        Q q11 = this.f63247g;
        C6496s.e(q11);
        q11.c(q10);
        return q10;
    }

    public final Q f() {
        byte[] bArr = this.f63241a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        C6496s.g(copyOf, "copyOf(...)");
        return new Q(copyOf, this.f63242b, this.f63243c, false, true);
    }

    public final void g(Q q10, int i10) {
        C6496s.h(q10, "sink");
        if (q10.f63245e) {
            int i11 = q10.f63243c;
            if (i11 + i10 > 8192) {
                if (!q10.f63244d) {
                    int i12 = q10.f63242b;
                    if ((i11 + i10) - i12 <= 8192) {
                        byte[] bArr = q10.f63241a;
                        C6559l.n(bArr, bArr, 0, i12, i11, 2, (Object) null);
                        q10.f63243c -= q10.f63242b;
                        q10.f63242b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f63241a;
            byte[] bArr3 = q10.f63241a;
            int i13 = q10.f63243c;
            int i14 = this.f63242b;
            C6559l.h(bArr2, bArr3, i13, i14, i14 + i10);
            q10.f63243c += i10;
            this.f63242b += i10;
            return;
        }
        throw new IllegalStateException("only owner can write");
    }

    public Q(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        C6496s.h(bArr, "data");
        this.f63241a = bArr;
        this.f63242b = i10;
        this.f63243c = i11;
        this.f63244d = z10;
        this.f63245e = z11;
    }
}
