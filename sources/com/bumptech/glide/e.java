package com.bumptech.glide;

import V4.k;
import W4.b;
import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.c;
import com.bumptech.glide.request.h;
import java.util.List;
import java.util.Map;
import l5.g;
import o5.f;

public class e extends ContextWrapper {

    /* renamed from: k  reason: collision with root package name */
    static final n f39039k = new b();

    /* renamed from: a  reason: collision with root package name */
    private final b f39040a;

    /* renamed from: b  reason: collision with root package name */
    private final f.b f39041b;

    /* renamed from: c  reason: collision with root package name */
    private final g f39042c;

    /* renamed from: d  reason: collision with root package name */
    private final c.a f39043d;

    /* renamed from: e  reason: collision with root package name */
    private final List f39044e;

    /* renamed from: f  reason: collision with root package name */
    private final Map f39045f;

    /* renamed from: g  reason: collision with root package name */
    private final k f39046g;

    /* renamed from: h  reason: collision with root package name */
    private final f f39047h;

    /* renamed from: i  reason: collision with root package name */
    private final int f39048i;

    /* renamed from: j  reason: collision with root package name */
    private h f39049j;

    public e(Context context, b bVar, f.b bVar2, g gVar, c.a aVar, Map map, List list, k kVar, f fVar, int i10) {
        super(context.getApplicationContext());
        this.f39040a = bVar;
        this.f39042c = gVar;
        this.f39043d = aVar;
        this.f39044e = list;
        this.f39045f = map;
        this.f39046g = kVar;
        this.f39047h = fVar;
        this.f39048i = i10;
        this.f39041b = f.a(bVar2);
    }

    public l5.k a(ImageView imageView, Class cls) {
        return this.f39042c.a(imageView, cls);
    }

    public b b() {
        return this.f39040a;
    }

    public List c() {
        return this.f39044e;
    }

    public synchronized h d() {
        try {
            if (this.f39049j == null) {
                this.f39049j = (h) this.f39043d.f().lock();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f39049j;
    }

    public n e(Class cls) {
        n nVar = (n) this.f39045f.get(cls);
        if (nVar == null) {
            for (Map.Entry entry : this.f39045f.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    nVar = (n) entry.getValue();
                }
            }
        }
        if (nVar == null) {
            return f39039k;
        }
        return nVar;
    }

    public k f() {
        return this.f39046g;
    }

    public f g() {
        return this.f39047h;
    }

    public int h() {
        return this.f39048i;
    }

    public j i() {
        return (j) this.f39041b.get();
    }
}
