package androidx.startup;

import B3.b;
import B3.c;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    private static volatile a f18382d;

    /* renamed from: e  reason: collision with root package name */
    private static final Object f18383e = new Object();

    /* renamed from: a  reason: collision with root package name */
    final Map f18384a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    final Set f18385b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    final Context f18386c;

    a(Context context) {
        this.f18386c = context.getApplicationContext();
    }

    private Object d(Class cls, Set set) {
        Object obj;
        if (D3.a.h()) {
            try {
                D3.a.c(cls.getSimpleName());
            } catch (Throwable th2) {
                D3.a.f();
                throw th2;
            }
        }
        if (!set.contains(cls)) {
            if (!this.f18384a.containsKey(cls)) {
                set.add(cls);
                B3.a aVar = (B3.a) cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                List<Class> a10 = aVar.a();
                if (!a10.isEmpty()) {
                    for (Class cls2 : a10) {
                        if (!this.f18384a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                obj = aVar.b(this.f18386c);
                set.remove(cls);
                this.f18384a.put(cls, obj);
            } else {
                obj = this.f18384a.get(cls);
            }
            D3.a.f();
            return obj;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
    }

    public static a e(Context context) {
        if (f18382d == null) {
            synchronized (f18383e) {
                try {
                    if (f18382d == null) {
                        f18382d = new a(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f18382d;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        try {
            D3.a.c("Startup");
            b(this.f18386c.getPackageManager().getProviderInfo(new ComponentName(this.f18386c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            D3.a.f();
        } catch (PackageManager.NameNotFoundException e10) {
            throw new c((Throwable) e10);
        } catch (Throwable th2) {
            D3.a.f();
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Bundle bundle) {
        String string = this.f18386c.getString(b.f824a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String next : bundle.keySet()) {
                    if (string.equals(bundle.getString(next, (String) null))) {
                        Class<?> cls = Class.forName(next);
                        if (B3.a.class.isAssignableFrom(cls)) {
                            this.f18385b.add(cls);
                        }
                    }
                }
                for (Class d10 : this.f18385b) {
                    d(d10, hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new c((Throwable) e10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Object c(Class cls) {
        Object obj;
        synchronized (f18383e) {
            try {
                obj = this.f18384a.get(cls);
                if (obj == null) {
                    obj = d(cls, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    public Object f(Class cls) {
        return c(cls);
    }

    public boolean g(Class cls) {
        return this.f18385b.contains(cls);
    }
}
