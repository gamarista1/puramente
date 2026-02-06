package Mg;

import Mg.f;
import Of.C5507z;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class A implements f {

    /* renamed from: a  reason: collision with root package name */
    private final String f64133a;

    public static final class a extends A {

        /* renamed from: b  reason: collision with root package name */
        private final int f64134b;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(int r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "must have at least "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " value parameter"
                r0.append(r1)
                r1 = 1
                if (r3 <= r1) goto L_0x0018
                java.lang.String r1 = "s"
                goto L_0x001a
            L_0x0018:
                java.lang.String r1 = ""
            L_0x001a:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 0
                r2.<init>(r0, r1)
                r2.f64134b = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Mg.A.a.<init>(int):void");
        }

        public boolean a(C5507z zVar) {
            C6496s.h(zVar, "functionDescriptor");
            if (zVar.k().size() >= this.f64134b) {
                return true;
            }
            return false;
        }
    }

    public static final class b extends A {

        /* renamed from: b  reason: collision with root package name */
        private final int f64135b;

        public b(int i10) {
            super("must have exactly " + i10 + " value parameters", (DefaultConstructorMarker) null);
            this.f64135b = i10;
        }

        public boolean a(C5507z zVar) {
            C6496s.h(zVar, "functionDescriptor");
            if (zVar.k().size() == this.f64135b) {
                return true;
            }
            return false;
        }
    }

    public static final class c extends A {

        /* renamed from: b  reason: collision with root package name */
        public static final c f64136b = new c();

        private c() {
            super("must have no value parameters", (DefaultConstructorMarker) null);
        }

        public boolean a(C5507z zVar) {
            C6496s.h(zVar, "functionDescriptor");
            return zVar.k().isEmpty();
        }
    }

    public static final class d extends A {

        /* renamed from: b  reason: collision with root package name */
        public static final d f64137b = new d();

        private d() {
            super("must have a single value parameter", (DefaultConstructorMarker) null);
        }

        public boolean a(C5507z zVar) {
            C6496s.h(zVar, "functionDescriptor");
            if (zVar.k().size() == 1) {
                return true;
            }
            return false;
        }
    }

    public /* synthetic */ A(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public String b(C5507z zVar) {
        return f.a.a(this, zVar);
    }

    public String getDescription() {
        return this.f64133a;
    }

    private A(String str) {
        this.f64133a = str;
    }
}
