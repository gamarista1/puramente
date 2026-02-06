package j8;

import android.content.Context;
import com.facebook.react.uimanager.C3430x;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private C3430x f44861a;

    /* renamed from: b  reason: collision with root package name */
    private C3430x f44862b;

    /* renamed from: c  reason: collision with root package name */
    private C3430x f44863c;

    /* renamed from: d  reason: collision with root package name */
    private C3430x f44864d;

    /* renamed from: e  reason: collision with root package name */
    private C3430x f44865e;

    /* renamed from: f  reason: collision with root package name */
    private C3430x f44866f;

    /* renamed from: g  reason: collision with root package name */
    private C3430x f44867g;

    /* renamed from: h  reason: collision with root package name */
    private C3430x f44868h;

    /* renamed from: i  reason: collision with root package name */
    private C3430x f44869i;

    /* renamed from: j  reason: collision with root package name */
    private C3430x f44870j;

    /* renamed from: k  reason: collision with root package name */
    private C3430x f44871k;

    /* renamed from: l  reason: collision with root package name */
    private C3430x f44872l;

    /* renamed from: m  reason: collision with root package name */
    private C3430x f44873m;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f44874a;

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|(2:25|26)|27|29) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|29) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                j8.d[] r0 = j8.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                j8.d r1 = j8.d.BORDER_RADIUS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                j8.d r1 = j8.d.BORDER_TOP_LEFT_RADIUS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                j8.d r1 = j8.d.BORDER_TOP_RIGHT_RADIUS     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                j8.d r1 = j8.d.BORDER_BOTTOM_LEFT_RADIUS     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                j8.d r1 = j8.d.BORDER_BOTTOM_RIGHT_RADIUS     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                j8.d r1 = j8.d.BORDER_TOP_START_RADIUS     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                j8.d r1 = j8.d.BORDER_TOP_END_RADIUS     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                j8.d r1 = j8.d.BORDER_BOTTOM_START_RADIUS     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                j8.d r1 = j8.d.BORDER_BOTTOM_END_RADIUS     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                j8.d r1 = j8.d.BORDER_START_START_RADIUS     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                j8.d r1 = j8.d.BORDER_START_END_RADIUS     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                j8.d r1 = j8.d.BORDER_END_START_RADIUS     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                j8.d r1 = j8.d.BORDER_END_END_RADIUS     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                f44874a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: j8.e.a.<clinit>():void");
        }
    }

    public e() {
        this((C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, (C3430x) null, 8191, (DefaultConstructorMarker) null);
    }

    private final i a(j jVar, j jVar2, j jVar3, j jVar4, float f10, float f11) {
        float f12;
        float f13;
        float f14;
        float a10 = jVar.a() + jVar3.a();
        float b10 = jVar.b() + jVar2.b();
        float a11 = jVar2.a() + jVar4.a();
        float b11 = jVar3.b() + jVar4.b();
        float f15 = 0.0f;
        if (a10 > 0.0f) {
            f12 = Math.min(1.0f, f11 / a10);
        } else {
            f12 = 0.0f;
        }
        if (b10 > 0.0f) {
            f13 = Math.min(1.0f, f10 / b10);
        } else {
            f13 = 0.0f;
        }
        if (a11 > 0.0f) {
            f14 = Math.min(1.0f, f11 / a11);
        } else {
            f14 = 0.0f;
        }
        if (b11 > 0.0f) {
            f15 = Math.min(1.0f, f10 / b11);
        }
        return new i(new j(jVar.a() * Math.min(f13, f12), jVar.b() * Math.min(f13, f12)), new j(jVar2.a() * Math.min(f13, f14), jVar2.b() * Math.min(f13, f14)), new j(jVar3.a() * Math.min(f15, f12), jVar3.b() * Math.min(f15, f12)), new j(jVar4.a() * Math.min(f15, f14), jVar4.b() * Math.min(f15, f14)));
    }

    public final C3430x b(d dVar) {
        C6496s.h(dVar, "property");
        switch (a.f44874a[dVar.ordinal()]) {
            case 1:
                return this.f44861a;
            case 2:
                return this.f44862b;
            case 3:
                return this.f44863c;
            case 4:
                return this.f44864d;
            case 5:
                return this.f44865e;
            case 6:
                return this.f44866f;
            case 7:
                return this.f44867g;
            case 8:
                return this.f44868h;
            case 9:
                return this.f44869i;
            case 10:
                return this.f44870j;
            case 11:
                return this.f44871k;
            case 12:
                return this.f44872l;
            case 13:
                return this.f44873m;
            default:
                throw new C6535s();
        }
    }

    public final boolean c() {
        if (this.f44861a == null && this.f44862b == null && this.f44863c == null && this.f44864d == null && this.f44865e == null && this.f44866f == null && this.f44867g == null && this.f44868h == null && this.f44869i == null && this.f44870j == null && this.f44871k == null && this.f44872l == null && this.f44873m == null) {
            return false;
        }
        return true;
    }

    public final i d(int i10, Context context, float f10, float f11) {
        j jVar;
        j jVar2;
        j jVar3;
        j jVar4;
        j b10;
        j b11;
        j b12;
        j b13;
        j jVar5;
        j jVar6;
        j jVar7;
        j jVar8;
        j b14;
        j b15;
        j b16;
        j b17;
        j jVar9;
        j jVar10;
        j jVar11;
        j jVar12;
        j b18;
        j b19;
        j b20;
        j b21;
        C6496s.h(context, "context");
        j jVar13 = new j(0.0f, 0.0f);
        if (i10 == 0) {
            C3430x xVar = this.f44870j;
            if (xVar == null && (xVar = this.f44866f) == null && (xVar = this.f44862b) == null) {
                xVar = this.f44861a;
            }
            if (xVar == null || (b13 = xVar.b(f10, f11)) == null) {
                jVar = jVar13;
            } else {
                jVar = b13;
            }
            C3430x xVar2 = this.f44872l;
            if (xVar2 == null && (xVar2 = this.f44867g) == null && (xVar2 = this.f44863c) == null) {
                xVar2 = this.f44861a;
            }
            if (xVar2 == null || (b12 = xVar2.b(f10, f11)) == null) {
                jVar2 = jVar13;
            } else {
                jVar2 = b12;
            }
            C3430x xVar3 = this.f44871k;
            if (xVar3 == null && (xVar3 = this.f44868h) == null && (xVar3 = this.f44864d) == null) {
                xVar3 = this.f44861a;
            }
            if (xVar3 == null || (b11 = xVar3.b(f10, f11)) == null) {
                jVar3 = jVar13;
            } else {
                jVar3 = b11;
            }
            C3430x xVar4 = this.f44873m;
            if (xVar4 == null && (xVar4 = this.f44869i) == null && (xVar4 = this.f44865e) == null) {
                xVar4 = this.f44861a;
            }
            if (xVar4 == null || (b10 = xVar4.b(f10, f11)) == null) {
                jVar4 = jVar13;
            } else {
                jVar4 = b10;
            }
            return a(jVar, jVar2, jVar3, jVar4, f10, f11);
        } else if (i10 != 1) {
            throw new IllegalArgumentException("Expected?.resolved layout direction");
        } else if (com.facebook.react.modules.i18nmanager.a.f41056a.a().d(context)) {
            C3430x xVar5 = this.f44872l;
            if (xVar5 == null && (xVar5 = this.f44867g) == null && (xVar5 = this.f44863c) == null) {
                xVar5 = this.f44861a;
            }
            if (xVar5 == null || (b21 = xVar5.b(f10, f11)) == null) {
                jVar9 = jVar13;
            } else {
                jVar9 = b21;
            }
            C3430x xVar6 = this.f44870j;
            if (xVar6 == null && (xVar6 = this.f44866f) == null && (xVar6 = this.f44862b) == null) {
                xVar6 = this.f44861a;
            }
            if (xVar6 == null || (b20 = xVar6.b(f10, f11)) == null) {
                jVar10 = jVar13;
            } else {
                jVar10 = b20;
            }
            C3430x xVar7 = this.f44873m;
            if (xVar7 == null && (xVar7 = this.f44869i) == null && (xVar7 = this.f44865e) == null) {
                xVar7 = this.f44861a;
            }
            if (xVar7 == null || (b19 = xVar7.b(f10, f11)) == null) {
                jVar11 = jVar13;
            } else {
                jVar11 = b19;
            }
            C3430x xVar8 = this.f44871k;
            if (xVar8 == null && (xVar8 = this.f44868h) == null && (xVar8 = this.f44864d) == null) {
                xVar8 = this.f44861a;
            }
            if (xVar8 == null || (b18 = xVar8.b(f10, f11)) == null) {
                jVar12 = jVar13;
            } else {
                jVar12 = b18;
            }
            return a(jVar9, jVar10, jVar11, jVar12, f10, f11);
        } else {
            C3430x xVar9 = this.f44872l;
            if (xVar9 == null && (xVar9 = this.f44867g) == null && (xVar9 = this.f44862b) == null) {
                xVar9 = this.f44861a;
            }
            if (xVar9 == null || (b17 = xVar9.b(f10, f11)) == null) {
                jVar5 = jVar13;
            } else {
                jVar5 = b17;
            }
            C3430x xVar10 = this.f44870j;
            if (xVar10 == null && (xVar10 = this.f44866f) == null && (xVar10 = this.f44863c) == null) {
                xVar10 = this.f44861a;
            }
            if (xVar10 == null || (b16 = xVar10.b(f10, f11)) == null) {
                jVar6 = jVar13;
            } else {
                jVar6 = b16;
            }
            C3430x xVar11 = this.f44873m;
            if (xVar11 == null && (xVar11 = this.f44868h) == null && (xVar11 = this.f44864d) == null) {
                xVar11 = this.f44861a;
            }
            if (xVar11 == null || (b15 = xVar11.b(f10, f11)) == null) {
                jVar7 = jVar13;
            } else {
                jVar7 = b15;
            }
            C3430x xVar12 = this.f44871k;
            if (xVar12 == null && (xVar12 = this.f44869i) == null && (xVar12 = this.f44865e) == null) {
                xVar12 = this.f44861a;
            }
            if (xVar12 == null || (b14 = xVar12.b(f10, f11)) == null) {
                jVar8 = jVar13;
            } else {
                jVar8 = b14;
            }
            return a(jVar5, jVar6, jVar7, jVar8, f10, f11);
        }
    }

    public final void e(d dVar, C3430x xVar) {
        C6496s.h(dVar, "property");
        switch (a.f44874a[dVar.ordinal()]) {
            case 1:
                this.f44861a = xVar;
                return;
            case 2:
                this.f44862b = xVar;
                return;
            case 3:
                this.f44863c = xVar;
                return;
            case 4:
                this.f44864d = xVar;
                return;
            case 5:
                this.f44865e = xVar;
                return;
            case 6:
                this.f44866f = xVar;
                return;
            case 7:
                this.f44867g = xVar;
                return;
            case 8:
                this.f44868h = xVar;
                return;
            case 9:
                this.f44869i = xVar;
                return;
            case 10:
                this.f44870j = xVar;
                return;
            case 11:
                this.f44871k = xVar;
                return;
            case 12:
                this.f44872l = xVar;
                return;
            case 13:
                this.f44873m = xVar;
                return;
            default:
                throw new C6535s();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (C6496s.c(this.f44861a, eVar.f44861a) && C6496s.c(this.f44862b, eVar.f44862b) && C6496s.c(this.f44863c, eVar.f44863c) && C6496s.c(this.f44864d, eVar.f44864d) && C6496s.c(this.f44865e, eVar.f44865e) && C6496s.c(this.f44866f, eVar.f44866f) && C6496s.c(this.f44867g, eVar.f44867g) && C6496s.c(this.f44868h, eVar.f44868h) && C6496s.c(this.f44869i, eVar.f44869i) && C6496s.c(this.f44870j, eVar.f44870j) && C6496s.c(this.f44871k, eVar.f44871k) && C6496s.c(this.f44872l, eVar.f44872l) && C6496s.c(this.f44873m, eVar.f44873m)) {
            return true;
        }
        return false;
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
        int i18;
        int i19;
        int i20;
        int i21;
        C3430x xVar = this.f44861a;
        int i22 = 0;
        if (xVar == null) {
            i10 = 0;
        } else {
            i10 = xVar.hashCode();
        }
        int i23 = i10 * 31;
        C3430x xVar2 = this.f44862b;
        if (xVar2 == null) {
            i11 = 0;
        } else {
            i11 = xVar2.hashCode();
        }
        int i24 = (i23 + i11) * 31;
        C3430x xVar3 = this.f44863c;
        if (xVar3 == null) {
            i12 = 0;
        } else {
            i12 = xVar3.hashCode();
        }
        int i25 = (i24 + i12) * 31;
        C3430x xVar4 = this.f44864d;
        if (xVar4 == null) {
            i13 = 0;
        } else {
            i13 = xVar4.hashCode();
        }
        int i26 = (i25 + i13) * 31;
        C3430x xVar5 = this.f44865e;
        if (xVar5 == null) {
            i14 = 0;
        } else {
            i14 = xVar5.hashCode();
        }
        int i27 = (i26 + i14) * 31;
        C3430x xVar6 = this.f44866f;
        if (xVar6 == null) {
            i15 = 0;
        } else {
            i15 = xVar6.hashCode();
        }
        int i28 = (i27 + i15) * 31;
        C3430x xVar7 = this.f44867g;
        if (xVar7 == null) {
            i16 = 0;
        } else {
            i16 = xVar7.hashCode();
        }
        int i29 = (i28 + i16) * 31;
        C3430x xVar8 = this.f44868h;
        if (xVar8 == null) {
            i17 = 0;
        } else {
            i17 = xVar8.hashCode();
        }
        int i30 = (i29 + i17) * 31;
        C3430x xVar9 = this.f44869i;
        if (xVar9 == null) {
            i18 = 0;
        } else {
            i18 = xVar9.hashCode();
        }
        int i31 = (i30 + i18) * 31;
        C3430x xVar10 = this.f44870j;
        if (xVar10 == null) {
            i19 = 0;
        } else {
            i19 = xVar10.hashCode();
        }
        int i32 = (i31 + i19) * 31;
        C3430x xVar11 = this.f44871k;
        if (xVar11 == null) {
            i20 = 0;
        } else {
            i20 = xVar11.hashCode();
        }
        int i33 = (i32 + i20) * 31;
        C3430x xVar12 = this.f44872l;
        if (xVar12 == null) {
            i21 = 0;
        } else {
            i21 = xVar12.hashCode();
        }
        int i34 = (i33 + i21) * 31;
        C3430x xVar13 = this.f44873m;
        if (xVar13 != null) {
            i22 = xVar13.hashCode();
        }
        return i34 + i22;
    }

    public String toString() {
        C3430x xVar = this.f44861a;
        C3430x xVar2 = this.f44862b;
        C3430x xVar3 = this.f44863c;
        C3430x xVar4 = this.f44864d;
        C3430x xVar5 = this.f44865e;
        C3430x xVar6 = this.f44866f;
        C3430x xVar7 = this.f44867g;
        C3430x xVar8 = this.f44868h;
        C3430x xVar9 = this.f44869i;
        C3430x xVar10 = this.f44870j;
        C3430x xVar11 = this.f44871k;
        C3430x xVar12 = this.f44872l;
        C3430x xVar13 = this.f44873m;
        return "BorderRadiusStyle(uniform=" + xVar + ", topLeft=" + xVar2 + ", topRight=" + xVar3 + ", bottomLeft=" + xVar4 + ", bottomRight=" + xVar5 + ", topStart=" + xVar6 + ", topEnd=" + xVar7 + ", bottomStart=" + xVar8 + ", bottomEnd=" + xVar9 + ", startStart=" + xVar10 + ", startEnd=" + xVar11 + ", endStart=" + xVar12 + ", endEnd=" + xVar13 + ")";
    }

    public e(C3430x xVar, C3430x xVar2, C3430x xVar3, C3430x xVar4, C3430x xVar5, C3430x xVar6, C3430x xVar7, C3430x xVar8, C3430x xVar9, C3430x xVar10, C3430x xVar11, C3430x xVar12, C3430x xVar13) {
        this.f44861a = xVar;
        this.f44862b = xVar2;
        this.f44863c = xVar3;
        this.f44864d = xVar4;
        this.f44865e = xVar5;
        this.f44866f = xVar6;
        this.f44867g = xVar7;
        this.f44868h = xVar8;
        this.f44869i = xVar9;
        this.f44870j = xVar10;
        this.f44871k = xVar11;
        this.f44872l = xVar12;
        this.f44873m = xVar13;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ e(com.facebook.react.uimanager.C3430x r15, com.facebook.react.uimanager.C3430x r16, com.facebook.react.uimanager.C3430x r17, com.facebook.react.uimanager.C3430x r18, com.facebook.react.uimanager.C3430x r19, com.facebook.react.uimanager.C3430x r20, com.facebook.react.uimanager.C3430x r21, com.facebook.react.uimanager.C3430x r22, com.facebook.react.uimanager.C3430x r23, com.facebook.react.uimanager.C3430x r24, com.facebook.react.uimanager.C3430x r25, com.facebook.react.uimanager.C3430x r26, com.facebook.react.uimanager.C3430x r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
            r14 = this;
            r0 = r28
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r15
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0012
        L_0x0010:
            r3 = r16
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r2
            goto L_0x001a
        L_0x0018:
            r4 = r17
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = r2
            goto L_0x0022
        L_0x0020:
            r5 = r18
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = r2
            goto L_0x002a
        L_0x0028:
            r6 = r19
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = r2
            goto L_0x0032
        L_0x0030:
            r7 = r20
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = r2
            goto L_0x003a
        L_0x0038:
            r8 = r21
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = r2
            goto L_0x0042
        L_0x0040:
            r9 = r22
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = r2
            goto L_0x004a
        L_0x0048:
            r10 = r23
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = r2
            goto L_0x0052
        L_0x0050:
            r11 = r24
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = r2
            goto L_0x005a
        L_0x0058:
            r12 = r25
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = r2
            goto L_0x0062
        L_0x0060:
            r13 = r26
        L_0x0062:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            r2 = r27
        L_0x0069:
            r15 = r14
            r16 = r1
            r17 = r3
            r18 = r4
            r19 = r5
            r20 = r6
            r21 = r7
            r22 = r8
            r23 = r9
            r24 = r10
            r25 = r11
            r26 = r12
            r27 = r13
            r28 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.e.<init>(com.facebook.react.uimanager.x, com.facebook.react.uimanager.x, com.facebook.react.uimanager.x, com.facebook.react.uimanager.x, com.facebook.react.uimanager.x, com.facebook.react.uimanager.x, com.facebook.react.uimanager.x, com.facebook.react.uimanager.x, com.facebook.react.uimanager.x, com.facebook.react.uimanager.x, com.facebook.react.uimanager.x, com.facebook.react.uimanager.x, com.facebook.react.uimanager.x, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
