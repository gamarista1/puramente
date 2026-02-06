package com.google.android.gms.common.server.response;

import Ca.C4248b;
import Ea.c;
import Ea.l;
import Ea.m;
import android.os.Parcel;
import android.util.Log;
import com.amazon.a.a.o.b.f;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import za.C5298a;

public abstract class a {

    public interface b {
        Object S(Object obj);

        Object W(Object obj);
    }

    private final void a(C0822a aVar, Object obj) {
        int i10 = aVar.f54267d;
        Object x02 = aVar.x0(obj);
        String str = aVar.f54269f;
        switch (i10) {
            case 0:
                if (x02 != null) {
                    setIntegerInternal(aVar, str, ((Integer) x02).intValue());
                    return;
                } else {
                    c(str);
                    return;
                }
            case 1:
                zaf(aVar, str, (BigInteger) x02);
                return;
            case 2:
                if (x02 != null) {
                    setLongInternal(aVar, str, ((Long) x02).longValue());
                    return;
                } else {
                    c(str);
                    return;
                }
            case 4:
                if (x02 != null) {
                    zan(aVar, str, ((Double) x02).doubleValue());
                    return;
                } else {
                    c(str);
                    return;
                }
            case 5:
                zab(aVar, str, (BigDecimal) x02);
                return;
            case 6:
                if (x02 != null) {
                    setBooleanInternal(aVar, str, ((Boolean) x02).booleanValue());
                    return;
                } else {
                    c(str);
                    return;
                }
            case 7:
                setStringInternal(aVar, str, (String) x02);
                return;
            case 8:
            case 9:
                if (x02 != null) {
                    setDecodedBytesInternal(aVar, str, (byte[]) x02);
                    return;
                } else {
                    c(str);
                    return;
                }
            default:
                throw new IllegalStateException("Unsupported type for conversion: " + i10);
        }
    }

    private static final void b(StringBuilder sb2, C0822a aVar, Object obj) {
        int i10 = aVar.f54265b;
        if (i10 == 11) {
            Class cls = aVar.f54271h;
            C4536s.l(cls);
            sb2.append(((a) cls.cast(obj)).toString());
        } else if (i10 == 7) {
            sb2.append("\"");
            sb2.append(l.a((String) obj));
            sb2.append("\"");
        } else {
            sb2.append(obj);
        }
    }

    private static final void c(String str) {
        if (Log.isLoggable("FastJsonResponse", 6)) {
            Log.e("FastJsonResponse", "Output field (" + str + ") has a null value, but expected a primitive");
        }
    }

    protected static final Object zaD(C0822a aVar, Object obj) {
        if (aVar.f54274k != null) {
            return aVar.y0(obj);
        }
        return obj;
    }

    public <T extends a> void addConcreteTypeArrayInternal(C0822a aVar, String str, ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    public <T extends a> void addConcreteTypeInternal(C0822a aVar, String str, T t10) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    public abstract Map<String, C0822a> getFieldMappings();

    /* access modifiers changed from: protected */
    public Object getFieldValue(C0822a aVar) {
        boolean z10;
        String str = aVar.f54269f;
        if (aVar.f54271h == null) {
            return getValueObject(str);
        }
        if (getValueObject(str) == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C4536s.q(z10, "Concrete field shouldn't be value object: %s", aVar.f54269f);
        try {
            return getClass().getMethod(com.amazon.a.a.o.b.au + Character.toUpperCase(str.charAt(0)) + str.substring(1), (Class[]) null).invoke(this, (Object[]) null);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    /* access modifiers changed from: protected */
    public abstract Object getValueObject(String str);

    /* access modifiers changed from: protected */
    public boolean isFieldSet(C0822a aVar) {
        if (aVar.f54267d != 11) {
            return isPrimitiveFieldSet(aVar.f54269f);
        }
        if (aVar.f54268e) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    /* access modifiers changed from: protected */
    public abstract boolean isPrimitiveFieldSet(String str);

    /* access modifiers changed from: protected */
    public void setBooleanInternal(C0822a aVar, String str, boolean z10) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    /* access modifiers changed from: protected */
    public void setDecodedBytesInternal(C0822a aVar, String str, byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    /* access modifiers changed from: protected */
    public void setIntegerInternal(C0822a aVar, String str, int i10) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    /* access modifiers changed from: protected */
    public void setLongInternal(C0822a aVar, String str, long j10) {
        throw new UnsupportedOperationException("Long not supported");
    }

    /* access modifiers changed from: protected */
    public void setStringInternal(C0822a aVar, String str, String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    /* access modifiers changed from: protected */
    public void setStringMapInternal(C0822a aVar, String str, Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    /* access modifiers changed from: protected */
    public void setStringsInternal(C0822a aVar, String str, ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    public String toString() {
        Map<String, C0822a> fieldMappings = getFieldMappings();
        StringBuilder sb2 = new StringBuilder(100);
        for (String next : fieldMappings.keySet()) {
            C0822a aVar = fieldMappings.get(next);
            if (isFieldSet(aVar)) {
                Object zaD = zaD(aVar, getFieldValue(aVar));
                if (sb2.length() == 0) {
                    sb2.append("{");
                } else {
                    sb2.append(f.f37529a);
                }
                sb2.append("\"");
                sb2.append(next);
                sb2.append("\":");
                if (zaD != null) {
                    switch (aVar.f54267d) {
                        case 8:
                            sb2.append("\"");
                            sb2.append(c.c((byte[]) zaD));
                            sb2.append("\"");
                            break;
                        case 9:
                            sb2.append("\"");
                            sb2.append(c.d((byte[]) zaD));
                            sb2.append("\"");
                            break;
                        case 10:
                            m.a(sb2, (HashMap) zaD);
                            break;
                        default:
                            if (!aVar.f54266c) {
                                b(sb2, aVar, zaD);
                                break;
                            } else {
                                ArrayList arrayList = (ArrayList) zaD;
                                sb2.append("[");
                                int size = arrayList.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    if (i10 > 0) {
                                        sb2.append(f.f37529a);
                                    }
                                    Object obj = arrayList.get(i10);
                                    if (obj != null) {
                                        b(sb2, aVar, obj);
                                    }
                                }
                                sb2.append("]");
                                break;
                            }
                    }
                } else {
                    sb2.append("null");
                }
            }
        }
        if (sb2.length() > 0) {
            sb2.append("}");
        } else {
            sb2.append("{}");
        }
        return sb2.toString();
    }

    public final void zaA(C0822a aVar, String str) {
        if (aVar.f54274k != null) {
            a(aVar, str);
        } else {
            setStringInternal(aVar, aVar.f54269f, str);
        }
    }

    public final void zaB(C0822a aVar, Map map) {
        if (aVar.f54274k != null) {
            a(aVar, map);
        } else {
            setStringMapInternal(aVar, aVar.f54269f, map);
        }
    }

    public final void zaC(C0822a aVar, ArrayList arrayList) {
        if (aVar.f54274k != null) {
            a(aVar, arrayList);
        } else {
            setStringsInternal(aVar, aVar.f54269f, arrayList);
        }
    }

    public final void zaa(C0822a aVar, BigDecimal bigDecimal) {
        if (aVar.f54274k != null) {
            a(aVar, bigDecimal);
        } else {
            zab(aVar, aVar.f54269f, bigDecimal);
        }
    }

    /* access modifiers changed from: protected */
    public void zab(C0822a aVar, String str, BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public final void zac(C0822a aVar, ArrayList arrayList) {
        if (aVar.f54274k != null) {
            a(aVar, arrayList);
        } else {
            zad(aVar, aVar.f54269f, arrayList);
        }
    }

    /* access modifiers changed from: protected */
    public void zad(C0822a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public final void zae(C0822a aVar, BigInteger bigInteger) {
        if (aVar.f54274k != null) {
            a(aVar, bigInteger);
        } else {
            zaf(aVar, aVar.f54269f, bigInteger);
        }
    }

    /* access modifiers changed from: protected */
    public void zaf(C0822a aVar, String str, BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public final void zag(C0822a aVar, ArrayList arrayList) {
        if (aVar.f54274k != null) {
            a(aVar, arrayList);
        } else {
            zah(aVar, aVar.f54269f, arrayList);
        }
    }

    /* access modifiers changed from: protected */
    public void zah(C0822a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public final void zai(C0822a aVar, boolean z10) {
        if (aVar.f54274k != null) {
            a(aVar, Boolean.valueOf(z10));
        } else {
            setBooleanInternal(aVar, aVar.f54269f, z10);
        }
    }

    public final void zaj(C0822a aVar, ArrayList arrayList) {
        if (aVar.f54274k != null) {
            a(aVar, arrayList);
        } else {
            zak(aVar, aVar.f54269f, arrayList);
        }
    }

    /* access modifiers changed from: protected */
    public void zak(C0822a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final void zal(C0822a aVar, byte[] bArr) {
        if (aVar.f54274k != null) {
            a(aVar, bArr);
        } else {
            setDecodedBytesInternal(aVar, aVar.f54269f, bArr);
        }
    }

    public final void zam(C0822a aVar, double d10) {
        if (aVar.f54274k != null) {
            a(aVar, Double.valueOf(d10));
        } else {
            zan(aVar, aVar.f54269f, d10);
        }
    }

    /* access modifiers changed from: protected */
    public void zan(C0822a aVar, String str, double d10) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public final void zao(C0822a aVar, ArrayList arrayList) {
        if (aVar.f54274k != null) {
            a(aVar, arrayList);
        } else {
            zap(aVar, aVar.f54269f, arrayList);
        }
    }

    /* access modifiers changed from: protected */
    public void zap(C0822a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public final void zaq(C0822a aVar, float f10) {
        if (aVar.f54274k != null) {
            a(aVar, Float.valueOf(f10));
        } else {
            zar(aVar, aVar.f54269f, f10);
        }
    }

    /* access modifiers changed from: protected */
    public void zar(C0822a aVar, String str, float f10) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public final void zas(C0822a aVar, ArrayList arrayList) {
        if (aVar.f54274k != null) {
            a(aVar, arrayList);
        } else {
            zat(aVar, aVar.f54269f, arrayList);
        }
    }

    /* access modifiers changed from: protected */
    public void zat(C0822a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public final void zau(C0822a aVar, int i10) {
        if (aVar.f54274k != null) {
            a(aVar, Integer.valueOf(i10));
        } else {
            setIntegerInternal(aVar, aVar.f54269f, i10);
        }
    }

    public final void zav(C0822a aVar, ArrayList arrayList) {
        if (aVar.f54274k != null) {
            a(aVar, arrayList);
        } else {
            zaw(aVar, aVar.f54269f, arrayList);
        }
    }

    /* access modifiers changed from: protected */
    public void zaw(C0822a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public final void zax(C0822a aVar, long j10) {
        if (aVar.f54274k != null) {
            a(aVar, Long.valueOf(j10));
        } else {
            setLongInternal(aVar, aVar.f54269f, j10);
        }
    }

    public final void zay(C0822a aVar, ArrayList arrayList) {
        if (aVar.f54274k != null) {
            a(aVar, arrayList);
        } else {
            zaz(aVar, aVar.f54269f, arrayList);
        }
    }

    /* access modifiers changed from: protected */
    public void zaz(C0822a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }

    /* renamed from: com.google.android.gms.common.server.response.a$a  reason: collision with other inner class name */
    public static class C0822a extends C5298a {
        public static final d CREATOR = new d();

        /* renamed from: a  reason: collision with root package name */
        private final int f54264a;

        /* renamed from: b  reason: collision with root package name */
        protected final int f54265b;

        /* renamed from: c  reason: collision with root package name */
        protected final boolean f54266c;

        /* renamed from: d  reason: collision with root package name */
        protected final int f54267d;

        /* renamed from: e  reason: collision with root package name */
        protected final boolean f54268e;

        /* renamed from: f  reason: collision with root package name */
        protected final String f54269f;

        /* renamed from: g  reason: collision with root package name */
        protected final int f54270g;

        /* renamed from: h  reason: collision with root package name */
        protected final Class f54271h;

        /* renamed from: i  reason: collision with root package name */
        protected final String f54272i;

        /* renamed from: j  reason: collision with root package name */
        private h f54273j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public final b f54274k;

        C0822a(int i10, int i11, boolean z10, int i12, boolean z11, String str, int i13, String str2, C4248b bVar) {
            this.f54264a = i10;
            this.f54265b = i11;
            this.f54266c = z10;
            this.f54267d = i12;
            this.f54268e = z11;
            this.f54269f = str;
            this.f54270g = i13;
            if (str2 == null) {
                this.f54271h = null;
                this.f54272i = null;
            } else {
                this.f54271h = c.class;
                this.f54272i = str2;
            }
            if (bVar == null) {
                this.f54274k = null;
            } else {
                this.f54274k = bVar.p0();
            }
        }

        public static C0822a o0(String str, int i10) {
            return new C0822a(8, false, 8, false, str, i10, (Class) null, (b) null);
        }

        public static C0822a p0(String str, int i10, Class cls) {
            return new C0822a(11, false, 11, false, str, i10, cls, (b) null);
        }

        public static C0822a q0(String str, int i10, Class cls) {
            return new C0822a(11, true, 11, true, str, i10, cls, (b) null);
        }

        public static C0822a r0(String str, int i10) {
            return new C0822a(0, false, 0, false, str, i10, (Class) null, (b) null);
        }

        public static C0822a s0(String str, int i10) {
            return new C0822a(7, false, 7, false, str, i10, (Class) null, (b) null);
        }

        public static C0822a t0(String str, int i10) {
            return new C0822a(7, true, 7, true, str, i10, (Class) null, (b) null);
        }

        public final Map A0() {
            C4536s.l(this.f54272i);
            C4536s.l(this.f54273j);
            return (Map) C4536s.l(this.f54273j.p0(this.f54272i));
        }

        public final void B0(h hVar) {
            this.f54273j = hVar;
        }

        public final boolean C0() {
            return this.f54274k != null;
        }

        public final String toString() {
            C4535q.a a10 = C4535q.d(this).a("versionCode", Integer.valueOf(this.f54264a)).a("typeIn", Integer.valueOf(this.f54265b)).a("typeInArray", Boolean.valueOf(this.f54266c)).a("typeOut", Integer.valueOf(this.f54267d)).a("typeOutArray", Boolean.valueOf(this.f54268e)).a("outputFieldName", this.f54269f).a("safeParcelFieldId", Integer.valueOf(this.f54270g)).a("concreteTypeName", z0());
            Class cls = this.f54271h;
            if (cls != null) {
                a10.a("concreteType.class", cls.getCanonicalName());
            }
            b bVar = this.f54274k;
            if (bVar != null) {
                a10.a("converterName", bVar.getClass().getCanonicalName());
            }
            return a10.toString();
        }

        public int u0() {
            return this.f54270g;
        }

        /* access modifiers changed from: package-private */
        public final C4248b v0() {
            b bVar = this.f54274k;
            if (bVar == null) {
                return null;
            }
            return C4248b.o0(bVar);
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            int i11 = this.f54264a;
            int a10 = za.c.a(parcel);
            za.c.t(parcel, 1, i11);
            za.c.t(parcel, 2, this.f54265b);
            za.c.g(parcel, 3, this.f54266c);
            za.c.t(parcel, 4, this.f54267d);
            za.c.g(parcel, 5, this.f54268e);
            za.c.D(parcel, 6, this.f54269f, false);
            za.c.t(parcel, 7, u0());
            za.c.D(parcel, 8, z0(), false);
            za.c.B(parcel, 9, v0(), i10, false);
            za.c.b(parcel, a10);
        }

        public final Object x0(Object obj) {
            C4536s.l(this.f54274k);
            return C4536s.l(this.f54274k.W(obj));
        }

        public final Object y0(Object obj) {
            C4536s.l(this.f54274k);
            return this.f54274k.S(obj);
        }

        /* access modifiers changed from: package-private */
        public final String z0() {
            String str = this.f54272i;
            if (str == null) {
                return null;
            }
            return str;
        }

        protected C0822a(int i10, boolean z10, int i11, boolean z11, String str, int i12, Class cls, b bVar) {
            this.f54264a = 1;
            this.f54265b = i10;
            this.f54266c = z10;
            this.f54267d = i11;
            this.f54268e = z11;
            this.f54269f = str;
            this.f54270g = i12;
            this.f54271h = cls;
            if (cls == null) {
                this.f54272i = null;
            } else {
                this.f54272i = cls.getCanonicalName();
            }
            this.f54274k = bVar;
        }
    }
}
