package Eb;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Eb.f  reason: case insensitive filesystem */
public final class C4285f {

    /* renamed from: a  reason: collision with root package name */
    private final Object f50708a;

    /* renamed from: b  reason: collision with root package name */
    private final c f50709b;

    /* renamed from: Eb.f$b */
    private static class b implements c {

        /* renamed from: a  reason: collision with root package name */
        private final Class f50710a;

        private Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f50710a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f50710a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        /* renamed from: c */
        public List a(Context context) {
            Bundle b10 = b(context);
            if (b10 == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String next : b10.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(b10.get(next)) && next.startsWith("com.google.firebase.components:")) {
                    arrayList.add(next.substring(31));
                }
            }
            return arrayList;
        }

        private b(Class cls) {
            this.f50710a = cls;
        }
    }

    /* renamed from: Eb.f$c */
    interface c {
        List a(Object obj);
    }

    C4285f(Object obj, c cVar) {
        this.f50708a = obj;
        this.f50709b = cVar;
    }

    public static C4285f c(Context context, Class cls) {
        return new C4285f(context, new b(cls));
    }

    /* access modifiers changed from: private */
    public static ComponentRegistrar d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
            }
            throw new v(String.format("Class %s is not an instance of %s", new Object[]{str, "com.google.firebase.components.ComponentRegistrar"}));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", new Object[]{str}));
            return null;
        } catch (IllegalAccessException e10) {
            throw new v(String.format("Could not instantiate %s.", new Object[]{str}), e10);
        } catch (InstantiationException e11) {
            throw new v(String.format("Could not instantiate %s.", new Object[]{str}), e11);
        } catch (NoSuchMethodException e12) {
            throw new v(String.format("Could not instantiate %s", new Object[]{str}), e12);
        } catch (InvocationTargetException e13) {
            throw new v(String.format("Could not instantiate %s", new Object[]{str}), e13);
        }
    }

    public List b() {
        ArrayList arrayList = new ArrayList();
        for (String eVar : this.f50709b.a(this.f50708a)) {
            arrayList.add(new C4284e(eVar));
        }
        return arrayList;
    }
}
