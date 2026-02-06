package com.facebook.react.views.safeareaview;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C1680b0;
import androidx.core.view.D0;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.C3413g0;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.UIManagerModule;
import io.intercom.android.sdk.models.carousel.BlockAlignment;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import kotlin.jvm.internal.C6496s;
import p1.C2388d;

public final class b extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private final C3415h0 f41927a;

    /* renamed from: b  reason: collision with root package name */
    private C3413g0 f41928b;

    public static final class a extends GuardedRunnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f41929a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2388d f41930b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, C2388d dVar, C3415h0 h0Var) {
            super((ReactContext) h0Var);
            this.f41929a = bVar;
            this.f41930b = dVar;
        }

        public void runGuarded() {
            UIManagerModule uIManagerModule = (UIManagerModule) this.f41929a.getReactContext().b().getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                int id2 = this.f41929a.getId();
                C2388d dVar = this.f41930b;
                uIManagerModule.updateInsetsPadding(id2, dVar.f25151b, dVar.f25150a, dVar.f25153d, dVar.f25152c);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(C3415h0 h0Var) {
        super(h0Var);
        C6496s.h(h0Var, "reactContext");
        this.f41927a = h0Var;
    }

    /* access modifiers changed from: private */
    public static final D0 b(b bVar, View view, D0 d02) {
        C6496s.h(view, "<unused var>");
        C6496s.h(d02, "windowInsets");
        C2388d f10 = d02.f(D0.n.h() | D0.n.b());
        C6496s.g(f10, "getInsets(...)");
        bVar.c(f10);
        return D0.f15980b;
    }

    private final void c(C2388d dVar) {
        C3413g0 g0Var = this.f41928b;
        if (g0Var != null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            G g10 = G.f41415a;
            writableNativeMap.putDouble(BlockAlignment.LEFT, (double) g10.d((float) dVar.f25150a));
            writableNativeMap.putDouble(VerticalAlignment.TOP, (double) g10.d((float) dVar.f25151b));
            writableNativeMap.putDouble(VerticalAlignment.BOTTOM, (double) g10.d((float) dVar.f25153d));
            writableNativeMap.putDouble(BlockAlignment.RIGHT, (double) g10.d((float) dVar.f25152c));
            g0Var.updateState(writableNativeMap);
            return;
        }
        C3415h0 h0Var = this.f41927a;
        h0Var.runOnNativeModulesQueueThread(new a(this, dVar, h0Var));
    }

    public final C3415h0 getReactContext() {
        return this.f41927a;
    }

    public final C3413g0 getStateWrapper$ReactAndroid_release() {
        return this.f41928b;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1680b0.C0(this, new a(this));
        requestApplyInsets();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    public final void setStateWrapper$ReactAndroid_release(C3413g0 g0Var) {
        this.f41928b = g0Var;
    }
}
