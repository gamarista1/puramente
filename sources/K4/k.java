package K4;

import L4.d;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.bugsnag.android.BreadcrumbType;
import com.bugsnag.android.C3247j0;
import com.bugsnag.android.C3254l1;
import com.bugsnag.android.C3259n0;
import com.bugsnag.android.C3271s0;
import com.bugsnag.android.E1;
import com.bugsnag.android.H1;
import com.bugsnag.android.Q;
import com.bugsnag.android.S0;
import com.bugsnag.android.T;
import com.bugsnag.android.U;
import java.util.Collection;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

public final class k {

    /* renamed from: A  reason: collision with root package name */
    private final Lazy f32360A;

    /* renamed from: B  reason: collision with root package name */
    private final boolean f32361B;

    /* renamed from: C  reason: collision with root package name */
    private final boolean f32362C;

    /* renamed from: D  reason: collision with root package name */
    private final boolean f32363D;

    /* renamed from: E  reason: collision with root package name */
    private final PackageInfo f32364E;

    /* renamed from: F  reason: collision with root package name */
    private final ApplicationInfo f32365F;

    /* renamed from: G  reason: collision with root package name */
    private final Collection f32366G;

    /* renamed from: a  reason: collision with root package name */
    private final String f32367a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f32368b;

    /* renamed from: c  reason: collision with root package name */
    private final C3259n0 f32369c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f32370d;

    /* renamed from: e  reason: collision with root package name */
    private final E1 f32371e;

    /* renamed from: f  reason: collision with root package name */
    private final Collection f32372f;

    /* renamed from: g  reason: collision with root package name */
    private final Collection f32373g;

    /* renamed from: h  reason: collision with root package name */
    private final Collection f32374h;

    /* renamed from: i  reason: collision with root package name */
    private final Set f32375i;

    /* renamed from: j  reason: collision with root package name */
    private final Set f32376j;

    /* renamed from: k  reason: collision with root package name */
    private final String f32377k;

    /* renamed from: l  reason: collision with root package name */
    private final d f32378l;

    /* renamed from: m  reason: collision with root package name */
    private final String f32379m;

    /* renamed from: n  reason: collision with root package name */
    private final Integer f32380n;

    /* renamed from: o  reason: collision with root package name */
    private final String f32381o;

    /* renamed from: p  reason: collision with root package name */
    private final Q f32382p;

    /* renamed from: q  reason: collision with root package name */
    private final C3247j0 f32383q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f32384r;

    /* renamed from: s  reason: collision with root package name */
    private final long f32385s;

    /* renamed from: t  reason: collision with root package name */
    private final S0 f32386t;

    /* renamed from: u  reason: collision with root package name */
    private final int f32387u;

    /* renamed from: v  reason: collision with root package name */
    private final int f32388v;

    /* renamed from: w  reason: collision with root package name */
    private final int f32389w;

    /* renamed from: x  reason: collision with root package name */
    private final int f32390x;

    /* renamed from: y  reason: collision with root package name */
    private final int f32391y;

    /* renamed from: z  reason: collision with root package name */
    private final long f32392z;

    public k(String str, boolean z10, C3259n0 n0Var, boolean z11, E1 e12, Collection collection, Collection collection2, Collection collection3, Set set, Set set2, String str2, d dVar, String str3, Integer num, String str4, Q q10, C3247j0 j0Var, boolean z12, long j10, S0 s02, int i10, int i11, int i12, int i13, int i14, long j11, Lazy lazy, boolean z13, boolean z14, boolean z15, PackageInfo packageInfo, ApplicationInfo applicationInfo, Collection collection4) {
        this.f32367a = str;
        this.f32368b = z10;
        this.f32369c = n0Var;
        this.f32370d = z11;
        this.f32371e = e12;
        this.f32372f = collection;
        this.f32373g = collection2;
        this.f32374h = collection3;
        this.f32375i = set;
        this.f32376j = set2;
        this.f32377k = str2;
        this.f32378l = dVar;
        this.f32379m = str3;
        this.f32380n = num;
        this.f32381o = str4;
        this.f32382p = q10;
        this.f32383q = j0Var;
        this.f32384r = z12;
        this.f32385s = j10;
        this.f32386t = s02;
        this.f32387u = i10;
        this.f32388v = i11;
        this.f32389w = i12;
        this.f32390x = i13;
        this.f32391y = i14;
        this.f32392z = j11;
        this.f32360A = lazy;
        this.f32361B = z13;
        this.f32362C = z14;
        this.f32363D = z15;
        this.f32364E = packageInfo;
        this.f32365F = applicationInfo;
        this.f32366G = collection4;
    }

    public final Collection A() {
        return this.f32374h;
    }

    public final Collection B() {
        return this.f32366G;
    }

    public final String C() {
        return this.f32377k;
    }

    public final boolean D() {
        return this.f32361B;
    }

    public final E1 E() {
        return this.f32371e;
    }

    public final U F(C3254l1 l1Var) {
        return new U(this.f32383q.b(), T.c(l1Var.c()));
    }

    public final Set G() {
        return this.f32376j;
    }

    public final long H() {
        return this.f32392z;
    }

    public final Integer I() {
        return this.f32380n;
    }

    public final boolean J(BreadcrumbType breadcrumbType) {
        Set set = this.f32375i;
        if (set == null || set.contains(breadcrumbType)) {
            return false;
        }
        return true;
    }

    public final boolean K(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        Iterable<Pattern> iterable = this.f32372f;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (Pattern matcher : iterable) {
            if (matcher.matcher(str.toString()).matches()) {
                return true;
            }
        }
        return false;
    }

    public final boolean L(Throwable th2) {
        Iterable<Throwable> a10 = H1.a(th2);
        if ((a10 instanceof Collection) && ((Collection) a10).isEmpty()) {
            return false;
        }
        for (Throwable th3 : a10) {
            if (K(th3.getClass().getName())) {
                return true;
            }
        }
        return false;
    }

    public final boolean M() {
        Collection collection = this.f32373g;
        if (collection == null || C6565s.e0(collection, this.f32377k)) {
            return false;
        }
        return true;
    }

    public final boolean N(String str) {
        if (M() || K(str)) {
            return true;
        }
        return false;
    }

    public final boolean O(Throwable th2) {
        if (M() || L(th2)) {
            return true;
        }
        return false;
    }

    public final boolean P(boolean z10) {
        if (M() || (z10 && !this.f32370d)) {
            return true;
        }
        return false;
    }

    public final String a() {
        return this.f32367a;
    }

    public final ApplicationInfo b() {
        return this.f32365F;
    }

    public final String c() {
        return this.f32381o;
    }

    public final String d() {
        return this.f32379m;
    }

    public final boolean e() {
        return this.f32362C;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (C6496s.c(this.f32367a, kVar.f32367a) && this.f32368b == kVar.f32368b && C6496s.c(this.f32369c, kVar.f32369c) && this.f32370d == kVar.f32370d && this.f32371e == kVar.f32371e && C6496s.c(this.f32372f, kVar.f32372f) && C6496s.c(this.f32373g, kVar.f32373g) && C6496s.c(this.f32374h, kVar.f32374h) && C6496s.c(this.f32375i, kVar.f32375i) && C6496s.c(this.f32376j, kVar.f32376j) && C6496s.c(this.f32377k, kVar.f32377k) && C6496s.c(this.f32378l, kVar.f32378l) && C6496s.c(this.f32379m, kVar.f32379m) && C6496s.c(this.f32380n, kVar.f32380n) && C6496s.c(this.f32381o, kVar.f32381o) && C6496s.c(this.f32382p, kVar.f32382p) && C6496s.c(this.f32383q, kVar.f32383q) && this.f32384r == kVar.f32384r && this.f32385s == kVar.f32385s && C6496s.c(this.f32386t, kVar.f32386t) && this.f32387u == kVar.f32387u && this.f32388v == kVar.f32388v && this.f32389w == kVar.f32389w && this.f32390x == kVar.f32390x && this.f32391y == kVar.f32391y && this.f32392z == kVar.f32392z && C6496s.c(this.f32360A, kVar.f32360A) && this.f32361B == kVar.f32361B && this.f32362C == kVar.f32362C && this.f32363D == kVar.f32363D && C6496s.c(this.f32364E, kVar.f32364E) && C6496s.c(this.f32365F, kVar.f32365F) && C6496s.c(this.f32366G, kVar.f32366G)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f32368b;
    }

    public final boolean g() {
        return this.f32370d;
    }

    public final d h() {
        return this.f32378l;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int hashCode = this.f32367a.hashCode() * 31;
        boolean z10 = this.f32368b;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int hashCode2 = (((hashCode + (z10 ? 1 : 0)) * 31) + this.f32369c.hashCode()) * 31;
        boolean z12 = this.f32370d;
        if (z12) {
            z12 = true;
        }
        int hashCode3 = (((((hashCode2 + (z12 ? 1 : 0)) * 31) + this.f32371e.hashCode()) * 31) + this.f32372f.hashCode()) * 31;
        Collection collection = this.f32373g;
        int i18 = 0;
        if (collection == null) {
            i10 = 0;
        } else {
            i10 = collection.hashCode();
        }
        int hashCode4 = (((hashCode3 + i10) * 31) + this.f32374h.hashCode()) * 31;
        Set set = this.f32375i;
        if (set == null) {
            i11 = 0;
        } else {
            i11 = set.hashCode();
        }
        int hashCode5 = (((hashCode4 + i11) * 31) + this.f32376j.hashCode()) * 31;
        String str = this.f32377k;
        if (str == null) {
            i12 = 0;
        } else {
            i12 = str.hashCode();
        }
        int i19 = (hashCode5 + i12) * 31;
        d dVar = this.f32378l;
        if (dVar == null) {
            i13 = 0;
        } else {
            i13 = dVar.hashCode();
        }
        int i20 = (i19 + i13) * 31;
        String str2 = this.f32379m;
        if (str2 == null) {
            i14 = 0;
        } else {
            i14 = str2.hashCode();
        }
        int i21 = (i20 + i14) * 31;
        Integer num = this.f32380n;
        if (num == null) {
            i15 = 0;
        } else {
            i15 = num.hashCode();
        }
        int i22 = (i21 + i15) * 31;
        String str3 = this.f32381o;
        if (str3 == null) {
            i16 = 0;
        } else {
            i16 = str3.hashCode();
        }
        int hashCode6 = (((((i22 + i16) * 31) + this.f32382p.hashCode()) * 31) + this.f32383q.hashCode()) * 31;
        boolean z13 = this.f32384r;
        if (z13) {
            z13 = true;
        }
        int hashCode7 = (((((((((((((((((((hashCode6 + (z13 ? 1 : 0)) * 31) + Long.hashCode(this.f32385s)) * 31) + this.f32386t.hashCode()) * 31) + Integer.hashCode(this.f32387u)) * 31) + Integer.hashCode(this.f32388v)) * 31) + Integer.hashCode(this.f32389w)) * 31) + Integer.hashCode(this.f32390x)) * 31) + Integer.hashCode(this.f32391y)) * 31) + Long.hashCode(this.f32392z)) * 31) + this.f32360A.hashCode()) * 31;
        boolean z14 = this.f32361B;
        if (z14) {
            z14 = true;
        }
        int i23 = (hashCode7 + (z14 ? 1 : 0)) * 31;
        boolean z15 = this.f32362C;
        if (z15) {
            z15 = true;
        }
        int i24 = (i23 + (z15 ? 1 : 0)) * 31;
        boolean z16 = this.f32363D;
        if (!z16) {
            z11 = z16;
        }
        int i25 = (i24 + (z11 ? 1 : 0)) * 31;
        PackageInfo packageInfo = this.f32364E;
        if (packageInfo == null) {
            i17 = 0;
        } else {
            i17 = packageInfo.hashCode();
        }
        int i26 = (i25 + i17) * 31;
        ApplicationInfo applicationInfo = this.f32365F;
        if (applicationInfo != null) {
            i18 = applicationInfo.hashCode();
        }
        return ((i26 + i18) * 31) + this.f32366G.hashCode();
    }

    public final Q i() {
        return this.f32382p;
    }

    public final Collection j() {
        return this.f32372f;
    }

    public final Set k() {
        return this.f32375i;
    }

    public final C3259n0 l() {
        return this.f32369c;
    }

    public final Collection m() {
        return this.f32373g;
    }

    public final C3247j0 n() {
        return this.f32383q;
    }

    public final U o(C3271s0 s0Var) {
        return new U(this.f32383q.a(), T.a(s0Var));
    }

    public final boolean p() {
        return this.f32363D;
    }

    public final long q() {
        return this.f32385s;
    }

    public final S0 r() {
        return this.f32386t;
    }

    public final int s() {
        return this.f32387u;
    }

    public final int t() {
        return this.f32388v;
    }

    public String toString() {
        return "ImmutableConfig(apiKey=" + this.f32367a + ", autoDetectErrors=" + this.f32368b + ", enabledErrorTypes=" + this.f32369c + ", autoTrackSessions=" + this.f32370d + ", sendThreads=" + this.f32371e + ", discardClasses=" + this.f32372f + ", enabledReleaseStages=" + this.f32373g + ", projectPackages=" + this.f32374h + ", enabledBreadcrumbTypes=" + this.f32375i + ", telemetry=" + this.f32376j + ", releaseStage=" + this.f32377k + ", buildUuid=" + this.f32378l + ", appVersion=" + this.f32379m + ", versionCode=" + this.f32380n + ", appType=" + this.f32381o + ", delivery=" + this.f32382p + ", endpoints=" + this.f32383q + ", persistUser=" + this.f32384r + ", launchDurationMillis=" + this.f32385s + ", logger=" + this.f32386t + ", maxBreadcrumbs=" + this.f32387u + ", maxPersistedEvents=" + this.f32388v + ", maxPersistedSessions=" + this.f32389w + ", maxReportedThreads=" + this.f32390x + ", maxStringValueLength=" + this.f32391y + ", threadCollectionTimeLimitMillis=" + this.f32392z + ", persistenceDirectory=" + this.f32360A + ", sendLaunchCrashesSynchronously=" + this.f32361B + ", attemptDeliveryOnCrash=" + this.f32362C + ", generateAnonymousId=" + this.f32363D + ", packageInfo=" + this.f32364E + ", appInfo=" + this.f32365F + ", redactedKeys=" + this.f32366G + ')';
    }

    public final int u() {
        return this.f32389w;
    }

    public final int v() {
        return this.f32390x;
    }

    public final int w() {
        return this.f32391y;
    }

    public final PackageInfo x() {
        return this.f32364E;
    }

    public final boolean y() {
        return this.f32384r;
    }

    public final Lazy z() {
        return this.f32360A;
    }
}
