package qe;

import Ff.p;
import ae.C4464a;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import expo.modules.kotlin.exception.r;
import expo.modules.kotlin.exception.x;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JavaScriptFunction;
import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.jni.JavaScriptValue;
import expo.modules.kotlin.sharedobjects.SharedObject;
import expo.modules.kotlin.sharedobjects.SharedRef;
import expo.modules.kotlin.types.Either;
import expo.modules.kotlin.types.EitherOfFour;
import expo.modules.kotlin.types.EitherOfThree;
import expo.modules.kotlin.views.q;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import je.C5052a;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;
import lf.C6502A;
import lf.C6514M;
import xf.C6781a;

public final class b0 implements Z {

    /* renamed from: a  reason: collision with root package name */
    public static final b0 f61416a;

    /* renamed from: b  reason: collision with root package name */
    private static final Map f61417b;

    /* renamed from: c  reason: collision with root package name */
    private static final Map f61418c;

    /* renamed from: d  reason: collision with root package name */
    private static final Map f61419d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    public static final int f61420e = 8;

    public static final class a extends C5175w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ExpectedType f61421b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(boolean z10, ExpectedType expectedType) {
            super(z10);
            this.f61421b = expectedType;
        }

        public ExpectedType b() {
            return this.f61421b;
        }

        public Object e(Object obj, C4464a aVar) {
            C6496s.h(obj, "value");
            return (long[]) obj;
        }

        public Object f(Dynamic dynamic, C4464a aVar) {
            C6496s.h(dynamic, "value");
            ReadableArray asArray = dynamic.asArray();
            int size = asArray.size();
            long[] jArr = new long[size];
            for (int i10 = 0; i10 < size; i10++) {
                jArr[i10] = (long) asArray.getDouble(i10);
            }
            return jArr;
        }
    }

    public static final class b extends C5175w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ExpectedType f61422b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(boolean z10, ExpectedType expectedType) {
            super(z10);
            this.f61422b = expectedType;
        }

        public ExpectedType b() {
            return this.f61422b;
        }

        public Object e(Object obj, C4464a aVar) {
            C6496s.h(obj, "value");
            return (double[]) obj;
        }

        public Object f(Dynamic dynamic, C4464a aVar) {
            C6496s.h(dynamic, "value");
            ReadableArray asArray = dynamic.asArray();
            int size = asArray.size();
            double[] dArr = new double[size];
            for (int i10 = 0; i10 < size; i10++) {
                dArr[i10] = asArray.getDouble(i10);
            }
            return dArr;
        }
    }

    public static final class c extends C5175w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ExpectedType f61423b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(boolean z10, ExpectedType expectedType) {
            super(z10);
            this.f61423b = expectedType;
        }

        public ExpectedType b() {
            return this.f61423b;
        }

        public Object e(Object obj, C4464a aVar) {
            C6496s.h(obj, "value");
            return (float[]) obj;
        }

        public Object f(Dynamic dynamic, C4464a aVar) {
            C6496s.h(dynamic, "value");
            ReadableArray asArray = dynamic.asArray();
            int size = asArray.size();
            float[] fArr = new float[size];
            for (int i10 = 0; i10 < size; i10++) {
                fArr[i10] = (float) asArray.getDouble(i10);
            }
            return fArr;
        }
    }

    public static final class d extends C5175w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ExpectedType f61424b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(boolean z10, ExpectedType expectedType) {
            super(z10);
            this.f61424b = expectedType;
        }

        public ExpectedType b() {
            return this.f61424b;
        }

        public Object e(Object obj, C4464a aVar) {
            C6496s.h(obj, "value");
            return (boolean[]) obj;
        }

        public Object f(Dynamic dynamic, C4464a aVar) {
            C6496s.h(dynamic, "value");
            ReadableArray asArray = dynamic.asArray();
            int size = asArray.size();
            boolean[] zArr = new boolean[size];
            for (int i10 = 0; i10 < size; i10++) {
                zArr[i10] = asArray.getBoolean(i10);
            }
            return zArr;
        }
    }

    public static final class e extends C5175w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ExpectedType f61425b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(boolean z10, ExpectedType expectedType) {
            super(z10);
            this.f61425b = expectedType;
        }

        public ExpectedType b() {
            return this.f61425b;
        }

        public Object e(Object obj, C4464a aVar) {
            C6496s.h(obj, "value");
            return (Integer) obj;
        }

        public Object f(Dynamic dynamic, C4464a aVar) {
            C6496s.h(dynamic, "value");
            return Integer.valueOf((int) dynamic.asDouble());
        }
    }

    public static final class f extends C5175w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ExpectedType f61426b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(boolean z10, ExpectedType expectedType) {
            super(z10);
            this.f61426b = expectedType;
        }

        public ExpectedType b() {
            return this.f61426b;
        }

        public Object e(Object obj, C4464a aVar) {
            C6496s.h(obj, "value");
            return (Long) obj;
        }

        public Object f(Dynamic dynamic, C4464a aVar) {
            C6496s.h(dynamic, "value");
            return Long.valueOf((long) dynamic.asDouble());
        }
    }

    public static final class g extends C5175w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ExpectedType f61427b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(boolean z10, ExpectedType expectedType) {
            super(z10);
            this.f61427b = expectedType;
        }

        public ExpectedType b() {
            return this.f61427b;
        }

        public Object e(Object obj, C4464a aVar) {
            C6496s.h(obj, "value");
            return (Double) obj;
        }

        public Object f(Dynamic dynamic, C4464a aVar) {
            C6496s.h(dynamic, "value");
            return Double.valueOf(dynamic.asDouble());
        }
    }

    public static final class h extends C5175w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ExpectedType f61428b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(boolean z10, ExpectedType expectedType) {
            super(z10);
            this.f61428b = expectedType;
        }

        public ExpectedType b() {
            return this.f61428b;
        }

        public Object e(Object obj, C4464a aVar) {
            C6496s.h(obj, "value");
            return (Float) obj;
        }

        public Object f(Dynamic dynamic, C4464a aVar) {
            C6496s.h(dynamic, "value");
            return Float.valueOf((float) dynamic.asDouble());
        }
    }

    public static final class i extends C5175w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ExpectedType f61429b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(boolean z10, ExpectedType expectedType) {
            super(z10);
            this.f61429b = expectedType;
        }

        public ExpectedType b() {
            return this.f61429b;
        }

        public Object e(Object obj, C4464a aVar) {
            C6496s.h(obj, "value");
            return (Boolean) obj;
        }

        public Object f(Dynamic dynamic, C4464a aVar) {
            C6496s.h(dynamic, "value");
            return Boolean.valueOf(dynamic.asBoolean());
        }
    }

    public static final class j extends C5175w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ExpectedType f61430b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(boolean z10, ExpectedType expectedType) {
            super(z10);
            this.f61430b = expectedType;
        }

        public ExpectedType b() {
            return this.f61430b;
        }

        public Object e(Object obj, C4464a aVar) {
            C6496s.h(obj, "value");
            return (String) obj;
        }

        public Object f(Dynamic dynamic, C4464a aVar) {
            C6496s.h(dynamic, "value");
            return dynamic.asString();
        }
    }

    public static final class k extends C5175w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ExpectedType f61431b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(boolean z10, ExpectedType expectedType) {
            super(z10);
            this.f61431b = expectedType;
        }

        public ExpectedType b() {
            return this.f61431b;
        }

        public Object e(Object obj, C4464a aVar) {
            C6496s.h(obj, "value");
            return (ReadableArray) obj;
        }

        public Object f(Dynamic dynamic, C4464a aVar) {
            C6496s.h(dynamic, "value");
            return dynamic.asArray();
        }
    }

    public static final class l extends C5175w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ExpectedType f61432b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(boolean z10, ExpectedType expectedType) {
            super(z10);
            this.f61432b = expectedType;
        }

        public ExpectedType b() {
            return this.f61432b;
        }

        public Object e(Object obj, C4464a aVar) {
            C6496s.h(obj, "value");
            return (ReadableMap) obj;
        }

        public Object f(Dynamic dynamic, C4464a aVar) {
            C6496s.h(dynamic, "value");
            return dynamic.asMap();
        }
    }

    public static final class m extends C5175w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ExpectedType f61433b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(boolean z10, ExpectedType expectedType) {
            super(z10);
            this.f61433b = expectedType;
        }

        public ExpectedType b() {
            return this.f61433b;
        }

        public Object e(Object obj, C4464a aVar) {
            C6496s.h(obj, "value");
            return (int[]) obj;
        }

        public Object f(Dynamic dynamic, C4464a aVar) {
            C6496s.h(dynamic, "value");
            ReadableArray asArray = dynamic.asArray();
            int size = asArray.size();
            int[] iArr = new int[size];
            for (int i10 = 0; i10 < size; i10++) {
                iArr[i10] = asArray.getInt(i10);
            }
            return iArr;
        }
    }

    public static final class n extends C5175w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ExpectedType f61434b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(boolean z10, ExpectedType expectedType) {
            super(z10);
            this.f61434b = expectedType;
        }

        public ExpectedType b() {
            return this.f61434b;
        }

        public Object e(Object obj, C4464a aVar) {
            C6496s.h(obj, "value");
            return obj;
        }

        public Object f(Dynamic dynamic, C4464a aVar) {
            C6496s.h(dynamic, "value");
            throw new x(O.b(Object.class));
        }
    }

    public static final class o extends C5175w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ExpectedType f61435b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public o(boolean z10, ExpectedType expectedType) {
            super(z10);
            this.f61435b = expectedType;
        }

        public ExpectedType b() {
            return this.f61435b;
        }

        public Object e(Object obj, C4464a aVar) {
            C6496s.h(obj, "value");
            return obj;
        }

        public Object f(Dynamic dynamic, C4464a aVar) {
            C6496s.h(dynamic, "value");
            throw new x(O.b(Object.class));
        }
    }

    static {
        b0 b0Var = new b0();
        f61416a = b0Var;
        f61417b = b0Var.b(false);
        f61418c = b0Var.b(true);
    }

    private b0() {
    }

    private final Map b(boolean z10) {
        boolean z11 = z10;
        C5052a aVar = C5052a.INT;
        e eVar = new e(z11, new ExpectedType(aVar));
        C5052a aVar2 = C5052a.LONG;
        f fVar = new f(z11, new ExpectedType(aVar2));
        C5052a aVar3 = C5052a.DOUBLE;
        g gVar = new g(z11, new ExpectedType(aVar3));
        C5052a aVar4 = C5052a.FLOAT;
        h hVar = new h(z11, new ExpectedType(aVar4));
        C5052a aVar5 = C5052a.BOOLEAN;
        i iVar = new i(z11, new ExpectedType(aVar5));
        Pair a10 = C6502A.a(O.b(Integer.TYPE), eVar);
        Pair a11 = C6502A.a(O.b(Integer.class), eVar);
        Pair a12 = C6502A.a(O.b(Long.TYPE), fVar);
        Pair a13 = C6502A.a(O.b(Long.class), fVar);
        Pair a14 = C6502A.a(O.b(Double.TYPE), gVar);
        Pair a15 = C6502A.a(O.b(Double.class), gVar);
        Pair a16 = C6502A.a(O.b(Float.TYPE), hVar);
        Pair a17 = C6502A.a(O.b(Float.class), hVar);
        Pair a18 = C6502A.a(O.b(Boolean.TYPE), iVar);
        Pair a19 = C6502A.a(O.b(Boolean.class), iVar);
        Pair a20 = C6502A.a(O.b(String.class), new j(z11, new ExpectedType(C5052a.STRING)));
        Pair a21 = C6502A.a(O.b(ReadableArray.class), new k(z11, new ExpectedType(C5052a.READABLE_ARRAY)));
        Pair a22 = C6502A.a(O.b(ReadableMap.class), new l(z11, new ExpectedType(C5052a.READABLE_MAP)));
        Ff.d b10 = O.b(int[].class);
        ExpectedType.a aVar6 = ExpectedType.f60423c;
        Map l10 = mf.O.l(a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, C6502A.a(b10, new m(z11, aVar6.e(aVar))), C6502A.a(O.b(long[].class), new a(z11, aVar6.e(aVar2))), C6502A.a(O.b(double[].class), new b(z11, aVar6.e(aVar3))), C6502A.a(O.b(float[].class), new c(z11, aVar6.e(aVar4))), C6502A.a(O.b(boolean[].class), new d(z11, aVar6.e(aVar5))), C6502A.a(O.b(byte[].class), new C5162i(z11)), C6502A.a(O.b(JavaScriptValue.class), new n(z11, new ExpectedType(C5052a.JS_VALUE))), C6502A.a(O.b(JavaScriptObject.class), new o(z11, new ExpectedType(C5052a.JS_OBJECT))), C6502A.a(O.b(pe.h.class), new K(z11)), C6502A.a(O.b(pe.f.class), new I(z11)), C6502A.a(O.b(pe.g.class), new J(z11)), C6502A.a(O.b(pe.n.class), new f0(z11)), C6502A.a(O.b(pe.o.class), new g0(z11)), C6502A.a(O.b(pe.l.class), new d0(z11)), C6502A.a(O.b(pe.m.class), new e0(z11)), C6502A.a(O.b(pe.c.class), new F(z11)), C6502A.a(O.b(pe.d.class), new G(z11)), C6502A.a(O.b(pe.a.class), new C5160g(z11)), C6502A.a(O.b(pe.b.class), new C5161h(z11)), C6502A.a(O.b(pe.j.class), new c0(z11)), C6502A.a(O.b(URL.class), new te.b(z11)), C6502A.a(O.b(Uri.class), new te.c(z11)), C6502A.a(O.b(URI.class), new te.a(z11)), C6502A.a(O.b(File.class), new se.a(z11)), C6502A.a(O.b(Tg.a.class), new C5174v(z11)), C6502A.a(O.b(Object.class), new C5156c(z11)), C6502A.a(O.b(C6514M.class), new i0()), C6502A.a(O.b(Nd.b.class), new U(z11)));
        if (Build.VERSION.SDK_INT >= 26) {
            return mf.O.p(l10, mf.O.l(C6502A.a(O.b(com.fasterxml.jackson.databind.ext.a.a()), new se.b(z11)), C6502A.a(O.b(Color.class), new C5164k(z11)), C6502A.a(O.b(a0.a()), new C5172t(z11))));
        }
        return l10;
    }

    private final Y c(p pVar) {
        if (pVar.e()) {
            return (Y) f61418c.get(pVar.b());
        }
        return (Y) f61417b.get(pVar.b());
    }

    private final Y d(p pVar, Class cls) {
        if (!Either.class.isAssignableFrom(cls)) {
            return null;
        }
        if (EitherOfFour.class.isAssignableFrom(cls)) {
            return new C5176x(this, pVar);
        }
        if (EitherOfThree.class.isAssignableFrom(cls)) {
            return new C5177y(this, pVar);
        }
        return new C5178z(this, pVar);
    }

    public Y a(p pVar) {
        Ff.d dVar;
        C6496s.h(pVar, "type");
        Y c10 = c(pVar);
        if (c10 != null) {
            return c10;
        }
        Ff.e b10 = pVar.b();
        if (b10 instanceof Ff.d) {
            dVar = (Ff.d) b10;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            Class b11 = C6781a.b(dVar);
            if (b11.isArray() || Object[].class.isAssignableFrom(b11)) {
                return new C5158e(this, pVar);
            }
            if (List.class.isAssignableFrom(b11)) {
                return new P(this, pVar);
            }
            if (Map.class.isAssignableFrom(b11)) {
                return new Q(this, pVar);
            }
            if (Pair.class.isAssignableFrom(b11)) {
                return new T(this, pVar);
            }
            if (Set.class.isAssignableFrom(b11)) {
                return new X(this, pVar);
            }
            if (b11.isEnum()) {
                return new D(dVar, pVar.e());
            }
            Map map = f61419d;
            Y y10 = (Y) map.get(pVar);
            if (y10 != null) {
                return y10;
            }
            if (ne.c.class.isAssignableFrom(b11)) {
                ne.e eVar = new ne.e(this, pVar);
                map.put(pVar, eVar);
                return eVar;
            } else if (View.class.isAssignableFrom(b11)) {
                return new q(pVar);
            } else {
                if (SharedRef.class.isAssignableFrom(b11)) {
                    return new oe.g(pVar);
                }
                if (SharedObject.class.isAssignableFrom(b11)) {
                    return new oe.e(pVar);
                }
                if (JavaScriptFunction.class.isAssignableFrom(b11)) {
                    return new N(pVar);
                }
                Y d10 = d(pVar, b11);
                if (d10 != null) {
                    return d10;
                }
                throw new r(pVar);
            }
        } else {
            throw new r(pVar);
        }
    }
}
