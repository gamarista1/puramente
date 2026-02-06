package kotlin.jvm.internal;

import Ff.d;
import Ff.e;
import Ff.p;
import Ff.r;
import java.util.List;
import lf.C6535s;
import mf.C6565s;
import xf.C6781a;
import yf.C6798l;

public final class X implements p {

    /* renamed from: e  reason: collision with root package name */
    public static final a f71767e = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final e f71768a;

    /* renamed from: b  reason: collision with root package name */
    private final List f71769b;

    /* renamed from: c  reason: collision with root package name */
    private final p f71770c;

    /* renamed from: d  reason: collision with root package name */
    private final int f71771d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f71772a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                Ff.s[] r0 = Ff.s.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Ff.s r1 = Ff.s.INVARIANT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Ff.s r1 = Ff.s.IN     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Ff.s r1 = Ff.s.OUT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f71772a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.X.b.<clinit>():void");
        }
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ X f71773a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(X x10) {
            super(1);
            this.f71773a = x10;
        }

        /* renamed from: a */
        public final CharSequence invoke(r rVar) {
            C6496s.h(rVar, "it");
            return this.f71773a.i(rVar);
        }
    }

    public X(e eVar, List list, p pVar, int i10) {
        C6496s.h(eVar, "classifier");
        C6496s.h(list, "arguments");
        this.f71768a = eVar;
        this.f71769b = list;
        this.f71770c = pVar;
        this.f71771d = i10;
    }

    /* access modifiers changed from: private */
    public final String i(r rVar) {
        X x10;
        String str;
        if (rVar.d() == null) {
            return "*";
        }
        p c10 = rVar.c();
        if (c10 instanceof X) {
            x10 = (X) c10;
        } else {
            x10 = null;
        }
        if (x10 == null || (str = x10.k(true)) == null) {
            str = String.valueOf(rVar.c());
        }
        int i10 = b.f71772a[rVar.d().ordinal()];
        if (i10 == 1) {
            return str;
        }
        if (i10 == 2) {
            return "in " + str;
        } else if (i10 == 3) {
            return "out " + str;
        } else {
            throw new C6535s();
        }
    }

    private final String k(boolean z10) {
        d dVar;
        String str;
        String str2;
        e b10 = b();
        Class cls = null;
        if (b10 instanceof d) {
            dVar = (d) b10;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            cls = C6781a.b(dVar);
        }
        if (cls == null) {
            str = b().toString();
        } else if ((this.f71771d & 4) != 0) {
            str = "kotlin.Nothing";
        } else if (cls.isArray()) {
            str = n(cls);
        } else if (!z10 || !cls.isPrimitive()) {
            str = cls.getName();
        } else {
            e b11 = b();
            C6496s.f(b11, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            str = C6781a.c((d) b11).getName();
        }
        String str3 = "";
        if (c().isEmpty()) {
            str2 = str3;
        } else {
            str2 = C6565s.x0(c(), ", ", "<", ">", 0, (CharSequence) null, new c(this), 24, (Object) null);
        }
        if (e()) {
            str3 = "?";
        }
        String str4 = str + str2 + str3;
        p pVar = this.f71770c;
        if (!(pVar instanceof X)) {
            return str4;
        }
        String k10 = ((X) pVar).k(true);
        if (C6496s.c(k10, str4)) {
            return str4;
        }
        if (C6496s.c(k10, str4 + '?')) {
            return str4 + '!';
        }
        return '(' + str4 + ".." + k10 + ')';
    }

    private final String n(Class cls) {
        if (C6496s.c(cls, boolean[].class)) {
            return "kotlin.BooleanArray";
        }
        if (C6496s.c(cls, char[].class)) {
            return "kotlin.CharArray";
        }
        if (C6496s.c(cls, byte[].class)) {
            return "kotlin.ByteArray";
        }
        if (C6496s.c(cls, short[].class)) {
            return "kotlin.ShortArray";
        }
        if (C6496s.c(cls, int[].class)) {
            return "kotlin.IntArray";
        }
        if (C6496s.c(cls, float[].class)) {
            return "kotlin.FloatArray";
        }
        if (C6496s.c(cls, long[].class)) {
            return "kotlin.LongArray";
        }
        if (C6496s.c(cls, double[].class)) {
            return "kotlin.DoubleArray";
        }
        return "kotlin.Array";
    }

    public e b() {
        return this.f71768a;
    }

    public List c() {
        return this.f71769b;
    }

    public boolean e() {
        if ((this.f71771d & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof X) {
            X x10 = (X) obj;
            if (!C6496s.c(b(), x10.b()) || !C6496s.c(c(), x10.c()) || !C6496s.c(this.f71770c, x10.f71770c) || this.f71771d != x10.f71771d) {
                return false;
            }
            return true;
        }
        return false;
    }

    public List getAnnotations() {
        return C6565s.n();
    }

    public int hashCode() {
        return (((b().hashCode() * 31) + c().hashCode()) * 31) + Integer.hashCode(this.f71771d);
    }

    public String toString() {
        return k(false) + " (Kotlin reflection is not available)";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public X(e eVar, List list, boolean z10) {
        this(eVar, list, (p) null, z10 ? 1 : 0);
        C6496s.h(eVar, "classifier");
        C6496s.h(list, "arguments");
    }
}
