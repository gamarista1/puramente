package h6;

import Sg.p;
import Tc.a;
import Tc.c;
import Tc.e;
import Tc.h;
import Wc.b;
import android.graphics.Bitmap;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import com.facebook.I;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import o7.C3884A;
import o7.C3906w;
import o7.Q;
import o7.W;
import org.json.JSONObject;
import t7.C4049a;

/* renamed from: h6.a  reason: case insensitive filesystem */
public final class C3580a {

    /* renamed from: a  reason: collision with root package name */
    public static final C3580a f44013a = new C3580a();

    /* renamed from: b  reason: collision with root package name */
    private static final String f44014b = C3580a.class.getCanonicalName();

    /* renamed from: c  reason: collision with root package name */
    private static final HashMap f44015c = new HashMap();

    /* renamed from: h6.a$a  reason: collision with other inner class name */
    public static final class C0676a implements NsdManager.RegistrationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f44016a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f44017b;

        C0676a(String str, String str2) {
            this.f44016a = str;
            this.f44017b = str2;
        }

        public void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i10) {
            C6496s.h(nsdServiceInfo, "serviceInfo");
            C3580a.a(this.f44017b);
        }

        public void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
            C6496s.h(nsdServiceInfo, "NsdServiceInfo");
            if (!C6496s.c(this.f44016a, nsdServiceInfo.getServiceName())) {
                C3580a.a(this.f44017b);
            }
        }

        public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
            C6496s.h(nsdServiceInfo, "serviceInfo");
        }

        public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i10) {
            C6496s.h(nsdServiceInfo, "serviceInfo");
        }
    }

    private C3580a() {
    }

    public static final void a(String str) {
        Class<C3580a> cls = C3580a.class;
        if (!C4049a.d(cls)) {
            try {
                f44013a.b(str);
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    private final void b(String str) {
        if (!C4049a.d(this)) {
            try {
                NsdManager.RegistrationListener registrationListener = (NsdManager.RegistrationListener) f44015c.get(str);
                if (registrationListener != null) {
                    Object systemService = I.l().getSystemService("servicediscovery");
                    C6496s.f(systemService, "null cannot be cast to non-null type android.net.nsd.NsdManager");
                    ((NsdManager) systemService).unregisterService(registrationListener);
                    f44015c.remove(str);
                }
            } catch (IllegalArgumentException e10) {
                W.k0(f44014b, e10);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public static final Bitmap c(String str) {
        int i10;
        Class<C3580a> cls = C3580a.class;
        Bitmap bitmap = null;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            EnumMap enumMap = new EnumMap(c.class);
            enumMap.put(c.MARGIN, 2);
            try {
                b a10 = new e().a(str, a.QR_CODE, 200, 200, enumMap);
                int g10 = a10.g();
                int h10 = a10.h();
                int[] iArr = new int[(g10 * h10)];
                for (int i11 = 0; i11 < g10; i11++) {
                    int i12 = i11 * h10;
                    for (int i13 = 0; i13 < h10; i13++) {
                        int i14 = i12 + i13;
                        if (a10.e(i13, i11)) {
                            i10 = -16777216;
                        } else {
                            i10 = -1;
                        }
                        iArr[i14] = i10;
                    }
                }
                Bitmap createBitmap = Bitmap.createBitmap(h10, g10, Bitmap.Config.ARGB_8888);
                try {
                    createBitmap.setPixels(iArr, 0, h10, 0, 0, h10, g10);
                    return createBitmap;
                } catch (h unused) {
                    bitmap = createBitmap;
                }
            } catch (h unused2) {
                return bitmap;
            }
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final String d(Map map) {
        Class<C3580a> cls = C3580a.class;
        if (C4049a.d(cls)) {
            return null;
        }
        if (map == null) {
            try {
                map = new HashMap();
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
                return null;
            }
        }
        String str = Build.DEVICE;
        C6496s.g(str, "DEVICE");
        map.put("device", str);
        String str2 = Build.MODEL;
        C6496s.g(str2, "MODEL");
        map.put("model", str2);
        String jSONObject = new JSONObject(map).toString();
        C6496s.g(jSONObject, "JSONObject(deviceInfo as Map<*, *>).toString()");
        return jSONObject;
    }

    public static final boolean e() {
        Class<C3580a> cls = C3580a.class;
        if (C4049a.d(cls)) {
            return false;
        }
        try {
            C3906w f10 = C3884A.f(I.m());
            if (f10 == null || !f10.x().contains(Q.Enabled)) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return false;
        }
    }

    public static final boolean f(String str) {
        Class<C3580a> cls = C3580a.class;
        if (C4049a.d(cls)) {
            return false;
        }
        try {
            if (e()) {
                return f44013a.g(str);
            }
            return false;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return false;
        }
    }

    private final boolean g(String str) {
        if (C4049a.d(this)) {
            return false;
        }
        try {
            HashMap hashMap = f44015c;
            if (hashMap.containsKey(str)) {
                return true;
            }
            String str2 = "fbsdk_" + ("android-" + p.C(I.B(), '.', '|', false, 4, (Object) null)) + '_' + str;
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(str2);
            nsdServiceInfo.setPort(80);
            Object systemService = I.l().getSystemService("servicediscovery");
            C6496s.f(systemService, "null cannot be cast to non-null type android.net.nsd.NsdManager");
            C0676a aVar = new C0676a(str2, str);
            hashMap.put(str, aVar);
            ((NsdManager) systemService).registerService(nsdServiceInfo, 1, aVar);
            return true;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return false;
        }
    }
}
