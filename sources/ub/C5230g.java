package ub;

import Ea.o;
import Eb.C4282c;
import Eb.C4285f;
import Eb.n;
import Eb.w;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.C1587a;
import com.google.android.gms.common.api.internal.C4491c;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import dc.C4944c;
import gc.C5001f;
import ic.C5027b;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import nc.C5115a;
import u1.p;
import w.C2780Y;

/* renamed from: ub.g  reason: case insensitive filesystem */
public class C5230g {
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final Object f61682k = new Object();

    /* renamed from: l  reason: collision with root package name */
    static final Map f61683l = new C1587a();

    /* renamed from: a  reason: collision with root package name */
    private final Context f61684a;

    /* renamed from: b  reason: collision with root package name */
    private final String f61685b;

    /* renamed from: c  reason: collision with root package name */
    private final p f61686c;

    /* renamed from: d  reason: collision with root package name */
    private final n f61687d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f61688e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f61689f = new AtomicBoolean();

    /* renamed from: g  reason: collision with root package name */
    private final w f61690g;

    /* renamed from: h  reason: collision with root package name */
    private final C5027b f61691h;

    /* renamed from: i  reason: collision with root package name */
    private final List f61692i = new CopyOnWriteArrayList();

    /* renamed from: j  reason: collision with root package name */
    private final List f61693j = new CopyOnWriteArrayList();

    /* renamed from: ub.g$a */
    public interface a {
        void a(boolean z10);
    }

    /* renamed from: ub.g$b */
    private static class b implements C4491c.a {

        /* renamed from: a  reason: collision with root package name */
        private static AtomicReference f61694a = new AtomicReference();

        private b() {
        }

        /* access modifiers changed from: private */
        public static void c(Context context) {
            if (Ea.n.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f61694a.get() == null) {
                    b bVar = new b();
                    if (C2780Y.a(f61694a, (Object) null, bVar)) {
                        C4491c.c(application);
                        C4491c.b().a(bVar);
                    }
                }
            }
        }

        public void a(boolean z10) {
            synchronized (C5230g.f61682k) {
                try {
                    Iterator it = new ArrayList(C5230g.f61683l.values()).iterator();
                    while (it.hasNext()) {
                        C5230g gVar = (C5230g) it.next();
                        if (gVar.f61688e.get()) {
                            gVar.C(z10);
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: ub.g$c */
    private static class c extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference f61695b = new AtomicReference();

        /* renamed from: a  reason: collision with root package name */
        private final Context f61696a;

        public c(Context context) {
            this.f61696a = context;
        }

        /* access modifiers changed from: private */
        public static void b(Context context) {
            if (f61695b.get() == null) {
                c cVar = new c(context);
                if (C2780Y.a(f61695b, (Object) null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f61696a.unregisterReceiver(this);
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (C5230g.f61682k) {
                try {
                    for (C5230g d10 : C5230g.f61683l.values()) {
                        d10.t();
                    }
                } catch (Throwable th2) {
                    while (true) {
                        throw th2;
                    }
                }
            }
            c();
        }
    }

    protected C5230g(Context context, String str, p pVar) {
        this.f61684a = (Context) C4536s.l(context);
        this.f61685b = C4536s.f(str);
        this.f61686c = (p) C4536s.l(pVar);
        r b10 = FirebaseInitProvider.b();
        Nc.c.b("Firebase");
        Nc.c.b("ComponentDiscovery");
        List b11 = C4285f.c(context, ComponentDiscoveryService.class).b();
        Nc.c.a();
        Nc.c.b("Runtime");
        n.b g10 = n.l(Fb.n.INSTANCE).d(b11).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(C4282c.s(context, Context.class, new Class[0])).b(C4282c.s(this, C5230g.class, new Class[0])).b(C4282c.s(pVar, p.class, new Class[0])).g(new Nc.b());
        if (p.a(context) && FirebaseInitProvider.c()) {
            g10.b(C4282c.s(b10, r.class, new Class[0]));
        }
        n e10 = g10.e();
        this.f61687d = e10;
        Nc.c.a();
        this.f61690g = new w(new C5228e(this, context));
        this.f61691h = e10.e(C5001f.class);
        g(new C5229f(this));
        Nc.c.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A(boolean z10) {
        if (!z10) {
            ((C5001f) this.f61691h.get()).l();
        }
    }

    private static String B(String str) {
        return str.trim();
    }

    /* access modifiers changed from: private */
    public void C(boolean z10) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (a a10 : this.f61692i) {
            a10.a(z10);
        }
    }

    private void D() {
        for (C5231h a10 : this.f61693j) {
            a10.a(this.f61685b, this.f61686c);
        }
    }

    private void i() {
        C4536s.p(!this.f61689f.get(), "FirebaseApp was deleted");
    }

    private static List l() {
        ArrayList arrayList = new ArrayList();
        synchronized (f61682k) {
            try {
                for (C5230g q10 : f61683l.values()) {
                    arrayList.add(q10.q());
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List n(Context context) {
        ArrayList arrayList;
        synchronized (f61682k) {
            arrayList = new ArrayList(f61683l.values());
        }
        return arrayList;
    }

    public static C5230g o() {
        C5230g gVar;
        synchronized (f61682k) {
            try {
                gVar = (C5230g) f61683l.get("[DEFAULT]");
                if (gVar != null) {
                    ((C5001f) gVar.f61691h.get()).l();
                } else {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + o.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    public static C5230g p(String str) {
        C5230g gVar;
        String str2;
        synchronized (f61682k) {
            try {
                gVar = (C5230g) f61683l.get(B(str));
                if (gVar != null) {
                    ((C5001f) gVar.f61691h.get()).l();
                } else {
                    List l10 = l();
                    if (l10.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", l10);
                    }
                    throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", new Object[]{str, str2}));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    /* access modifiers changed from: private */
    public void t() {
        if (!p.a(this.f61684a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + q());
            c.b(this.f61684a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + q());
        this.f61687d.o(y());
        ((C5001f) this.f61691h.get()).l();
    }

    public static C5230g u(Context context) {
        synchronized (f61682k) {
            try {
                if (f61683l.containsKey("[DEFAULT]")) {
                    C5230g o10 = o();
                    return o10;
                }
                p a10 = p.a(context);
                if (a10 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                C5230g v10 = v(context, a10);
                return v10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static C5230g v(Context context, p pVar) {
        return w(context, pVar, "[DEFAULT]");
    }

    public static C5230g w(Context context, p pVar, String str) {
        C5230g gVar;
        b.c(context);
        String B10 = B(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f61682k) {
            Map map = f61683l;
            C4536s.p(!map.containsKey(B10), "FirebaseApp name " + B10 + " already exists!");
            C4536s.m(context, "Application context cannot be null.");
            gVar = new C5230g(context, B10, pVar);
            map.put(B10, gVar);
        }
        gVar.t();
        return gVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C5115a z(Context context) {
        return new C5115a(context, s(), (C4944c) this.f61687d.get(C4944c.class));
    }

    public void E(boolean z10) {
        i();
        if (this.f61688e.compareAndSet(!z10, z10)) {
            boolean d10 = C4491c.b().d();
            if (z10 && d10) {
                C(true);
            } else if (!z10 && d10) {
                C(false);
            }
        }
    }

    public void F(Boolean bool) {
        i();
        ((C5115a) this.f61690g.get()).e(bool);
    }

    public void G(boolean z10) {
        F(Boolean.valueOf(z10));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5230g)) {
            return false;
        }
        return this.f61685b.equals(((C5230g) obj).q());
    }

    public void g(a aVar) {
        i();
        if (this.f61688e.get() && C4491c.b().d()) {
            aVar.a(true);
        }
        this.f61692i.add(aVar);
    }

    public void h(C5231h hVar) {
        i();
        C4536s.l(hVar);
        this.f61693j.add(hVar);
    }

    public int hashCode() {
        return this.f61685b.hashCode();
    }

    public void j() {
        if (this.f61689f.compareAndSet(false, true)) {
            synchronized (f61682k) {
                f61683l.remove(this.f61685b);
            }
            D();
        }
    }

    public Object k(Class cls) {
        i();
        return this.f61687d.get(cls);
    }

    public Context m() {
        i();
        return this.f61684a;
    }

    public String q() {
        i();
        return this.f61685b;
    }

    public p r() {
        i();
        return this.f61686c;
    }

    public String s() {
        return Ea.c.e(q().getBytes(Charset.defaultCharset())) + "+" + Ea.c.e(r().c().getBytes(Charset.defaultCharset()));
    }

    public String toString() {
        return C4535q.d(this).a("name", this.f61685b).a("options", this.f61686c).toString();
    }

    public boolean x() {
        i();
        return ((C5115a) this.f61690g.get()).b();
    }

    public boolean y() {
        return "[DEFAULT]".equals(q());
    }
}
