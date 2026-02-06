package V;

import X.C1459b;
import X.C1460c;
import X.C1461d;
import Y.C1500m;
import Y.C1506p;
import Y.C1521x;
import Y.I0;
import c1.h;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2544x0;
import r0.C2550z0;
import yf.C6787a;

/* renamed from: V.s  reason: case insensitive filesystem */
public abstract class C1404s {

    /* renamed from: a  reason: collision with root package name */
    private static final I0 f8009a = C1521x.f(a.f8011a);

    /* renamed from: b  reason: collision with root package name */
    private static final I0 f8010b = C1521x.f(b.f8012a);

    /* renamed from: V.s$a */
    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f8011a = new a();

        a() {
            super(0);
        }

        /* renamed from: a */
        public final r invoke() {
            return C1404s.j(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 15, (Object) null);
        }
    }

    /* renamed from: V.s$b */
    static final class b extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f8012a = new b();

        b() {
            super(0);
        }

        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    /* renamed from: V.s$c */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8013a;

        /* JADX WARNING: Can't wrap try/catch for region: R(74:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(2:71|72)|73|75) */
        /* JADX WARNING: Can't wrap try/catch for region: R(75:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|75) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x008c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0096 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00a0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00aa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00be */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00c8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00d2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00dc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00e6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00fa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0104 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x010e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0118 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x0122 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x012c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0136 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0140 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x014a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0154 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x015e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                X.d[] r0 = X.C1461d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                X.d r1 = X.C1461d.Background     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                X.d r1 = X.C1461d.Error     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                X.d r1 = X.C1461d.ErrorContainer     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                X.d r1 = X.C1461d.InverseOnSurface     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                X.d r1 = X.C1461d.InversePrimary     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                X.d r1 = X.C1461d.InverseSurface     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                X.d r1 = X.C1461d.OnBackground     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                X.d r1 = X.C1461d.OnError     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                X.d r1 = X.C1461d.OnErrorContainer     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                X.d r1 = X.C1461d.OnPrimary     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                X.d r1 = X.C1461d.OnPrimaryContainer     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                X.d r1 = X.C1461d.OnSecondary     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                X.d r1 = X.C1461d.OnSecondaryContainer     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                X.d r1 = X.C1461d.OnSurface     // Catch:{ NoSuchFieldError -> 0x008c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008c }
            L_0x008c:
                X.d r1 = X.C1461d.OnSurfaceVariant     // Catch:{ NoSuchFieldError -> 0x0096 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0096 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0096 }
            L_0x0096:
                X.d r1 = X.C1461d.SurfaceTint     // Catch:{ NoSuchFieldError -> 0x00a0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a0 }
            L_0x00a0:
                X.d r1 = X.C1461d.OnTertiary     // Catch:{ NoSuchFieldError -> 0x00aa }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00aa }
            L_0x00aa:
                X.d r1 = X.C1461d.OnTertiaryContainer     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                X.d r1 = X.C1461d.Outline     // Catch:{ NoSuchFieldError -> 0x00be }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00be }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00be }
            L_0x00be:
                X.d r1 = X.C1461d.OutlineVariant     // Catch:{ NoSuchFieldError -> 0x00c8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c8 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c8 }
            L_0x00c8:
                X.d r1 = X.C1461d.Primary     // Catch:{ NoSuchFieldError -> 0x00d2 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d2 }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d2 }
            L_0x00d2:
                X.d r1 = X.C1461d.PrimaryContainer     // Catch:{ NoSuchFieldError -> 0x00dc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dc }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00dc }
            L_0x00dc:
                X.d r1 = X.C1461d.Scrim     // Catch:{ NoSuchFieldError -> 0x00e6 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e6 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e6 }
            L_0x00e6:
                X.d r1 = X.C1461d.Secondary     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 24
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                X.d r1 = X.C1461d.SecondaryContainer     // Catch:{ NoSuchFieldError -> 0x00fa }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fa }
                r2 = 25
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fa }
            L_0x00fa:
                X.d r1 = X.C1461d.Surface     // Catch:{ NoSuchFieldError -> 0x0104 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0104 }
                r2 = 26
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0104 }
            L_0x0104:
                X.d r1 = X.C1461d.SurfaceVariant     // Catch:{ NoSuchFieldError -> 0x010e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x010e }
                r2 = 27
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x010e }
            L_0x010e:
                X.d r1 = X.C1461d.SurfaceBright     // Catch:{ NoSuchFieldError -> 0x0118 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0118 }
                r2 = 28
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0118 }
            L_0x0118:
                X.d r1 = X.C1461d.SurfaceContainer     // Catch:{ NoSuchFieldError -> 0x0122 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0122 }
                r2 = 29
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0122 }
            L_0x0122:
                X.d r1 = X.C1461d.SurfaceContainerHigh     // Catch:{ NoSuchFieldError -> 0x012c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012c }
                r2 = 30
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x012c }
            L_0x012c:
                X.d r1 = X.C1461d.SurfaceContainerHighest     // Catch:{ NoSuchFieldError -> 0x0136 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0136 }
                r2 = 31
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0136 }
            L_0x0136:
                X.d r1 = X.C1461d.SurfaceContainerLow     // Catch:{ NoSuchFieldError -> 0x0140 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0140 }
                r2 = 32
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0140 }
            L_0x0140:
                X.d r1 = X.C1461d.SurfaceContainerLowest     // Catch:{ NoSuchFieldError -> 0x014a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x014a }
                r2 = 33
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x014a }
            L_0x014a:
                X.d r1 = X.C1461d.SurfaceDim     // Catch:{ NoSuchFieldError -> 0x0154 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0154 }
                r2 = 34
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0154 }
            L_0x0154:
                X.d r1 = X.C1461d.Tertiary     // Catch:{ NoSuchFieldError -> 0x015e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x015e }
                r2 = 35
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x015e }
            L_0x015e:
                X.d r1 = X.C1461d.TertiaryContainer     // Catch:{ NoSuchFieldError -> 0x0168 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0168 }
                r2 = 36
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0168 }
            L_0x0168:
                f8013a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: V.C1404s.c.<clinit>():void");
        }
    }

    public static final long a(r rVar, long j10, float f10, C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(-1610977682, i10, -1, "androidx.compose.material3.applyTonalElevation (ColorScheme.kt:895)");
        }
        boolean booleanValue = ((Boolean) mVar.m(f8010b)).booleanValue();
        if (C2544x0.q(j10, rVar.I()) && booleanValue) {
            j10 = k(rVar, f10);
        }
        if (C1506p.H()) {
            C1506p.P();
        }
        return j10;
    }

    public static final long b(r rVar, long j10) {
        if (C2544x0.q(j10, rVar.D())) {
            return rVar.t();
        }
        if (C2544x0.q(j10, rVar.G())) {
            return rVar.v();
        }
        if (C2544x0.q(j10, rVar.S())) {
            return rVar.z();
        }
        if (C2544x0.q(j10, rVar.a())) {
            return rVar.q();
        }
        if (C2544x0.q(j10, rVar.l())) {
            return rVar.r();
        }
        if (C2544x0.q(j10, rVar.E())) {
            return rVar.u();
        }
        if (C2544x0.q(j10, rVar.H())) {
            return rVar.w();
        }
        if (C2544x0.q(j10, rVar.T())) {
            return rVar.A();
        }
        if (C2544x0.q(j10, rVar.m())) {
            return rVar.s();
        }
        if (C2544x0.q(j10, rVar.p())) {
            return rVar.n();
        }
        if (C2544x0.q(j10, rVar.I())) {
            return rVar.x();
        }
        if (C2544x0.q(j10, rVar.R())) {
            return rVar.y();
        }
        if (C2544x0.q(j10, rVar.J())) {
            return rVar.x();
        }
        if (C2544x0.q(j10, rVar.K())) {
            return rVar.x();
        }
        if (C2544x0.q(j10, rVar.L())) {
            return rVar.x();
        }
        if (C2544x0.q(j10, rVar.M())) {
            return rVar.x();
        }
        if (C2544x0.q(j10, rVar.N())) {
            return rVar.x();
        }
        if (C2544x0.q(j10, rVar.O())) {
            return rVar.x();
        }
        return C2544x0.f25560b.h();
    }

    public static final long c(long j10, C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(509589638, i10, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:878)");
        }
        mVar.T(-1680936624);
        long b10 = b(X.f7146a.a(mVar, 6), j10);
        if (b10 == 16) {
            b10 = ((C2544x0) mVar.m(A.a())).y();
        }
        mVar.M();
        if (C1506p.H()) {
            C1506p.P();
        }
        return b10;
    }

    public static final r d(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45) {
        return new r(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j45, j40, j41, j42, j43, j44, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ r e(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, int i10, int i11, Object obj) {
        int i12 = i10;
        long t10 = (i12 & 1) != 0 ? C1459b.f8917a.t() : j10;
        return d(t10, (i12 & 2) != 0 ? C1459b.f8917a.j() : j11, (i12 & 4) != 0 ? C1459b.f8917a.u() : j12, (i12 & 8) != 0 ? C1459b.f8917a.k() : j13, (i12 & 16) != 0 ? C1459b.f8917a.e() : j14, (i12 & 32) != 0 ? C1459b.f8917a.w() : j15, (i12 & 64) != 0 ? C1459b.f8917a.l() : j16, (i12 & 128) != 0 ? C1459b.f8917a.x() : j17, (i12 & 256) != 0 ? C1459b.f8917a.m() : j18, (i12 & 512) != 0 ? C1459b.f8917a.H() : j19, (i12 & 1024) != 0 ? C1459b.f8917a.p() : j20, (i12 & 2048) != 0 ? C1459b.f8917a.I() : j21, (i12 & 4096) != 0 ? C1459b.f8917a.q() : j22, (i12 & 8192) != 0 ? C1459b.f8917a.a() : j23, (i12 & 16384) != 0 ? C1459b.f8917a.g() : j24, (i12 & 32768) != 0 ? C1459b.f8917a.y() : j25, (i12 & 65536) != 0 ? C1459b.f8917a.n() : j26, (i12 & 131072) != 0 ? C1459b.f8917a.G() : j27, (i12 & 262144) != 0 ? C1459b.f8917a.o() : j28, (i12 & 524288) != 0 ? t10 : j29, (i12 & 1048576) != 0 ? C1459b.f8917a.f() : j30, (i12 & 2097152) != 0 ? C1459b.f8917a.d() : j31, (i12 & 4194304) != 0 ? C1459b.f8917a.b() : j32, (i12 & 8388608) != 0 ? C1459b.f8917a.h() : j33, (i12 & 16777216) != 0 ? C1459b.f8917a.c() : j34, (i12 & 33554432) != 0 ? C1459b.f8917a.i() : j35, (i12 & 67108864) != 0 ? C1459b.f8917a.r() : j36, (i12 & 134217728) != 0 ? C1459b.f8917a.s() : j37, (i12 & 268435456) != 0 ? C1459b.f8917a.v() : j38, (i12 & 536870912) != 0 ? C1459b.f8917a.z() : j39, (i12 & 1073741824) != 0 ? C1459b.f8917a.A() : j40, (i12 & Integer.MIN_VALUE) != 0 ? C1459b.f8917a.B() : j41, (i11 & 1) != 0 ? C1459b.f8917a.C() : j42, (i11 & 2) != 0 ? C1459b.f8917a.D() : j43, (i11 & 4) != 0 ? C1459b.f8917a.E() : j44, (i11 & 8) != 0 ? C1459b.f8917a.F() : j45);
    }

    public static final long f(r rVar, C1461d dVar) {
        switch (c.f8013a[dVar.ordinal()]) {
            case 1:
                return rVar.a();
            case 2:
                return rVar.l();
            case 3:
                return rVar.m();
            case 4:
                return rVar.n();
            case 5:
                return rVar.o();
            case 6:
                return rVar.p();
            case 7:
                return rVar.q();
            case 8:
                return rVar.r();
            case 9:
                return rVar.s();
            case 10:
                return rVar.t();
            case 11:
                return rVar.u();
            case 12:
                return rVar.v();
            case 13:
                return rVar.w();
            case StdKeyDeserializer.TYPE_URL /*14*/:
                return rVar.x();
            case StdKeyDeserializer.TYPE_CLASS /*15*/:
                return rVar.y();
            case 16:
                return rVar.Q();
            case 17:
                return rVar.z();
            case 18:
                return rVar.A();
            case 19:
                return rVar.B();
            case InboxPagingSource.PAGE_SIZE /*20*/:
                return rVar.C();
            case 21:
                return rVar.D();
            case 22:
                return rVar.E();
            case 23:
                return rVar.F();
            case 24:
                return rVar.G();
            case 25:
                return rVar.H();
            case 26:
                return rVar.I();
            case 27:
                return rVar.R();
            case 28:
                return rVar.J();
            case 29:
                return rVar.K();
            case 30:
                return rVar.L();
            case 31:
                return rVar.M();
            case com.amazon.c.a.a.c.f37660h /*32*/:
                return rVar.N();
            case CharsToNameCanonicalizer.HASH_MULT /*33*/:
                return rVar.O();
            case 34:
                return rVar.P();
            case 35:
                return rVar.S();
            case 36:
                return rVar.T();
            default:
                return C2544x0.f25560b.h();
        }
    }

    public static final I0 g() {
        return f8009a;
    }

    public static final long h(C1461d dVar, C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(-810780884, i10, -1, "androidx.compose.material3.<get-value> (ColorScheme.kt:1009)");
        }
        long f10 = f(X.f7146a.a(mVar, 6), dVar);
        if (C1506p.H()) {
            C1506p.P();
        }
        return f10;
    }

    public static final r i(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45) {
        return new r(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j45, j40, j41, j42, j43, j44, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ r j(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, int i10, int i11, Object obj) {
        int i12 = i10;
        long t10 = (i12 & 1) != 0 ? C1460c.f8966a.t() : j10;
        return i(t10, (i12 & 2) != 0 ? C1460c.f8966a.j() : j11, (i12 & 4) != 0 ? C1460c.f8966a.u() : j12, (i12 & 8) != 0 ? C1460c.f8966a.k() : j13, (i12 & 16) != 0 ? C1460c.f8966a.e() : j14, (i12 & 32) != 0 ? C1460c.f8966a.w() : j15, (i12 & 64) != 0 ? C1460c.f8966a.l() : j16, (i12 & 128) != 0 ? C1460c.f8966a.x() : j17, (i12 & 256) != 0 ? C1460c.f8966a.m() : j18, (i12 & 512) != 0 ? C1460c.f8966a.H() : j19, (i12 & 1024) != 0 ? C1460c.f8966a.p() : j20, (i12 & 2048) != 0 ? C1460c.f8966a.I() : j21, (i12 & 4096) != 0 ? C1460c.f8966a.q() : j22, (i12 & 8192) != 0 ? C1460c.f8966a.a() : j23, (i12 & 16384) != 0 ? C1460c.f8966a.g() : j24, (i12 & 32768) != 0 ? C1460c.f8966a.y() : j25, (i12 & 65536) != 0 ? C1460c.f8966a.n() : j26, (i12 & 131072) != 0 ? C1460c.f8966a.G() : j27, (i12 & 262144) != 0 ? C1460c.f8966a.o() : j28, (i12 & 524288) != 0 ? t10 : j29, (i12 & 1048576) != 0 ? C1460c.f8966a.f() : j30, (i12 & 2097152) != 0 ? C1460c.f8966a.d() : j31, (i12 & 4194304) != 0 ? C1460c.f8966a.b() : j32, (i12 & 8388608) != 0 ? C1460c.f8966a.h() : j33, (i12 & 16777216) != 0 ? C1460c.f8966a.c() : j34, (i12 & 33554432) != 0 ? C1460c.f8966a.i() : j35, (i12 & 67108864) != 0 ? C1460c.f8966a.r() : j36, (i12 & 134217728) != 0 ? C1460c.f8966a.s() : j37, (i12 & 268435456) != 0 ? C1460c.f8966a.v() : j38, (i12 & 536870912) != 0 ? C1460c.f8966a.z() : j39, (i12 & 1073741824) != 0 ? C1460c.f8966a.A() : j40, (i12 & Integer.MIN_VALUE) != 0 ? C1460c.f8966a.B() : j41, (i11 & 1) != 0 ? C1460c.f8966a.C() : j42, (i11 & 2) != 0 ? C1460c.f8966a.D() : j43, (i11 & 4) != 0 ? C1460c.f8966a.E() : j44, (i11 & 8) != 0 ? C1460c.f8966a.F() : j45);
    }

    public static final long k(r rVar, float f10) {
        if (h.m(f10, h.j((float) 0))) {
            return rVar.I();
        }
        return C2550z0.h(C2544x0.o(rVar.Q(), ((((float) Math.log((double) (f10 + ((float) 1)))) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null), rVar.I());
    }
}
