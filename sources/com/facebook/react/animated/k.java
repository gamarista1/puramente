package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.C2387c;
import sf.C6714a;

public final class k extends w {

    /* renamed from: q  reason: collision with root package name */
    public static final a f40484q = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public static final Pattern f40485r;

    /* renamed from: i  reason: collision with root package name */
    private final double[] f40486i;

    /* renamed from: j  reason: collision with root package name */
    private Object f40487j;

    /* renamed from: k  reason: collision with root package name */
    private b f40488k;

    /* renamed from: l  reason: collision with root package name */
    private String f40489l;

    /* renamed from: m  reason: collision with root package name */
    private final String f40490m;

    /* renamed from: n  reason: collision with root package name */
    private final String f40491n;

    /* renamed from: o  reason: collision with root package name */
    private w f40492o;

    /* renamed from: p  reason: collision with root package name */
    private Object f40493p;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int d(double d10, double[] dArr) {
            int i10 = 1;
            while (i10 < dArr.length - 1 && dArr[i10] < d10) {
                i10++;
            }
            return i10 - 1;
        }

        /* access modifiers changed from: private */
        public final double[] e(ReadableArray readableArray) {
            if (readableArray == null) {
                return new double[0];
            }
            int size = readableArray.size();
            double[] dArr = new double[size];
            for (int i10 = 0; i10 < size; i10++) {
                dArr[i10] = readableArray.getDouble(i10);
            }
            return dArr;
        }

        /* access modifiers changed from: private */
        public final int[] f(ReadableArray readableArray) {
            if (readableArray == null) {
                return new int[0];
            }
            int size = readableArray.size();
            int[] iArr = new int[size];
            for (int i10 = 0; i10 < size; i10++) {
                iArr[i10] = readableArray.getInt(i10);
            }
            return iArr;
        }

        /* access modifiers changed from: private */
        public final double[][] g(ReadableArray readableArray) {
            int size = readableArray.size();
            double[][] dArr = new double[size][];
            Pattern o10 = k.f40485r;
            String string = readableArray.getString(0);
            if (string == null) {
                string = "";
            }
            Matcher matcher = o10.matcher(string);
            ArrayList arrayList = new ArrayList();
            while (matcher.find()) {
                String group = matcher.group();
                C6496s.g(group, "group(...)");
                arrayList.add(Double.valueOf(Double.parseDouble(group)));
            }
            int size2 = arrayList.size();
            double[] dArr2 = new double[size2];
            int size3 = arrayList.size();
            for (int i10 = 0; i10 < size3; i10++) {
                dArr2[i10] = ((Number) arrayList.get(i10)).doubleValue();
            }
            dArr[0] = dArr2;
            for (int i11 = 1; i11 < size; i11++) {
                double[] dArr3 = new double[size2];
                Pattern o11 = k.f40485r;
                String string2 = readableArray.getString(i11);
                if (string2 == null) {
                    string2 = "";
                }
                Matcher matcher2 = o11.matcher(string2);
                int i12 = 0;
                while (matcher2.find() && i12 < size2) {
                    String group2 = matcher2.group();
                    C6496s.g(group2, "group(...)");
                    dArr3[i12] = Double.parseDouble(group2);
                    i12++;
                }
                dArr[i11] = dArr3;
            }
            return dArr;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
            if (r0.equals("extend") != false) goto L_0x0055;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x007a, code lost:
            if (r1.equals("extend") != false) goto L_0x0097;
         */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x009b A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x009c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final double h(double r13, double r15, double r17, double r19, double r21, java.lang.String r23, java.lang.String r24) {
            /*
                r12 = this;
                r0 = r23
                r1 = r24
                int r2 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                java.lang.String r3 = "Invalid extrapolation type "
                java.lang.String r4 = "extend"
                java.lang.String r5 = "identity"
                java.lang.String r6 = "clamp"
                r7 = 94742715(0x5a5a8bb, float:1.5578507E-35)
                r8 = -135761730(0xfffffffff7e870be, float:-9.428903E33)
                r9 = -1289044198(0xffffffffb32abf1a, float:-3.9755015E-8)
                if (r2 >= 0) goto L_0x0055
                if (r0 == 0) goto L_0x003b
                int r10 = r23.hashCode()
                if (r10 == r9) goto L_0x0034
                if (r10 == r8) goto L_0x002d
                if (r10 != r7) goto L_0x003b
                boolean r10 = r0.equals(r6)
                if (r10 == 0) goto L_0x003b
                r10 = r15
                goto L_0x0056
            L_0x002d:
                boolean r1 = r0.equals(r5)
                if (r1 == 0) goto L_0x003b
                return r13
            L_0x0034:
                boolean r10 = r0.equals(r4)
                if (r10 == 0) goto L_0x003b
                goto L_0x0055
            L_0x003b:
                com.facebook.react.bridge.JSApplicationIllegalArgumentException r1 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = "for left extrapolation"
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L_0x0055:
                r10 = r13
            L_0x0056:
                int r0 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
                if (r0 <= 0) goto L_0x0097
                if (r1 == 0) goto L_0x007d
                int r0 = r24.hashCode()
                if (r0 == r9) goto L_0x0076
                if (r0 == r8) goto L_0x006f
                if (r0 != r7) goto L_0x007d
                boolean r0 = r1.equals(r6)
                if (r0 == 0) goto L_0x007d
                r10 = r17
                goto L_0x0097
            L_0x006f:
                boolean r0 = r1.equals(r5)
                if (r0 == 0) goto L_0x007d
                return r10
            L_0x0076:
                boolean r0 = r1.equals(r4)
                if (r0 == 0) goto L_0x007d
                goto L_0x0097
            L_0x007d:
                com.facebook.react.bridge.JSApplicationIllegalArgumentException r0 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = "for right extrapolation"
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
            L_0x0097:
                int r0 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
                if (r0 != 0) goto L_0x009c
                return r19
            L_0x009c:
                int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
                if (r0 != 0) goto L_0x00a8
                if (r2 > 0) goto L_0x00a5
                r0 = r19
                goto L_0x00b1
            L_0x00a5:
                r0 = r21
                goto L_0x00b1
            L_0x00a8:
                double r0 = r21 - r19
                double r10 = r10 - r15
                double r0 = r0 * r10
                double r2 = r17 - r15
                double r0 = r0 / r2
                double r0 = r19 + r0
            L_0x00b1:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.animated.k.a.h(double, double, double, double, double, java.lang.String, java.lang.String):double");
        }

        public final double i(double d10, double[] dArr, double[] dArr2, String str, String str2) {
            double[] dArr3 = dArr;
            double[] dArr4 = dArr2;
            C6496s.h(dArr3, "inputRange");
            C6496s.h(dArr4, "outputRange");
            int d11 = d(d10, dArr);
            int i10 = d11 + 1;
            return h(d10, dArr3[d11], dArr3[i10], dArr4[d11], dArr4[i10], str, str2);
        }

        public final int j(double d10, double[] dArr, int[] iArr) {
            C6496s.h(dArr, "inputRange");
            C6496s.h(iArr, "outputRange");
            int d11 = d(d10, dArr);
            int i10 = iArr[d11];
            int i11 = d11 + 1;
            int i12 = iArr[i11];
            if (i10 == i12) {
                return i10;
            }
            double d12 = dArr[d11];
            double d13 = dArr[i11];
            if (d12 != d13) {
                return C2387c.e(i10, i12, (float) ((d10 - d12) / (d13 - d12)));
            }
            if (d10 <= d12) {
                return i10;
            }
            return i12;
        }

        public final String k(String str, double d10, double[] dArr, double[][] dArr2, String str2, String str3) {
            String str4;
            String str5 = str;
            double[] dArr3 = dArr;
            double[][] dArr4 = dArr2;
            C6496s.h(str5, "pattern");
            C6496s.h(dArr3, "inputRange");
            C6496s.h(dArr4, "outputRange");
            int d11 = d(d10, dArr3);
            StringBuffer stringBuffer = new StringBuffer(str.length());
            Matcher matcher = k.f40485r.matcher(str5);
            int i10 = 0;
            while (matcher.find()) {
                double[] dArr5 = dArr4[d11];
                if (i10 >= dArr5.length) {
                    break;
                }
                int i11 = d11 + 1;
                int i12 = i10;
                StringBuffer stringBuffer2 = stringBuffer;
                double h10 = h(d10, dArr3[d11], dArr3[i11], dArr5[i10], dArr4[i11][i10], str2, str3);
                int i13 = (int) h10;
                if (((double) i13) == h10) {
                    str4 = String.valueOf(i13);
                } else {
                    str4 = String.valueOf(h10);
                }
                matcher.appendReplacement(stringBuffer2, str4);
                i10 = i12 + 1;
                double d12 = d10;
                stringBuffer = stringBuffer2;
                dArr3 = dArr;
            }
            StringBuffer stringBuffer3 = stringBuffer;
            matcher.appendTail(stringBuffer3);
            String stringBuffer4 = stringBuffer3.toString();
            C6496s.g(stringBuffer4, "toString(...)");
            return stringBuffer4;
        }

        private a() {
        }
    }

    private enum b {
        Number,
        Color,
        String;

        static {
            b[] a10;
            f40498e = C6714a.a(a10);
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f40499a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.facebook.react.animated.k$b[] r0 = com.facebook.react.animated.k.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.facebook.react.animated.k$b r1 = com.facebook.react.animated.k.b.Number     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.facebook.react.animated.k$b r1 = com.facebook.react.animated.k.b.Color     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.facebook.react.animated.k$b r1 = com.facebook.react.animated.k.b.String     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f40499a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.animated.k.c.<clinit>():void");
        }
    }

    static {
        Pattern compile = Pattern.compile("[+-]?(\\d+\\.?\\d*|\\.\\d+)([eE][+-]?\\d+)?");
        C6496s.g(compile, "compile(...)");
        f40485r = compile;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(ReadableMap readableMap) {
        super((ReadableMap) null, 1, (DefaultConstructorMarker) null);
        C6496s.h(readableMap, "config");
        ReadableType readableType = null;
        a aVar = f40484q;
        this.f40486i = aVar.e(readableMap.getArray("inputRange"));
        this.f40490m = readableMap.getString("extrapolateLeft");
        this.f40491n = readableMap.getString("extrapolateRight");
        ReadableArray array = readableMap.getArray("outputRange");
        if (C6496s.c("color", readableMap.getString("outputType"))) {
            this.f40488k = b.Color;
            this.f40487j = aVar.f(array);
            return;
        }
        if ((array != null ? array.getType(0) : readableType) == ReadableType.String) {
            this.f40488k = b.String;
            this.f40487j = aVar.g(array);
            this.f40489l = array.getString(0);
            return;
        }
        this.f40488k = b.Number;
        this.f40487j = aVar.e(array);
    }

    public void c(b bVar) {
        C6496s.h(bVar, "parent");
        if (this.f40492o != null) {
            throw new IllegalStateException("Parent already attached");
        } else if (bVar instanceof w) {
            this.f40492o = (w) bVar;
        } else {
            throw new IllegalArgumentException("Parent is of an invalid type");
        }
    }

    public void d(b bVar) {
        C6496s.h(bVar, "parent");
        if (bVar == this.f40492o) {
            this.f40492o = null;
            return;
        }
        throw new IllegalArgumentException("Invalid parent node provided");
    }

    public String e() {
        int i10 = this.f40448d;
        return "InterpolationAnimatedNode[" + i10 + "] super: {super.prettyPrint()}";
    }

    public void h() {
        int i10;
        String str;
        w wVar = this.f40492o;
        if (wVar != null) {
            double l10 = wVar.l();
            b bVar = this.f40488k;
            if (bVar == null) {
                i10 = -1;
            } else {
                i10 = c.f40499a[bVar.ordinal()];
            }
            if (i10 == 1) {
                a aVar = f40484q;
                double[] dArr = this.f40486i;
                Object obj = this.f40487j;
                C6496s.f(obj, "null cannot be cast to non-null type kotlin.DoubleArray");
                this.f40562f = aVar.i(l10, dArr, (double[]) obj, this.f40490m, this.f40491n);
            } else if (i10 == 2) {
                a aVar2 = f40484q;
                double[] dArr2 = this.f40486i;
                Object obj2 = this.f40487j;
                C6496s.f(obj2, "null cannot be cast to non-null type kotlin.IntArray");
                this.f40493p = Integer.valueOf(aVar2.j(l10, dArr2, (int[]) obj2));
            } else if (i10 == 3 && (str = this.f40489l) != null) {
                a aVar3 = f40484q;
                double[] dArr3 = this.f40486i;
                Object obj3 = this.f40487j;
                C6496s.f(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.DoubleArray>");
                this.f40493p = aVar3.k(str, l10, dArr3, (double[][]) obj3, this.f40490m, this.f40491n);
            }
        }
    }

    public Object k() {
        return this.f40493p;
    }
}
