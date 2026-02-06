package x5;

import android.util.Log;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C6496s;

/* renamed from: x5.e  reason: case insensitive filesystem */
public final class C4169e {

    /* renamed from: a  reason: collision with root package name */
    public static final C4169e f49468a = new C4169e();

    /* renamed from: b  reason: collision with root package name */
    private static final String f49469b = C4169e.class.getCanonicalName();

    /* renamed from: c  reason: collision with root package name */
    private static Class f49470c;

    private C4169e() {
    }

    public static final void a() {
        d("UnityFacebookSDKPlugin", "CaptureViewHierarchy", "");
    }

    private final Class b() {
        Class<?> cls = Class.forName("com.unity3d.player.UnityPlayer");
        C6496s.g(cls, "forName(UNITY_PLAYER_CLASS)");
        return cls;
    }

    public static final void c(String str) {
        d("UnityFacebookSDKPlugin", "OnReceiveMapping", str);
    }

    public static final void d(String str, String str2, String str3) {
        Class<String> cls = String.class;
        try {
            if (f49470c == null) {
                f49470c = f49468a.b();
            }
            Class cls2 = f49470c;
            Class cls3 = null;
            if (cls2 == null) {
                C6496s.v("unityPlayer");
                cls2 = null;
            }
            Method method = cls2.getMethod("UnitySendMessage", new Class[]{cls, cls, cls});
            Class cls4 = f49470c;
            if (cls4 == null) {
                C6496s.v("unityPlayer");
            } else {
                cls3 = cls4;
            }
            method.invoke(cls3, new Object[]{str, str2, str3});
        } catch (Exception e10) {
            Log.e(f49469b, "Failed to send message to Unity", e10);
        }
    }
}
