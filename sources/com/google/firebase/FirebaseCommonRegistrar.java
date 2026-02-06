package com.google.firebase;

import Cc.c;
import Cc.e;
import Cc.h;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import gc.C5001f;
import java.util.ArrayList;
import java.util.List;
import ub.C5232i;
import ub.j;
import ub.k;
import ub.l;

public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* access modifiers changed from: private */
    public static /* synthetic */ String e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.targetSdkVersion);
        }
        return "";
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.minSdkVersion);
        }
        return "";
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String g(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        if (i10 < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
            return "";
        }
        return "embedded";
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName != null) {
            return i(installerPackageName);
        }
        return "";
    }

    private static String i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    public List getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.c());
        arrayList.add(C5001f.g());
        arrayList.add(h.b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(h.b("fire-core", "21.0.0"));
        arrayList.add(h.b("device-name", i(Build.PRODUCT)));
        arrayList.add(h.b("device-model", i(Build.DEVICE)));
        arrayList.add(h.b("device-brand", i(Build.BRAND)));
        arrayList.add(h.c("android-target-sdk", new C5232i()));
        arrayList.add(h.c("android-min-sdk", new j()));
        arrayList.add(h.c("android-platform", new k()));
        arrayList.add(h.c("android-installer", new l()));
        String a10 = e.a();
        if (a10 != null) {
            arrayList.add(h.b("kotlin", a10));
        }
        return arrayList;
    }
}
