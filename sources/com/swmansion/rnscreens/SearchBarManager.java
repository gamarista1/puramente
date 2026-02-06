package com.swmansion.rnscreens;

import C7.d;
import android.util.Log;
import android.view.View;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.w0;
import e8.C3500a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m8.M;
import m8.N;

@Q7.a(name = "RNSSearchBar")
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0007\u0018\u0000 C2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001DB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010 \u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u001aH\u0017¢\u0006\u0004\b#\u0010$J!\u0010&\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b&\u0010\u0019J!\u0010(\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b(\u0010\u0019J!\u0010)\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0004\b)\u0010!J!\u0010*\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0004\b*\u0010!J!\u0010+\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0004\b+\u0010!J\u001f\u0010-\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u001aH\u0017¢\u0006\u0004\b-\u0010$J\u001d\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020/\u0018\u00010.H\u0016¢\u0006\u0004\b0\u00101J\u0019\u00102\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b2\u0010\u0016J\u0019\u00103\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b3\u0010\u0016J\u0019\u00104\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b4\u0010\u0016J!\u00106\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u00105\u001a\u00020\u001aH\u0016¢\u0006\u0004\b6\u0010$J#\u00108\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u00107\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b8\u0010\u0019J\u0019\u00109\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b9\u0010\u0016J!\u0010:\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b:\u0010\u0019J!\u0010<\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010;\u001a\u00020\u001aH\u0016¢\u0006\u0004\b<\u0010$J!\u0010=\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010;\u001a\u00020\u001aH\u0016¢\u0006\u0004\b=\u0010$J!\u0010>\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010;\u001a\u00020\u001aH\u0016¢\u0006\u0004\b>\u0010$J#\u0010?\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010;\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b?\u0010\u0019J#\u0010@\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010;\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b@\u0010!R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lcom/swmansion/rnscreens/SearchBarManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/X;", "Lm8/N;", "<init>", "()V", "", "propName", "Llf/M;", "logNotAvailable", "(Ljava/lang/String;)V", "Lcom/facebook/react/uimanager/w0;", "getDelegate", "()Lcom/facebook/react/uimanager/w0;", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/h0;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/h0;)Lcom/swmansion/rnscreens/X;", "view", "onAfterUpdateTransaction", "(Lcom/swmansion/rnscreens/X;)V", "autoCapitalize", "setAutoCapitalize", "(Lcom/swmansion/rnscreens/X;Ljava/lang/String;)V", "", "autoFocus", "setAutoFocus", "(Lcom/swmansion/rnscreens/X;Ljava/lang/Boolean;)V", "", "color", "setBarTintColor", "(Lcom/swmansion/rnscreens/X;Ljava/lang/Integer;)V", "disableBackButtonOverride", "setDisableBackButtonOverride", "(Lcom/swmansion/rnscreens/X;Z)V", "inputType", "setInputType", "placeholder", "setPlaceholder", "setTextColor", "setHeaderIconColor", "setHintTextColor", "shouldShowHintSearchIcon", "setShouldShowHintSearchIcon", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "blur", "focus", "clearText", "flag", "toggleCancelButton", "text", "setText", "cancelSearch", "setPlacement", "value", "setHideWhenScrolling", "setObscureBackground", "setHideNavigationBar", "setCancelButtonText", "setTintColor", "delegate", "Lcom/facebook/react/uimanager/w0;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SearchBarManager extends ViewGroupManager<X> implements N {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    public static final String REACT_CLASS = "RNSSearchBar";
    private final w0 delegate = new M(this);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final void logNotAvailable(String str) {
        Log.w("[RNScreens]", str + " prop is not available on Android");
    }

    /* access modifiers changed from: protected */
    public w0 getDelegate() {
        return this.delegate;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return d.i("topSearchBlur", d.d("registrationName", "onSearchBlur"), "topChangeText", d.d("registrationName", "onChangeText"), "topClose", d.d("registrationName", "onClose"), "topSearchFocus", d.d("registrationName", "onSearchFocus"), "topOpen", d.d("registrationName", "onOpen"), "topSearchButtonPress", d.d("registrationName", "onSearchButtonPress"));
    }

    public String getName() {
        return REACT_CLASS;
    }

    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @C3500a(name = "autoFocus")
    public final void setAutoFocus(X x10, Boolean bool) {
        boolean z10;
        C6496s.h(x10, "view");
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            z10 = false;
        }
        x10.setAutoFocus(z10);
    }

    public void blur(X x10) {
        if (x10 != null) {
            x10.r();
        }
    }

    public void cancelSearch(X x10) {
        if (x10 != null) {
            x10.v();
        }
    }

    public void clearText(X x10) {
        if (x10 != null) {
            x10.s();
        }
    }

    /* access modifiers changed from: protected */
    public X createViewInstance(C3415h0 h0Var) {
        C6496s.h(h0Var, "context");
        return new X(h0Var);
    }

    public void focus(X x10) {
        if (x10 != null) {
            x10.v();
        }
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(X x10) {
        C6496s.h(x10, "view");
        super.onAfterUpdateTransaction(x10);
        x10.C();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        if (r3.equals("none") != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        throw new com.facebook.react.bridge.JSApplicationIllegalArgumentException("Forbidden auto capitalize value passed");
     */
    @e8.C3500a(name = "autoCapitalize")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setAutoCapitalize(com.swmansion.rnscreens.X r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C6496s.h(r2, r0)
            if (r3 == 0) goto L_0x0041
            int r0 = r3.hashCode()
            switch(r0) {
                case 3387192: goto L_0x0030;
                case 113318569: goto L_0x0025;
                case 490141296: goto L_0x001a;
                case 1245424234: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0039
        L_0x000f:
            java.lang.String r0 = "characters"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0039
            com.swmansion.rnscreens.X$a r3 = com.swmansion.rnscreens.X.a.CHARACTERS
            goto L_0x0043
        L_0x001a:
            java.lang.String r0 = "sentences"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0039
            com.swmansion.rnscreens.X$a r3 = com.swmansion.rnscreens.X.a.SENTENCES
            goto L_0x0043
        L_0x0025:
            java.lang.String r0 = "words"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0039
            com.swmansion.rnscreens.X$a r3 = com.swmansion.rnscreens.X.a.WORDS
            goto L_0x0043
        L_0x0030:
            java.lang.String r0 = "none"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0039
            goto L_0x0041
        L_0x0039:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r2 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.String r3 = "Forbidden auto capitalize value passed"
            r2.<init>(r3)
            throw r2
        L_0x0041:
            com.swmansion.rnscreens.X$a r3 = com.swmansion.rnscreens.X.a.NONE
        L_0x0043:
            r2.setAutoCapitalize(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.SearchBarManager.setAutoCapitalize(com.swmansion.rnscreens.X, java.lang.String):void");
    }

    @C3500a(customType = "Color", name = "barTintColor")
    public void setBarTintColor(X x10, Integer num) {
        C6496s.h(x10, "view");
        x10.setTintColor(num);
    }

    public void setCancelButtonText(X x10, String str) {
        logNotAvailable("cancelButtonText");
    }

    @C3500a(name = "disableBackButtonOverride")
    public void setDisableBackButtonOverride(X x10, boolean z10) {
        C6496s.h(x10, "view");
        boolean z11 = true;
        if (z10) {
            z11 = false;
        }
        x10.setShouldOverrideBackButton(z11);
    }

    @C3500a(customType = "Color", name = "headerIconColor")
    public void setHeaderIconColor(X x10, Integer num) {
        C6496s.h(x10, "view");
        x10.setHeaderIconColor(num);
    }

    public void setHideNavigationBar(X x10, boolean z10) {
        logNotAvailable("hideNavigationBar");
    }

    public void setHideWhenScrolling(X x10, boolean z10) {
        logNotAvailable("hideWhenScrolling");
    }

    @C3500a(customType = "Color", name = "hintTextColor")
    public void setHintTextColor(X x10, Integer num) {
        C6496s.h(x10, "view");
        x10.setHintTextColor(num);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r3.equals(io.intercom.android.sdk.models.AttributeType.TEXT) != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        throw new com.facebook.react.bridge.JSApplicationIllegalArgumentException("Forbidden input type value");
     */
    @e8.C3500a(name = "inputType")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setInputType(com.swmansion.rnscreens.X r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C6496s.h(r2, r0)
            if (r3 == 0) goto L_0x0041
            int r0 = r3.hashCode()
            switch(r0) {
                case -1034364087: goto L_0x002e;
                case 3556653: goto L_0x0025;
                case 96619420: goto L_0x001a;
                case 106642798: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0039
        L_0x000f:
            java.lang.String r0 = "phone"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0039
            com.swmansion.rnscreens.X$b r3 = com.swmansion.rnscreens.X.b.f59765b
            goto L_0x0043
        L_0x001a:
            java.lang.String r0 = "email"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0039
            com.swmansion.rnscreens.X$b r3 = com.swmansion.rnscreens.X.b.f59767d
            goto L_0x0043
        L_0x0025:
            java.lang.String r0 = "text"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0039
            goto L_0x0041
        L_0x002e:
            java.lang.String r0 = "number"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0039
            com.swmansion.rnscreens.X$b r3 = com.swmansion.rnscreens.X.b.f59766c
            goto L_0x0043
        L_0x0039:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r2 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.String r3 = "Forbidden input type value"
            r2.<init>(r3)
            throw r2
        L_0x0041:
            com.swmansion.rnscreens.X$b r3 = com.swmansion.rnscreens.X.b.f59764a
        L_0x0043:
            r2.setInputType(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.SearchBarManager.setInputType(com.swmansion.rnscreens.X, java.lang.String):void");
    }

    public void setObscureBackground(X x10, boolean z10) {
        logNotAvailable("hideNavigationBar");
    }

    @C3500a(name = "placeholder")
    public void setPlaceholder(X x10, String str) {
        C6496s.h(x10, "view");
        if (str != null) {
            x10.setPlaceholder(str);
        }
    }

    public void setPlacement(X x10, String str) {
        C6496s.h(x10, "view");
        logNotAvailable("setPlacement");
    }

    @C3500a(name = "shouldShowHintSearchIcon")
    public void setShouldShowHintSearchIcon(X x10, boolean z10) {
        C6496s.h(x10, "view");
        x10.setShouldShowHintSearchIcon(z10);
    }

    public void setText(X x10, String str) {
        if (x10 != null) {
            x10.x(str);
        }
    }

    @C3500a(customType = "Color", name = "textColor")
    public void setTextColor(X x10, Integer num) {
        C6496s.h(x10, "view");
        x10.setTextColor(num);
    }

    public void setTintColor(X x10, Integer num) {
        logNotAvailable("tintColor");
    }

    public void toggleCancelButton(X x10, boolean z10) {
        if (x10 != null) {
            x10.A(z10);
        }
    }
}
