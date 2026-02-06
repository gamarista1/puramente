package Mg;

import Mg.f;
import Of.C5507z;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class k implements f {

    /* renamed from: a  reason: collision with root package name */
    private final String f64160a;

    public static final class a extends k {

        /* renamed from: b  reason: collision with root package name */
        public static final a f64161b = new a();

        private a() {
            super("must be a member function", (DefaultConstructorMarker) null);
        }

        public boolean a(C5507z zVar) {
            C6496s.h(zVar, "functionDescriptor");
            if (zVar.M() != null) {
                return true;
            }
            return false;
        }
    }

    public static final class b extends k {

        /* renamed from: b  reason: collision with root package name */
        public static final b f64162b = new b();

        private b() {
            super("must be a member or an extension function", (DefaultConstructorMarker) null);
        }

        public boolean a(C5507z zVar) {
            C6496s.h(zVar, "functionDescriptor");
            if (zVar.M() == null && zVar.P() == null) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ k(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public String b(C5507z zVar) {
        return f.a.a(this, zVar);
    }

    public String getDescription() {
        return this.f64160a;
    }

    private k(String str) {
        this.f64160a = str;
    }
}
