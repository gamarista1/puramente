package L1;

import I1.k;
import K1.f;
import K1.g;
import K1.h;
import L1.d;
import androidx.datastore.preferences.protobuf.C1749w;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.C6535s;
import mf.C6565s;
import qf.C6658d;

public final class h implements k {

    /* renamed from: a  reason: collision with root package name */
    public static final h f4138a = new h();

    /* renamed from: b  reason: collision with root package name */
    private static final String f4139b = "preferences_pb";

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4140a;

        static {
            int[] iArr = new int[h.b.values().length];
            iArr[h.b.BOOLEAN.ordinal()] = 1;
            iArr[h.b.FLOAT.ordinal()] = 2;
            iArr[h.b.DOUBLE.ordinal()] = 3;
            iArr[h.b.INTEGER.ordinal()] = 4;
            iArr[h.b.LONG.ordinal()] = 5;
            iArr[h.b.STRING.ordinal()] = 6;
            iArr[h.b.STRING_SET.ordinal()] = 7;
            iArr[h.b.VALUE_NOT_SET.ordinal()] = 8;
            f4140a = iArr;
        }
    }

    private h() {
    }

    private final void d(String str, K1.h hVar, a aVar) {
        int i10;
        h.b X10 = hVar.X();
        if (X10 == null) {
            i10 = -1;
        } else {
            i10 = a.f4140a[X10.ordinal()];
        }
        switch (i10) {
            case -1:
                throw new I1.a("Value case is null.", (Throwable) null, 2, (DefaultConstructorMarker) null);
            case 1:
                aVar.i(f.a(str), Boolean.valueOf(hVar.P()));
                return;
            case 2:
                aVar.i(f.c(str), Float.valueOf(hVar.S()));
                return;
            case 3:
                aVar.i(f.b(str), Double.valueOf(hVar.R()));
                return;
            case 4:
                aVar.i(f.d(str), Integer.valueOf(hVar.T()));
                return;
            case 5:
                aVar.i(f.e(str), Long.valueOf(hVar.U()));
                return;
            case 6:
                d.a f10 = f.f(str);
                String V10 = hVar.V();
                C6496s.g(V10, "value.string");
                aVar.i(f10, V10);
                return;
            case 7:
                d.a g10 = f.g(str);
                List M10 = hVar.W().M();
                C6496s.g(M10, "value.stringSet.stringsList");
                aVar.i(g10, C6565s.j1(M10));
                return;
            case 8:
                throw new I1.a("Value not set.", (Throwable) null, 2, (DefaultConstructorMarker) null);
            default:
                throw new C6535s();
        }
    }

    private final K1.h g(Object obj) {
        if (obj instanceof Boolean) {
            C1749w m10 = K1.h.Y().w(((Boolean) obj).booleanValue()).m();
            C6496s.g(m10, "newBuilder().setBoolean(value).build()");
            return (K1.h) m10;
        } else if (obj instanceof Float) {
            C1749w m11 = K1.h.Y().y(((Number) obj).floatValue()).m();
            C6496s.g(m11, "newBuilder().setFloat(value).build()");
            return (K1.h) m11;
        } else if (obj instanceof Double) {
            C1749w m12 = K1.h.Y().x(((Number) obj).doubleValue()).m();
            C6496s.g(m12, "newBuilder().setDouble(value).build()");
            return (K1.h) m12;
        } else if (obj instanceof Integer) {
            C1749w m13 = K1.h.Y().z(((Number) obj).intValue()).m();
            C6496s.g(m13, "newBuilder().setInteger(value).build()");
            return (K1.h) m13;
        } else if (obj instanceof Long) {
            C1749w m14 = K1.h.Y().A(((Number) obj).longValue()).m();
            C6496s.g(m14, "newBuilder().setLong(value).build()");
            return (K1.h) m14;
        } else if (obj instanceof String) {
            C1749w m15 = K1.h.Y().B((String) obj).m();
            C6496s.g(m15, "newBuilder().setString(value).build()");
            return (K1.h) m15;
        } else if (obj instanceof Set) {
            C1749w m16 = K1.h.Y().C(g.N().w((Set) obj)).m();
            C6496s.g(m16, "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()");
            return (K1.h) m16;
        } else {
            throw new IllegalStateException(C6496s.o("PreferencesSerializer does not support type: ", obj.getClass().getName()));
        }
    }

    public Object b(InputStream inputStream, C6658d dVar) {
        f a10 = K1.d.f3991a.a(inputStream);
        a b10 = e.b(new d.b[0]);
        Map K10 = a10.K();
        C6496s.g(K10, "preferencesProto.preferencesMap");
        for (Map.Entry entry : K10.entrySet()) {
            String str = (String) entry.getKey();
            K1.h hVar = (K1.h) entry.getValue();
            h hVar2 = f4138a;
            C6496s.g(str, "name");
            C6496s.g(hVar, "value");
            hVar2.d(str, hVar, b10);
        }
        return b10.d();
    }

    /* renamed from: e */
    public d a() {
        return e.a();
    }

    public final String f() {
        return f4139b;
    }

    /* renamed from: h */
    public Object c(d dVar, OutputStream outputStream, C6658d dVar2) {
        Map a10 = dVar.a();
        f.a N10 = f.N();
        for (Map.Entry entry : a10.entrySet()) {
            N10.w(((d.a) entry.getKey()).a(), g(entry.getValue()));
        }
        ((f) N10.m()).k(outputStream);
        return C6514M.f71813a;
    }
}
