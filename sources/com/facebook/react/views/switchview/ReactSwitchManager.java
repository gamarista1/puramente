package com.facebook.react.views.switchview;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.C3428v;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.w0;
import com.facebook.yoga.o;
import com.facebook.yoga.p;
import com.facebook.yoga.q;
import com.facebook.yoga.r;
import e8.C3500a;
import m8.C3805g;
import m8.C3807h;

public class ReactSwitchManager extends SimpleViewManager<a> implements C3807h {
    private static final CompoundButton.OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER = new a();
    public static final String REACT_CLASS = "AndroidSwitch";
    private final w0 mDelegate = new C3805g(this);

    class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            ReactContext reactContext = (ReactContext) compoundButton.getContext();
            int id2 = compoundButton.getId();
            n0.c(reactContext, id2).h(new b(n0.e(reactContext), id2, z10));
        }
    }

    static class b extends C3428v implements o {

        /* renamed from: a  reason: collision with root package name */
        private int f42088a;

        /* renamed from: b  reason: collision with root package name */
        private int f42089b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f42090c;

        private void g() {
            setMeasureFunction(this);
        }

        public long a(r rVar, float f10, p pVar, float f11, p pVar2) {
            if (!this.f42090c) {
                a aVar = new a(getThemedContext());
                aVar.setShowText(false);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                aVar.measure(makeMeasureSpec, makeMeasureSpec);
                this.f42088a = aVar.getMeasuredWidth();
                this.f42089b = aVar.getMeasuredHeight();
                this.f42090c = true;
            }
            return q.b(this.f42088a, this.f42089b);
        }

        private b() {
            g();
        }
    }

    private static void setValueInternal(a aVar, boolean z10) {
        aVar.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        aVar.setOn(z10);
        aVar.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    /* access modifiers changed from: protected */
    public w0 getDelegate() {
        return this.mDelegate;
    }

    public String getName() {
        return REACT_CLASS;
    }

    public Class getShadowNodeClass() {
        return b.class;
    }

    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f10, p pVar, float f11, p pVar2, float[] fArr) {
        a aVar = new a(context);
        aVar.setShowText(false);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        aVar.measure(makeMeasureSpec, makeMeasureSpec);
        return q.a(G.f((float) aVar.getMeasuredWidth()), G.f((float) aVar.getMeasuredHeight()));
    }

    /* access modifiers changed from: protected */
    public void addEventEmitters(C3415h0 h0Var, a aVar) {
        aVar.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    public C3428v createShadowNodeInstance() {
        return new b();
    }

    /* access modifiers changed from: protected */
    public a createViewInstance(C3415h0 h0Var) {
        a aVar = new a(h0Var);
        aVar.setShowText(false);
        return aVar;
    }

    public void receiveCommand(a aVar, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("setNativeValue")) {
            boolean z10 = false;
            if (readableArray != null && readableArray.getBoolean(0)) {
                z10 = true;
            }
            setValueInternal(aVar, z10);
        }
    }

    public void setBackgroundColor(a aVar, int i10) {
        aVar.setBackgroundColor(i10);
    }

    @C3500a(defaultBoolean = false, name = "disabled")
    public void setDisabled(a aVar, boolean z10) {
        aVar.setEnabled(!z10);
    }

    @C3500a(defaultBoolean = true, name = "enabled")
    public void setEnabled(a aVar, boolean z10) {
        aVar.setEnabled(z10);
    }

    public void setNativeValue(a aVar, boolean z10) {
        setValueInternal(aVar, z10);
    }

    @C3500a(name = "on")
    public void setOn(a aVar, boolean z10) {
        setValueInternal(aVar, z10);
    }

    @C3500a(customType = "Color", name = "thumbColor")
    public void setThumbColor(a aVar, Integer num) {
        aVar.setThumbColor(num);
    }

    @C3500a(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(a aVar, Integer num) {
        setThumbColor(aVar, num);
    }

    @C3500a(customType = "Color", name = "trackColorForFalse")
    public void setTrackColorForFalse(a aVar, Integer num) {
        aVar.setTrackColorForFalse(num);
    }

    @C3500a(customType = "Color", name = "trackColorForTrue")
    public void setTrackColorForTrue(a aVar, Integer num) {
        aVar.setTrackColorForTrue(num);
    }

    @C3500a(customType = "Color", name = "trackTintColor")
    public void setTrackTintColor(a aVar, Integer num) {
        aVar.setTrackColor(num);
    }

    @C3500a(name = "value")
    public void setValue(a aVar, boolean z10) {
        setValueInternal(aVar, z10);
    }
}
