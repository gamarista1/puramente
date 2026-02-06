package com.facebook.react.animated;

import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.UIManager;
import f8.C3519a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import lf.v;
import lf.w;

public final class q extends b {

    /* renamed from: f  reason: collision with root package name */
    private final o f40521f;

    /* renamed from: g  reason: collision with root package name */
    private int f40522g = -1;

    /* renamed from: h  reason: collision with root package name */
    private final Map f40523h;

    /* renamed from: i  reason: collision with root package name */
    private final JavaOnlyMap f40524i = new JavaOnlyMap();

    /* renamed from: j  reason: collision with root package name */
    private UIManager f40525j;

    public q(ReadableMap readableMap, o oVar) {
        ReadableMapKeySetIterator readableMapKeySetIterator;
        C6496s.h(readableMap, "config");
        C6496s.h(oVar, "nativeAnimatedNodesManager");
        this.f40521f = oVar;
        ReadableMap map = readableMap.getMap("props");
        if (map != null) {
            readableMapKeySetIterator = map.keySetIterator();
        } else {
            readableMapKeySetIterator = null;
        }
        this.f40523h = new LinkedHashMap();
        while (readableMapKeySetIterator != null && readableMapKeySetIterator.hasNextKey()) {
            String nextKey = readableMapKeySetIterator.nextKey();
            this.f40523h.put(nextKey, Integer.valueOf(map.getInt(nextKey)));
        }
    }

    public String e() {
        int i10 = this.f40448d;
        int i11 = this.f40522g;
        Map map = this.f40523h;
        JavaOnlyMap javaOnlyMap = this.f40524i;
        return "PropsAnimatedNode[" + i10 + "] connectedViewTag: " + i11 + " propNodeMapping: " + map + " propMap: " + javaOnlyMap;
    }

    public final void i(int i10, UIManager uIManager) {
        if (this.f40522g == -1) {
            this.f40522g = i10;
            this.f40525j = uIManager;
            return;
        }
        int i11 = this.f40448d;
        int i12 = this.f40522g;
        throw new JSApplicationIllegalArgumentException("Animated node " + i11 + " is already attached to a view: " + i12);
    }

    public final void j(int i10) {
        int i11 = this.f40522g;
        if (i11 == i10 || i11 == -1) {
            this.f40522g = -1;
            return;
        }
        int i12 = this.f40522g;
        throw new JSApplicationIllegalArgumentException("Attempting to disconnect view that has not been connected with the given animated node: " + i10 + " but is connected to view " + i12);
    }

    public final View k() {
        Object obj;
        View view;
        View view2 = null;
        try {
            v.a aVar = v.f71841b;
            UIManager uIManager = this.f40525j;
            if (uIManager != null) {
                view = uIManager.resolveView(this.f40522g);
            } else {
                view = null;
            }
            obj = v.b(view);
        } catch (Throwable th2) {
            v.a aVar2 = v.f71841b;
            obj = v.b(w.a(th2));
        }
        if (!v.g(obj)) {
            view2 = obj;
        }
        return view2;
    }

    public final void l() {
        int i10 = this.f40522g;
        if (i10 != -1 && C3519a.a(i10) != 2) {
            ReadableMapKeySetIterator keySetIterator = this.f40524i.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                this.f40524i.putNull(keySetIterator.nextKey());
            }
            UIManager uIManager = this.f40525j;
            if (uIManager != null) {
                uIManager.synchronouslyUpdateViewOnUIThread(this.f40522g, this.f40524i);
            }
        }
    }

    public final void m() {
        if (this.f40522g != -1) {
            for (Map.Entry entry : this.f40523h.entrySet()) {
                String str = (String) entry.getKey();
                b k10 = this.f40521f.k(((Number) entry.getValue()).intValue());
                if (k10 == null) {
                    throw new IllegalArgumentException("Mapped property node does not exist");
                } else if (k10 instanceof s) {
                    ((s) k10).i(this.f40524i);
                } else if (k10 instanceof w) {
                    w wVar = (w) k10;
                    Object k11 = wVar.k();
                    if (k11 instanceof Integer) {
                        this.f40524i.putInt(str, ((Number) k11).intValue());
                    } else if (k11 instanceof String) {
                        this.f40524i.putString(str, (String) k11);
                    } else {
                        this.f40524i.putDouble(str, wVar.l());
                    }
                } else if (k10 instanceof f) {
                    this.f40524i.putInt(str, ((f) k10).i());
                } else if (k10 instanceof p) {
                    ((p) k10).i(str, this.f40524i);
                } else {
                    Class<?> cls = k10.getClass();
                    throw new IllegalArgumentException("Unsupported type of node used in property node " + cls);
                }
            }
            UIManager uIManager = this.f40525j;
            if (uIManager != null) {
                uIManager.synchronouslyUpdateViewOnUIThread(this.f40522g, this.f40524i);
            }
        }
    }
}
