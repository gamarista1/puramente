package com.facebook.react.animated;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.views.view.b;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class f extends b implements d {

    /* renamed from: n  reason: collision with root package name */
    public static final a f40453n = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    private final o f40454f;

    /* renamed from: g  reason: collision with root package name */
    private final ReactApplicationContext f40455g;

    /* renamed from: h  reason: collision with root package name */
    private int f40456h;

    /* renamed from: i  reason: collision with root package name */
    private int f40457i;

    /* renamed from: j  reason: collision with root package name */
    private int f40458j;

    /* renamed from: k  reason: collision with root package name */
    private int f40459k;

    /* renamed from: l  reason: collision with root package name */
    private ReadableMap f40460l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f40461m;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final Context b(b bVar) {
            List list = bVar.f40445a;
            if (list == null) {
                return null;
            }
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                return null;
            }
            b bVar2 = (b) it.next();
            if (!(bVar2 instanceof q)) {
                return f.f40453n.b(bVar2);
            }
            View k10 = ((q) bVar2).k();
            if (k10 != null) {
                return k10.getContext();
            }
            return null;
        }

        private a() {
        }
    }

    public f(ReadableMap readableMap, o oVar, ReactApplicationContext reactApplicationContext) {
        C6496s.h(readableMap, "config");
        C6496s.h(oVar, "nativeAnimatedNodesManager");
        C6496s.h(reactApplicationContext, "reactApplicationContext");
        this.f40454f = oVar;
        this.f40455g = reactApplicationContext;
        a(readableMap);
    }

    private final Context j() {
        Activity currentActivity = this.f40455g.getCurrentActivity();
        if (currentActivity != null) {
            return currentActivity;
        }
        return f40453n.b(this);
    }

    private final void k() {
        Context j10;
        if (this.f40460l != null && !this.f40461m && (j10 = j()) != null) {
            Integer color = ColorPropConverter.getColor(this.f40460l, j10);
            w wVar = (w) this.f40454f.k(this.f40456h);
            w wVar2 = (w) this.f40454f.k(this.f40457i);
            w wVar3 = (w) this.f40454f.k(this.f40458j);
            w wVar4 = (w) this.f40454f.k(this.f40459k);
            if (wVar != null) {
                C6496s.e(color);
                wVar.f40562f = (double) Color.red(color.intValue());
            }
            if (wVar2 != null) {
                C6496s.e(color);
                wVar2.f40562f = (double) Color.green(color.intValue());
            }
            if (wVar3 != null) {
                C6496s.e(color);
                wVar3.f40562f = (double) Color.blue(color.intValue());
            }
            if (wVar4 != null) {
                C6496s.e(color);
                wVar4.f40562f = ((double) Color.alpha(color.intValue())) / 255.0d;
            }
            this.f40461m = true;
        }
    }

    public void a(ReadableMap readableMap) {
        if (readableMap != null) {
            this.f40456h = readableMap.getInt("r");
            this.f40457i = readableMap.getInt("g");
            this.f40458j = readableMap.getInt("b");
            this.f40459k = readableMap.getInt("a");
            this.f40460l = readableMap.getMap("nativeColor");
            this.f40461m = false;
            k();
            return;
        }
        this.f40456h = 0;
        this.f40457i = 0;
        this.f40458j = 0;
        this.f40459k = 0;
        this.f40460l = null;
        this.f40461m = false;
    }

    public String e() {
        int i10 = this.f40448d;
        int i11 = this.f40456h;
        int i12 = this.f40457i;
        int i13 = this.f40458j;
        int i14 = this.f40459k;
        return "ColorAnimatedNode[" + i10 + "]: r: " + i11 + "  g: " + i12 + " b: " + i13 + " a: " + i14;
    }

    public final int i() {
        double d10;
        double d11;
        double d12;
        k();
        w wVar = (w) this.f40454f.k(this.f40456h);
        w wVar2 = (w) this.f40454f.k(this.f40457i);
        w wVar3 = (w) this.f40454f.k(this.f40458j);
        w wVar4 = (w) this.f40454f.k(this.f40459k);
        double d13 = 0.0d;
        if (wVar != null) {
            d10 = wVar.f40562f;
        } else {
            d10 = 0.0d;
        }
        if (wVar2 != null) {
            d11 = wVar2.f40562f;
        } else {
            d11 = 0.0d;
        }
        if (wVar3 != null) {
            d12 = wVar3.f40562f;
        } else {
            d12 = 0.0d;
        }
        if (wVar4 != null) {
            d13 = wVar4.f40562f;
        }
        return b.b(d10, d11, d12, d13);
    }
}
