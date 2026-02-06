package com.swmansion.rnscreens;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.view.e;
import kotlin.jvm.internal.C6496s;

/* renamed from: com.swmansion.rnscreens.u  reason: case insensitive filesystem */
public final class C4936u extends e {

    /* renamed from: a  reason: collision with root package name */
    private a f59913a;

    /* renamed from: com.swmansion.rnscreens.u$a */
    public interface a {
        void a(boolean z10, int i10, int i11, int i12, int i13);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4936u(ReactContext reactContext) {
        super(reactContext);
        C6496s.h(reactContext, "reactContext");
    }

    public final a getDelegate$react_native_screens_release() {
        return this.f59913a;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        a aVar = this.f59913a;
        if (aVar != null) {
            aVar.a(z10, i10, i11, i12, i13);
        }
    }

    public final void setDelegate$react_native_screens_release(a aVar) {
        this.f59913a = aVar;
    }
}
