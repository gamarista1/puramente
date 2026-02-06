package id;

import android.util.Log;

/* renamed from: id.a  reason: case insensitive filesystem */
public abstract class C5028a {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f60795a = false;

    public static synchronized void a() {
        synchronized (C5028a.class) {
            if (!f60795a) {
                try {
                    Log.i("NitroModules", "Loading NitroModules C++ library...");
                    System.loadLibrary("NitroModules");
                    Log.i("NitroModules", "Successfully loaded NitroModules C++ library!");
                    f60795a = true;
                } catch (Throwable th2) {
                    Log.e("NitroModules", "Failed to load NitroModules C++ library! Is it properly installed and linked?", th2);
                    throw th2;
                }
            }
        }
    }
}
