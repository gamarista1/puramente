package Ld;

import ie.C5036f;
import java.util.Map;
import ke.c;
import ke.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.O;
import qe.C5155b;
import yf.C6787a;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LLd/a;", "Lke/b;", "<init>", "()V", "Lke/d;", "b", "()Lke/d;", "expo-constants_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends ke.b {

    /* renamed from: Ld.a$a  reason: collision with other inner class name */
    static final class C0795a implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f51993a;

        C0795a(a aVar) {
            this.f51993a = aVar;
        }

        /* renamed from: a */
        public final Map invoke() {
            Map constants;
            Wd.a k10 = this.f51993a.c().k();
            if (k10 == null || (constants = k10.getConstants()) == null) {
                return O.i();
            }
            return constants;
        }
    }

    public static final class b implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "it");
            return System.getProperty("http.agent");
        }
    }

    public d b() {
        D3.a.c("[" + "ExpoModulesCore" + "] " + (getClass() + ".ModuleDefinition"));
        try {
            c cVar = new c(this);
            cVar.o("ExponentConstants");
            cVar.d(new C0795a(this));
            cVar.k().put("getWebViewUserAgentAsync", new C5036f("getWebViewUserAgentAsync", new C5155b[0], new b()));
            return cVar.p();
        } finally {
            D3.a.f();
        }
    }
}
