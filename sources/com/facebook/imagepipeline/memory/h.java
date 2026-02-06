package com.facebook.imagepipeline.memory;

import T5.k;
import X5.f;
import java.util.LinkedList;

class h extends b {

    /* renamed from: f  reason: collision with root package name */
    private LinkedList f39762f = new LinkedList();

    public h(int i10, int i11, int i12) {
        super(i10, i11, i12, false);
    }

    /* access modifiers changed from: package-private */
    public void a(Object obj) {
        f fVar = (f) this.f39762f.poll();
        if (fVar == null) {
            fVar = new f();
        }
        fVar.c(obj);
        this.f39751c.add(fVar);
    }

    public Object g() {
        f fVar = (f) this.f39751c.poll();
        k.g(fVar);
        Object b10 = fVar.b();
        fVar.a();
        this.f39762f.add(fVar);
        return b10;
    }
}
