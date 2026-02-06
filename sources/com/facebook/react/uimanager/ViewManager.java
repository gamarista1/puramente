package com.facebook.react.uimanager;

import M7.b;
import U5.a;
import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.U;
import com.facebook.yoga.p;
import d8.C3480a;
import d8.C3483d;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public abstract class ViewManager<T extends View, C extends U> extends BaseJavaModule {
    private static final String NAME = "ViewManager";
    private HashMap<Integer, Stack<T>> mRecyclableViews = null;

    public ViewManager() {
        super((ReactApplicationContext) null);
    }

    private Stack<T> getRecyclableViewStack(int i10, boolean z10) {
        HashMap<Integer, Stack<T>> hashMap = this.mRecyclableViews;
        if (hashMap == null) {
            return null;
        }
        if (z10 && !hashMap.containsKey(Integer.valueOf(i10))) {
            this.mRecyclableViews.put(Integer.valueOf(i10), new Stack());
        }
        return this.mRecyclableViews.get(Integer.valueOf(i10));
    }

    /* access modifiers changed from: protected */
    public void addEventEmitters(C3415h0 h0Var, T t10) {
    }

    public C createShadowNodeInstance() {
        throw new RuntimeException("ViewManager subclasses must implement createShadowNodeInstance()");
    }

    public T createView(int i10, C3415h0 h0Var, W w10, C3413g0 g0Var, C3480a aVar) {
        T createViewInstance = createViewInstance(i10, h0Var, w10, g0Var);
        if (createViewInstance instanceof C3483d) {
            ((C3483d) createViewInstance).setOnInterceptTouchEventListener(aVar);
        }
        return createViewInstance;
    }

    /* access modifiers changed from: protected */
    public T createViewInstance(int i10, C3415h0 h0Var, W w10, C3413g0 g0Var) {
        T t10;
        Object updateState;
        Stack recyclableViewStack = getRecyclableViewStack(h0Var.c(), true);
        if (recyclableViewStack == null || recyclableViewStack.empty()) {
            t10 = createViewInstance(h0Var);
        } else {
            t10 = recycleView(h0Var, (View) recyclableViewStack.pop());
        }
        t10.setId(i10);
        addEventEmitters(h0Var, t10);
        if (w10 != null) {
            updateProperties(t10, w10);
        }
        if (!(g0Var == null || (updateState = updateState(t10, w10, g0Var)) == null)) {
            updateExtraData(t10, updateState);
        }
        return t10;
    }

    /* access modifiers changed from: protected */
    public abstract T createViewInstance(C3415h0 h0Var);

    public Map<String, Integer> getCommandsMap() {
        return null;
    }

    /* access modifiers changed from: protected */
    public w0 getDelegate() {
        return null;
    }

    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedViewConstants() {
        return null;
    }

    public abstract String getName();

    public Map<String, String> getNativeProps() {
        return x0.e(getClass(), getShadowNodeClass());
    }

    public abstract Class<? extends C> getShadowNodeClass();

    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f10, p pVar, float f11, p pVar2, float[] fArr) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(T t10) {
    }

    public void onDropViewInstance(T t10) {
        View prepareToRecycleView;
        Context context = t10.getContext();
        if (context == null) {
            String str = NAME;
            a.m(str, "onDropViewInstance: view [" + t10.getId() + "] has a null context");
        } else if (!(context instanceof C3415h0)) {
            String str2 = NAME;
            a.m(str2, "onDropViewInstance: view [" + t10.getId() + "] has a context that is not a ThemedReactContext: " + context);
        } else {
            C3415h0 h0Var = (C3415h0) context;
            Stack recyclableViewStack = getRecyclableViewStack(h0Var.c(), false);
            if (recyclableViewStack != null && (prepareToRecycleView = prepareToRecycleView(h0Var, t10)) != null) {
                recyclableViewStack.push(prepareToRecycleView);
            }
        }
    }

    public void onSurfaceStopped(int i10) {
        HashMap<Integer, Stack<T>> hashMap = this.mRecyclableViews;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(i10));
        }
    }

    /* access modifiers changed from: protected */
    public abstract T prepareToRecycleView(C3415h0 h0Var, T t10);

    @Deprecated
    public void receiveCommand(T t10, int i10, ReadableArray readableArray) {
    }

    /* access modifiers changed from: protected */
    public T recycleView(C3415h0 h0Var, T t10) {
        return t10;
    }

    public void setPadding(T t10, int i10, int i11, int i12, int i13) {
    }

    /* access modifiers changed from: protected */
    public void setupViewRecycling() {
        if (b.m()) {
            this.mRecyclableViews = new HashMap<>();
        }
    }

    /* access modifiers changed from: package-private */
    public void trimMemory() {
        if (this.mRecyclableViews != null) {
            this.mRecyclableViews = new HashMap<>();
        }
    }

    public abstract void updateExtraData(T t10, Object obj);

    public void updateProperties(T t10, W w10) {
        w0 delegate = getDelegate();
        if (delegate != null) {
            x0.h(delegate, t10, w10);
        } else {
            x0.g(this, t10, w10);
        }
        onAfterUpdateTransaction(t10);
    }

    public Object updateState(T t10, W w10, C3413g0 g0Var) {
        return null;
    }

    public C createShadowNodeInstance(ReactApplicationContext reactApplicationContext) {
        return createShadowNodeInstance();
    }

    public long measure(Context context, com.facebook.react.common.mapbuffer.a aVar, com.facebook.react.common.mapbuffer.a aVar2, com.facebook.react.common.mapbuffer.a aVar3, float f10, p pVar, float f11, p pVar2, float[] fArr) {
        return 0;
    }

    public void receiveCommand(T t10, String str, ReadableArray readableArray) {
        w0 delegate = getDelegate();
        if (delegate != null) {
            delegate.b(t10, str, readableArray);
        }
    }

    public ViewManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
