package com.facebook.react.uimanager;

import C7.h;
import android.util.SparseArray;
import android.util.SparseBooleanArray;

/* renamed from: com.facebook.react.uimanager.e0  reason: case insensitive filesystem */
class C3409e0 {

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray f41570a = new SparseArray();

    /* renamed from: b  reason: collision with root package name */
    private final SparseBooleanArray f41571b = new SparseBooleanArray();

    /* renamed from: c  reason: collision with root package name */
    private final h f41572c = new h();

    public void a(U u10) {
        this.f41572c.a();
        this.f41570a.put(u10.getReactTag(), u10);
    }

    public void b(U u10) {
        this.f41572c.a();
        int reactTag = u10.getReactTag();
        this.f41570a.put(reactTag, u10);
        this.f41571b.put(reactTag, true);
    }

    public U c(int i10) {
        this.f41572c.a();
        return (U) this.f41570a.get(i10);
    }

    public int d() {
        this.f41572c.a();
        return this.f41571b.size();
    }

    public int e(int i10) {
        this.f41572c.a();
        return this.f41571b.keyAt(i10);
    }

    public boolean f(int i10) {
        this.f41572c.a();
        return this.f41571b.get(i10);
    }

    public void g(int i10) {
        this.f41572c.a();
        if (!this.f41571b.get(i10)) {
            this.f41570a.remove(i10);
            return;
        }
        throw new r("Trying to remove root node " + i10 + " without using removeRootNode!");
    }

    public void h(int i10) {
        this.f41572c.a();
        if (i10 != -1) {
            if (this.f41571b.get(i10)) {
                this.f41570a.remove(i10);
                this.f41571b.delete(i10);
                return;
            }
            throw new r("View with tag " + i10 + " is not registered as a root view");
        }
    }
}
