package com.google.firebase.sessions;

import Cc.h;
import Eb.C4282c;
import Eb.C4283d;
import Eb.E;
import Eb.q;
import Hc.C;
import Hc.C4304g;
import Hc.C4308k;
import Hc.H;
import Hc.K;
import Hc.m;
import Hc.n;
import Hc.o;
import Hc.p;
import Hc.r;
import Hc.y;
import Jc.f;
import Ug.G;
import W8.i;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import ic.C5027b;
import java.util.List;
import jc.C5046e;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import qf.g;
import ub.C5230g;
import yb.C5292a;
import yb.b;
import yf.C6787a;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\b\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "LEb/c;", "", "kotlin.jvm.PlatformType", "getComponents", "()Ljava/util/List;", "Companion", "a", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Keep
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final a Companion = new a((DefaultConstructorMarker) null);
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final E backgroundDispatcher;
    private static final E blockingDispatcher;
    private static final E firebaseApp;
    private static final E firebaseInstallationsApi;
    private static final E sessionLifecycleServiceBinder;
    private static final E sessionsSettings;
    private static final E transportFactory;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        E b10 = E.b(C5230g.class);
        C6496s.g(b10, "unqualified(FirebaseApp::class.java)");
        firebaseApp = b10;
        E b11 = E.b(C5046e.class);
        C6496s.g(b11, "unqualified(FirebaseInstallationsApi::class.java)");
        firebaseInstallationsApi = b11;
        Class<G> cls = G.class;
        E a10 = E.a(C5292a.class, cls);
        C6496s.g(a10, "qualified(Background::cl…neDispatcher::class.java)");
        backgroundDispatcher = a10;
        E a11 = E.a(b.class, cls);
        C6496s.g(a11, "qualified(Blocking::clas…neDispatcher::class.java)");
        blockingDispatcher = a11;
        E b12 = E.b(i.class);
        C6496s.g(b12, "unqualified(TransportFactory::class.java)");
        transportFactory = b12;
        E b13 = E.b(f.class);
        C6496s.g(b13, "unqualified(SessionsSettings::class.java)");
        sessionsSettings = b13;
        E b14 = E.b(Hc.G.class);
        C6496s.g(b14, "unqualified(SessionLifec…erviceBinder::class.java)");
        sessionLifecycleServiceBinder = b14;
    }

    /* access modifiers changed from: private */
    public static final C4308k getComponents$lambda$0(C4283d dVar) {
        Object d10 = dVar.d(firebaseApp);
        C6496s.g(d10, "container[firebaseApp]");
        Object d11 = dVar.d(sessionsSettings);
        C6496s.g(d11, "container[sessionsSettings]");
        Object d12 = dVar.d(backgroundDispatcher);
        C6496s.g(d12, "container[backgroundDispatcher]");
        Object d13 = dVar.d(sessionLifecycleServiceBinder);
        C6496s.g(d13, "container[sessionLifecycleServiceBinder]");
        return new C4308k((C5230g) d10, (f) d11, (g) d12, (Hc.G) d13);
    }

    /* access modifiers changed from: private */
    public static final c getComponents$lambda$1(C4283d dVar) {
        return new c(K.f50955a, (C6787a) null, 2, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public static final b getComponents$lambda$2(C4283d dVar) {
        Object d10 = dVar.d(firebaseApp);
        C6496s.g(d10, "container[firebaseApp]");
        Object d11 = dVar.d(firebaseInstallationsApi);
        C6496s.g(d11, "container[firebaseInstallationsApi]");
        Object d12 = dVar.d(sessionsSettings);
        C6496s.g(d12, "container[sessionsSettings]");
        C5027b f10 = dVar.f(transportFactory);
        C6496s.g(f10, "container.getProvider(transportFactory)");
        C4304g gVar = new C4304g(f10);
        Object d13 = dVar.d(backgroundDispatcher);
        C6496s.g(d13, "container[backgroundDispatcher]");
        return new C((C5230g) d10, (C5046e) d11, (f) d12, gVar, (g) d13);
    }

    /* access modifiers changed from: private */
    public static final f getComponents$lambda$3(C4283d dVar) {
        Object d10 = dVar.d(firebaseApp);
        C6496s.g(d10, "container[firebaseApp]");
        Object d11 = dVar.d(blockingDispatcher);
        C6496s.g(d11, "container[blockingDispatcher]");
        Object d12 = dVar.d(backgroundDispatcher);
        C6496s.g(d12, "container[backgroundDispatcher]");
        Object d13 = dVar.d(firebaseInstallationsApi);
        C6496s.g(d13, "container[firebaseInstallationsApi]");
        return new f((C5230g) d10, (g) d11, (g) d12, (C5046e) d13);
    }

    /* access modifiers changed from: private */
    public static final a getComponents$lambda$4(C4283d dVar) {
        Context m10 = ((C5230g) dVar.d(firebaseApp)).m();
        C6496s.g(m10, "container[firebaseApp].applicationContext");
        Object d10 = dVar.d(backgroundDispatcher);
        C6496s.g(d10, "container[backgroundDispatcher]");
        return new y(m10, (g) d10);
    }

    /* access modifiers changed from: private */
    public static final Hc.G getComponents$lambda$5(C4283d dVar) {
        Object d10 = dVar.d(firebaseApp);
        C6496s.g(d10, "container[firebaseApp]");
        return new H((C5230g) d10);
    }

    public List<C4282c> getComponents() {
        C4282c.b h10 = C4282c.e(C4308k.class).h(LIBRARY_NAME);
        E e10 = firebaseApp;
        C4282c.b b10 = h10.b(q.k(e10));
        E e11 = sessionsSettings;
        C4282c.b b11 = b10.b(q.k(e11));
        E e12 = backgroundDispatcher;
        C4282c d10 = b11.b(q.k(e12)).b(q.k(sessionLifecycleServiceBinder)).f(new m()).e().d();
        C4282c d11 = C4282c.e(c.class).h("session-generator").f(new n()).d();
        C4282c.b b12 = C4282c.e(b.class).h("session-publisher").b(q.k(e10));
        E e13 = firebaseInstallationsApi;
        return C6565s.q(d10, d11, b12.b(q.k(e13)).b(q.k(e11)).b(q.m(transportFactory)).b(q.k(e12)).f(new o()).d(), C4282c.e(f.class).h("sessions-settings").b(q.k(e10)).b(q.k(blockingDispatcher)).b(q.k(e12)).b(q.k(e13)).f(new p()).d(), C4282c.e(a.class).h("sessions-datastore").b(q.k(e10)).b(q.k(e12)).f(new Hc.q()).d(), C4282c.e(Hc.G.class).h("sessions-service-binder").b(q.k(e10)).f(new r()).d(), h.b(LIBRARY_NAME, "2.0.0"));
    }
}
