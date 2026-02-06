package com.facebook.react.views.text;

import C7.d;
import L7.c;
import Q7.a;
import android.content.Context;
import android.os.Build;
import android.text.Spannable;
import com.facebook.react.C3367m;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.uimanager.C3413g0;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.C3424q;
import com.facebook.react.uimanager.I;
import com.facebook.react.uimanager.W;
import com.facebook.yoga.p;
import e8.C3500a;
import java.util.HashMap;
import java.util.Map;
import s8.C3998g;
import s8.q;

@a(name = "RCTText")
public class ReactTextViewManager extends ReactTextAnchorViewManager<k, f> implements C3424q {
    public static final String REACT_CLASS = "RCTText";
    private static final String TAG = "ReactTextViewManager";
    private static final short TX_STATE_KEY_ATTRIBUTED_STRING = 0;
    private static final short TX_STATE_KEY_HASH = 2;
    private static final short TX_STATE_KEY_MOST_RECENT_EVENT_COUNT = 3;
    private static final short TX_STATE_KEY_PARAGRAPH_ATTRIBUTES = 1;
    protected l mReactTextViewManagerCallback;

    public ReactTextViewManager() {
        this((l) null);
    }

    private Object getReactTextUpdate(k kVar, W w10, com.facebook.react.common.mapbuffer.a aVar) {
        String str;
        int i10 = 0;
        com.facebook.react.common.mapbuffer.a F10 = aVar.F(0);
        com.facebook.react.common.mapbuffer.a F11 = aVar.F(1);
        Spannable g10 = q.g(kVar.getContext(), F10, (l) null);
        kVar.setSpanned(g10);
        try {
            kVar.setMinimumFontSize((float) F11.getDouble(6));
            int m10 = o.m(F11.getString(2));
            if (Build.VERSION.SDK_INT >= 26) {
                i10 = kVar.getJustificationMode();
            }
            return new g(g10, -1, false, q.j(F10, g10, kVar.getGravityHorizontal()), m10, o.h(w10, i10));
        } catch (IllegalArgumentException e10) {
            if (F11 != null) {
                str = F11.toString();
            } else {
                str = "<empty>";
            }
            U5.a.o(TAG, "Paragraph Attributes: %s", str);
            throw e10;
        }
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        Map exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap();
        }
        exportedCustomDirectEventTypeConstants.putAll(d.e("topTextLayout", d.d("registrationName", "onTextLayout"), "topInlineViewLayout", d.d("registrationName", "onInlineViewLayout")));
        return exportedCustomDirectEventTypeConstants;
    }

    public String getName() {
        return REACT_CLASS;
    }

    public Class<f> getShadowNodeClass() {
        return f.class;
    }

    public long measure(Context context, com.facebook.react.common.mapbuffer.a aVar, com.facebook.react.common.mapbuffer.a aVar2, com.facebook.react.common.mapbuffer.a aVar3, float f10, p pVar, float f11, p pVar2, float[] fArr) {
        return q.n(context, aVar, aVar2, f10, pVar, f11, pVar2, (l) null, fArr);
    }

    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @C3500a(name = "overflow")
    public void setOverflow(k kVar, String str) {
        kVar.setOverflow(str);
    }

    public ReactTextViewManager(l lVar) {
        setupViewRecycling();
    }

    public f createShadowNodeInstance() {
        return new f((l) null);
    }

    public k createViewInstance(C3415h0 h0Var) {
        return new k(h0Var);
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(k kVar) {
        super.onAfterUpdateTransaction(kVar);
        kVar.k();
    }

    /* access modifiers changed from: protected */
    public k prepareToRecycleView(C3415h0 h0Var, k kVar) {
        k kVar2 = (k) super.prepareToRecycleView(h0Var, kVar);
        if (kVar2 != null) {
            kVar2.i();
            setSelectionColor(kVar2, (Integer) null);
        }
        return kVar;
    }

    public void setPadding(k kVar, int i10, int i11, int i12, int i13) {
        kVar.setPadding(i10, i11, i12, i13);
    }

    public void updateExtraData(k kVar, Object obj) {
        c cVar = new c("ReactTextViewManager.updateExtraData");
        try {
            g gVar = (g) obj;
            Spannable i10 = gVar.i();
            if (gVar.b()) {
                q.g(i10, kVar);
            }
            kVar.setText(gVar);
            C3998g[] gVarArr = (C3998g[]) i10.getSpans(0, gVar.i().length(), C3998g.class);
            if (gVarArr.length > 0) {
                kVar.setTag(C3367m.f40930f, new I.d(gVarArr, i10));
                I.X(kVar, kVar.isFocusable(), kVar.getImportantForAccessibility());
            }
            cVar.close();
            return;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public Object updateState(k kVar, W w10, C3413g0 g0Var) {
        c cVar = new c("ReactTextViewManager.updateState");
        try {
            ReadableMapBuffer stateDataMapBuffer = g0Var.getStateDataMapBuffer();
            if (stateDataMapBuffer != null) {
                Object reactTextUpdate = getReactTextUpdate(kVar, w10, stateDataMapBuffer);
                cVar.close();
                return reactTextUpdate;
            }
            cVar.close();
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public f createShadowNodeInstance(l lVar) {
        return new f(lVar);
    }
}
