package com.bugsnag.android;

import Sg.C5538a;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import yf.C6798l;
import yf.p;

/* renamed from: com.bugsnag.android.b  reason: case insensitive filesystem */
public final class C3222b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private final p f38649a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakHashMap f38650b = new WeakHashMap();

    public C3222b(p pVar) {
        this.f38649a = pVar;
    }

    private final String a(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    private final void b(Activity activity, String str, Map map) {
        String str2 = (String) this.f38650b.get(activity);
        if (str2 != null) {
            map.put("previous", str2);
        }
        String a10 = a(activity);
        p pVar = this.f38649a;
        pVar.invoke(a10 + '#' + str, map);
        this.f38650b.put(activity, str);
    }

    static /* synthetic */ void c(C3222b bVar, Activity activity, String str, Map map, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            map = new LinkedHashMap();
        }
        bVar.b(activity, str, map);
    }

    private final void d(Map map, Intent intent) {
        boolean z10;
        Object obj;
        String a10;
        if (intent != null) {
            String action = intent.getAction();
            if (action != null) {
                map.put("action", action);
            }
            Set<String> categories = intent.getCategories();
            if (categories != null) {
                map.put("categories", C6565s.x0(categories, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 62, (Object) null));
            }
            String type = intent.getType();
            if (type != null) {
                map.put("type", type);
            }
            if (intent.getFlags() != 0) {
                String num = Integer.toString(intent.getFlags(), C5538a.a(16));
                C6496s.g(num, "toString(this, checkRadix(radix))");
                map.put("flags", C6496s.o("0x", num));
            }
            if (Build.VERSION.SDK_INT >= 29 && (a10 = intent.getIdentifier()) != null) {
                map.put("id", a10);
            }
            if (intent.getData() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            map.put("hasData", Boolean.valueOf(z10));
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    Set<String> keySet = extras.keySet();
                    if (keySet != null) {
                        obj = C6565s.x0(keySet, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 62, (Object) null);
                        if (obj == null) {
                        }
                        map.put("hasExtras", obj);
                    }
                }
                obj = Boolean.FALSE;
                map.put("hasExtras", obj);
            } catch (Exception unused) {
            }
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        boolean z10;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (bundle != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        linkedHashMap.put("hasBundle", Boolean.valueOf(z10));
        d(linkedHashMap, activity.getIntent());
        C6514M m10 = C6514M.f71813a;
        b(activity, "onCreate()", linkedHashMap);
    }

    public void onActivityDestroyed(Activity activity) {
        c(this, activity, "onDestroy()", (Map) null, 4, (Object) null);
        this.f38650b.remove(activity);
    }

    public void onActivityPaused(Activity activity) {
        c(this, activity, "onPause()", (Map) null, 4, (Object) null);
    }

    public void onActivityResumed(Activity activity) {
        c(this, activity, "onResume()", (Map) null, 4, (Object) null);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        c(this, activity, "onSaveInstanceState()", (Map) null, 4, (Object) null);
    }

    public void onActivityStarted(Activity activity) {
        c(this, activity, "onStart()", (Map) null, 4, (Object) null);
    }

    public void onActivityStopped(Activity activity) {
        c(this, activity, "onStop()", (Map) null, 4, (Object) null);
    }
}
