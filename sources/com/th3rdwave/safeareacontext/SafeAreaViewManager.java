package com.th3rdwave.safeareacontext;

import com.facebook.react.uimanager.C3413g0;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.W;
import com.facebook.react.uimanager.w0;
import com.facebook.react.views.view.ReactViewManager;
import com.facebook.react.views.view.e;
import e8.C3500a;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Q7.a(name = "RNCSafeAreaView")
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 &2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001'B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010$\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0017\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/th3rdwave/safeareacontext/SafeAreaViewManager;", "Lcom/facebook/react/views/view/ReactViewManager;", "", "Lcom/th3rdwave/safeareacontext/k;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/w0;", "Lcom/facebook/react/views/view/e;", "getDelegate", "()Lcom/facebook/react/uimanager/w0;", "Lcom/facebook/react/uimanager/h0;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/h0;)Lcom/th3rdwave/safeareacontext/k;", "Lcom/th3rdwave/safeareacontext/p;", "createShadowNodeInstance", "()Lcom/th3rdwave/safeareacontext/p;", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "view", "mode", "Llf/M;", "setMode", "(Lcom/th3rdwave/safeareacontext/k;Ljava/lang/String;)V", "Lcom/facebook/react/bridge/ReadableMap;", "propList", "setEdges", "(Lcom/th3rdwave/safeareacontext/k;Lcom/facebook/react/bridge/ReadableMap;)V", "Lcom/facebook/react/uimanager/W;", "props", "Lcom/facebook/react/uimanager/g0;", "stateWrapper", "updateState", "(Lcom/facebook/react/views/view/e;Lcom/facebook/react/uimanager/W;Lcom/facebook/react/uimanager/g0;)Ljava/lang/Object;", "Companion", "a", "react-native-safe-area-context_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SafeAreaViewManager extends ReactViewManager {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    public static final String REACT_CLASS = "RNCSafeAreaView";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* access modifiers changed from: protected */
    public w0 getDelegate() {
        return null;
    }

    public String getName() {
        return REACT_CLASS;
    }

    public Class<p> getShadowNodeClass() {
        return p.class;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        if (r2 == null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        if (r3 == null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        if (r7 == null) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (r0 == null) goto L_0x0020;
     */
    @e8.C3500a(name = "edges")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setEdges(com.th3rdwave.safeareacontext.k r6, com.facebook.react.bridge.ReadableMap r7) {
        /*
            r5 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C6496s.h(r6, r0)
            if (r7 == 0) goto L_0x0075
            java.lang.String r0 = "top"
            java.lang.String r0 = r7.getString(r0)
            java.lang.String r1 = "toUpperCase(...)"
            if (r0 == 0) goto L_0x0020
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r2)
            kotlin.jvm.internal.C6496s.g(r0, r1)
            com.th3rdwave.safeareacontext.l r0 = com.th3rdwave.safeareacontext.l.valueOf(r0)
            if (r0 != 0) goto L_0x0022
        L_0x0020:
            com.th3rdwave.safeareacontext.l r0 = com.th3rdwave.safeareacontext.l.OFF
        L_0x0022:
            java.lang.String r2 = "right"
            java.lang.String r2 = r7.getString(r2)
            if (r2 == 0) goto L_0x0039
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toUpperCase(r3)
            kotlin.jvm.internal.C6496s.g(r2, r1)
            com.th3rdwave.safeareacontext.l r2 = com.th3rdwave.safeareacontext.l.valueOf(r2)
            if (r2 != 0) goto L_0x003b
        L_0x0039:
            com.th3rdwave.safeareacontext.l r2 = com.th3rdwave.safeareacontext.l.OFF
        L_0x003b:
            java.lang.String r3 = "bottom"
            java.lang.String r3 = r7.getString(r3)
            if (r3 == 0) goto L_0x0052
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toUpperCase(r4)
            kotlin.jvm.internal.C6496s.g(r3, r1)
            com.th3rdwave.safeareacontext.l r3 = com.th3rdwave.safeareacontext.l.valueOf(r3)
            if (r3 != 0) goto L_0x0054
        L_0x0052:
            com.th3rdwave.safeareacontext.l r3 = com.th3rdwave.safeareacontext.l.OFF
        L_0x0054:
            java.lang.String r4 = "left"
            java.lang.String r7 = r7.getString(r4)
            if (r7 == 0) goto L_0x006b
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r7 = r7.toUpperCase(r4)
            kotlin.jvm.internal.C6496s.g(r7, r1)
            com.th3rdwave.safeareacontext.l r7 = com.th3rdwave.safeareacontext.l.valueOf(r7)
            if (r7 != 0) goto L_0x006d
        L_0x006b:
            com.th3rdwave.safeareacontext.l r7 = com.th3rdwave.safeareacontext.l.OFF
        L_0x006d:
            com.th3rdwave.safeareacontext.m r1 = new com.th3rdwave.safeareacontext.m
            r1.<init>(r0, r2, r3, r7)
            r6.setEdges(r1)
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.th3rdwave.safeareacontext.SafeAreaViewManager.setEdges(com.th3rdwave.safeareacontext.k, com.facebook.react.bridge.ReadableMap):void");
    }

    @C3500a(name = "mode")
    public void setMode(k kVar, String str) {
        C6496s.h(kVar, "view");
        if (C6496s.c(str, "padding")) {
            kVar.setMode(o.PADDING);
        } else if (C6496s.c(str, "margin")) {
            kVar.setMode(o.MARGIN);
        }
    }

    public Object updateState(e eVar, W w10, C3413g0 g0Var) {
        C6496s.h(eVar, "view");
        ((k) eVar).setStateWrapper(g0Var);
        return null;
    }

    public p createShadowNodeInstance() {
        return new p();
    }

    public k createViewInstance(C3415h0 h0Var) {
        C6496s.h(h0Var, "context");
        return new k(h0Var);
    }
}
