package com.google.firebase.remoteconfig.internal;

import Dc.u;
import Ea.d;
import android.util.Log;
import com.adjust.sdk.Constants;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

public class o {

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f57883e = Charset.forName(Constants.ENCODING);

    /* renamed from: f  reason: collision with root package name */
    static final Pattern f57884f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* renamed from: g  reason: collision with root package name */
    static final Pattern f57885g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* renamed from: a  reason: collision with root package name */
    private final Set f57886a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private final Executor f57887b;

    /* renamed from: c  reason: collision with root package name */
    private final f f57888c;

    /* renamed from: d  reason: collision with root package name */
    private final f f57889d;

    public o(Executor executor, f fVar, f fVar2) {
        this.f57887b = executor;
        this.f57888c = fVar;
        this.f57889d = fVar2;
    }

    private void c(String str, g gVar) {
        if (gVar != null) {
            synchronized (this.f57886a) {
                try {
                    for (d nVar : this.f57886a) {
                        this.f57887b.execute(new n(nVar, str, gVar));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private static g e(f fVar) {
        return fVar.f();
    }

    private static Set f(f fVar) {
        HashSet hashSet = new HashSet();
        g e10 = e(fVar);
        if (e10 == null) {
            return hashSet;
        }
        Iterator<String> keys = e10.g().keys();
        while (keys.hasNext()) {
            hashSet.add(keys.next());
        }
        return hashSet;
    }

    private static String g(f fVar, String str) {
        g e10 = e(fVar);
        if (e10 == null) {
            return null;
        }
        try {
            return e10.g().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static void j(String str, String str2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", new Object[]{str2, str}));
    }

    public void b(d dVar) {
        synchronized (this.f57886a) {
            this.f57886a.add(dVar);
        }
    }

    public Map d() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(f(this.f57888c));
        hashSet.addAll(f(this.f57889d));
        HashMap hashMap = new HashMap();
        for (String str : hashSet) {
            hashMap.put(str, h(str));
        }
        return hashMap;
    }

    public u h(String str) {
        String g10 = g(this.f57888c, str);
        if (g10 != null) {
            c(str, e(this.f57888c));
            return new x(g10, 2);
        }
        String g11 = g(this.f57889d, str);
        if (g11 != null) {
            return new x(g11, 1);
        }
        j(str, "FirebaseRemoteConfigValue");
        return new x("", 0);
    }
}
