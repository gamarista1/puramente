package sb;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import rb.C5190b;
import sb.e;

/* renamed from: sb.d  reason: case insensitive filesystem */
public final class C5199d {

    /* renamed from: b  reason: collision with root package name */
    public static final C5199d f61614b = new C5199d(new e.a());

    /* renamed from: c  reason: collision with root package name */
    public static final C5199d f61615c = new C5199d(new e.C0911e());

    /* renamed from: d  reason: collision with root package name */
    public static final C5199d f61616d = new C5199d(new e.g());

    /* renamed from: e  reason: collision with root package name */
    public static final C5199d f61617e = new C5199d(new e.f());

    /* renamed from: f  reason: collision with root package name */
    public static final C5199d f61618f = new C5199d(new e.b());

    /* renamed from: g  reason: collision with root package name */
    public static final C5199d f61619g = new C5199d(new e.d());

    /* renamed from: h  reason: collision with root package name */
    public static final C5199d f61620h = new C5199d(new e.c());

    /* renamed from: a  reason: collision with root package name */
    private final e f61621a;

    /* renamed from: sb.d$b */
    private static class b implements e {

        /* renamed from: a  reason: collision with root package name */
        private final e f61622a;

        public Object a(String str) {
            Exception exc = null;
            for (Provider a10 : C5199d.b("GmsCore_OpenSSL", "AndroidOpenSSL")) {
                try {
                    return this.f61622a.a(str, a10);
                } catch (Exception e10) {
                    if (exc == null) {
                        exc = e10;
                    }
                }
            }
            return this.f61622a.a(str, (Provider) null);
        }

        private b(e eVar) {
            this.f61622a = eVar;
        }
    }

    /* renamed from: sb.d$c */
    private static class c implements e {

        /* renamed from: a  reason: collision with root package name */
        private final e f61623a;

        public Object a(String str) {
            return this.f61623a.a(str, (Provider) null);
        }

        private c(e eVar) {
            this.f61623a = eVar;
        }
    }

    /* renamed from: sb.d$d  reason: collision with other inner class name */
    private static class C0910d implements e {

        /* renamed from: a  reason: collision with root package name */
        private final e f61624a;

        public Object a(String str) {
            Exception exc = null;
            for (Provider a10 : C5199d.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt")) {
                try {
                    return this.f61624a.a(str, a10);
                } catch (Exception e10) {
                    if (exc == null) {
                        exc = e10;
                    }
                }
            }
            throw new GeneralSecurityException("No good Provider found.", exc);
        }

        private C0910d(e eVar) {
            this.f61624a = eVar;
        }
    }

    /* renamed from: sb.d$e */
    private interface e {
        Object a(String str);
    }

    public C5199d(e eVar) {
        if (C5190b.c()) {
            this.f61621a = new C0910d(eVar);
        } else if (h.a()) {
            this.f61621a = new b(eVar);
        } else {
            this.f61621a = new c(eVar);
        }
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String provider : strArr) {
            Provider provider2 = Security.getProvider(provider);
            if (provider2 != null) {
                arrayList.add(provider2);
            }
        }
        return arrayList;
    }

    public Object a(String str) {
        return this.f61621a.a(str);
    }
}
