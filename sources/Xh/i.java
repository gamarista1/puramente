package xh;

import java.net.Proxy;
import kotlin.jvm.internal.C6496s;
import rh.C;
import rh.v;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f73895a = new i();

    private i() {
    }

    private final boolean b(C c10, Proxy.Type type) {
        if (c10.g() || type != Proxy.Type.HTTP) {
            return false;
        }
        return true;
    }

    public final String a(C c10, Proxy.Type type) {
        C6496s.h(c10, "request");
        C6496s.h(type, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c10.h());
        sb2.append(' ');
        i iVar = f73895a;
        if (iVar.b(c10, type)) {
            sb2.append(c10.l());
        } else {
            sb2.append(iVar.c(c10.l()));
        }
        sb2.append(" HTTP/1.1");
        String sb3 = sb2.toString();
        C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final String c(v vVar) {
        C6496s.h(vVar, "url");
        String d10 = vVar.d();
        String f10 = vVar.f();
        if (f10 == null) {
            return d10;
        }
        return d10 + '?' + f10;
    }
}
