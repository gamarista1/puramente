package com.facebook.react.devsupport;

import C7.j;
import I7.b;
import I7.c;
import I7.h;
import I7.i;
import android.content.Context;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.Map;

/* renamed from: com.facebook.react.devsupport.a  reason: case insensitive filesystem */
class C3334a extends E {
    public C3334a(Context context, e0 e0Var, String str, boolean z10, i iVar, b bVar, int i10, Map map, j jVar, c cVar, h hVar) {
        super(context, e0Var, str, z10, iVar, bVar, i10, map, jVar, cVar, hVar);
    }

    /* access modifiers changed from: protected */
    public String n0() {
        return "Bridgeless";
    }

    public void z() {
        UiThreadUtil.assertOnUiThread();
        p();
        this.f40676f.d("BridgelessDevSupportManager.handleReloadJS()");
    }
}
