package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

abstract class d {

    /* renamed from: a  reason: collision with root package name */
    protected static final Class f15747a;

    /* renamed from: b  reason: collision with root package name */
    protected static final Field f15748b = b();

    /* renamed from: c  reason: collision with root package name */
    protected static final Field f15749c = f();

    /* renamed from: d  reason: collision with root package name */
    protected static final Method f15750d;

    /* renamed from: e  reason: collision with root package name */
    protected static final Method f15751e;

    /* renamed from: f  reason: collision with root package name */
    protected static final Method f15752f;

    /* renamed from: g  reason: collision with root package name */
    private static final Handler f15753g = new Handler(Looper.getMainLooper());

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0280d f15754a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f15755b;

        a(C0280d dVar, Object obj) {
            this.f15754a = dVar;
            this.f15755b = obj;
        }

        public void run() {
            this.f15754a.f15760a = this.f15755b;
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Application f15756a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C0280d f15757b;

        b(Application application, C0280d dVar) {
            this.f15756a = application;
            this.f15757b = dVar;
        }

        public void run() {
            this.f15756a.unregisterActivityLifecycleCallbacks(this.f15757b);
        }
    }

    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f15758a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f15759b;

        c(Object obj, Object obj2) {
            this.f15758a = obj;
            this.f15759b = obj2;
        }

        public void run() {
            try {
                Method method = d.f15750d;
                if (method != null) {
                    method.invoke(this.f15758a, new Object[]{this.f15759b, Boolean.FALSE, "AppCompat recreation"});
                } else {
                    d.f15751e.invoke(this.f15758a, new Object[]{this.f15759b, Boolean.FALSE});
                }
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
            }
        }
    }

    /* renamed from: androidx.core.app.d$d  reason: collision with other inner class name */
    private static final class C0280d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        Object f15760a;

        /* renamed from: b  reason: collision with root package name */
        private Activity f15761b;

        /* renamed from: c  reason: collision with root package name */
        private final int f15762c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f15763d = false;

        /* renamed from: e  reason: collision with root package name */
        private boolean f15764e = false;

        /* renamed from: f  reason: collision with root package name */
        private boolean f15765f = false;

        C0280d(Activity activity) {
            this.f15761b = activity;
            this.f15762c = activity.hashCode();
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f15761b == activity) {
                this.f15761b = null;
                this.f15764e = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f15764e && !this.f15765f && !this.f15763d && d.h(this.f15760a, this.f15762c, activity)) {
                this.f15765f = true;
                this.f15760a = null;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f15761b == activity) {
                this.f15763d = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class a10 = a();
        f15747a = a10;
        f15750d = d(a10);
        f15751e = c(a10);
        f15752f = e(a10);
    }

    private static Class a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class cls) {
        if (g() && cls != null) {
            Class<IBinder> cls2 = IBinder.class;
            Class<List> cls3 = List.class;
            Class<List> cls4 = List.class;
            try {
                Class cls5 = Integer.TYPE;
                Class cls6 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", new Class[]{cls2, cls3, cls4, cls5, cls6, Configuration.class, Configuration.class, cls6, cls6});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 26 || i10 == 27) {
            return true;
        }
        return false;
    }

    protected static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f15749c.get(activity);
            if (obj2 == obj) {
                if (activity.hashCode() == i10) {
                    f15753g.postAtFrontOfQueue(new c(f15748b.get(activity), obj2));
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            return false;
        }
    }

    static boolean i(Activity activity) {
        Object obj;
        Application application;
        C0280d dVar;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (g() && f15752f == null) {
            return false;
        } else {
            if (f15751e == null && f15750d == null) {
                return false;
            }
            try {
                Object obj2 = f15749c.get(activity);
                if (obj2 == null || (obj = f15748b.get(activity)) == null) {
                    return false;
                }
                application = activity.getApplication();
                dVar = new C0280d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = f15753g;
                handler.post(new a(dVar, obj2));
                if (g()) {
                    Method method = f15752f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, new Object[]{obj2, null, null, 0, bool, null, null, bool, bool});
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
