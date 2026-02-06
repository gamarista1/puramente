package com.bugsnag.android;

import K4.k;
import Sg.p;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class z1 extends BroadcastReceiver {

    /* renamed from: d  reason: collision with root package name */
    public static final a f39004d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final A f39005a;

    /* renamed from: b  reason: collision with root package name */
    private final S0 f39006b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f39007c = b();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(String str) {
            return p.J(str, "android.", false, 2, (Object) null);
        }

        public final void b(Context context, z1 z1Var, S0 s02) {
            if (!z1Var.c().isEmpty()) {
                IntentFilter intentFilter = new IntentFilter();
                for (String addAction : z1Var.c().keySet()) {
                    intentFilter.addAction(addAction);
                }
                K.e(context, z1Var, intentFilter, s02);
            }
        }

        public final String c(String str) {
            if (a(str)) {
                return p.V0(str, '.', (String) null, 2, (Object) null);
            }
            return str;
        }

        private a() {
        }
    }

    public z1(A a10, S0 s02) {
        this.f39005a = a10;
        this.f39006b = s02;
    }

    private final void a(Intent intent, Map map, String str) {
        Set<String> keySet;
        Bundle extras = intent.getExtras();
        if (extras != null && (keySet = extras.keySet()) != null) {
            for (String str2 : keySet) {
                Object obj = extras.get(str2);
                if (obj != null) {
                    String obj2 = obj.toString();
                    if (f39004d.a(str2)) {
                        map.put("Extra", str + ": " + obj2);
                    } else {
                        map.put(str2, obj2);
                    }
                }
            }
        }
    }

    private final Map b() {
        HashMap hashMap = new HashMap();
        k m10 = this.f39005a.m();
        BreadcrumbType breadcrumbType = BreadcrumbType.USER;
        if (!m10.J(breadcrumbType)) {
            hashMap.put("android.appwidget.action.APPWIDGET_DELETED", breadcrumbType);
            hashMap.put("android.appwidget.action.APPWIDGET_DISABLED", breadcrumbType);
            hashMap.put("android.appwidget.action.APPWIDGET_ENABLED", breadcrumbType);
            hashMap.put("android.intent.action.CAMERA_BUTTON", breadcrumbType);
            hashMap.put("android.intent.action.CLOSE_SYSTEM_DIALOGS", breadcrumbType);
            hashMap.put("android.intent.action.DOCK_EVENT", breadcrumbType);
        }
        BreadcrumbType breadcrumbType2 = BreadcrumbType.STATE;
        if (!m10.J(breadcrumbType2)) {
            hashMap.put("android.appwidget.action.APPWIDGET_HOST_RESTORED", breadcrumbType2);
            hashMap.put("android.appwidget.action.APPWIDGET_RESTORED", breadcrumbType2);
            hashMap.put("android.appwidget.action.APPWIDGET_UPDATE", breadcrumbType2);
            hashMap.put("android.appwidget.action.APPWIDGET_UPDATE_OPTIONS", breadcrumbType2);
            hashMap.put("android.intent.action.ACTION_POWER_CONNECTED", breadcrumbType2);
            hashMap.put("android.intent.action.ACTION_POWER_DISCONNECTED", breadcrumbType2);
            hashMap.put("android.intent.action.ACTION_SHUTDOWN", breadcrumbType2);
            hashMap.put("android.intent.action.AIRPLANE_MODE", breadcrumbType2);
            hashMap.put("android.intent.action.BATTERY_LOW", breadcrumbType2);
            hashMap.put("android.intent.action.BATTERY_OKAY", breadcrumbType2);
            hashMap.put("android.intent.action.BOOT_COMPLETED", breadcrumbType2);
            hashMap.put("android.intent.action.CONFIGURATION_CHANGED", breadcrumbType2);
            hashMap.put("android.intent.action.CONTENT_CHANGED", breadcrumbType2);
            hashMap.put("android.intent.action.DATE_CHANGED", breadcrumbType2);
            hashMap.put("android.intent.action.DEVICE_STORAGE_LOW", breadcrumbType2);
            hashMap.put("android.intent.action.DEVICE_STORAGE_OK", breadcrumbType2);
            hashMap.put("android.intent.action.INPUT_METHOD_CHANGED", breadcrumbType2);
            hashMap.put("android.intent.action.LOCALE_CHANGED", breadcrumbType2);
            hashMap.put("android.intent.action.REBOOT", breadcrumbType2);
            hashMap.put("android.intent.action.SCREEN_OFF", breadcrumbType2);
            hashMap.put("android.intent.action.SCREEN_ON", breadcrumbType2);
            hashMap.put("android.intent.action.TIMEZONE_CHANGED", breadcrumbType2);
            hashMap.put("android.intent.action.TIME_SET", breadcrumbType2);
            hashMap.put("android.os.action.DEVICE_IDLE_MODE_CHANGED", breadcrumbType2);
            hashMap.put("android.os.action.POWER_SAVE_MODE_CHANGED", breadcrumbType2);
        }
        BreadcrumbType breadcrumbType3 = BreadcrumbType.NAVIGATION;
        if (!m10.J(breadcrumbType3)) {
            hashMap.put("android.intent.action.DREAMING_STARTED", breadcrumbType3);
            hashMap.put("android.intent.action.DREAMING_STOPPED", breadcrumbType3);
        }
        return hashMap;
    }

    public static final void d(Context context, z1 z1Var, S0 s02) {
        f39004d.b(context, z1Var, s02);
    }

    public final Map c() {
        return this.f39007c;
    }

    public void onReceive(Context context, Intent intent) {
        try {
            HashMap hashMap = new HashMap();
            String action = intent.getAction();
            if (action != null) {
                String c10 = f39004d.c(action);
                hashMap.put("Intent Action", action);
                a(intent, hashMap, c10);
                BreadcrumbType breadcrumbType = (BreadcrumbType) this.f39007c.get(action);
                if (breadcrumbType == null) {
                    breadcrumbType = BreadcrumbType.STATE;
                }
                this.f39005a.B(c10, hashMap, breadcrumbType);
            }
        } catch (Exception e10) {
            this.f39006b.e(C6496s.o("Failed to leave breadcrumb in SystemBroadcastReceiver: ", e10.getMessage()));
        }
    }
}
