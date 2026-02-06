package t5;

import F5.h;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import com.facebook.I;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: t5.d  reason: case insensitive filesystem */
public final class C4027d {

    /* renamed from: a  reason: collision with root package name */
    public static final C4027d f48216a = new C4027d();

    /* renamed from: b  reason: collision with root package name */
    private static final String f48217b = C4027d.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    private static final ReentrantReadWriteLock f48218c = new ReentrantReadWriteLock();

    /* renamed from: d  reason: collision with root package name */
    private static String f48219d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile boolean f48220e;

    private C4027d() {
    }

    public static final String c() {
        if (!f48220e) {
            Log.w(f48217b, "initStore should have been called before calling setUserID");
            f48216a.d();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f48218c;
        reentrantReadWriteLock.readLock().lock();
        try {
            String str = f48219d;
            reentrantReadWriteLock.readLock().unlock();
            return str;
        } catch (Throwable th2) {
            f48218c.readLock().unlock();
            throw th2;
        }
    }

    private final void d() {
        if (!f48220e) {
            ReentrantReadWriteLock reentrantReadWriteLock = f48218c;
            reentrantReadWriteLock.writeLock().lock();
            try {
                if (f48220e) {
                    reentrantReadWriteLock.writeLock().unlock();
                    return;
                }
                f48219d = PreferenceManager.getDefaultSharedPreferences(I.l()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", (String) null);
                f48220e = true;
                reentrantReadWriteLock.writeLock().unlock();
            } catch (Throwable th2) {
                f48218c.writeLock().unlock();
                throw th2;
            }
        }
    }

    public static final void e() {
        if (!f48220e) {
            C4021N.f48172b.c().execute(new C4026c());
        }
    }

    /* access modifiers changed from: private */
    public static final void f() {
        f48216a.d();
    }

    public static final void g(String str) {
        h.b();
        if (!f48220e) {
            Log.w(f48217b, "initStore should have been called before calling setUserID");
            f48216a.d();
        }
        C4021N.f48172b.c().execute(new C4025b(str));
    }

    /* access modifiers changed from: private */
    public static final void h(String str) {
        ReentrantReadWriteLock reentrantReadWriteLock = f48218c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            f48219d = str;
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(I.l()).edit();
            edit.putString("com.facebook.appevents.AnalyticsUserIDStore.userID", f48219d);
            edit.apply();
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th2) {
            f48218c.writeLock().unlock();
            throw th2;
        }
    }
}
