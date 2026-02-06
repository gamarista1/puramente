package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.swmansion.gesturehandler.react.k;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vd.C5260d;
import vd.e;
import vd.q;

public final class f implements e {

    /* renamed from: d  reason: collision with root package name */
    public static final a f59584d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray f59585a = new SparseArray();

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray f59586b = new SparseArray();

    /* renamed from: c  reason: collision with root package name */
    private final SparseArray f59587c = new SparseArray();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final int[] f(ReadableMap readableMap, String str) {
        ReadableArray array = readableMap.getArray(str);
        C6496s.e(array);
        int size = array.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = array.getInt(i10);
        }
        return iArr;
    }

    public boolean a(C5260d dVar, C5260d dVar2) {
        C6496s.h(dVar, "handler");
        C6496s.h(dVar2, "otherHandler");
        int[] iArr = (int[]) this.f59586b.get(dVar.T());
        if (iArr == null) {
            return false;
        }
        for (int i10 : iArr) {
            if (i10 == dVar2.T()) {
                return true;
            }
        }
        return false;
    }

    public boolean b(C5260d dVar, C5260d dVar2) {
        C6496s.h(dVar, "handler");
        C6496s.h(dVar2, "otherHandler");
        if (dVar2 instanceof q) {
            return ((q) dVar2).X0();
        }
        if (dVar2 instanceof k.b) {
            return true;
        }
        return false;
    }

    public boolean c(C5260d dVar, C5260d dVar2) {
        C6496s.h(dVar, "handler");
        C6496s.h(dVar2, "otherHandler");
        int[] iArr = (int[]) this.f59587c.get(dVar.T());
        if (iArr == null) {
            return false;
        }
        for (int i10 : iArr) {
            if (i10 == dVar2.T()) {
                return true;
            }
        }
        return false;
    }

    public boolean d(C5260d dVar, C5260d dVar2) {
        C6496s.h(dVar, "handler");
        C6496s.h(dVar2, "otherHandler");
        int[] iArr = (int[]) this.f59585a.get(dVar.T());
        if (iArr == null) {
            return false;
        }
        for (int i10 : iArr) {
            if (i10 == dVar2.T()) {
                return true;
            }
        }
        return false;
    }

    public final void e(C5260d dVar, ReadableMap readableMap) {
        C6496s.h(dVar, "handler");
        C6496s.h(readableMap, "config");
        dVar.A0(this);
        if (readableMap.hasKey("waitFor")) {
            this.f59585a.put(dVar.T(), f(readableMap, "waitFor"));
        }
        if (readableMap.hasKey("simultaneousHandlers")) {
            this.f59586b.put(dVar.T(), f(readableMap, "simultaneousHandlers"));
        }
        if (readableMap.hasKey("blocksHandlers")) {
            this.f59587c.put(dVar.T(), f(readableMap, "blocksHandlers"));
        }
    }

    public final void g(int i10) {
        this.f59585a.remove(i10);
        this.f59586b.remove(i10);
    }

    public final void h() {
        this.f59585a.clear();
        this.f59586b.clear();
    }
}
