package com.bumptech.glide;

import V4.k;
import W4.b;
import W4.d;
import X4.h;
import android.app.Activity;
import android.app.Fragment;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.C1769q;
import androidx.fragment.app.C1773v;
import c5.x;
import i5.o;
import j5.C3637a;
import j5.C3638b;
import j5.C3640d;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l5.g;
import l5.j;
import o5.l;

public class c implements ComponentCallbacks2 {

    /* renamed from: k  reason: collision with root package name */
    private static volatile c f39009k;

    /* renamed from: l  reason: collision with root package name */
    private static volatile boolean f39010l;

    /* renamed from: a  reason: collision with root package name */
    private final k f39011a;

    /* renamed from: b  reason: collision with root package name */
    private final d f39012b;

    /* renamed from: c  reason: collision with root package name */
    private final h f39013c;

    /* renamed from: d  reason: collision with root package name */
    private final e f39014d;

    /* renamed from: e  reason: collision with root package name */
    private final b f39015e;

    /* renamed from: f  reason: collision with root package name */
    private final o f39016f;

    /* renamed from: g  reason: collision with root package name */
    private final i5.c f39017g;

    /* renamed from: h  reason: collision with root package name */
    private final List f39018h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private final a f39019i;

    /* renamed from: j  reason: collision with root package name */
    private g f39020j = g.NORMAL;

    public interface a {
        com.bumptech.glide.request.h f();
    }

    c(Context context, k kVar, h hVar, d dVar, b bVar, o oVar, i5.c cVar, int i10, a aVar, Map map, List list, List list2, C3637a aVar2, f fVar) {
        this.f39011a = kVar;
        this.f39012b = dVar;
        b bVar2 = bVar;
        this.f39015e = bVar2;
        this.f39013c = hVar;
        this.f39016f = oVar;
        this.f39017g = cVar;
        a aVar3 = aVar;
        this.f39019i = aVar3;
        this.f39014d = new e(context, bVar2, k.d(this, list2, aVar2), new g(), aVar3, map, list, kVar, fVar, i10);
    }

    public static m B(Activity activity) {
        return D(activity.getApplicationContext());
    }

    public static m C(Fragment fragment) {
        Activity activity = fragment.getActivity();
        o5.k.e(activity, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return D(activity.getApplicationContext());
    }

    public static m D(Context context) {
        return p(context).f(context);
    }

    public static m E(View view) {
        return p(view.getContext()).g(view);
    }

    public static m F(C1769q qVar) {
        return p(qVar.getContext()).h(qVar);
    }

    public static m G(C1773v vVar) {
        return p(vVar).i(vVar);
    }

    static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (!f39010l) {
            f39010l = true;
            try {
                s(context, generatedAppGlideModule);
            } finally {
                f39010l = false;
            }
        } else {
            throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
        }
    }

    public static void d() {
        x.b().h();
    }

    public static c e(Context context) {
        if (f39009k == null) {
            GeneratedAppGlideModule f10 = f(context.getApplicationContext());
            synchronized (c.class) {
                try {
                    if (f39009k == null) {
                        a(context, f10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f39009k;
    }

    private static GeneratedAppGlideModule f(Context context) {
        try {
            return GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{context.getApplicationContext()});
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
        } catch (InstantiationException e10) {
            y(e10);
        } catch (IllegalAccessException e11) {
            y(e11);
        } catch (NoSuchMethodException e12) {
            y(e12);
        } catch (InvocationTargetException e13) {
            y(e13);
        }
        return null;
    }

    public static File l(Context context) {
        return m(context, "image_manager_disk_cache");
    }

    public static File m(Context context, String str) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            File file = new File(cacheDir, str);
            if (file.isDirectory() || file.mkdirs()) {
                return file;
            }
            return null;
        }
        if (Log.isLoggable("Glide", 6)) {
            Log.e("Glide", "default disk cache dir is null");
        }
        return null;
    }

    private static o p(Context context) {
        o5.k.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return e(context).o();
    }

    public static void q(Context context, d dVar) {
        GeneratedAppGlideModule f10 = f(context);
        synchronized (c.class) {
            try {
                if (f39009k != null) {
                    x();
                }
                t(context, dVar, f10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized void r(c cVar) {
        synchronized (c.class) {
            try {
                if (f39009k != null) {
                    x();
                }
                f39009k = cVar;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    private static void s(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        t(context, new d(), generatedAppGlideModule);
    }

    private static void t(Context context, d dVar, GeneratedAppGlideModule generatedAppGlideModule) {
        o.b bVar;
        Context applicationContext = context.getApplicationContext();
        List<C3638b> emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.isManifestParsingEnabled()) {
            emptyList = new C3640d(applicationContext).b();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.a().isEmpty()) {
            Set a10 = generatedAppGlideModule.a();
            Iterator it = emptyList.iterator();
            while (it.hasNext()) {
                C3638b bVar2 = (C3638b) it.next();
                if (a10.contains(bVar2.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + bVar2);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            for (C3638b bVar3 : emptyList) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + bVar3.getClass());
            }
        }
        if (generatedAppGlideModule != null) {
            bVar = generatedAppGlideModule.b();
        } else {
            bVar = null;
        }
        dVar.b(bVar);
        for (C3638b a11 : emptyList) {
            a11.a(applicationContext, dVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.applyOptions(applicationContext, dVar);
        }
        c a12 = dVar.a(applicationContext, emptyList, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(a12);
        f39009k = a12;
    }

    public static synchronized boolean u() {
        boolean z10;
        synchronized (c.class) {
            if (f39009k != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public static void x() {
        synchronized (c.class) {
            try {
                if (f39009k != null) {
                    f39009k.j().getApplicationContext().unregisterComponentCallbacks(f39009k);
                    f39009k.f39011a.m();
                }
                f39009k = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void y(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* access modifiers changed from: package-private */
    public void A(m mVar) {
        synchronized (this.f39018h) {
            try {
                if (this.f39018h.contains(mVar)) {
                    this.f39018h.remove(mVar);
                } else {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b() {
        l.a();
        this.f39011a.e();
    }

    public void c() {
        l.b();
        this.f39013c.b();
        this.f39012b.b();
        this.f39015e.b();
    }

    public b g() {
        return this.f39015e;
    }

    public d h() {
        return this.f39012b;
    }

    /* access modifiers changed from: package-private */
    public i5.c i() {
        return this.f39017g;
    }

    public Context j() {
        return this.f39014d.getBaseContext();
    }

    /* access modifiers changed from: package-private */
    public e k() {
        return this.f39014d;
    }

    public j n() {
        return this.f39014d.i();
    }

    public o o() {
        return this.f39016f;
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        c();
    }

    public void onTrimMemory(int i10) {
        z(i10);
    }

    /* access modifiers changed from: package-private */
    public void v(m mVar) {
        synchronized (this.f39018h) {
            try {
                if (!this.f39018h.contains(mVar)) {
                    this.f39018h.add(mVar);
                } else {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean w(j jVar) {
        synchronized (this.f39018h) {
            try {
                for (m untrack : this.f39018h) {
                    if (untrack.untrack(jVar)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z(int i10) {
        l.b();
        synchronized (this.f39018h) {
            try {
                for (m onTrimMemory : this.f39018h) {
                    onTrimMemory.onTrimMemory(i10);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        this.f39013c.a(i10);
        this.f39012b.a(i10);
        this.f39015e.a(i10);
    }
}
