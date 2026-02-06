package com.google.android.gms.common;

import Ea.i;
import Ga.C4293e;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.common.zzd;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final int f54100a = d.f54103a;

    /* renamed from: b  reason: collision with root package name */
    private static final b f54101b = new b();

    b() {
    }

    public static b f() {
        return f54101b;
    }

    public int a(Context context) {
        return d.b(context);
    }

    public Intent b(Context context, int i10, String str) {
        if (i10 == 1 || i10 == 2) {
            if (context == null || !i.d(context)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("gcore_");
                sb2.append(f54100a);
                sb2.append("-");
                if (!TextUtils.isEmpty(str)) {
                    sb2.append(str);
                }
                sb2.append("-");
                if (context != null) {
                    sb2.append(context.getPackageName());
                }
                sb2.append("-");
                if (context != null) {
                    try {
                        sb2.append(C4293e.a(context).e(context.getPackageName(), 0).versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                String sb3 = sb2.toString();
                Intent intent = new Intent("android.intent.action.VIEW");
                Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
                if (!TextUtils.isEmpty(sb3)) {
                    appendQueryParameter.appendQueryParameter("pcampaignid", sb3);
                }
                intent.setData(appendQueryParameter.build());
                intent.setPackage("com.android.vending");
                intent.addFlags(524288);
                return intent;
            }
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        } else if (i10 != 3) {
            return null;
        } else {
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", (String) null);
            Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent3.setData(fromParts);
            return intent3;
        }
    }

    public PendingIntent c(Context context, int i10, int i11) {
        return d(context, i10, i11, (String) null);
    }

    public PendingIntent d(Context context, int i10, int i11, String str) {
        Intent b10 = b(context, i10, str);
        if (b10 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i11, b10, zzd.zza | 134217728);
    }

    public String e(int i10) {
        return d.c(i10);
    }

    public int g(Context context) {
        return h(context, f54100a);
    }

    public int h(Context context, int i10) {
        int g10 = d.g(context, i10);
        if (d.h(context, g10)) {
            return 18;
        }
        return g10;
    }

    public boolean i(Context context, String str) {
        return d.l(context, str);
    }

    public boolean j(int i10) {
        return d.j(i10);
    }

    public void k(Context context, int i10) {
        d.a(context, i10);
    }
}
