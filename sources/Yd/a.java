package Yd;

import Md.d;
import ae.p;

public interface a {

    /* renamed from: Yd.a$a  reason: collision with other inner class name */
    class C0814a implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f53527a;

        C0814a(p pVar) {
            this.f53527a = pVar;
        }

        public void reject(String str, String str2, Throwable th2) {
            this.f53527a.reject(str, str2, th2);
        }

        public void resolve(Object obj) {
            this.f53527a.resolve(obj);
        }
    }

    class b implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f53528a;

        b(p pVar) {
            this.f53528a = pVar;
        }

        public void reject(String str, String str2, Throwable th2) {
            this.f53528a.reject(str, str2, th2);
        }

        public void resolve(Object obj) {
            this.f53528a.resolve(obj);
        }
    }

    static void a(a aVar, d dVar, String... strArr) {
        if (aVar == null) {
            dVar.reject("E_NO_PERMISSIONS", "Permissions module is null. Are you sure all the installed Expo modules are properly linked?");
        } else {
            aVar.h(dVar, strArr);
        }
    }

    static void b(a aVar, p pVar, String... strArr) {
        a(aVar, new C0814a(pVar), strArr);
    }

    static void c(a aVar, d dVar, String... strArr) {
        if (aVar == null) {
            dVar.reject("E_NO_PERMISSIONS", "Permissions module is null. Are you sure all the installed Expo modules are properly linked?");
        } else {
            aVar.g(dVar, strArr);
        }
    }

    static void d(a aVar, p pVar, String... strArr) {
        c(aVar, new b(pVar), strArr);
    }

    void e(c cVar, String... strArr);

    boolean f(String... strArr);

    void g(d dVar, String... strArr);

    void h(d dVar, String... strArr);
}
