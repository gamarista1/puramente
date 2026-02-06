package com.bumptech.glide;

import V4.k;
import W4.j;
import X4.a;
import X4.g;
import X4.h;
import X4.i;
import android.content.Context;
import androidx.collection.C1587a;
import com.bumptech.glide.c;
import com.bumptech.glide.f;
import i5.e;
import i5.o;
import j5.C3637a;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Map f39021a = new C1587a();

    /* renamed from: b  reason: collision with root package name */
    private final f.a f39022b = new f.a();

    /* renamed from: c  reason: collision with root package name */
    private k f39023c;

    /* renamed from: d  reason: collision with root package name */
    private W4.d f39024d;

    /* renamed from: e  reason: collision with root package name */
    private W4.b f39025e;

    /* renamed from: f  reason: collision with root package name */
    private h f39026f;

    /* renamed from: g  reason: collision with root package name */
    private Y4.a f39027g;

    /* renamed from: h  reason: collision with root package name */
    private Y4.a f39028h;

    /* renamed from: i  reason: collision with root package name */
    private a.C0566a f39029i;

    /* renamed from: j  reason: collision with root package name */
    private i f39030j;

    /* renamed from: k  reason: collision with root package name */
    private i5.c f39031k;

    /* renamed from: l  reason: collision with root package name */
    private int f39032l = 4;

    /* renamed from: m  reason: collision with root package name */
    private c.a f39033m = new a();

    /* renamed from: n  reason: collision with root package name */
    private o.b f39034n;

    /* renamed from: o  reason: collision with root package name */
    private Y4.a f39035o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f39036p;

    /* renamed from: q  reason: collision with root package name */
    private List f39037q;

    class a implements c.a {
        a() {
        }

        public com.bumptech.glide.request.h f() {
            return new com.bumptech.glide.request.h();
        }
    }

    static final class b {
    }

    public static final class c {
    }

    /* access modifiers changed from: package-private */
    public c a(Context context, List list, C3637a aVar) {
        Context context2 = context;
        if (this.f39027g == null) {
            this.f39027g = Y4.a.h();
        }
        if (this.f39028h == null) {
            this.f39028h = Y4.a.f();
        }
        if (this.f39035o == null) {
            this.f39035o = Y4.a.d();
        }
        if (this.f39030j == null) {
            this.f39030j = new i.a(context2).a();
        }
        if (this.f39031k == null) {
            this.f39031k = new e();
        }
        if (this.f39024d == null) {
            int b10 = this.f39030j.b();
            if (b10 > 0) {
                this.f39024d = new j((long) b10);
            } else {
                this.f39024d = new W4.e();
            }
        }
        if (this.f39025e == null) {
            this.f39025e = new W4.i(this.f39030j.a());
        }
        if (this.f39026f == null) {
            this.f39026f = new g((long) this.f39030j.d());
        }
        if (this.f39029i == null) {
            this.f39029i = new X4.f(context2);
        }
        if (this.f39023c == null) {
            this.f39023c = new k(this.f39026f, this.f39029i, this.f39028h, this.f39027g, Y4.a.i(), this.f39035o, this.f39036p);
        }
        List list2 = this.f39037q;
        if (list2 == null) {
            this.f39037q = Collections.emptyList();
        } else {
            this.f39037q = Collections.unmodifiableList(list2);
        }
        f b11 = this.f39022b.b();
        return new c(context, this.f39023c, this.f39026f, this.f39024d, this.f39025e, new o(this.f39034n), this.f39031k, this.f39032l, this.f39033m, this.f39021a, this.f39037q, list, aVar, b11);
    }

    /* access modifiers changed from: package-private */
    public void b(o.b bVar) {
        this.f39034n = bVar;
    }
}
