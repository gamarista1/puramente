package com.google.firebase.installations;

import Eb.w;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.d;
import ic.C5027b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import jc.C5042a;
import jc.C5043b;
import jc.C5044c;
import jc.C5045d;
import jc.C5046e;
import jc.C5048g;
import kc.C5064b;
import kc.C5065c;
import kc.C5066d;
import lc.C5093c;
import lc.C5094d;
import lc.C5096f;
import ub.C5230g;

public class c implements C5046e {

    /* renamed from: m  reason: collision with root package name */
    private static final Object f57355m = new Object();

    /* renamed from: n  reason: collision with root package name */
    private static final ThreadFactory f57356n = new a();

    /* renamed from: a  reason: collision with root package name */
    private final C5230g f57357a;

    /* renamed from: b  reason: collision with root package name */
    private final C5093c f57358b;

    /* renamed from: c  reason: collision with root package name */
    private final C5065c f57359c;

    /* renamed from: d  reason: collision with root package name */
    private final i f57360d;

    /* renamed from: e  reason: collision with root package name */
    private final w f57361e;

    /* renamed from: f  reason: collision with root package name */
    private final C5048g f57362f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f57363g;

    /* renamed from: h  reason: collision with root package name */
    private final ExecutorService f57364h;

    /* renamed from: i  reason: collision with root package name */
    private final Executor f57365i;

    /* renamed from: j  reason: collision with root package name */
    private String f57366j;

    /* renamed from: k  reason: collision with root package name */
    private Set f57367k;

    /* renamed from: l  reason: collision with root package name */
    private final List f57368l;

    class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f57369a = new AtomicInteger(1);

        a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.f57369a.getAndIncrement())}));
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f57370a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f57371b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                lc.f$b[] r0 = lc.C5096f.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f57371b = r0
                r1 = 1
                lc.f$b r2 = lc.C5096f.b.OK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f57371b     // Catch:{ NoSuchFieldError -> 0x001d }
                lc.f$b r3 = lc.C5096f.b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f57371b     // Catch:{ NoSuchFieldError -> 0x0028 }
                lc.f$b r3 = lc.C5096f.b.AUTH_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                lc.d$b[] r2 = lc.C5094d.b.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f57370a = r2
                lc.d$b r3 = lc.C5094d.b.OK     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f57370a     // Catch:{ NoSuchFieldError -> 0x0043 }
                lc.d$b r2 = lc.C5094d.b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.c.b.<clinit>():void");
        }
    }

    c(C5230g gVar, C5027b bVar, ExecutorService executorService, Executor executor) {
        this(executorService, executor, gVar, new C5093c(gVar.m(), bVar), new C5065c(gVar), i.c(), new w(new C5042a(gVar)), new C5048g());
    }

    private String A(C5066d dVar) {
        if ((!this.f57357a.q().equals("CHIME_ANDROID_SDK") && !this.f57357a.y()) || !dVar.m()) {
            return this.f57362f.a();
        }
        String f10 = o().f();
        if (TextUtils.isEmpty(f10)) {
            return this.f57362f.a();
        }
        return f10;
    }

    private C5066d B(C5066d dVar) {
        String str;
        if (dVar.d() == null || dVar.d().length() != 11) {
            str = null;
        } else {
            str = o().i();
        }
        C5094d d10 = this.f57358b.d(l(), dVar.d(), t(), m(), str);
        int i10 = b.f57370a[d10.e().ordinal()];
        if (i10 == 1) {
            return dVar.s(d10.c(), d10.d(), this.f57360d.b(), d10.b().c(), d10.b().d());
        } else if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        } else {
            throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
    }

    private void C(Exception exc) {
        synchronized (this.f57363g) {
            try {
                Iterator it = this.f57368l.iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } finally {
            }
        }
    }

    private void D(C5066d dVar) {
        synchronized (this.f57363g) {
            try {
                Iterator it = this.f57368l.iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).b(dVar)) {
                        it.remove();
                    }
                }
            } finally {
            }
        }
    }

    private synchronized void E(String str) {
        this.f57366j = str;
    }

    private synchronized void F(C5066d dVar, C5066d dVar2) {
        if (this.f57367k.size() != 0 && !TextUtils.equals(dVar.d(), dVar2.d())) {
            Iterator it = this.f57367k.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.c.a(it.next());
                dVar2.d();
                throw null;
            }
        }
    }

    private Task f() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        h(new e(this.f57360d, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task g() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        h(new f(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private void h(h hVar) {
        synchronized (this.f57363g) {
            this.f57368l.add(hVar);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004c  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void v(boolean r3) {
        /*
            r2 = this;
            kc.d r0 = r2.r()
            boolean r1 = r0.i()     // Catch:{ d -> 0x001d }
            if (r1 != 0) goto L_0x0024
            boolean r1 = r0.l()     // Catch:{ d -> 0x001d }
            if (r1 == 0) goto L_0x0011
            goto L_0x0024
        L_0x0011:
            if (r3 != 0) goto L_0x001f
            com.google.firebase.installations.i r3 = r2.f57360d     // Catch:{ d -> 0x001d }
            boolean r3 = r3.f(r0)     // Catch:{ d -> 0x001d }
            if (r3 == 0) goto L_0x001c
            goto L_0x001f
        L_0x001c:
            return
        L_0x001d:
            r3 = move-exception
            goto L_0x0061
        L_0x001f:
            kc.d r3 = r2.k(r0)     // Catch:{ d -> 0x001d }
            goto L_0x0028
        L_0x0024:
            kc.d r3 = r2.B(r0)     // Catch:{ d -> 0x001d }
        L_0x0028:
            r2.u(r3)
            r2.F(r0, r3)
            boolean r0 = r3.k()
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r3.d()
            r2.E(r0)
        L_0x003b:
            boolean r0 = r3.i()
            if (r0 == 0) goto L_0x004c
            com.google.firebase.installations.d r3 = new com.google.firebase.installations.d
            com.google.firebase.installations.d$a r0 = com.google.firebase.installations.d.a.BAD_CONFIG
            r3.<init>(r0)
            r2.C(r3)
            goto L_0x0060
        L_0x004c:
            boolean r0 = r3.j()
            if (r0 == 0) goto L_0x005d
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            r2.C(r3)
            goto L_0x0060
        L_0x005d:
            r2.D(r3)
        L_0x0060:
            return
        L_0x0061:
            r2.C(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.c.v(boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final void x(boolean z10) {
        C5066d s10 = s();
        if (z10) {
            s10 = s10.p();
        }
        D(s10);
        this.f57365i.execute(new C5045d(this, z10));
    }

    private C5066d k(C5066d dVar) {
        C5096f e10 = this.f57358b.e(l(), dVar.d(), t(), dVar.f());
        int i10 = b.f57371b[e10.b().ordinal()];
        if (i10 == 1) {
            return dVar.o(e10.c(), e10.d(), this.f57360d.b());
        } else if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        } else {
            if (i10 == 3) {
                E((String) null);
                return dVar.r();
            }
            throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
    }

    private synchronized String n() {
        return this.f57366j;
    }

    private C5064b o() {
        return (C5064b) this.f57361e.get();
    }

    public static c p() {
        return q(C5230g.o());
    }

    public static c q(C5230g gVar) {
        boolean z10;
        if (gVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C4536s.b(z10, "Null is not a valid value of FirebaseApp.");
        return (c) gVar.k(C5046e.class);
    }

    private C5066d r() {
        b a10;
        C5066d d10;
        synchronized (f57355m) {
            try {
                a10 = b.a(this.f57357a.m(), "generatefid.lock");
                d10 = this.f57359c.d();
                if (a10 != null) {
                    a10.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return d10;
    }

    private C5066d s() {
        b a10;
        C5066d d10;
        synchronized (f57355m) {
            try {
                a10 = b.a(this.f57357a.m(), "generatefid.lock");
                d10 = this.f57359c.d();
                if (d10.j()) {
                    d10 = this.f57359c.b(d10.t(A(d10)));
                }
                if (a10 != null) {
                    a10.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return d10;
    }

    private void u(C5066d dVar) {
        b a10;
        synchronized (f57355m) {
            try {
                a10 = b.a(this.f57357a.m(), "generatefid.lock");
                this.f57359c.b(dVar);
                if (a10 != null) {
                    a10.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void w() {
        x(false);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C5064b y(C5230g gVar) {
        return new C5064b(gVar);
    }

    private void z() {
        C4536s.g(m(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C4536s.g(t(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C4536s.g(l(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C4536s.b(i.h(m()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C4536s.b(i.g(l()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public Task a(boolean z10) {
        z();
        Task f10 = f();
        this.f57364h.execute(new C5044c(this, z10));
        return f10;
    }

    public Task getId() {
        z();
        String n10 = n();
        if (n10 != null) {
            return Tasks.forResult(n10);
        }
        Task g10 = g();
        this.f57364h.execute(new C5043b(this));
        return g10;
    }

    /* access modifiers changed from: package-private */
    public String l() {
        return this.f57357a.r().b();
    }

    /* access modifiers changed from: package-private */
    public String m() {
        return this.f57357a.r().c();
    }

    /* access modifiers changed from: package-private */
    public String t() {
        return this.f57357a.r().g();
    }

    c(ExecutorService executorService, Executor executor, C5230g gVar, C5093c cVar, C5065c cVar2, i iVar, w wVar, C5048g gVar2) {
        this.f57363g = new Object();
        this.f57367k = new HashSet();
        this.f57368l = new ArrayList();
        this.f57357a = gVar;
        this.f57358b = cVar;
        this.f57359c = cVar2;
        this.f57360d = iVar;
        this.f57361e = wVar;
        this.f57362f = gVar2;
        this.f57364h = executorService;
        this.f57365i = executor;
    }
}
