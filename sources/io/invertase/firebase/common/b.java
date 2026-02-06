package io.invertase.firebase.common;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private final a f71262a = new a(e());

    /* renamed from: b  reason: collision with root package name */
    private final Context f71263b;

    /* renamed from: c  reason: collision with root package name */
    private final String f71264c;

    protected b(Context context, String str) {
        this.f71263b = context;
        this.f71264c = str;
    }

    public Context a() {
        return c().getApplicationContext();
    }

    public Map b() {
        return new HashMap();
    }

    public Context c() {
        return this.f71263b;
    }

    /* access modifiers changed from: protected */
    public ExecutorService d() {
        return this.f71262a.b();
    }

    public String e() {
        return "Universal" + this.f71264c + "Module";
    }

    public void f() {
        this.f71262a.j();
    }
}
