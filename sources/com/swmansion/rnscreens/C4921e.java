package com.swmansion.rnscreens;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.C3413g0;
import com.facebook.react.uimanager.G;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.swmansion.rnscreens.e  reason: case insensitive filesystem */
public abstract class C4921e extends ViewGroup {

    /* renamed from: d  reason: collision with root package name */
    public static final a f59786d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private C3413g0 f59787a;

    /* renamed from: b  reason: collision with root package name */
    private float f59788b;

    /* renamed from: c  reason: collision with root package name */
    private float f59789c;

    /* renamed from: com.swmansion.rnscreens.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C4921e(Context context) {
        super(context);
    }

    public final void a(int i10, int i11) {
        b(i10, i11);
    }

    public final void b(int i10, int i11) {
        float f10 = (float) i10;
        float f11 = G.f(f10);
        float f12 = (float) i11;
        float f13 = G.f(f12);
        if (Math.abs(this.f59788b - f10) >= 0.9f || Math.abs(this.f59789c - f12) >= 0.9f) {
            this.f59788b = f11;
            this.f59789c = f13;
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("paddingStart", (double) f11);
            writableNativeMap.putDouble("paddingEnd", (double) f13);
            C3413g0 g0Var = this.f59787a;
            if (g0Var != null) {
                g0Var.updateState(writableNativeMap);
            }
        }
    }

    public final void setStateWrapper(C3413g0 g0Var) {
        this.f59787a = g0Var;
    }
}
