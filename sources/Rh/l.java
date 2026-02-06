package rh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import pf.C6632a;
import sh.C6726e;

public final class l {

    /* renamed from: e  reason: collision with root package name */
    public static final b f73405e = new b((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    private static final C6712i[] f73406f;

    /* renamed from: g  reason: collision with root package name */
    private static final C6712i[] f73407g;

    /* renamed from: h  reason: collision with root package name */
    public static final l f73408h;

    /* renamed from: i  reason: collision with root package name */
    public static final l f73409i;

    /* renamed from: j  reason: collision with root package name */
    public static final l f73410j;

    /* renamed from: k  reason: collision with root package name */
    public static final l f73411k = new a(false).a();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f73412a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f73413b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final String[] f73414c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final String[] f73415d;

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static {
        C6712i iVar = C6712i.f73376o1;
        C6712i iVar2 = C6712i.f73379p1;
        C6712i iVar3 = C6712i.f73382q1;
        C6712i iVar4 = C6712i.f73334a1;
        C6712i iVar5 = C6712i.f73346e1;
        C6712i iVar6 = C6712i.f73337b1;
        C6712i iVar7 = C6712i.f73349f1;
        C6712i iVar8 = C6712i.f73367l1;
        C6712i iVar9 = C6712i.f73364k1;
        C6712i iVar10 = iVar;
        C6712i iVar11 = iVar2;
        C6712i iVar12 = iVar3;
        C6712i iVar13 = iVar4;
        C6712i iVar14 = iVar5;
        C6712i iVar15 = iVar6;
        C6712i iVar16 = iVar7;
        C6712i iVar17 = iVar8;
        C6712i[] iVarArr = {iVar10, iVar11, iVar12, iVar13, iVar14, iVar15, iVar16, iVar17, iVar9};
        f73406f = iVarArr;
        C6712i[] iVarArr2 = iVarArr;
        C6712i[] iVarArr3 = {iVar10, iVar11, iVar12, iVar13, iVar14, iVar15, iVar16, iVar17, iVar9, C6712i.f73304L0, C6712i.f73306M0, C6712i.f73360j0, C6712i.f73363k0, C6712i.f73295H, C6712i.f73303L, C6712i.f73365l};
        f73407g = iVarArr3;
        a c10 = new a(true).c((C6712i[]) Arrays.copyOf(iVarArr2, iVarArr2.length));
        H h10 = H.TLS_1_3;
        H h11 = H.TLS_1_2;
        f73408h = c10.f(h10, h11).d(true).a();
        f73409i = new a(true).c((C6712i[]) Arrays.copyOf(iVarArr3, iVarArr3.length)).f(h10, h11).d(true).a();
        f73410j = new a(true).c((C6712i[]) Arrays.copyOf(iVarArr3, iVarArr3.length)).f(h10, h11, H.TLS_1_1, H.TLS_1_0).d(true).a();
    }

    public l(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f73412a = z10;
        this.f73413b = z11;
        this.f73414c = strArr;
        this.f73415d = strArr2;
    }

    private final l g(SSLSocket sSLSocket, boolean z10) {
        String[] strArr;
        String[] strArr2;
        if (this.f73414c != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            C6496s.g(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            strArr = C6726e.E(enabledCipherSuites, this.f73414c, C6712i.f73335b.c());
        } else {
            strArr = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f73415d != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            C6496s.g(enabledProtocols, "sslSocket.enabledProtocols");
            strArr2 = C6726e.E(enabledProtocols, this.f73415d, C6632a.f());
        } else {
            strArr2 = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        C6496s.g(supportedCipherSuites, "supportedCipherSuites");
        int x10 = C6726e.x(supportedCipherSuites, "TLS_FALLBACK_SCSV", C6712i.f73335b.c());
        if (z10 && x10 != -1) {
            C6496s.g(strArr, "cipherSuitesIntersection");
            String str = supportedCipherSuites[x10];
            C6496s.g(str, "supportedCipherSuites[indexOfFallbackScsv]");
            strArr = C6726e.o(strArr, str);
        }
        a aVar = new a(this);
        C6496s.g(strArr, "cipherSuitesIntersection");
        a b10 = aVar.b((String[]) Arrays.copyOf(strArr, strArr.length));
        C6496s.g(strArr2, "tlsVersionsIntersection");
        return b10.e((String[]) Arrays.copyOf(strArr2, strArr2.length)).a();
    }

    public final void c(SSLSocket sSLSocket, boolean z10) {
        C6496s.h(sSLSocket, "sslSocket");
        l g10 = g(sSLSocket, z10);
        if (g10.i() != null) {
            sSLSocket.setEnabledProtocols(g10.f73415d);
        }
        if (g10.d() != null) {
            sSLSocket.setEnabledCipherSuites(g10.f73414c);
        }
    }

    public final List d() {
        String[] strArr = this.f73414c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String b10 : strArr) {
            arrayList.add(C6712i.f73335b.b(b10));
        }
        return C6565s.e1(arrayList);
    }

    public final boolean e(SSLSocket sSLSocket) {
        C6496s.h(sSLSocket, "socket");
        if (!this.f73412a) {
            return false;
        }
        String[] strArr = this.f73415d;
        if (strArr != null && !C6726e.u(strArr, sSLSocket.getEnabledProtocols(), C6632a.f())) {
            return false;
        }
        String[] strArr2 = this.f73414c;
        if (strArr2 == null || C6726e.u(strArr2, sSLSocket.getEnabledCipherSuites(), C6712i.f73335b.c())) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z10 = this.f73412a;
        l lVar = (l) obj;
        if (z10 != lVar.f73412a) {
            return false;
        }
        if (!z10 || (Arrays.equals(this.f73414c, lVar.f73414c) && Arrays.equals(this.f73415d, lVar.f73415d) && this.f73413b == lVar.f73413b)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f73412a;
    }

    public final boolean h() {
        return this.f73413b;
    }

    public int hashCode() {
        int i10;
        if (!this.f73412a) {
            return 17;
        }
        String[] strArr = this.f73414c;
        int i11 = 0;
        if (strArr != null) {
            i10 = Arrays.hashCode(strArr);
        } else {
            i10 = 0;
        }
        int i12 = (527 + i10) * 31;
        String[] strArr2 = this.f73415d;
        if (strArr2 != null) {
            i11 = Arrays.hashCode(strArr2);
        }
        return ((i12 + i11) * 31) + (this.f73413b ^ true ? 1 : 0);
    }

    public final List i() {
        String[] strArr = this.f73415d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a10 : strArr) {
            arrayList.add(H.f73192b.a(a10));
        }
        return C6565s.e1(arrayList);
    }

    public String toString() {
        if (!this.f73412a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(d(), "[all enabled]") + ", tlsVersions=" + Objects.toString(i(), "[all enabled]") + ", supportsTlsExtensions=" + this.f73413b + ')';
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f73416a;

        /* renamed from: b  reason: collision with root package name */
        private String[] f73417b;

        /* renamed from: c  reason: collision with root package name */
        private String[] f73418c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f73419d;

        public a(boolean z10) {
            this.f73416a = z10;
        }

        public final l a() {
            return new l(this.f73416a, this.f73419d, this.f73417b, this.f73418c);
        }

        public final a b(String... strArr) {
            boolean z10;
            C6496s.h(strArr, "cipherSuites");
            if (this.f73416a) {
                if (strArr.length == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    this.f73417b = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }

        public final a c(C6712i... iVarArr) {
            C6496s.h(iVarArr, "cipherSuites");
            if (this.f73416a) {
                ArrayList arrayList = new ArrayList(iVarArr.length);
                for (C6712i c10 : iVarArr) {
                    arrayList.add(c10.c());
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                return b((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }

        public final a d(boolean z10) {
            if (this.f73416a) {
                this.f73419d = z10;
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }

        public final a e(String... strArr) {
            boolean z10;
            C6496s.h(strArr, "tlsVersions");
            if (this.f73416a) {
                if (strArr.length == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    this.f73418c = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }

        public final a f(H... hArr) {
            C6496s.h(hArr, "tlsVersions");
            if (this.f73416a) {
                ArrayList arrayList = new ArrayList(hArr.length);
                for (H b10 : hArr) {
                    arrayList.add(b10.b());
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                return e((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }

        public a(l lVar) {
            C6496s.h(lVar, "connectionSpec");
            this.f73416a = lVar.f();
            this.f73417b = lVar.f73414c;
            this.f73418c = lVar.f73415d;
            this.f73419d = lVar.h();
        }
    }
}
