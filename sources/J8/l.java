package j8;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;
import sf.C6714a;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f44905a;

    /* renamed from: b  reason: collision with root package name */
    private final float[] f44906b;

    /* renamed from: c  reason: collision with root package name */
    private final a f44907c;

    private static abstract class a {

        /* renamed from: j8.l$a$a  reason: collision with other inner class name */
        public static final class C0687a extends a {

            /* renamed from: a  reason: collision with root package name */
            private final double f44908a;

            public C0687a(double d10) {
                super((DefaultConstructorMarker) null);
                this.f44908a = d10;
            }

            public final double a() {
                return this.f44908a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0687a) && Double.compare(this.f44908a, ((C0687a) obj).f44908a) == 0) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return Double.hashCode(this.f44908a);
            }

            public String toString() {
                double d10 = this.f44908a;
                return "Angle(value=" + d10 + ")";
            }
        }

        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            private final c f44909a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(c cVar) {
                super((DefaultConstructorMarker) null);
                C6496s.h(cVar, "value");
                this.f44909a = cVar;
            }

            public final c a() {
                return this.f44909a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof b) && this.f44909a == ((b) obj).f44909a) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f44909a.hashCode();
            }

            public String toString() {
                c cVar = this.f44909a;
                return "Keyword(value=" + cVar + ")";
            }
        }

        public enum c {
            TO_TOP_RIGHT,
            TO_BOTTOM_RIGHT,
            TO_TOP_LEFT,
            TO_BOTTOM_LEFT;

            static {
                c[] a10;
                f44915f = C6714a.a(a10);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f44916a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                j8.l$a$c[] r0 = j8.l.a.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                j8.l$a$c r1 = j8.l.a.c.TO_TOP_RIGHT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                j8.l$a$c r1 = j8.l.a.c.TO_BOTTOM_RIGHT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                j8.l$a$c r1 = j8.l.a.c.TO_TOP_LEFT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                j8.l$a$c r1 = j8.l.a.c.TO_BOTTOM_LEFT     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f44916a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: j8.l.b.<clinit>():void");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0071, code lost:
        r4 = new j8.l.a.b(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l(com.facebook.react.bridge.ReadableMap r2, int[] r3, float[] r4) {
        /*
            r1 = this;
            java.lang.String r0 = "directionMap"
            kotlin.jvm.internal.C6496s.h(r2, r0)
            java.lang.String r0 = "colors"
            kotlin.jvm.internal.C6496s.h(r3, r0)
            java.lang.String r0 = "positions"
            kotlin.jvm.internal.C6496s.h(r4, r0)
            r1.<init>()
            r1.f44905a = r3
            r1.f44906b = r4
            java.lang.String r3 = "type"
            java.lang.String r3 = r2.getString(r3)
            java.lang.String r4 = "angle"
            boolean r4 = kotlin.jvm.internal.C6496s.c(r3, r4)
            java.lang.String r0 = "value"
            if (r4 == 0) goto L_0x0030
            double r2 = r2.getDouble(r0)
            j8.l$a$a r4 = new j8.l$a$a
            r4.<init>(r2)
            goto L_0x0076
        L_0x0030:
            java.lang.String r4 = "keyword"
            boolean r4 = kotlin.jvm.internal.C6496s.c(r3, r4)
            if (r4 == 0) goto L_0x0094
            java.lang.String r3 = r2.getString(r0)
            if (r3 == 0) goto L_0x0079
            int r4 = r3.hashCode()
            switch(r4) {
                case -1849920841: goto L_0x0067;
                case -1507310228: goto L_0x005c;
                case -1359525897: goto L_0x0051;
                case 810031148: goto L_0x0046;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x0079
        L_0x0046:
            java.lang.String r4 = "to top right"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0079
            j8.l$a$c r2 = j8.l.a.c.TO_TOP_RIGHT
            goto L_0x0071
        L_0x0051:
            java.lang.String r4 = "to top left"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0079
            j8.l$a$c r2 = j8.l.a.c.TO_TOP_LEFT
            goto L_0x0071
        L_0x005c:
            java.lang.String r4 = "to bottom right"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0079
            j8.l$a$c r2 = j8.l.a.c.TO_BOTTOM_RIGHT
            goto L_0x0071
        L_0x0067:
            java.lang.String r4 = "to bottom left"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0079
            j8.l$a$c r2 = j8.l.a.c.TO_BOTTOM_LEFT
        L_0x0071:
            j8.l$a$b r4 = new j8.l$a$b
            r4.<init>(r2)
        L_0x0076:
            r1.f44907c = r4
            return
        L_0x0079:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.getString(r0)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Invalid linear gradient direction keyword: "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
        L_0x0094:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Invalid direction type: "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.l.<init>(com.facebook.react.bridge.ReadableMap, int[], float[]):void");
    }

    private final Pair a(double d10, float f10, float f11) {
        double d11 = (double) 360;
        double d12 = d10 % d11;
        if (d12 < 0.0d) {
            d12 += d11;
        }
        if (d12 == 0.0d) {
            return new Pair(new float[]{0.0f, f10}, new float[]{0.0f, 0.0f});
        }
        int i10 = (d12 > 90.0d ? 1 : (d12 == 90.0d ? 0 : -1));
        if (i10 == 0) {
            return new Pair(new float[]{0.0f, 0.0f}, new float[]{f11, 0.0f});
        }
        int i11 = (d12 > 180.0d ? 1 : (d12 == 180.0d ? 0 : -1));
        if (i11 == 0) {
            return new Pair(new float[]{0.0f, 0.0f}, new float[]{0.0f, f10});
        }
        int i12 = (d12 > 270.0d ? 1 : (d12 == 270.0d ? 0 : -1));
        if (i12 == 0) {
            return new Pair(new float[]{f11, 0.0f}, new float[]{0.0f, 0.0f});
        }
        float tan = (float) Math.tan(Math.toRadians(((double) 90) - d12));
        float f12 = ((float) -1) / tan;
        float f13 = (float) 2;
        float f14 = f10 / f13;
        float f15 = f11 / f13;
        float[] fArr = i10 < 0 ? new float[]{f15, f14} : i11 < 0 ? new float[]{f15, -f14} : i12 < 0 ? new float[]{-f15, -f14} : new float[]{-f15, f14};
        float f16 = fArr[1] - (fArr[0] * f12);
        float f17 = f16 / (tan - f12);
        float f18 = (f12 * f17) + f16;
        return new Pair(new float[]{f15 - f17, f14 + f18}, new float[]{f15 + f17, f14 - f18});
    }

    private final double b(a.c cVar, double d10, double d11) {
        double degrees;
        double d12;
        int i10;
        int i11 = b.f44916a[cVar.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    degrees = Math.toDegrees(Math.atan(d10 / d11));
                    i10 = 270;
                } else if (i11 == 4) {
                    degrees = Math.toDegrees(Math.atan(d11 / d10));
                    i10 = 180;
                } else {
                    throw new C6535s();
                }
                d12 = (double) i10;
            } else {
                degrees = Math.toDegrees(Math.atan(d10 / d11));
                d12 = (double) 90;
            }
            return degrees + d12;
        }
        return ((double) 90) - Math.toDegrees(Math.atan(d10 / d11));
    }

    public final Shader c(float f10, float f11) {
        double d10;
        a aVar = this.f44907c;
        if (aVar instanceof a.C0687a) {
            d10 = ((a.C0687a) aVar).a();
        } else if (aVar instanceof a.b) {
            d10 = b(((a.b) aVar).a(), (double) f10, (double) f11);
        } else {
            throw new C6535s();
        }
        Pair a10 = a(d10, f11, f10);
        float[] fArr = (float[]) a10.a();
        float[] fArr2 = (float[]) a10.b();
        return new LinearGradient(fArr[0], fArr[1], fArr2[0], fArr2[1], this.f44905a, this.f44906b, Shader.TileMode.CLAMP);
    }
}
