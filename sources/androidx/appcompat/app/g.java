package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.C1588b;
import androidx.core.app.e;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;
import u1.i;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    static c f10982a = new c(new d());

    /* renamed from: b  reason: collision with root package name */
    private static int f10983b = -100;

    /* renamed from: c  reason: collision with root package name */
    private static i f10984c = null;

    /* renamed from: d  reason: collision with root package name */
    private static i f10985d = null;

    /* renamed from: e  reason: collision with root package name */
    private static Boolean f10986e = null;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f10987f = false;

    /* renamed from: g  reason: collision with root package name */
    private static final C1588b f10988g = new C1588b();

    /* renamed from: h  reason: collision with root package name */
    private static final Object f10989h = new Object();

    /* renamed from: i  reason: collision with root package name */
    private static final Object f10990i = new Object();

    static class a {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    static class b {
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    static class c implements Executor {

        /* renamed from: a  reason: collision with root package name */
        private final Object f10991a = new Object();

        /* renamed from: b  reason: collision with root package name */
        final Queue f10992b = new ArrayDeque();

        /* renamed from: c  reason: collision with root package name */
        final Executor f10993c;

        /* renamed from: d  reason: collision with root package name */
        Runnable f10994d;

        c(Executor executor) {
            this.f10993c = executor;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(Runnable runnable) {
            try {
                runnable.run();
            } finally {
                c();
            }
        }

        /* access modifiers changed from: protected */
        public void c() {
            synchronized (this.f10991a) {
                try {
                    Runnable runnable = (Runnable) this.f10992b.poll();
                    this.f10994d = runnable;
                    if (runnable != null) {
                        this.f10993c.execute(runnable);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void execute(Runnable runnable) {
            synchronized (this.f10991a) {
                try {
                    this.f10992b.add(new h(this, runnable));
                    if (this.f10994d == null) {
                        c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    static class d implements Executor {
        d() {
        }

        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    g() {
    }

    static void H(g gVar) {
        synchronized (f10989h) {
            I(gVar);
        }
    }

    private static void I(g gVar) {
        synchronized (f10989h) {
            try {
                Iterator it = f10988g.iterator();
                while (it.hasNext()) {
                    g gVar2 = (g) ((WeakReference) it.next()).get();
                    if (gVar2 == gVar || gVar2 == null) {
                        it.remove();
                    }
                }
            } finally {
            }
        }
    }

    public static void N(int i10) {
        if (i10 != -1 && i10 != 0 && i10 != 1 && i10 != 2 && i10 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (f10983b != i10) {
            f10983b = i10;
            g();
        }
    }

    static void T(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (m().f()) {
                    String b10 = e.b(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        b.b(systemService, a.a(b10));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void U(android.content.Context r3) {
        /*
            boolean r0 = x(r3)
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L_0x001c
            boolean r0 = f10987f
            if (r0 != 0) goto L_0x0057
            androidx.appcompat.app.g$c r0 = f10982a
            androidx.appcompat.app.f r1 = new androidx.appcompat.app.f
            r1.<init>(r3)
            r0.execute(r1)
            goto L_0x0057
        L_0x001c:
            java.lang.Object r0 = f10990i
            monitor-enter(r0)
            u1.i r1 = f10984c     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0043
            u1.i r1 = f10985d     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0034
            java.lang.String r3 = androidx.core.app.e.b(r3)     // Catch:{ all -> 0x0032 }
            u1.i r3 = u1.i.b(r3)     // Catch:{ all -> 0x0032 }
            f10985d = r3     // Catch:{ all -> 0x0032 }
            goto L_0x0034
        L_0x0032:
            r3 = move-exception
            goto L_0x0058
        L_0x0034:
            u1.i r3 = f10985d     // Catch:{ all -> 0x0032 }
            boolean r3 = r3.f()     // Catch:{ all -> 0x0032 }
            if (r3 == 0) goto L_0x003e
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x003e:
            u1.i r3 = f10985d     // Catch:{ all -> 0x0032 }
            f10984c = r3     // Catch:{ all -> 0x0032 }
            goto L_0x0056
        L_0x0043:
            u1.i r2 = f10985d     // Catch:{ all -> 0x0032 }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0056
            u1.i r1 = f10984c     // Catch:{ all -> 0x0032 }
            f10985d = r1     // Catch:{ all -> 0x0032 }
            java.lang.String r1 = r1.h()     // Catch:{ all -> 0x0032 }
            androidx.core.app.e.a(r3, r1)     // Catch:{ all -> 0x0032 }
        L_0x0056:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
        L_0x0057:
            return
        L_0x0058:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g.U(android.content.Context):void");
    }

    static void d(g gVar) {
        synchronized (f10989h) {
            I(gVar);
            f10988g.add(new WeakReference(gVar));
        }
    }

    private static void g() {
        synchronized (f10989h) {
            try {
                Iterator it = f10988g.iterator();
                while (it.hasNext()) {
                    g gVar = (g) ((WeakReference) it.next()).get();
                    if (gVar != null) {
                        gVar.f();
                    }
                }
            } finally {
            }
        }
    }

    public static g j(Activity activity, e eVar) {
        return new i(activity, eVar);
    }

    public static g k(Dialog dialog, e eVar) {
        return new i(dialog, eVar);
    }

    public static i m() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object r10 = r();
            if (r10 != null) {
                return i.j(b.a(r10));
            }
        } else {
            i iVar = f10984c;
            if (iVar != null) {
                return iVar;
            }
        }
        return i.e();
    }

    public static int o() {
        return f10983b;
    }

    static Object r() {
        Context n10;
        Iterator it = f10988g.iterator();
        while (it.hasNext()) {
            g gVar = (g) ((WeakReference) it.next()).get();
            if (gVar != null && (n10 = gVar.n()) != null) {
                return n10.getSystemService("locale");
            }
        }
        return null;
    }

    static i t() {
        return f10984c;
    }

    static boolean x(Context context) {
        if (f10986e == null) {
            try {
                Bundle bundle = u.a(context).metaData;
                if (bundle != null) {
                    f10986e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f10986e = Boolean.FALSE;
            }
        }
        return f10986e.booleanValue();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void y(Context context) {
        T(context);
        f10987f = true;
    }

    public abstract void A(Bundle bundle);

    public abstract void B();

    public abstract void C(Bundle bundle);

    public abstract void D();

    public abstract void E(Bundle bundle);

    public abstract void F();

    public abstract void G();

    public abstract boolean J(int i10);

    public abstract void K(int i10);

    public abstract void L(View view);

    public abstract void M(View view, ViewGroup.LayoutParams layoutParams);

    public void O(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract void P(Toolbar toolbar);

    public abstract void Q(int i10);

    public abstract void R(CharSequence charSequence);

    public abstract androidx.appcompat.view.b S(b.a aVar);

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean f();

    public void h(Context context) {
    }

    public Context i(Context context) {
        h(context);
        return context;
    }

    public abstract View l(int i10);

    public abstract Context n();

    public abstract C1561b p();

    public abstract int q();

    public abstract MenuInflater s();

    public abstract C1560a u();

    public abstract void v();

    public abstract void w();

    public abstract void z(Configuration configuration);
}
