package com.google.android.gms.common.api;

import Ra.d;
import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import androidx.collection.C1587a;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.C4492d;
import com.google.android.gms.common.api.internal.C4494f;
import com.google.android.gms.common.api.internal.C4502n;
import com.google.android.gms.common.api.internal.C4506s;
import com.google.android.gms.common.internal.C4522e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    private static final Set f53927a = Collections.newSetFromMap(new WeakHashMap());

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private Account f53928a;

        /* renamed from: b  reason: collision with root package name */
        private final Set f53929b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        private final Set f53930c = new HashSet();

        /* renamed from: d  reason: collision with root package name */
        private int f53931d;

        /* renamed from: e  reason: collision with root package name */
        private View f53932e;

        /* renamed from: f  reason: collision with root package name */
        private String f53933f;

        /* renamed from: g  reason: collision with root package name */
        private String f53934g;

        /* renamed from: h  reason: collision with root package name */
        private final Map f53935h = new C1587a();

        /* renamed from: i  reason: collision with root package name */
        private final Context f53936i;

        /* renamed from: j  reason: collision with root package name */
        private final Map f53937j = new C1587a();

        /* renamed from: k  reason: collision with root package name */
        private int f53938k = -1;

        /* renamed from: l  reason: collision with root package name */
        private Looper f53939l;

        /* renamed from: m  reason: collision with root package name */
        private com.google.android.gms.common.a f53940m = com.google.android.gms.common.a.o();

        /* renamed from: n  reason: collision with root package name */
        private a.C0818a f53941n = d.f52317c;

        /* renamed from: o  reason: collision with root package name */
        private final ArrayList f53942o = new ArrayList();

        /* renamed from: p  reason: collision with root package name */
        private final ArrayList f53943p = new ArrayList();

        public a(Context context) {
            this.f53936i = context;
            this.f53939l = context.getMainLooper();
            this.f53933f = context.getPackageName();
            this.f53934g = context.getClass().getName();
        }

        public final C4522e a() {
            Ra.a aVar = Ra.a.f52305j;
            Map map = this.f53937j;
            a aVar2 = d.f52321g;
            if (map.containsKey(aVar2)) {
                aVar = (Ra.a) this.f53937j.get(aVar2);
            }
            return new C4522e(this.f53928a, this.f53929b, this.f53935h, this.f53931d, this.f53932e, this.f53933f, this.f53934g, aVar, false);
        }
    }

    public interface b extends C4494f {
    }

    public interface c extends C4502n {
    }

    public static Set c() {
        Set set = f53927a;
        synchronized (set) {
        }
        return set;
    }

    public abstract C4492d a(C4492d dVar);

    public abstract C4492d b(C4492d dVar);

    public a.f d(a.c cVar) {
        throw new UnsupportedOperationException();
    }

    public abstract Context e();

    public abstract Looper f();

    public boolean g(C4506s sVar) {
        throw new UnsupportedOperationException();
    }

    public void h() {
        throw new UnsupportedOperationException();
    }
}
