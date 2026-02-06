package Kc;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.common.api.internal.C4497i;
import com.google.android.gms.common.api.internal.C4498j;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class a {

    /* renamed from: c  reason: collision with root package name */
    private static final a f51456c = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Map f51457a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Object f51458b = new Object();

    /* renamed from: Kc.a$a  reason: collision with other inner class name */
    private static class C0791a {

        /* renamed from: a  reason: collision with root package name */
        private final Activity f51459a;

        /* renamed from: b  reason: collision with root package name */
        private final Runnable f51460b;

        /* renamed from: c  reason: collision with root package name */
        private final Object f51461c;

        public C0791a(Activity activity, Runnable runnable, Object obj) {
            this.f51459a = activity;
            this.f51460b = runnable;
            this.f51461c = obj;
        }

        public Activity a() {
            return this.f51459a;
        }

        public Object b() {
            return this.f51461c;
        }

        public Runnable c() {
            return this.f51460b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0791a)) {
                return false;
            }
            C0791a aVar = (C0791a) obj;
            if (aVar.f51461c.equals(this.f51461c) && aVar.f51460b == this.f51460b && aVar.f51459a == this.f51459a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f51461c.hashCode();
        }
    }

    private static class b extends LifecycleCallback {

        /* renamed from: a  reason: collision with root package name */
        private final List f51462a = new ArrayList();

        private b(C4498j jVar) {
            super(jVar);
            this.mLifecycleFragment.a("StorageOnStopCallback", this);
        }

        public static b b(Activity activity) {
            C4498j fragment = LifecycleCallback.getFragment(new C4497i(activity));
            b bVar = (b) fragment.d("StorageOnStopCallback", b.class);
            if (bVar == null) {
                return new b(fragment);
            }
            return bVar;
        }

        public void a(C0791a aVar) {
            synchronized (this.f51462a) {
                this.f51462a.add(aVar);
            }
        }

        public void c(C0791a aVar) {
            synchronized (this.f51462a) {
                this.f51462a.remove(aVar);
            }
        }

        public void onStop() {
            ArrayList arrayList;
            synchronized (this.f51462a) {
                arrayList = new ArrayList(this.f51462a);
                this.f51462a.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0791a aVar = (C0791a) it.next();
                if (aVar != null) {
                    Log.d("StorageOnStopCallback", "removing subscription from activity.");
                    aVar.c().run();
                    a.a().b(aVar.b());
                }
            }
        }
    }

    private a() {
    }

    public static a a() {
        return f51456c;
    }

    public void b(Object obj) {
        synchronized (this.f51458b) {
            try {
                C0791a aVar = (C0791a) this.f51457a.get(obj);
                if (aVar != null) {
                    b.b(aVar.a()).c(aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(Activity activity, Object obj, Runnable runnable) {
        synchronized (this.f51458b) {
            C0791a aVar = new C0791a(activity, runnable, obj);
            b.b(activity).a(aVar);
            this.f51457a.put(obj, aVar);
        }
    }
}
