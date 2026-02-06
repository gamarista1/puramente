package com.bugsnag.android;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.RemoteException;
import android.os.storage.StorageManager;

public abstract class K {
    public static final ActivityManager a(Context context) {
        try {
            Object systemService = context.getSystemService("activity");
            if (!(systemService instanceof ActivityManager)) {
                systemService = null;
            }
            return (ActivityManager) systemService;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static final ConnectivityManager b(Context context) {
        try {
            Object systemService = context.getSystemService("connectivity");
            if (!(systemService instanceof ConnectivityManager)) {
                systemService = null;
            }
            return (ConnectivityManager) systemService;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static final LocationManager c(Context context) {
        try {
            Object systemService = context.getSystemService("location");
            if (!(systemService instanceof LocationManager)) {
                systemService = null;
            }
            return (LocationManager) systemService;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static final StorageManager d(Context context) {
        try {
            Object systemService = context.getSystemService("storage");
            if (!(systemService instanceof StorageManager)) {
                systemService = null;
            }
            return (StorageManager) systemService;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static final Intent e(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, S0 s02) {
        try {
            if (Build.VERSION.SDK_INT >= 34) {
                return context.registerReceiver(broadcastReceiver, intentFilter, 2);
            }
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (SecurityException e10) {
            if (s02 == null) {
                return null;
            }
            s02.b("Failed to register receiver", e10);
            return null;
        } catch (RemoteException e11) {
            if (s02 == null) {
                return null;
            }
            s02.b("Failed to register receiver", e11);
            return null;
        } catch (IllegalArgumentException e12) {
            if (s02 == null) {
                return null;
            }
            s02.b("Failed to register receiver", e12);
            return null;
        }
    }

    public static final void f(Context context, BroadcastReceiver broadcastReceiver, S0 s02) {
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (SecurityException e10) {
            if (s02 != null) {
                s02.b("Failed to register receiver", e10);
            }
        } catch (RemoteException e11) {
            if (s02 != null) {
                s02.b("Failed to register receiver", e11);
            }
        } catch (IllegalArgumentException e12) {
            if (s02 != null) {
                s02.b("Failed to register receiver", e12);
            }
        }
    }
}
