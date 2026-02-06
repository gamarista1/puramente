package Be;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private String f50375a;

    /* renamed from: b  reason: collision with root package name */
    private long f50376b;

    /* renamed from: c  reason: collision with root package name */
    private String f50377c;

    /* renamed from: d  reason: collision with root package name */
    private long f50378d;

    /* renamed from: e  reason: collision with root package name */
    private Long f50379e;

    /* renamed from: f  reason: collision with root package name */
    private Long f50380f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f50381g;

    public a(String str, long j10, String str2, long j11, Long l10, Long l11, boolean z10) {
        this.f50375a = str;
        this.f50376b = j10;
        this.f50377c = str2;
        this.f50378d = j11;
        this.f50379e = l10;
        this.f50380f = l11;
        this.f50381g = z10;
    }

    public final String a() {
        return this.f50375a;
    }

    public final long b() {
        return this.f50376b;
    }

    public final Long c() {
        return this.f50379e;
    }

    public final String d() {
        return this.f50377c;
    }

    public final long e() {
        return this.f50378d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (C6496s.c(this.f50375a, aVar.f50375a) && this.f50376b == aVar.f50376b && C6496s.c(this.f50377c, aVar.f50377c) && this.f50378d == aVar.f50378d && C6496s.c(this.f50379e, aVar.f50379e) && C6496s.c(this.f50380f, aVar.f50380f) && this.f50381g == aVar.f50381g) {
            return true;
        }
        return false;
    }

    public final Long f() {
        return this.f50380f;
    }

    public final boolean g() {
        return this.f50381g;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        String str = this.f50375a;
        int i13 = 0;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int hashCode = ((i10 * 31) + Long.hashCode(this.f50376b)) * 31;
        String str2 = this.f50377c;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int hashCode2 = (((hashCode + i11) * 31) + Long.hashCode(this.f50378d)) * 31;
        Long l10 = this.f50379e;
        if (l10 == null) {
            i12 = 0;
        } else {
            i12 = l10.hashCode();
        }
        int i14 = (hashCode2 + i12) * 31;
        Long l11 = this.f50380f;
        if (l11 != null) {
            i13 = l11.hashCode();
        }
        int i15 = (i14 + i13) * 31;
        boolean z10 = this.f50381g;
        if (z10) {
            z10 = true;
        }
        return i15 + (z10 ? 1 : 0);
    }

    public String toString() {
        return "InstallReferrerResult(appStore=" + this.f50375a + ", installBeginTimestampSeconds=" + this.f50376b + ", installReferrer=" + this.f50377c + ", referrerClickTimestampSeconds=" + this.f50378d + ", installBeginTimestampServerSeconds=" + this.f50379e + ", referrerClickTimestampServerSeconds=" + this.f50380f + ", isClickThrough=" + this.f50381g + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, long j10, String str2, long j11, Long l10, Long l11, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, str2, j11, l10, l11, (i10 & 64) != 0 ? true : z10);
    }
}
