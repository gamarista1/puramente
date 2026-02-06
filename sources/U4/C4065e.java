package u4;

import E4.b;
import E4.e;
import E4.f;
import E4.g;
import E4.h;
import android.content.Context;
import java.io.File;
import y4.C4186b;
import y4.c;

/* renamed from: u4.e  reason: case insensitive filesystem */
public abstract class C4065e {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f48481a = false;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f48482b = false;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f48483c = true;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f48484d = true;

    /* renamed from: e  reason: collision with root package name */
    private static C4061a f48485e = C4061a.AUTOMATIC;

    /* renamed from: f  reason: collision with root package name */
    private static f f48486f;

    /* renamed from: g  reason: collision with root package name */
    private static e f48487g;

    /* renamed from: h  reason: collision with root package name */
    private static volatile h f48488h;

    /* renamed from: i  reason: collision with root package name */
    private static volatile g f48489i;

    /* renamed from: j  reason: collision with root package name */
    private static ThreadLocal f48490j;

    /* renamed from: k  reason: collision with root package name */
    private static C4186b f48491k = new c();

    public static void b(String str) {
        if (f48482b) {
            g().a(str);
        }
    }

    public static float c(String str) {
        if (!f48482b) {
            return 0.0f;
        }
        return g().b(str);
    }

    public static C4061a d() {
        return f48485e;
    }

    public static boolean e() {
        return f48484d;
    }

    public static C4186b f() {
        return f48491k;
    }

    private static H4.h g() {
        H4.h hVar = (H4.h) f48490j.get();
        if (hVar != null) {
            return hVar;
        }
        H4.h hVar2 = new H4.h();
        f48490j.set(hVar2);
        return hVar2;
    }

    public static boolean h() {
        return f48482b;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ File i(Context context) {
        return new File(context.getCacheDir(), "lottie_network_cache");
    }

    public static g j(Context context) {
        if (!f48483c) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        g gVar = f48489i;
        if (gVar == null) {
            synchronized (g.class) {
                try {
                    gVar = f48489i;
                    if (gVar == null) {
                        e eVar = f48487g;
                        if (eVar == null) {
                            eVar = new C4064d(applicationContext);
                        }
                        gVar = new g(eVar);
                        f48489i = gVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return gVar;
    }

    public static h k(Context context) {
        h hVar = f48488h;
        if (hVar == null) {
            synchronized (h.class) {
                try {
                    hVar = f48488h;
                    if (hVar == null) {
                        g j10 = j(context);
                        f fVar = f48486f;
                        if (fVar == null) {
                            fVar = new b();
                        }
                        hVar = new h(j10, fVar);
                        f48488h = hVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hVar;
    }
}
