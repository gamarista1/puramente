package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m8.J;
import m8.K;

@Q7.a(name = "RNSScreenStackHeaderSubview")
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0018B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/swmansion/rnscreens/ScreenStackHeaderSubviewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/J;", "Lm8/K;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/h0;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/h0;)Lcom/swmansion/rnscreens/J;", "view", "type", "Llf/M;", "setType", "(Lcom/swmansion/rnscreens/J;Ljava/lang/String;)V", "Lcom/facebook/react/uimanager/w0;", "getDelegate", "()Lcom/facebook/react/uimanager/w0;", "delegate", "Lcom/facebook/react/uimanager/w0;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScreenStackHeaderSubviewManager extends ViewGroupManager<J> implements K {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    public static final String REACT_CLASS = "RNSScreenStackHeaderSubview";
    private final w0 delegate = new J(this);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* access modifiers changed from: protected */
    public w0 getDelegate() {
        return this.delegate;
    }

    public String getName() {
        return REACT_CLASS;
    }

    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    /* access modifiers changed from: protected */
    public J createViewInstance(C3415h0 h0Var) {
        C6496s.h(h0Var, "context");
        return new J(h0Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        r3.setType(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        return;
     */
    @e8.C3500a(name = "type")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setType(com.swmansion.rnscreens.J r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C6496s.h(r3, r0)
            if (r4 == 0) goto L_0x0049
            int r0 = r4.hashCode()
            switch(r0) {
                case -1364013995: goto L_0x003b;
                case 3015911: goto L_0x0030;
                case 3317767: goto L_0x0025;
                case 108511772: goto L_0x001a;
                case 1778179403: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0049
        L_0x000f:
            java.lang.String r0 = "searchBar"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0049
            com.swmansion.rnscreens.J$a r4 = com.swmansion.rnscreens.J.a.SEARCH_BAR
            goto L_0x0045
        L_0x001a:
            java.lang.String r0 = "right"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0049
            com.swmansion.rnscreens.J$a r4 = com.swmansion.rnscreens.J.a.RIGHT
            goto L_0x0045
        L_0x0025:
            java.lang.String r0 = "left"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0049
            com.swmansion.rnscreens.J$a r4 = com.swmansion.rnscreens.J.a.LEFT
            goto L_0x0045
        L_0x0030:
            java.lang.String r0 = "back"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0049
            com.swmansion.rnscreens.J$a r4 = com.swmansion.rnscreens.J.a.BACK
            goto L_0x0045
        L_0x003b:
            java.lang.String r0 = "center"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0049
            com.swmansion.rnscreens.J$a r4 = com.swmansion.rnscreens.J.a.CENTER
        L_0x0045:
            r3.setType(r4)
            return
        L_0x0049:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r3 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown type "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenStackHeaderSubviewManager.setType(com.swmansion.rnscreens.J, java.lang.String):void");
    }
}
