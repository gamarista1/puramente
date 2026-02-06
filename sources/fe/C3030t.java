package Fe;

import java.util.Date;
import kotlin.jvm.internal.C6496s;

/* renamed from: Fe.t  reason: case insensitive filesystem */
public final class C3030t {

    /* renamed from: a  reason: collision with root package name */
    private String f31176a;

    /* renamed from: b  reason: collision with root package name */
    private String f31177b;

    /* renamed from: c  reason: collision with root package name */
    private Date f31178c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f31179d;

    /* renamed from: e  reason: collision with root package name */
    private long f31180e;

    public C3030t(String str, String str2, Date date, boolean z10, long j10) {
        this.f31176a = str;
        this.f31177b = str2;
        this.f31178c = date;
        this.f31179d = z10;
        this.f31180e = j10;
    }

    public final String a() {
        return this.f31176a;
    }

    public final Date b() {
        return this.f31178c;
    }

    public final long c() {
        return this.f31180e;
    }

    public final String d() {
        return this.f31177b;
    }

    public final boolean e() {
        return this.f31179d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3030t)) {
            return false;
        }
        C3030t tVar = (C3030t) obj;
        if (C6496s.c(this.f31176a, tVar.f31176a) && C6496s.c(this.f31177b, tVar.f31177b) && C6496s.c(this.f31178c, tVar.f31178c) && this.f31179d == tVar.f31179d && this.f31180e == tVar.f31180e) {
            return true;
        }
        return false;
    }

    public final void f(boolean z10) {
        this.f31179d = z10;
    }

    public final void g(String str) {
        this.f31176a = str;
    }

    public final void h(Date date) {
        this.f31178c = date;
    }

    public int hashCode() {
        int i10;
        int i11;
        String str = this.f31176a;
        int i12 = 0;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = i10 * 31;
        String str2 = this.f31177b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        Date date = this.f31178c;
        if (date != null) {
            i12 = date.hashCode();
        }
        int i15 = (i14 + i12) * 31;
        boolean z10 = this.f31179d;
        if (z10) {
            z10 = true;
        }
        return ((i15 + (z10 ? 1 : 0)) * 31) + Long.hashCode(this.f31180e);
    }

    public final void i(long j10) {
        this.f31180e = j10;
    }

    public final void j(String str) {
        this.f31177b = str;
    }

    public String toString() {
        return "BranchUrlQueryParameter(name=" + this.f31176a + ", value=" + this.f31177b + ", timestamp=" + this.f31178c + ", isDeepLink=" + this.f31179d + ", validityWindow=" + this.f31180e + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C3030t(java.lang.String r4, java.lang.String r5, java.util.Date r6, boolean r7, long r8, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r3 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r4
        L_0x0008:
            r4 = r10 & 2
            if (r4 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r5
        L_0x000f:
            r4 = r10 & 4
            if (r4 == 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r0 = r6
        L_0x0015:
            r4 = r10 & 8
            if (r4 == 0) goto L_0x001a
            r7 = 0
        L_0x001a:
            r2 = r7
            r4 = r10 & 16
            if (r4 == 0) goto L_0x0021
            r8 = 0
        L_0x0021:
            r9 = r8
            r4 = r3
            r5 = r11
            r6 = r1
            r7 = r0
            r8 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Fe.C3030t.<init>(java.lang.String, java.lang.String, java.util.Date, boolean, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
