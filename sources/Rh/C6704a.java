package rh;

import com.adjust.sdk.Constants;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.C6496s;
import rh.v;
import sh.C6726e;

/* renamed from: rh.a  reason: case insensitive filesystem */
public final class C6704a {

    /* renamed from: a  reason: collision with root package name */
    private final q f73200a;

    /* renamed from: b  reason: collision with root package name */
    private final SocketFactory f73201b;

    /* renamed from: c  reason: collision with root package name */
    private final SSLSocketFactory f73202c;

    /* renamed from: d  reason: collision with root package name */
    private final HostnameVerifier f73203d;

    /* renamed from: e  reason: collision with root package name */
    private final C6710g f73204e;

    /* renamed from: f  reason: collision with root package name */
    private final C6705b f73205f;

    /* renamed from: g  reason: collision with root package name */
    private final Proxy f73206g;

    /* renamed from: h  reason: collision with root package name */
    private final ProxySelector f73207h;

    /* renamed from: i  reason: collision with root package name */
    private final v f73208i;

    /* renamed from: j  reason: collision with root package name */
    private final List f73209j;

    /* renamed from: k  reason: collision with root package name */
    private final List f73210k;

    public C6704a(String str, int i10, q qVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C6710g gVar, C6705b bVar, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        String str2;
        C6496s.h(str, "uriHost");
        C6496s.h(qVar, "dns");
        C6496s.h(socketFactory, "socketFactory");
        C6496s.h(bVar, "proxyAuthenticator");
        C6496s.h(list, "protocols");
        C6496s.h(list2, "connectionSpecs");
        C6496s.h(proxySelector, "proxySelector");
        this.f73200a = qVar;
        this.f73201b = socketFactory;
        this.f73202c = sSLSocketFactory;
        this.f73203d = hostnameVerifier;
        this.f73204e = gVar;
        this.f73205f = bVar;
        this.f73206g = proxy;
        this.f73207h = proxySelector;
        v.a aVar = new v.a();
        if (sSLSocketFactory != null) {
            str2 = Constants.SCHEME;
        } else {
            str2 = "http";
        }
        this.f73208i = aVar.s(str2).h(str).n(i10).c();
        this.f73209j = C6726e.V(list);
        this.f73210k = C6726e.V(list2);
    }

    public final C6710g a() {
        return this.f73204e;
    }

    public final List b() {
        return this.f73210k;
    }

    public final q c() {
        return this.f73200a;
    }

    public final boolean d(C6704a aVar) {
        C6496s.h(aVar, "that");
        if (!C6496s.c(this.f73200a, aVar.f73200a) || !C6496s.c(this.f73205f, aVar.f73205f) || !C6496s.c(this.f73209j, aVar.f73209j) || !C6496s.c(this.f73210k, aVar.f73210k) || !C6496s.c(this.f73207h, aVar.f73207h) || !C6496s.c(this.f73206g, aVar.f73206g) || !C6496s.c(this.f73202c, aVar.f73202c) || !C6496s.c(this.f73203d, aVar.f73203d) || !C6496s.c(this.f73204e, aVar.f73204e) || this.f73208i.o() != aVar.f73208i.o()) {
            return false;
        }
        return true;
    }

    public final HostnameVerifier e() {
        return this.f73203d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6704a) {
            C6704a aVar = (C6704a) obj;
            if (!C6496s.c(this.f73208i, aVar.f73208i) || !d(aVar)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final List f() {
        return this.f73209j;
    }

    public final Proxy g() {
        return this.f73206g;
    }

    public final C6705b h() {
        return this.f73205f;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f73208i.hashCode()) * 31) + this.f73200a.hashCode()) * 31) + this.f73205f.hashCode()) * 31) + this.f73209j.hashCode()) * 31) + this.f73210k.hashCode()) * 31) + this.f73207h.hashCode()) * 31) + Objects.hashCode(this.f73206g)) * 31) + Objects.hashCode(this.f73202c)) * 31) + Objects.hashCode(this.f73203d)) * 31) + Objects.hashCode(this.f73204e);
    }

    public final ProxySelector i() {
        return this.f73207h;
    }

    public final SocketFactory j() {
        return this.f73201b;
    }

    public final SSLSocketFactory k() {
        return this.f73202c;
    }

    public final v l() {
        return this.f73208i;
    }

    public String toString() {
        StringBuilder sb2;
        Object obj;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Address{");
        sb3.append(this.f73208i.i());
        sb3.append(':');
        sb3.append(this.f73208i.o());
        sb3.append(", ");
        if (this.f73206g != null) {
            sb2 = new StringBuilder();
            sb2.append("proxy=");
            obj = this.f73206g;
        } else {
            sb2 = new StringBuilder();
            sb2.append("proxySelector=");
            obj = this.f73207h;
        }
        sb2.append(obj);
        sb3.append(sb2.toString());
        sb3.append('}');
        return sb3.toString();
    }
}
