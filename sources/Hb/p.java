package Hb;

import Jb.f;
import Jb.h;
import Jb.n;
import Lb.C4373g;
import Lb.k;
import Lb.m;
import Lb.s;
import Nb.e;
import Ob.c;
import Sb.d;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import ub.C5230g;

public class p implements m {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f50883a;

    /* renamed from: b  reason: collision with root package name */
    private final Set f50884b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    private final C5230g f50885c;

    class a extends c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Sb.c f50886b;

        /* renamed from: Hb.p$a$a  reason: collision with other inner class name */
        class C0775a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f50888a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Throwable f50889b;

            C0775a(String str, Throwable th2) {
                this.f50888a = str;
                this.f50889b = th2;
            }

            public void run() {
                throw new RuntimeException(this.f50888a, this.f50889b);
            }
        }

        a(Sb.c cVar) {
            this.f50886b = cVar;
        }

        public void f(Throwable th2) {
            String g10 = c.g(th2);
            this.f50886b.c(g10, th2);
            new Handler(p.this.f50883a.getMainLooper()).post(new C0775a(g10, th2));
            c().shutdownNow();
        }
    }

    class b implements C5230g.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f50891a;

        b(h hVar) {
            this.f50891a = hVar;
        }

        public void a(boolean z10) {
            if (z10) {
                this.f50891a.k("app_in_background");
            } else {
                this.f50891a.n("app_in_background");
            }
        }
    }

    public p(C5230g gVar) {
        this.f50885c = gVar;
        if (gVar != null) {
            this.f50883a = gVar.m();
            return;
        }
        Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        Log.e("FirebaseDatabase", "ERROR: You must call FirebaseApp.initializeApp() before using Firebase Database.");
        Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        throw new RuntimeException("You need to call FirebaseApp.initializeApp() before using Firebase Database.");
    }

    public h a(C4373g gVar, Jb.c cVar, f fVar, h.a aVar) {
        n nVar = new n(cVar, fVar, aVar);
        this.f50885c.g(new b(nVar));
        return nVar;
    }

    public e b(C4373g gVar, String str) {
        String x10 = gVar.x();
        String str2 = str + "_" + x10;
        if (!this.f50884b.contains(str2)) {
            this.f50884b.add(str2);
            return new Nb.b(gVar, new q(this.f50883a, gVar, str2), new Nb.c(gVar.s()));
        }
        throw new Gb.c("SessionPersistenceKey '" + x10 + "' has already been used.");
    }

    public File c() {
        return this.f50883a.getApplicationContext().getDir("sslcache", 0);
    }

    public d d(C4373g gVar, d.a aVar, List list) {
        return new Sb.a(aVar, list);
    }

    public k e(C4373g gVar) {
        return new o();
    }

    public String f(C4373g gVar) {
        return Build.VERSION.SDK_INT + "/Android";
    }

    public s g(C4373g gVar) {
        return new a(gVar.q("RunLoop"));
    }
}
