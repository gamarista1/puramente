package com.google.firebase.database;

import Gb.g;
import Lb.C4374h;
import Lb.n;
import Lb.q;
import Lb.r;
import Ob.h;
import Ob.l;
import Ob.m;
import Yb.a;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4536s;
import ub.C5230g;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final C5230g f57133a;

    /* renamed from: b  reason: collision with root package name */
    private final q f57134b;

    /* renamed from: c  reason: collision with root package name */
    private final C4374h f57135c;

    /* renamed from: d  reason: collision with root package name */
    private a f57136d;

    /* renamed from: e  reason: collision with root package name */
    private n f57137e;

    c(C5230g gVar, q qVar, C4374h hVar) {
        this.f57133a = gVar;
        this.f57134b = qVar;
        this.f57135c = hVar;
    }

    private void a(String str) {
        if (this.f57137e != null) {
            throw new Gb.c("Calls to " + str + "() must be made before any other usage of FirebaseDatabase instance.");
        }
    }

    private synchronized void b() {
        if (this.f57137e == null) {
            this.f57134b.a(this.f57136d);
            this.f57137e = r.b(this.f57135c, this.f57134b, this);
        }
    }

    public static c c(String str) {
        C5230g o10 = C5230g.o();
        if (o10 != null) {
            return e(o10, str);
        }
        throw new Gb.c("You must call FirebaseApp.initialize() first.");
    }

    public static c d(C5230g gVar) {
        String d10 = gVar.r().d();
        if (d10 == null) {
            if (gVar.r().g() != null) {
                d10 = "https://" + gVar.r().g() + "-default-rtdb.firebaseio.com";
            } else {
                throw new Gb.c("Failed to get FirebaseDatabase instance: Can't determine Firebase Database URL. Be sure to include a Project ID in your configuration.");
            }
        }
        return e(gVar, d10);
    }

    public static synchronized c e(C5230g gVar, String str) {
        c a10;
        synchronized (c.class) {
            if (!TextUtils.isEmpty(str)) {
                C4536s.m(gVar, "Provided FirebaseApp must not be null.");
                d dVar = (d) gVar.k(d.class);
                C4536s.m(dVar, "Firebase Database component is not present.");
                h h10 = l.h(str);
                if (h10.f52117b.isEmpty()) {
                    a10 = dVar.a(h10.f52116a);
                } else {
                    throw new Gb.c("Specified Database URL '" + str + "' is invalid. It should point to the root of a Firebase Database but it includes a path: " + h10.f52117b.toString());
                }
            } else {
                throw new Gb.c("Failed to get FirebaseDatabase instance: Specify DatabaseURL within FirebaseApp or from your getInstance() call.");
            }
        }
        return a10;
    }

    public static String g() {
        return "21.0.0";
    }

    public b f(String str) {
        b();
        if (str != null) {
            m.i(str);
            return new b(this.f57137e, new Lb.l(str));
        }
        throw new NullPointerException("Can't pass null for argument 'pathString' in FirebaseDatabase.getReference()");
    }

    public void h() {
        b();
        r.c(this.f57137e);
    }

    public void i() {
        b();
        r.d(this.f57137e);
    }

    public synchronized void j(g gVar) {
        a("setLogLevel");
        this.f57135c.L(gVar);
    }

    public synchronized void k(long j10) {
        a("setPersistenceCacheSizeBytes");
        this.f57135c.M(j10);
    }

    public synchronized void l(boolean z10) {
        a("setPersistenceEnabled");
        this.f57135c.N(z10);
    }

    public void m(String str, int i10) {
        if (this.f57137e == null) {
            this.f57136d = new a(str, i10);
            return;
        }
        throw new IllegalStateException("Cannot call useEmulator() after instance has already been initialized.");
    }
}
