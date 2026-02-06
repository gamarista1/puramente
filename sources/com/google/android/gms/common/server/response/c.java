package com.google.android.gms.common.server.response;

import Ea.C4279b;
import Ea.l;
import Ea.m;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.amazon.a.a.o.b.f;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.common.server.response.a;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import za.b;

public class c extends b {
    public static final Parcelable.Creator<c> CREATOR = new k();

    /* renamed from: a  reason: collision with root package name */
    private final int f54275a;

    /* renamed from: b  reason: collision with root package name */
    private final Parcel f54276b;

    /* renamed from: c  reason: collision with root package name */
    private final int f54277c = 2;

    /* renamed from: d  reason: collision with root package name */
    private final h f54278d;

    /* renamed from: e  reason: collision with root package name */
    private final String f54279e;

    /* renamed from: f  reason: collision with root package name */
    private int f54280f;

    /* renamed from: g  reason: collision with root package name */
    private int f54281g;

    c(int i10, Parcel parcel, h hVar) {
        String o02;
        this.f54275a = i10;
        this.f54276b = (Parcel) C4536s.l(parcel);
        this.f54278d = hVar;
        if (hVar == null) {
            o02 = null;
        } else {
            o02 = hVar.o0();
        }
        this.f54279e = o02;
        this.f54280f = 2;
    }

    private final void e(a.C0822a aVar) {
        if (aVar.f54270g != -1) {
            Parcel parcel = this.f54276b;
            if (parcel != null) {
                int i10 = this.f54280f;
                if (i10 == 0) {
                    this.f54281g = za.c.a(parcel);
                    this.f54280f = 1;
                } else if (i10 != 1) {
                    throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
                }
            } else {
                throw new IllegalStateException("Internal Parcel object is null.");
            }
        } else {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
    }

    private final void f(StringBuilder sb2, Map map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((a.C0822a) entry.getValue()).u0(), entry);
        }
        sb2.append('{');
        int L10 = b.L(parcel);
        boolean z10 = false;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            Map.Entry entry2 = (Map.Entry) sparseArray.get(b.v(C10));
            if (entry2 != null) {
                if (z10) {
                    sb2.append(f.f37529a);
                }
                a.C0822a aVar = (a.C0822a) entry2.getValue();
                sb2.append("\"");
                sb2.append((String) entry2.getKey());
                sb2.append("\":");
                if (aVar.C0()) {
                    int i10 = aVar.f54267d;
                    switch (i10) {
                        case 0:
                            h(sb2, aVar, a.zaD(aVar, Integer.valueOf(b.E(parcel, C10))));
                            break;
                        case 1:
                            h(sb2, aVar, a.zaD(aVar, b.c(parcel, C10)));
                            break;
                        case 2:
                            h(sb2, aVar, a.zaD(aVar, Long.valueOf(b.G(parcel, C10))));
                            break;
                        case 3:
                            h(sb2, aVar, a.zaD(aVar, Float.valueOf(b.A(parcel, C10))));
                            break;
                        case 4:
                            h(sb2, aVar, a.zaD(aVar, Double.valueOf(b.y(parcel, C10))));
                            break;
                        case 5:
                            h(sb2, aVar, a.zaD(aVar, b.a(parcel, C10)));
                            break;
                        case 6:
                            h(sb2, aVar, a.zaD(aVar, Boolean.valueOf(b.w(parcel, C10))));
                            break;
                        case 7:
                            h(sb2, aVar, a.zaD(aVar, b.p(parcel, C10)));
                            break;
                        case 8:
                        case 9:
                            h(sb2, aVar, a.zaD(aVar, b.g(parcel, C10)));
                            break;
                        case 10:
                            Bundle f10 = b.f(parcel, C10);
                            HashMap hashMap = new HashMap();
                            for (String next : f10.keySet()) {
                                hashMap.put(next, (String) C4536s.l(f10.getString(next)));
                            }
                            h(sb2, aVar, a.zaD(aVar, hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException("Unknown field out type = " + i10);
                    }
                } else if (aVar.f54268e) {
                    sb2.append("[");
                    switch (aVar.f54267d) {
                        case 0:
                            C4279b.e(sb2, b.k(parcel, C10));
                            break;
                        case 1:
                            C4279b.g(sb2, b.d(parcel, C10));
                            break;
                        case 2:
                            C4279b.f(sb2, b.l(parcel, C10));
                            break;
                        case 3:
                            C4279b.d(sb2, b.j(parcel, C10));
                            break;
                        case 4:
                            C4279b.c(sb2, b.i(parcel, C10));
                            break;
                        case 5:
                            C4279b.g(sb2, b.b(parcel, C10));
                            break;
                        case 6:
                            C4279b.h(sb2, b.e(parcel, C10));
                            break;
                        case 7:
                            C4279b.i(sb2, b.q(parcel, C10));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            Parcel[] n10 = b.n(parcel, C10);
                            int length = n10.length;
                            for (int i11 = 0; i11 < length; i11++) {
                                if (i11 > 0) {
                                    sb2.append(f.f37529a);
                                }
                                n10[i11].setDataPosition(0);
                                f(sb2, aVar.A0(), n10[i11]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb2.append("]");
                } else {
                    switch (aVar.f54267d) {
                        case 0:
                            sb2.append(b.E(parcel, C10));
                            break;
                        case 1:
                            sb2.append(b.c(parcel, C10));
                            break;
                        case 2:
                            sb2.append(b.G(parcel, C10));
                            break;
                        case 3:
                            sb2.append(b.A(parcel, C10));
                            break;
                        case 4:
                            sb2.append(b.y(parcel, C10));
                            break;
                        case 5:
                            sb2.append(b.a(parcel, C10));
                            break;
                        case 6:
                            sb2.append(b.w(parcel, C10));
                            break;
                        case 7:
                            String p10 = b.p(parcel, C10);
                            sb2.append("\"");
                            sb2.append(l.a(p10));
                            sb2.append("\"");
                            break;
                        case 8:
                            byte[] g10 = b.g(parcel, C10);
                            sb2.append("\"");
                            sb2.append(Ea.c.c(g10));
                            sb2.append("\"");
                            break;
                        case 9:
                            byte[] g11 = b.g(parcel, C10);
                            sb2.append("\"");
                            sb2.append(Ea.c.d(g11));
                            sb2.append("\"");
                            break;
                        case 10:
                            Bundle f11 = b.f(parcel, C10);
                            Set<String> keySet = f11.keySet();
                            sb2.append("{");
                            boolean z11 = true;
                            for (String next2 : keySet) {
                                if (!z11) {
                                    sb2.append(f.f37529a);
                                }
                                sb2.append("\"");
                                sb2.append(next2);
                                sb2.append("\":\"");
                                sb2.append(l.a(f11.getString(next2)));
                                sb2.append("\"");
                                z11 = false;
                            }
                            sb2.append("}");
                            break;
                        case 11:
                            Parcel m10 = b.m(parcel, C10);
                            m10.setDataPosition(0);
                            f(sb2, aVar.A0(), m10);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z10 = true;
            }
        }
        if (parcel.dataPosition() == L10) {
            sb2.append('}');
            return;
        }
        throw new b.a("Overread allowed size end=" + L10, parcel);
    }

    private static final void g(StringBuilder sb2, int i10, Object obj) {
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb2.append(obj);
                return;
            case 7:
                sb2.append("\"");
                sb2.append(l.a(C4536s.l(obj).toString()));
                sb2.append("\"");
                return;
            case 8:
                sb2.append("\"");
                sb2.append(Ea.c.c((byte[]) obj));
                sb2.append("\"");
                return;
            case 9:
                sb2.append("\"");
                sb2.append(Ea.c.d((byte[]) obj));
                sb2.append("\"");
                return;
            case 10:
                m.a(sb2, (HashMap) C4536s.l(obj));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown type = " + i10);
        }
    }

    private static final void h(StringBuilder sb2, a.C0822a aVar, Object obj) {
        if (aVar.f54266c) {
            ArrayList arrayList = (ArrayList) obj;
            sb2.append("[");
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 != 0) {
                    sb2.append(f.f37529a);
                }
                g(sb2, aVar.f54265b, arrayList.get(i10));
            }
            sb2.append("]");
            return;
        }
        g(sb2, aVar.f54265b, obj);
    }

    public final void addConcreteTypeArrayInternal(a.C0822a aVar, String str, ArrayList arrayList) {
        e(aVar);
        ArrayList arrayList2 = new ArrayList();
        ((ArrayList) C4536s.l(arrayList)).size();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(((c) ((a) arrayList.get(i10))).d());
        }
        za.c.A(this.f54276b, aVar.u0(), arrayList2, true);
    }

    public final void addConcreteTypeInternal(a.C0822a aVar, String str, a aVar2) {
        e(aVar);
        za.c.z(this.f54276b, aVar.u0(), ((c) aVar2).d(), true);
    }

    public final Parcel d() {
        int i10 = this.f54280f;
        if (i10 == 0) {
            int a10 = za.c.a(this.f54276b);
            this.f54281g = a10;
            za.c.b(this.f54276b, a10);
            this.f54280f = 2;
        } else if (i10 == 1) {
            za.c.b(this.f54276b, this.f54281g);
            this.f54280f = 2;
        }
        return this.f54276b;
    }

    public final Map getFieldMappings() {
        h hVar = this.f54278d;
        if (hVar == null) {
            return null;
        }
        return hVar.p0((String) C4536s.l(this.f54279e));
    }

    public final Object getValueObject(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public final boolean isPrimitiveFieldSet(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* access modifiers changed from: protected */
    public final void setBooleanInternal(a.C0822a aVar, String str, boolean z10) {
        e(aVar);
        za.c.g(this.f54276b, aVar.u0(), z10);
    }

    /* access modifiers changed from: protected */
    public final void setDecodedBytesInternal(a.C0822a aVar, String str, byte[] bArr) {
        e(aVar);
        za.c.k(this.f54276b, aVar.u0(), bArr, true);
    }

    /* access modifiers changed from: protected */
    public final void setIntegerInternal(a.C0822a aVar, String str, int i10) {
        e(aVar);
        za.c.t(this.f54276b, aVar.u0(), i10);
    }

    /* access modifiers changed from: protected */
    public final void setLongInternal(a.C0822a aVar, String str, long j10) {
        e(aVar);
        za.c.w(this.f54276b, aVar.u0(), j10);
    }

    /* access modifiers changed from: protected */
    public final void setStringInternal(a.C0822a aVar, String str, String str2) {
        e(aVar);
        za.c.D(this.f54276b, aVar.u0(), str2, true);
    }

    /* access modifiers changed from: protected */
    public final void setStringMapInternal(a.C0822a aVar, String str, Map map) {
        e(aVar);
        Bundle bundle = new Bundle();
        for (String str2 : ((Map) C4536s.l(map)).keySet()) {
            bundle.putString(str2, (String) map.get(str2));
        }
        za.c.j(this.f54276b, aVar.u0(), bundle, true);
    }

    /* access modifiers changed from: protected */
    public final void setStringsInternal(a.C0822a aVar, String str, ArrayList arrayList) {
        e(aVar);
        int size = ((ArrayList) C4536s.l(arrayList)).size();
        String[] strArr = new String[size];
        for (int i10 = 0; i10 < size; i10++) {
            strArr[i10] = (String) arrayList.get(i10);
        }
        za.c.E(this.f54276b, aVar.u0(), strArr, true);
    }

    public final String toString() {
        C4536s.m(this.f54278d, "Cannot convert to JSON on client side.");
        Parcel d10 = d();
        d10.setDataPosition(0);
        StringBuilder sb2 = new StringBuilder(100);
        f(sb2, (Map) C4536s.l(this.f54278d.p0((String) C4536s.l(this.f54279e))), d10);
        return sb2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        h hVar;
        int i11 = this.f54275a;
        int a10 = za.c.a(parcel);
        za.c.t(parcel, 1, i11);
        za.c.z(parcel, 2, d(), false);
        int i12 = this.f54277c;
        if (i12 == 0) {
            hVar = null;
        } else if (i12 != 1) {
            hVar = this.f54278d;
        } else {
            hVar = this.f54278d;
        }
        za.c.B(parcel, 3, hVar, i10, false);
        za.c.b(parcel, a10);
    }

    /* access modifiers changed from: protected */
    public final void zab(a.C0822a aVar, String str, BigDecimal bigDecimal) {
        e(aVar);
        za.c.c(this.f54276b, aVar.u0(), bigDecimal, true);
    }

    /* access modifiers changed from: protected */
    public final void zad(a.C0822a aVar, String str, ArrayList arrayList) {
        e(aVar);
        int size = ((ArrayList) C4536s.l(arrayList)).size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i10 = 0; i10 < size; i10++) {
            bigDecimalArr[i10] = (BigDecimal) arrayList.get(i10);
        }
        za.c.d(this.f54276b, aVar.u0(), bigDecimalArr, true);
    }

    /* access modifiers changed from: protected */
    public final void zaf(a.C0822a aVar, String str, BigInteger bigInteger) {
        e(aVar);
        za.c.e(this.f54276b, aVar.u0(), bigInteger, true);
    }

    /* access modifiers changed from: protected */
    public final void zah(a.C0822a aVar, String str, ArrayList arrayList) {
        e(aVar);
        int size = ((ArrayList) C4536s.l(arrayList)).size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i10 = 0; i10 < size; i10++) {
            bigIntegerArr[i10] = (BigInteger) arrayList.get(i10);
        }
        za.c.f(this.f54276b, aVar.u0(), bigIntegerArr, true);
    }

    /* access modifiers changed from: protected */
    public final void zak(a.C0822a aVar, String str, ArrayList arrayList) {
        e(aVar);
        int size = ((ArrayList) C4536s.l(arrayList)).size();
        boolean[] zArr = new boolean[size];
        for (int i10 = 0; i10 < size; i10++) {
            zArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue();
        }
        za.c.h(this.f54276b, aVar.u0(), zArr, true);
    }

    /* access modifiers changed from: protected */
    public final void zan(a.C0822a aVar, String str, double d10) {
        e(aVar);
        za.c.m(this.f54276b, aVar.u0(), d10);
    }

    /* access modifiers changed from: protected */
    public final void zap(a.C0822a aVar, String str, ArrayList arrayList) {
        e(aVar);
        int size = ((ArrayList) C4536s.l(arrayList)).size();
        double[] dArr = new double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = ((Double) arrayList.get(i10)).doubleValue();
        }
        za.c.n(this.f54276b, aVar.u0(), dArr, true);
    }

    /* access modifiers changed from: protected */
    public final void zar(a.C0822a aVar, String str, float f10) {
        e(aVar);
        za.c.p(this.f54276b, aVar.u0(), f10);
    }

    /* access modifiers changed from: protected */
    public final void zat(a.C0822a aVar, String str, ArrayList arrayList) {
        e(aVar);
        int size = ((ArrayList) C4536s.l(arrayList)).size();
        float[] fArr = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            fArr[i10] = ((Float) arrayList.get(i10)).floatValue();
        }
        za.c.q(this.f54276b, aVar.u0(), fArr, true);
    }

    /* access modifiers changed from: protected */
    public final void zaw(a.C0822a aVar, String str, ArrayList arrayList) {
        e(aVar);
        int size = ((ArrayList) C4536s.l(arrayList)).size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
        }
        za.c.u(this.f54276b, aVar.u0(), iArr, true);
    }

    /* access modifiers changed from: protected */
    public final void zaz(a.C0822a aVar, String str, ArrayList arrayList) {
        e(aVar);
        int size = ((ArrayList) C4536s.l(arrayList)).size();
        long[] jArr = new long[size];
        for (int i10 = 0; i10 < size; i10++) {
            jArr[i10] = ((Long) arrayList.get(i10)).longValue();
        }
        za.c.x(this.f54276b, aVar.u0(), jArr, true);
    }
}
