package j3;

import Sg.C5538a;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import io.intercom.android.sdk.models.AttributeType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;
import mf.C6565s;

/* renamed from: j3.C  reason: case insensitive filesystem */
public abstract class C2126C {
    public static final C2126C BoolArrayType = new a();
    public static final C2126C BoolListType = new b();
    public static final C2126C BoolType = new c();
    public static final q Companion = new q((DefaultConstructorMarker) null);
    public static final C2126C FloatArrayType = new d();
    public static final C2126C FloatListType = new e();
    public static final C2126C FloatType = new f();
    public static final C2126C IntArrayType = new g();
    public static final C2126C IntListType = new h();
    public static final C2126C IntType = new i();
    public static final C2126C LongArrayType = new j();
    public static final C2126C LongListType = new k();
    public static final C2126C LongType = new l();
    public static final C2126C ReferenceType = new m();
    public static final C2126C StringArrayType = new n();
    public static final C2126C StringListType = new o();
    public static final C2126C StringType = new p();
    private final boolean isNullableAllowed;
    private final String name = "nav_type";

    /* renamed from: j3.C$a */
    public static final class a extends C2132c {
        a() {
            super(true);
        }

        /* renamed from: c */
        public boolean[] a() {
            return new boolean[0];
        }

        /* renamed from: d */
        public boolean[] get(Bundle bundle, String str) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            return (boolean[]) bundle.get(str);
        }

        /* renamed from: e */
        public boolean[] parseValue(String str) {
            C6496s.h(str, "value");
            return new boolean[]{((Boolean) C2126C.BoolType.parseValue(str)).booleanValue()};
        }

        /* renamed from: f */
        public boolean[] parseValue(String str, boolean[] zArr) {
            boolean[] I10;
            C6496s.h(str, "value");
            if (zArr == null || (I10 = C6559l.I(zArr, parseValue(str))) == null) {
                return parseValue(str);
            }
            return I10;
        }

        /* renamed from: g */
        public void put(Bundle bundle, String str, boolean[] zArr) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            bundle.putBooleanArray(str, zArr);
        }

        public String getName() {
            return "boolean[]";
        }

        /* renamed from: h */
        public List b(boolean[] zArr) {
            List p12;
            if (zArr == null || (p12 = C6559l.p1(zArr)) == null) {
                return C6565s.n();
            }
            Iterable<Boolean> iterable = p12;
            ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
            for (Boolean booleanValue : iterable) {
                arrayList.add(String.valueOf(booleanValue.booleanValue()));
            }
            return arrayList;
        }

        /* renamed from: i */
        public boolean valueEquals(boolean[] zArr, boolean[] zArr2) {
            Boolean[] boolArr;
            Boolean[] boolArr2 = null;
            if (zArr != null) {
                boolArr = C6559l.N(zArr);
            } else {
                boolArr = null;
            }
            if (zArr2 != null) {
                boolArr2 = C6559l.N(zArr2);
            }
            return C6559l.c(boolArr, boolArr2);
        }
    }

    /* renamed from: j3.C$b */
    public static final class b extends C2132c {
        b() {
            super(true);
        }

        /* renamed from: c */
        public List a() {
            return C6565s.n();
        }

        /* renamed from: d */
        public List get(Bundle bundle, String str) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            boolean[] zArr = (boolean[]) bundle.get(str);
            if (zArr != null) {
                return C6559l.p1(zArr);
            }
            return null;
        }

        /* renamed from: e */
        public List parseValue(String str) {
            C6496s.h(str, "value");
            return C6565s.e(C2126C.BoolType.parseValue(str));
        }

        /* renamed from: f */
        public List parseValue(String str, List list) {
            List K02;
            C6496s.h(str, "value");
            if (list == null || (K02 = C6565s.K0(list, parseValue(str))) == null) {
                return parseValue(str);
            }
            return K02;
        }

        /* renamed from: g */
        public void put(Bundle bundle, String str, List list) {
            boolean[] zArr;
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            if (list != null) {
                zArr = C6565s.X0(list);
            } else {
                zArr = null;
            }
            bundle.putBooleanArray(str, zArr);
        }

        public String getName() {
            return "List<Boolean>";
        }

        /* renamed from: h */
        public List b(List list) {
            if (list == null) {
                return C6565s.n();
            }
            Iterable<Boolean> iterable = list;
            ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
            for (Boolean booleanValue : iterable) {
                arrayList.add(String.valueOf(booleanValue.booleanValue()));
            }
            return arrayList;
        }

        /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Object[]] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean valueEquals(java.util.List r4, java.util.List r5) {
            /*
                r3 = this;
                r0 = 0
                r1 = 0
                if (r4 == 0) goto L_0x000f
                java.util.Collection r4 = (java.util.Collection) r4
                java.lang.Boolean[] r2 = new java.lang.Boolean[r1]
                java.lang.Object[] r4 = r4.toArray(r2)
                java.lang.Boolean[] r4 = (java.lang.Boolean[]) r4
                goto L_0x0010
            L_0x000f:
                r4 = r0
            L_0x0010:
                if (r5 == 0) goto L_0x001d
                java.util.Collection r5 = (java.util.Collection) r5
                java.lang.Boolean[] r0 = new java.lang.Boolean[r1]
                java.lang.Object[] r5 = r5.toArray(r0)
                r0 = r5
                java.lang.Boolean[] r0 = (java.lang.Boolean[]) r0
            L_0x001d:
                boolean r4 = mf.C6559l.c(r4, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: j3.C2126C.b.valueEquals(java.util.List, java.util.List):boolean");
        }
    }

    /* renamed from: j3.C$c */
    public static final class c extends C2126C {
        c() {
            super(false);
        }

        /* renamed from: a */
        public Boolean get(Bundle bundle, String str) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            return (Boolean) bundle.get(str);
        }

        /* renamed from: b */
        public Boolean parseValue(String str) {
            boolean z10;
            C6496s.h(str, "value");
            if (C6496s.c(str, com.amazon.a.a.o.b.f37475af)) {
                z10 = true;
            } else if (C6496s.c(str, com.amazon.a.a.o.b.f37476ag)) {
                z10 = false;
            } else {
                throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
            }
            return Boolean.valueOf(z10);
        }

        public void c(Bundle bundle, String str, boolean z10) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            bundle.putBoolean(str, z10);
        }

        public String getName() {
            return AttributeType.BOOLEAN;
        }

        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Object obj) {
            c(bundle, str, ((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: j3.C$d */
    public static final class d extends C2132c {
        d() {
            super(true);
        }

        /* renamed from: c */
        public float[] a() {
            return new float[0];
        }

        /* renamed from: d */
        public float[] get(Bundle bundle, String str) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            return (float[]) bundle.get(str);
        }

        /* renamed from: e */
        public float[] parseValue(String str) {
            C6496s.h(str, "value");
            return new float[]{((Number) C2126C.FloatType.parseValue(str)).floatValue()};
        }

        /* renamed from: f */
        public float[] parseValue(String str, float[] fArr) {
            float[] C10;
            C6496s.h(str, "value");
            if (fArr == null || (C10 = C6559l.C(fArr, parseValue(str))) == null) {
                return parseValue(str);
            }
            return C10;
        }

        /* renamed from: g */
        public void put(Bundle bundle, String str, float[] fArr) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            bundle.putFloatArray(str, fArr);
        }

        public String getName() {
            return "float[]";
        }

        /* renamed from: h */
        public List b(float[] fArr) {
            List k12;
            if (fArr == null || (k12 = C6559l.k1(fArr)) == null) {
                return C6565s.n();
            }
            Iterable<Number> iterable = k12;
            ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
            for (Number floatValue : iterable) {
                arrayList.add(String.valueOf(floatValue.floatValue()));
            }
            return arrayList;
        }

        /* renamed from: i */
        public boolean valueEquals(float[] fArr, float[] fArr2) {
            Float[] fArr3;
            Float[] fArr4 = null;
            if (fArr != null) {
                fArr3 = C6559l.O(fArr);
            } else {
                fArr3 = null;
            }
            if (fArr2 != null) {
                fArr4 = C6559l.O(fArr2);
            }
            return C6559l.c(fArr3, fArr4);
        }
    }

    /* renamed from: j3.C$e */
    public static final class e extends C2132c {
        e() {
            super(true);
        }

        /* renamed from: c */
        public List a() {
            return C6565s.n();
        }

        /* renamed from: d */
        public List get(Bundle bundle, String str) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            float[] fArr = (float[]) bundle.get(str);
            if (fArr != null) {
                return C6559l.k1(fArr);
            }
            return null;
        }

        /* renamed from: e */
        public List parseValue(String str) {
            C6496s.h(str, "value");
            return C6565s.e(C2126C.FloatType.parseValue(str));
        }

        /* renamed from: f */
        public List parseValue(String str, List list) {
            List K02;
            C6496s.h(str, "value");
            if (list == null || (K02 = C6565s.K0(list, parseValue(str))) == null) {
                return parseValue(str);
            }
            return K02;
        }

        /* renamed from: g */
        public void put(Bundle bundle, String str, List list) {
            float[] fArr;
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            if (list != null) {
                fArr = C6565s.b1(list);
            } else {
                fArr = null;
            }
            bundle.putFloatArray(str, fArr);
        }

        public String getName() {
            return "List<Float>";
        }

        /* renamed from: h */
        public List b(List list) {
            if (list == null) {
                return C6565s.n();
            }
            Iterable<Number> iterable = list;
            ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
            for (Number floatValue : iterable) {
                arrayList.add(String.valueOf(floatValue.floatValue()));
            }
            return arrayList;
        }

        /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Object[]] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean valueEquals(java.util.List r4, java.util.List r5) {
            /*
                r3 = this;
                r0 = 0
                r1 = 0
                if (r4 == 0) goto L_0x000f
                java.util.Collection r4 = (java.util.Collection) r4
                java.lang.Float[] r2 = new java.lang.Float[r1]
                java.lang.Object[] r4 = r4.toArray(r2)
                java.lang.Float[] r4 = (java.lang.Float[]) r4
                goto L_0x0010
            L_0x000f:
                r4 = r0
            L_0x0010:
                if (r5 == 0) goto L_0x001d
                java.util.Collection r5 = (java.util.Collection) r5
                java.lang.Float[] r0 = new java.lang.Float[r1]
                java.lang.Object[] r5 = r5.toArray(r0)
                r0 = r5
                java.lang.Float[] r0 = (java.lang.Float[]) r0
            L_0x001d:
                boolean r4 = mf.C6559l.c(r4, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: j3.C2126C.e.valueEquals(java.util.List, java.util.List):boolean");
        }
    }

    /* renamed from: j3.C$f */
    public static final class f extends C2126C {
        f() {
            super(false);
        }

        /* renamed from: a */
        public Float get(Bundle bundle, String str) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            Object obj = bundle.get(str);
            C6496s.f(obj, "null cannot be cast to non-null type kotlin.Float");
            return (Float) obj;
        }

        /* renamed from: b */
        public Float parseValue(String str) {
            C6496s.h(str, "value");
            return Float.valueOf(Float.parseFloat(str));
        }

        public void c(Bundle bundle, String str, float f10) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            bundle.putFloat(str, f10);
        }

        public String getName() {
            return AttributeType.FLOAT;
        }

        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Object obj) {
            c(bundle, str, ((Number) obj).floatValue());
        }
    }

    /* renamed from: j3.C$g */
    public static final class g extends C2132c {
        g() {
            super(true);
        }

        /* renamed from: c */
        public int[] a() {
            return new int[0];
        }

        /* renamed from: d */
        public int[] get(Bundle bundle, String str) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            return (int[]) bundle.get(str);
        }

        /* renamed from: e */
        public int[] parseValue(String str) {
            C6496s.h(str, "value");
            return new int[]{((Number) C2126C.IntType.parseValue(str)).intValue()};
        }

        /* renamed from: f */
        public int[] parseValue(String str, int[] iArr) {
            int[] E10;
            C6496s.h(str, "value");
            if (iArr == null || (E10 = C6559l.E(iArr, parseValue(str))) == null) {
                return parseValue(str);
            }
            return E10;
        }

        /* renamed from: g */
        public void put(Bundle bundle, String str, int[] iArr) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            bundle.putIntArray(str, iArr);
        }

        public String getName() {
            return "integer[]";
        }

        /* renamed from: h */
        public List b(int[] iArr) {
            List l12;
            if (iArr == null || (l12 = C6559l.l1(iArr)) == null) {
                return C6565s.n();
            }
            Iterable<Number> iterable = l12;
            ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
            for (Number intValue : iterable) {
                arrayList.add(String.valueOf(intValue.intValue()));
            }
            return arrayList;
        }

        /* renamed from: i */
        public boolean valueEquals(int[] iArr, int[] iArr2) {
            Integer[] numArr;
            Integer[] numArr2 = null;
            if (iArr != null) {
                numArr = C6559l.P(iArr);
            } else {
                numArr = null;
            }
            if (iArr2 != null) {
                numArr2 = C6559l.P(iArr2);
            }
            return C6559l.c(numArr, numArr2);
        }
    }

    /* renamed from: j3.C$h */
    public static final class h extends C2132c {
        h() {
            super(true);
        }

        /* renamed from: c */
        public List a() {
            return C6565s.n();
        }

        /* renamed from: d */
        public List get(Bundle bundle, String str) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            int[] iArr = (int[]) bundle.get(str);
            if (iArr != null) {
                return C6559l.l1(iArr);
            }
            return null;
        }

        /* renamed from: e */
        public List parseValue(String str) {
            C6496s.h(str, "value");
            return C6565s.e(C2126C.IntType.parseValue(str));
        }

        /* renamed from: f */
        public List parseValue(String str, List list) {
            List K02;
            C6496s.h(str, "value");
            if (list == null || (K02 = C6565s.K0(list, parseValue(str))) == null) {
                return parseValue(str);
            }
            return K02;
        }

        /* renamed from: g */
        public void put(Bundle bundle, String str, List list) {
            int[] iArr;
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            if (list != null) {
                iArr = C6565s.d1(list);
            } else {
                iArr = null;
            }
            bundle.putIntArray(str, iArr);
        }

        public String getName() {
            return "List<Int>";
        }

        /* renamed from: h */
        public List b(List list) {
            if (list == null) {
                return C6565s.n();
            }
            Iterable<Number> iterable = list;
            ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
            for (Number intValue : iterable) {
                arrayList.add(String.valueOf(intValue.intValue()));
            }
            return arrayList;
        }

        /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Object[]] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean valueEquals(java.util.List r4, java.util.List r5) {
            /*
                r3 = this;
                r0 = 0
                r1 = 0
                if (r4 == 0) goto L_0x000f
                java.util.Collection r4 = (java.util.Collection) r4
                java.lang.Integer[] r2 = new java.lang.Integer[r1]
                java.lang.Object[] r4 = r4.toArray(r2)
                java.lang.Integer[] r4 = (java.lang.Integer[]) r4
                goto L_0x0010
            L_0x000f:
                r4 = r0
            L_0x0010:
                if (r5 == 0) goto L_0x001d
                java.util.Collection r5 = (java.util.Collection) r5
                java.lang.Integer[] r0 = new java.lang.Integer[r1]
                java.lang.Object[] r5 = r5.toArray(r0)
                r0 = r5
                java.lang.Integer[] r0 = (java.lang.Integer[]) r0
            L_0x001d:
                boolean r4 = mf.C6559l.c(r4, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: j3.C2126C.h.valueEquals(java.util.List, java.util.List):boolean");
        }
    }

    /* renamed from: j3.C$i */
    public static final class i extends C2126C {
        i() {
            super(false);
        }

        /* renamed from: a */
        public Integer get(Bundle bundle, String str) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            Object obj = bundle.get(str);
            C6496s.f(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        /* renamed from: b */
        public Integer parseValue(String str) {
            int i10;
            C6496s.h(str, "value");
            if (Sg.p.J(str, "0x", false, 2, (Object) null)) {
                String substring = str.substring(2);
                C6496s.g(substring, "substring(...)");
                i10 = Integer.parseInt(substring, C5538a.a(16));
            } else {
                i10 = Integer.parseInt(str);
            }
            return Integer.valueOf(i10);
        }

        public void c(Bundle bundle, String str, int i10) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            bundle.putInt(str, i10);
        }

        public String getName() {
            return AttributeType.INTEGER;
        }

        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Object obj) {
            c(bundle, str, ((Number) obj).intValue());
        }
    }

    /* renamed from: j3.C$j */
    public static final class j extends C2132c {
        j() {
            super(true);
        }

        /* renamed from: c */
        public long[] a() {
            return new long[0];
        }

        /* renamed from: d */
        public long[] get(Bundle bundle, String str) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            return (long[]) bundle.get(str);
        }

        /* renamed from: e */
        public long[] parseValue(String str) {
            C6496s.h(str, "value");
            return new long[]{((Number) C2126C.LongType.parseValue(str)).longValue()};
        }

        /* renamed from: f */
        public long[] parseValue(String str, long[] jArr) {
            long[] F10;
            C6496s.h(str, "value");
            if (jArr == null || (F10 = C6559l.F(jArr, parseValue(str))) == null) {
                return parseValue(str);
            }
            return F10;
        }

        /* renamed from: g */
        public void put(Bundle bundle, String str, long[] jArr) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            bundle.putLongArray(str, jArr);
        }

        public String getName() {
            return "long[]";
        }

        /* renamed from: h */
        public List b(long[] jArr) {
            List m12;
            if (jArr == null || (m12 = C6559l.m1(jArr)) == null) {
                return C6565s.n();
            }
            Iterable<Number> iterable = m12;
            ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
            for (Number longValue : iterable) {
                arrayList.add(String.valueOf(longValue.longValue()));
            }
            return arrayList;
        }

        /* renamed from: i */
        public boolean valueEquals(long[] jArr, long[] jArr2) {
            Long[] lArr;
            Long[] lArr2 = null;
            if (jArr != null) {
                lArr = C6559l.Q(jArr);
            } else {
                lArr = null;
            }
            if (jArr2 != null) {
                lArr2 = C6559l.Q(jArr2);
            }
            return C6559l.c(lArr, lArr2);
        }
    }

    /* renamed from: j3.C$k */
    public static final class k extends C2132c {
        k() {
            super(true);
        }

        /* renamed from: c */
        public List a() {
            return C6565s.n();
        }

        /* renamed from: d */
        public List get(Bundle bundle, String str) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            long[] jArr = (long[]) bundle.get(str);
            if (jArr != null) {
                return C6559l.m1(jArr);
            }
            return null;
        }

        /* renamed from: e */
        public List parseValue(String str) {
            C6496s.h(str, "value");
            return C6565s.e(C2126C.LongType.parseValue(str));
        }

        /* renamed from: f */
        public List parseValue(String str, List list) {
            List K02;
            C6496s.h(str, "value");
            if (list == null || (K02 = C6565s.K0(list, parseValue(str))) == null) {
                return parseValue(str);
            }
            return K02;
        }

        /* renamed from: g */
        public void put(Bundle bundle, String str, List list) {
            long[] jArr;
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            if (list != null) {
                jArr = C6565s.f1(list);
            } else {
                jArr = null;
            }
            bundle.putLongArray(str, jArr);
        }

        public String getName() {
            return "List<Long>";
        }

        /* renamed from: h */
        public List b(List list) {
            if (list == null) {
                return C6565s.n();
            }
            Iterable<Number> iterable = list;
            ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
            for (Number longValue : iterable) {
                arrayList.add(String.valueOf(longValue.longValue()));
            }
            return arrayList;
        }

        /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Object[]] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean valueEquals(java.util.List r4, java.util.List r5) {
            /*
                r3 = this;
                r0 = 0
                r1 = 0
                if (r4 == 0) goto L_0x000f
                java.util.Collection r4 = (java.util.Collection) r4
                java.lang.Long[] r2 = new java.lang.Long[r1]
                java.lang.Object[] r4 = r4.toArray(r2)
                java.lang.Long[] r4 = (java.lang.Long[]) r4
                goto L_0x0010
            L_0x000f:
                r4 = r0
            L_0x0010:
                if (r5 == 0) goto L_0x001d
                java.util.Collection r5 = (java.util.Collection) r5
                java.lang.Long[] r0 = new java.lang.Long[r1]
                java.lang.Object[] r5 = r5.toArray(r0)
                r0 = r5
                java.lang.Long[] r0 = (java.lang.Long[]) r0
            L_0x001d:
                boolean r4 = mf.C6559l.c(r4, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: j3.C2126C.k.valueEquals(java.util.List, java.util.List):boolean");
        }
    }

    /* renamed from: j3.C$l */
    public static final class l extends C2126C {
        l() {
            super(false);
        }

        /* renamed from: a */
        public Long get(Bundle bundle, String str) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            Object obj = bundle.get(str);
            C6496s.f(obj, "null cannot be cast to non-null type kotlin.Long");
            return (Long) obj;
        }

        /* renamed from: b */
        public Long parseValue(String str) {
            String str2;
            long j10;
            C6496s.h(str, "value");
            if (Sg.p.u(str, "L", false, 2, (Object) null)) {
                str2 = str.substring(0, str.length() - 1);
                C6496s.g(str2, "substring(...)");
            } else {
                str2 = str;
            }
            if (Sg.p.J(str, "0x", false, 2, (Object) null)) {
                String substring = str2.substring(2);
                C6496s.g(substring, "substring(...)");
                j10 = Long.parseLong(substring, C5538a.a(16));
            } else {
                j10 = Long.parseLong(str2);
            }
            return Long.valueOf(j10);
        }

        public void c(Bundle bundle, String str, long j10) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            bundle.putLong(str, j10);
        }

        public String getName() {
            return Constants.LONG;
        }

        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Object obj) {
            c(bundle, str, ((Number) obj).longValue());
        }
    }

    /* renamed from: j3.C$m */
    public static final class m extends C2126C {
        m() {
            super(false);
        }

        /* renamed from: a */
        public Integer get(Bundle bundle, String str) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            Object obj = bundle.get(str);
            C6496s.f(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        /* renamed from: b */
        public Integer parseValue(String str) {
            int i10;
            C6496s.h(str, "value");
            if (Sg.p.J(str, "0x", false, 2, (Object) null)) {
                String substring = str.substring(2);
                C6496s.g(substring, "substring(...)");
                i10 = Integer.parseInt(substring, C5538a.a(16));
            } else {
                i10 = Integer.parseInt(str);
            }
            return Integer.valueOf(i10);
        }

        public void c(Bundle bundle, String str, int i10) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            bundle.putInt(str, i10);
        }

        public String getName() {
            return "reference";
        }

        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Object obj) {
            c(bundle, str, ((Number) obj).intValue());
        }
    }

    /* renamed from: j3.C$n */
    public static final class n extends C2132c {
        n() {
            super(true);
        }

        /* renamed from: c */
        public String[] a() {
            return new String[0];
        }

        /* renamed from: d */
        public String[] get(Bundle bundle, String str) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            return (String[]) bundle.get(str);
        }

        /* renamed from: e */
        public String[] parseValue(String str) {
            C6496s.h(str, "value");
            return new String[]{str};
        }

        /* renamed from: f */
        public String[] parseValue(String str, String[] strArr) {
            String[] strArr2;
            C6496s.h(str, "value");
            if (strArr == null || (strArr2 = (String[]) C6559l.H(strArr, parseValue(str))) == null) {
                return parseValue(str);
            }
            return strArr2;
        }

        /* renamed from: g */
        public void put(Bundle bundle, String str, String[] strArr) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            bundle.putStringArray(str, strArr);
        }

        public String getName() {
            return "string[]";
        }

        /* renamed from: h */
        public List b(String[] strArr) {
            if (strArr == null) {
                return C6565s.n();
            }
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String encode : strArr) {
                arrayList.add(Uri.encode(encode));
            }
            return arrayList;
        }

        /* renamed from: i */
        public boolean valueEquals(String[] strArr, String[] strArr2) {
            return C6559l.c(strArr, strArr2);
        }
    }

    /* renamed from: j3.C$o */
    public static final class o extends C2132c {
        o() {
            super(true);
        }

        /* renamed from: c */
        public List a() {
            return C6565s.n();
        }

        /* renamed from: d */
        public List get(Bundle bundle, String str) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            String[] strArr = (String[]) bundle.get(str);
            if (strArr != null) {
                return C6559l.n1(strArr);
            }
            return null;
        }

        /* renamed from: e */
        public List parseValue(String str) {
            C6496s.h(str, "value");
            return C6565s.e(str);
        }

        /* renamed from: f */
        public List parseValue(String str, List list) {
            List K02;
            C6496s.h(str, "value");
            if (list == null || (K02 = C6565s.K0(list, parseValue(str))) == null) {
                return parseValue(str);
            }
            return K02;
        }

        /* renamed from: g */
        public void put(Bundle bundle, String str, List list) {
            String[] strArr;
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            if (list != null) {
                strArr = (String[]) list.toArray(new String[0]);
            } else {
                strArr = null;
            }
            bundle.putStringArray(str, strArr);
        }

        public String getName() {
            return "List<String>";
        }

        /* renamed from: h */
        public List b(List list) {
            if (list == null) {
                return C6565s.n();
            }
            Iterable<String> iterable = list;
            ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
            for (String encode : iterable) {
                arrayList.add(Uri.encode(encode));
            }
            return arrayList;
        }

        /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Object[]] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean valueEquals(java.util.List r4, java.util.List r5) {
            /*
                r3 = this;
                r0 = 0
                r1 = 0
                if (r4 == 0) goto L_0x000f
                java.util.Collection r4 = (java.util.Collection) r4
                java.lang.String[] r2 = new java.lang.String[r1]
                java.lang.Object[] r4 = r4.toArray(r2)
                java.lang.String[] r4 = (java.lang.String[]) r4
                goto L_0x0010
            L_0x000f:
                r4 = r0
            L_0x0010:
                if (r5 == 0) goto L_0x001d
                java.util.Collection r5 = (java.util.Collection) r5
                java.lang.String[] r0 = new java.lang.String[r1]
                java.lang.Object[] r5 = r5.toArray(r0)
                r0 = r5
                java.lang.String[] r0 = (java.lang.String[]) r0
            L_0x001d:
                boolean r4 = mf.C6559l.c(r4, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: j3.C2126C.o.valueEquals(java.util.List, java.util.List):boolean");
        }
    }

    /* renamed from: j3.C$p */
    public static final class p extends C2126C {
        p() {
            super(true);
        }

        /* renamed from: a */
        public String get(Bundle bundle, String str) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            return (String) bundle.get(str);
        }

        /* renamed from: b */
        public String parseValue(String str) {
            C6496s.h(str, "value");
            if (C6496s.c(str, "null")) {
                return null;
            }
            return str;
        }

        /* renamed from: c */
        public void put(Bundle bundle, String str, String str2) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            bundle.putString(str, str2);
        }

        /* renamed from: d */
        public String serializeAsValue(String str) {
            String str2;
            if (str != null) {
                str2 = Uri.encode(str);
            } else {
                str2 = null;
            }
            if (str2 == null) {
                return "null";
            }
            return str2;
        }

        public String getName() {
            return "string";
        }
    }

    /* renamed from: j3.C$q */
    public static final class q {
        public /* synthetic */ q(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C2126C a(String str, String str2) {
            String str3;
            C2126C c10 = C2126C.IntType;
            if (C6496s.c(c10.getName(), str)) {
                return c10;
            }
            C2126C c11 = C2126C.IntArrayType;
            if (C6496s.c(c11.getName(), str)) {
                return c11;
            }
            C2126C c12 = C2126C.IntListType;
            if (C6496s.c(c12.getName(), str)) {
                return c12;
            }
            C2126C c13 = C2126C.LongType;
            if (C6496s.c(c13.getName(), str)) {
                return c13;
            }
            C2126C c14 = C2126C.LongArrayType;
            if (C6496s.c(c14.getName(), str)) {
                return c14;
            }
            C2126C c15 = C2126C.LongListType;
            if (C6496s.c(c15.getName(), str)) {
                return c15;
            }
            C2126C c16 = C2126C.BoolType;
            if (C6496s.c(c16.getName(), str)) {
                return c16;
            }
            C2126C c17 = C2126C.BoolArrayType;
            if (C6496s.c(c17.getName(), str)) {
                return c17;
            }
            C2126C c18 = C2126C.BoolListType;
            if (C6496s.c(c18.getName(), str)) {
                return c18;
            }
            C2126C c19 = C2126C.StringType;
            if (C6496s.c(c19.getName(), str)) {
                return c19;
            }
            C2126C c20 = C2126C.StringArrayType;
            if (C6496s.c(c20.getName(), str)) {
                return c20;
            }
            C2126C c21 = C2126C.StringListType;
            if (C6496s.c(c21.getName(), str)) {
                return c21;
            }
            C2126C c22 = C2126C.FloatType;
            if (C6496s.c(c22.getName(), str)) {
                return c22;
            }
            C2126C c23 = C2126C.FloatArrayType;
            if (C6496s.c(c23.getName(), str)) {
                return c23;
            }
            C2126C c24 = C2126C.FloatListType;
            if (C6496s.c(c24.getName(), str)) {
                return c24;
            }
            C2126C c25 = C2126C.ReferenceType;
            if (C6496s.c(c25.getName(), str)) {
                return c25;
            }
            if (str == null || str.length() == 0) {
                return c19;
            }
            try {
                if (!Sg.p.J(str, ".", false, 2, (Object) null) || str2 == null) {
                    str3 = str;
                } else {
                    str3 = str2 + str;
                }
                boolean u10 = Sg.p.u(str, "[]", false, 2, (Object) null);
                if (u10) {
                    str3 = str3.substring(0, str3.length() - 2);
                    C6496s.g(str3, "substring(...)");
                }
                Class<?> cls = Class.forName(str3);
                C6496s.g(cls, "clazz");
                C2126C d10 = d(cls, u10);
                if (d10 != null) {
                    return d10;
                }
                throw new IllegalArgumentException((str3 + " is not Serializable or Parcelable.").toString());
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:4|5|6) */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r1 = j3.C2126C.BoolType;
            r1.parseValue(r3);
            kotlin.jvm.internal.C6496s.f(r1, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
            return r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
            r3 = j3.C2126C.StringType;
            kotlin.jvm.internal.C6496s.f(r3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
            return r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
            r1 = j3.C2126C.LongType;
            r1.parseValue(r3);
            kotlin.jvm.internal.C6496s.f(r1, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
            return r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
            r1 = j3.C2126C.FloatType;
            r1.parseValue(r3);
            kotlin.jvm.internal.C6496s.f(r1, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
            return r1;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0019 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final j3.C2126C b(java.lang.String r3) {
            /*
                r2 = this;
                java.lang.String r0 = "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>"
                java.lang.String r1 = "value"
                kotlin.jvm.internal.C6496s.h(r3, r1)
                j3.C r1 = j3.C2126C.IntType     // Catch:{ IllegalArgumentException -> 0x0010 }
                r1.parseValue(r3)     // Catch:{ IllegalArgumentException -> 0x0010 }
                kotlin.jvm.internal.C6496s.f(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0010 }
                return r1
            L_0x0010:
                j3.C r1 = j3.C2126C.LongType     // Catch:{ IllegalArgumentException -> 0x0019 }
                r1.parseValue(r3)     // Catch:{ IllegalArgumentException -> 0x0019 }
                kotlin.jvm.internal.C6496s.f(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0019 }
                return r1
            L_0x0019:
                j3.C r1 = j3.C2126C.FloatType     // Catch:{ IllegalArgumentException -> 0x0022 }
                r1.parseValue(r3)     // Catch:{ IllegalArgumentException -> 0x0022 }
                kotlin.jvm.internal.C6496s.f(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0022 }
                return r1
            L_0x0022:
                j3.C r1 = j3.C2126C.BoolType     // Catch:{ IllegalArgumentException -> 0x002b }
                r1.parseValue(r3)     // Catch:{ IllegalArgumentException -> 0x002b }
                kotlin.jvm.internal.C6496s.f(r1, r0)     // Catch:{ IllegalArgumentException -> 0x002b }
                return r1
            L_0x002b:
                j3.C r3 = j3.C2126C.StringType
                kotlin.jvm.internal.C6496s.f(r3, r0)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: j3.C2126C.q.b(java.lang.String):j3.C");
        }

        public final C2126C c(Object obj) {
            C2126C vVar;
            if (obj instanceof Integer) {
                C2126C c10 = C2126C.IntType;
                C6496s.f(c10, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return c10;
            } else if (obj instanceof int[]) {
                C2126C c11 = C2126C.IntArrayType;
                C6496s.f(c11, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return c11;
            } else if (obj instanceof Long) {
                C2126C c12 = C2126C.LongType;
                C6496s.f(c12, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return c12;
            } else if (obj instanceof long[]) {
                C2126C c13 = C2126C.LongArrayType;
                C6496s.f(c13, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return c13;
            } else if (obj instanceof Float) {
                C2126C c14 = C2126C.FloatType;
                C6496s.f(c14, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return c14;
            } else if (obj instanceof float[]) {
                C2126C c15 = C2126C.FloatArrayType;
                C6496s.f(c15, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return c15;
            } else if (obj instanceof Boolean) {
                C2126C c16 = C2126C.BoolType;
                C6496s.f(c16, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return c16;
            } else if (obj instanceof boolean[]) {
                C2126C c17 = C2126C.BoolArrayType;
                C6496s.f(c17, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return c17;
            } else if ((obj instanceof String) || obj == null) {
                C2126C c18 = C2126C.StringType;
                C6496s.f(c18, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return c18;
            } else if (!(obj instanceof Object[]) || !(((Object[]) obj) instanceof String[])) {
                if (obj.getClass().isArray()) {
                    Class<?> componentType = obj.getClass().getComponentType();
                    C6496s.e(componentType);
                    if (Parcelable.class.isAssignableFrom(componentType)) {
                        Class<?> componentType2 = obj.getClass().getComponentType();
                        C6496s.f(componentType2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                        vVar = new s(componentType2);
                        return vVar;
                    }
                }
                if (obj.getClass().isArray()) {
                    Class<?> componentType3 = obj.getClass().getComponentType();
                    C6496s.e(componentType3);
                    if (Serializable.class.isAssignableFrom(componentType3)) {
                        Class<?> componentType4 = obj.getClass().getComponentType();
                        C6496s.f(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                        vVar = new u(componentType4);
                        return vVar;
                    }
                }
                if (obj instanceof Parcelable) {
                    vVar = new t(obj.getClass());
                } else if (obj instanceof Enum) {
                    vVar = new r(obj.getClass());
                } else if (obj instanceof Serializable) {
                    vVar = new v(obj.getClass());
                } else {
                    throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                }
                return vVar;
            } else {
                C2126C c19 = C2126C.StringArrayType;
                C6496s.f(c19, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return c19;
            }
        }

        public final C2126C d(Class cls, boolean z10) {
            C6496s.h(cls, "clazz");
            if (Parcelable.class.isAssignableFrom(cls)) {
                if (z10) {
                    return new s(cls);
                }
                return new t(cls);
            } else if (Enum.class.isAssignableFrom(cls) && !z10) {
                return new r(cls);
            } else {
                if (!Serializable.class.isAssignableFrom(cls)) {
                    return null;
                }
                if (z10) {
                    return new u(cls);
                }
                return new v(cls);
            }
        }

        private q() {
        }
    }

    /* renamed from: j3.C$r */
    public static final class r extends v {

        /* renamed from: b  reason: collision with root package name */
        private final Class f22762b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public r(Class cls) {
            super(false, cls);
            C6496s.h(cls, "type");
            if (cls.isEnum()) {
                this.f22762b = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
        }

        /* renamed from: d */
        public Enum parseValue(String str) {
            Enum enumR;
            C6496s.h(str, "value");
            Object[] enumConstants = this.f22762b.getEnumConstants();
            C6496s.g(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    enumR = null;
                    break;
                }
                enumR = enumConstants[i10];
                if (Sg.p.v(((Enum) enumR).name(), str, true)) {
                    break;
                }
                i10++;
            }
            Enum enumR2 = enumR;
            if (enumR2 != null) {
                return enumR2;
            }
            throw new IllegalArgumentException("Enum value " + str + " not found for type " + this.f22762b.getName() + '.');
        }

        public String getName() {
            String name = this.f22762b.getName();
            C6496s.g(name, "type.name");
            return name;
        }
    }

    /* renamed from: j3.C$s */
    public static final class s extends C2126C {

        /* renamed from: a  reason: collision with root package name */
        private final Class f22763a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public s(Class cls) {
            super(true);
            C6496s.h(cls, "type");
            if (Parcelable.class.isAssignableFrom(cls)) {
                try {
                    Class<?> cls2 = Class.forName("[L" + cls.getName() + ';');
                    C6496s.f(cls2, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.ParcelableArrayType>>");
                    this.f22763a = cls2;
                } catch (ClassNotFoundException e10) {
                    throw new RuntimeException(e10);
                }
            } else {
                throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
            }
        }

        /* renamed from: a */
        public Parcelable[] get(Bundle bundle, String str) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            return (Parcelable[]) bundle.get(str);
        }

        /* renamed from: b */
        public Parcelable[] parseValue(String str) {
            C6496s.h(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: c */
        public void put(Bundle bundle, String str, Parcelable[] parcelableArr) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            this.f22763a.cast(parcelableArr);
            bundle.putParcelableArray(str, parcelableArr);
        }

        /* renamed from: d */
        public boolean valueEquals(Parcelable[] parcelableArr, Parcelable[] parcelableArr2) {
            return C6559l.c(parcelableArr, parcelableArr2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (!C6496s.c(s.class, obj.getClass())) {
                return false;
            }
            return C6496s.c(this.f22763a, ((s) obj).f22763a);
        }

        public String getName() {
            String name = this.f22763a.getName();
            C6496s.g(name, "arrayType.name");
            return name;
        }

        public int hashCode() {
            return this.f22763a.hashCode();
        }
    }

    /* renamed from: j3.C$t */
    public static final class t extends C2126C {

        /* renamed from: a  reason: collision with root package name */
        private final Class f22764a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public t(Class cls) {
            super(true);
            C6496s.h(cls, "type");
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.f22764a = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (!C6496s.c(t.class, obj.getClass())) {
                return false;
            }
            return C6496s.c(this.f22764a, ((t) obj).f22764a);
        }

        public Object get(Bundle bundle, String str) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            return bundle.get(str);
        }

        public String getName() {
            String name = this.f22764a.getName();
            C6496s.g(name, "type.name");
            return name;
        }

        public int hashCode() {
            return this.f22764a.hashCode();
        }

        public Object parseValue(String str) {
            C6496s.h(str, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        public void put(Bundle bundle, String str, Object obj) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            this.f22764a.cast(obj);
            if (obj == null || (obj instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            }
        }
    }

    /* renamed from: j3.C$u */
    public static final class u extends C2126C {

        /* renamed from: a  reason: collision with root package name */
        private final Class f22765a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public u(Class cls) {
            super(true);
            C6496s.h(cls, "type");
            if (Serializable.class.isAssignableFrom(cls)) {
                try {
                    Class<?> cls2 = Class.forName("[L" + cls.getName() + ';');
                    C6496s.f(cls2, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.SerializableArrayType>>");
                    this.f22765a = cls2;
                } catch (ClassNotFoundException e10) {
                    throw new RuntimeException(e10);
                }
            } else {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            }
        }

        /* renamed from: a */
        public Serializable[] get(Bundle bundle, String str) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            return (Serializable[]) bundle.get(str);
        }

        /* renamed from: b */
        public Serializable[] parseValue(String str) {
            C6496s.h(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, java.io.Serializable[], java.io.Serializable] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void put(android.os.Bundle r2, java.lang.String r3, java.io.Serializable[] r4) {
            /*
                r1 = this;
                java.lang.String r0 = "bundle"
                kotlin.jvm.internal.C6496s.h(r2, r0)
                java.lang.String r0 = "key"
                kotlin.jvm.internal.C6496s.h(r3, r0)
                java.lang.Class r0 = r1.f22765a
                r0.cast(r4)
                r2.putSerializable(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: j3.C2126C.u.put(android.os.Bundle, java.lang.String, java.io.Serializable[]):void");
        }

        /* renamed from: d */
        public boolean valueEquals(Serializable[] serializableArr, Serializable[] serializableArr2) {
            return C6559l.c(serializableArr, serializableArr2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (!C6496s.c(u.class, obj.getClass())) {
                return false;
            }
            return C6496s.c(this.f22765a, ((u) obj).f22765a);
        }

        public String getName() {
            String name = this.f22765a.getName();
            C6496s.g(name, "arrayType.name");
            return name;
        }

        public int hashCode() {
            return this.f22765a.hashCode();
        }
    }

    public C2126C(boolean z10) {
        this.isNullableAllowed = z10;
    }

    public static C2126C fromArgType(String str, String str2) {
        return Companion.a(str, str2);
    }

    public static final C2126C inferFromValue(String str) {
        return Companion.b(str);
    }

    public static final C2126C inferFromValueType(Object obj) {
        return Companion.c(obj);
    }

    public abstract Object get(Bundle bundle, String str);

    public String getName() {
        return this.name;
    }

    public boolean isNullableAllowed() {
        return this.isNullableAllowed;
    }

    public final Object parseAndPut(Bundle bundle, String str, String str2) {
        C6496s.h(bundle, "bundle");
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(str2, "value");
        Object parseValue = parseValue(str2);
        put(bundle, str, parseValue);
        return parseValue;
    }

    public abstract Object parseValue(String str);

    public Object parseValue(String str, Object obj) {
        C6496s.h(str, "value");
        return parseValue(str);
    }

    public abstract void put(Bundle bundle, String str, Object obj);

    public String serializeAsValue(Object obj) {
        return String.valueOf(obj);
    }

    public String toString() {
        return getName();
    }

    public boolean valueEquals(Object obj, Object obj2) {
        return C6496s.c(obj, obj2);
    }

    public final Object parseAndPut(Bundle bundle, String str, String str2, Object obj) {
        C6496s.h(bundle, "bundle");
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        if (!bundle.containsKey(str)) {
            throw new IllegalArgumentException("There is no previous value in this bundle.");
        } else if (str2 == null) {
            return obj;
        } else {
            Object parseValue = parseValue(str2, obj);
            put(bundle, str, parseValue);
            return parseValue;
        }
    }

    /* renamed from: j3.C$v */
    public static class v extends C2126C {

        /* renamed from: a  reason: collision with root package name */
        private final Class f22766a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public v(Class cls) {
            super(true);
            C6496s.h(cls, "type");
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            } else if (!cls.isEnum()) {
                this.f22766a = cls;
            } else {
                throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
            }
        }

        /* renamed from: a */
        public Serializable get(Bundle bundle, String str) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            return (Serializable) bundle.get(str);
        }

        /* renamed from: b */
        public Serializable parseValue(String str) {
            C6496s.h(str, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        /* renamed from: c */
        public void put(Bundle bundle, String str, Serializable serializable) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            C6496s.h(serializable, "value");
            this.f22766a.cast(serializable);
            bundle.putSerializable(str, serializable);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            return C6496s.c(this.f22766a, ((v) obj).f22766a);
        }

        public String getName() {
            String name = this.f22766a.getName();
            C6496s.g(name, "type.name");
            return name;
        }

        public int hashCode() {
            return this.f22766a.hashCode();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public v(boolean z10, Class cls) {
            super(z10);
            C6496s.h(cls, "type");
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f22766a = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
    }
}
