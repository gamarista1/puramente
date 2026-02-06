package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Collections;
import java.util.List;
import oh.C6629a;
import oh.C6630b;
import qh.C6667a;

public class NewHtcHomeBadger implements C6629a {
    public List a() {
        return Collections.singletonList("com.htc.launcher");
    }

    public void b(Context context, ComponentName componentName, int i10) {
        boolean z10;
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", componentName.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i10);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", componentName.getPackageName());
        intent2.putExtra("count", i10);
        boolean z11 = false;
        try {
            C6667a.c(context, intent);
            z10 = true;
        } catch (C6630b unused) {
            z10 = false;
        }
        try {
            C6667a.c(context, intent2);
            z11 = true;
        } catch (C6630b unused2) {
        }
        if (!z10 && !z11) {
            throw new C6630b("unable to resolve intent: " + intent2.toString());
        }
    }
}
