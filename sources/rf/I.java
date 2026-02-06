package Rf;

import Eg.n;
import Of.G;
import Of.V;
import kotlin.jvm.internal.C6496s;
import ng.c;

public interface I {

    /* renamed from: a  reason: collision with root package name */
    public static final a f64751a = a.f64752a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f64752a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final G f64753b = new G("PackageViewDescriptorFactory");

        private a() {
        }

        public final G a() {
            return f64753b;
        }
    }

    public static final class b implements I {

        /* renamed from: b  reason: collision with root package name */
        public static final b f64754b = new b();

        private b() {
        }

        public V a(F f10, c cVar, n nVar) {
            C6496s.h(f10, "module");
            C6496s.h(cVar, "fqName");
            C6496s.h(nVar, "storageManager");
            return new C5534x(f10, cVar, nVar);
        }
    }

    V a(F f10, c cVar, n nVar);
}
