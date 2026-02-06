package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import kotlin.jvm.internal.C6496s;
import vd.C5260d;
import vd.j;

public final class i implements j {

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray f59590a = new SparseArray();

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray f59591b = new SparseArray();

    /* renamed from: c  reason: collision with root package name */
    private final SparseArray f59592c = new SparseArray();

    private final synchronized void d(C5260d dVar) {
        try {
            Integer num = (Integer) this.f59591b.get(dVar.T());
            if (num != null) {
                this.f59591b.remove(dVar.T());
                ArrayList arrayList = (ArrayList) this.f59592c.get(num.intValue());
                if (arrayList != null) {
                    synchronized (arrayList) {
                        arrayList.remove(dVar);
                    }
                    if (arrayList.size() == 0) {
                        this.f59592c.remove(num.intValue());
                    }
                }
            }
            if (dVar.W() != null) {
                UiThreadUtil.runOnUiThread(new h(dVar));
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void e(C5260d dVar) {
        dVar.q();
    }

    private final synchronized void k(int i10, C5260d dVar) {
        try {
            if (this.f59591b.get(dVar.T()) == null) {
                this.f59591b.put(dVar.T(), Integer.valueOf(i10));
                Object obj = this.f59592c.get(i10);
                if (obj == null) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(dVar);
                    this.f59592c.put(i10, arrayList);
                } else {
                    synchronized (obj) {
                        ((ArrayList) obj).add(dVar);
                    }
                }
            } else {
                throw new IllegalStateException(("Handler " + dVar + " already attached").toString());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized ArrayList a(View view) {
        C6496s.h(view, "view");
        return i(view.getId());
    }

    public final synchronized boolean c(int i10, int i11, int i12) {
        boolean z10;
        C5260d dVar = (C5260d) this.f59590a.get(i10);
        if (dVar != null) {
            d(dVar);
            dVar.u0(i12);
            k(i11, dVar);
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    public final synchronized void f() {
        this.f59590a.clear();
        this.f59591b.clear();
        this.f59592c.clear();
    }

    public final synchronized void g(int i10) {
        C5260d dVar = (C5260d) this.f59590a.get(i10);
        if (dVar != null) {
            d(dVar);
            this.f59590a.remove(i10);
        }
    }

    public final synchronized C5260d h(int i10) {
        return (C5260d) this.f59590a.get(i10);
    }

    public final synchronized ArrayList i(int i10) {
        return (ArrayList) this.f59592c.get(i10);
    }

    public final synchronized void j(C5260d dVar) {
        C6496s.h(dVar, "handler");
        this.f59590a.put(dVar.T(), dVar);
    }
}
