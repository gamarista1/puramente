package com.bumptech.glide;

import T4.k;
import T4.l;
import V4.i;
import V4.t;
import V4.v;
import Z4.o;
import Z4.p;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import h5.C3579e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k5.C3672a;
import k5.f;
import p5.C3931a;

public class j {

    /* renamed from: a  reason: collision with root package name */
    private final p f39092a;

    /* renamed from: b  reason: collision with root package name */
    private final C3672a f39093b;

    /* renamed from: c  reason: collision with root package name */
    private final k5.e f39094c;

    /* renamed from: d  reason: collision with root package name */
    private final f f39095d;

    /* renamed from: e  reason: collision with root package name */
    private final com.bumptech.glide.load.data.f f39096e;

    /* renamed from: f  reason: collision with root package name */
    private final h5.f f39097f;

    /* renamed from: g  reason: collision with root package name */
    private final k5.b f39098g;

    /* renamed from: h  reason: collision with root package name */
    private final k5.d f39099h = new k5.d();

    /* renamed from: i  reason: collision with root package name */
    private final k5.c f39100i = new k5.c();

    /* renamed from: j  reason: collision with root package name */
    private final x1.e f39101j;

    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    public static class c extends a {
        public c(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public c(Object obj, List list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
        }

        public c(Class cls, Class cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    public static class d extends a {
        public d(Class cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class e extends a {
        public e(Class cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public j() {
        x1.e e10 = C3931a.e();
        this.f39101j = e10;
        this.f39092a = new p(e10);
        this.f39093b = new C3672a();
        this.f39094c = new k5.e();
        this.f39095d = new f();
        this.f39096e = new com.bumptech.glide.load.data.f();
        this.f39097f = new h5.f();
        this.f39098g = new k5.b();
        v(Arrays.asList(new String[]{"Animation", "Bitmap", "BitmapDrawable"}));
    }

    private List f(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f39094c.d(cls, cls2)) {
            for (Class cls5 : this.f39097f.b(cls4, cls3)) {
                arrayList.add(new i(cls, cls4, cls5, this.f39094c.b(cls, cls4), this.f39097f.a(cls4, cls5), this.f39101j));
            }
        }
        return arrayList;
    }

    public j a(Class cls, T4.d dVar) {
        this.f39093b.a(cls, dVar);
        return this;
    }

    public j b(Class cls, l lVar) {
        this.f39095d.a(cls, lVar);
        return this;
    }

    public j c(Class cls, Class cls2, k kVar) {
        e("legacy_append", cls, cls2, kVar);
        return this;
    }

    public j d(Class cls, Class cls2, o oVar) {
        this.f39092a.a(cls, cls2, oVar);
        return this;
    }

    public j e(String str, Class cls, Class cls2, k kVar) {
        this.f39094c.a(str, kVar, cls, cls2);
        return this;
    }

    public List g() {
        List b10 = this.f39098g.b();
        if (!b10.isEmpty()) {
            return b10;
        }
        throw new b();
    }

    public t h(Class cls, Class cls2, Class cls3) {
        t a10 = this.f39100i.a(cls, cls2, cls3);
        if (this.f39100i.c(a10)) {
            return null;
        }
        if (a10 == null) {
            List f10 = f(cls, cls2, cls3);
            if (f10.isEmpty()) {
                a10 = null;
            } else {
                a10 = new t(cls, cls2, cls3, f10, this.f39101j);
            }
            this.f39100i.d(cls, cls2, cls3, a10);
        }
        return a10;
    }

    public List i(Object obj) {
        return this.f39092a.d(obj);
    }

    public List j(Class cls, Class cls2, Class cls3) {
        List a10 = this.f39099h.a(cls, cls2, cls3);
        if (a10 == null) {
            a10 = new ArrayList();
            for (Class d10 : this.f39092a.c(cls)) {
                for (Class cls4 : this.f39094c.d(d10, cls2)) {
                    if (!this.f39097f.b(cls4, cls3).isEmpty() && !a10.contains(cls4)) {
                        a10.add(cls4);
                    }
                }
            }
            this.f39099h.b(cls, cls2, cls3, Collections.unmodifiableList(a10));
        }
        return a10;
    }

    public l k(v vVar) {
        l b10 = this.f39095d.b(vVar.a());
        if (b10 != null) {
            return b10;
        }
        throw new d(vVar.a());
    }

    public com.bumptech.glide.load.data.e l(Object obj) {
        return this.f39096e.a(obj);
    }

    public T4.d m(Object obj) {
        T4.d b10 = this.f39093b.b(obj.getClass());
        if (b10 != null) {
            return b10;
        }
        throw new e(obj.getClass());
    }

    public boolean n(v vVar) {
        if (this.f39095d.b(vVar.a()) != null) {
            return true;
        }
        return false;
    }

    public j o(Class cls, l lVar) {
        this.f39095d.c(cls, lVar);
        return this;
    }

    public j p(Class cls, Class cls2, k kVar) {
        q("legacy_prepend_all", cls, cls2, kVar);
        return this;
    }

    public j q(String str, Class cls, Class cls2, k kVar) {
        this.f39094c.e(str, kVar, cls, cls2);
        return this;
    }

    public j r(ImageHeaderParser imageHeaderParser) {
        this.f39098g.a(imageHeaderParser);
        return this;
    }

    public j s(e.a aVar) {
        this.f39096e.b(aVar);
        return this;
    }

    public j t(Class cls, Class cls2, C3579e eVar) {
        this.f39097f.c(cls, cls2, eVar);
        return this;
    }

    public j u(Class cls, Class cls2, o oVar) {
        this.f39092a.f(cls, cls2, oVar);
        return this;
    }

    public final j v(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        this.f39094c.f(arrayList);
        return this;
    }
}
