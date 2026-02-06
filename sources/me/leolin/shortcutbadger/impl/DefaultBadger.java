package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import oh.C6629a;
import qh.C6667a;

public class DefaultBadger implements C6629a {
    public List a() {
        return Arrays.asList(new String[]{"fr.neamar.kiss", "com.quaap.launchtime", "com.quaap.launchtime_official"});
    }

    public void b(Context context, ComponentName componentName, int i10) {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i10);
        intent.putExtra("badge_count_package_name", componentName.getPackageName());
        intent.putExtra("badge_count_class_name", componentName.getClassName());
        C6667a.b(context, intent);
    }
}
