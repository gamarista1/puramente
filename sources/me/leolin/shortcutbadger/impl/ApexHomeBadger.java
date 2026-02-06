package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import oh.C6629a;
import qh.C6667a;

public class ApexHomeBadger implements C6629a {
    public List a() {
        return Arrays.asList(new String[]{"com.anddoes.launcher"});
    }

    public void b(Context context, ComponentName componentName, int i10) {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", componentName.getPackageName());
        intent.putExtra("count", i10);
        intent.putExtra("class", componentName.getClassName());
        C6667a.c(context, intent);
    }
}
