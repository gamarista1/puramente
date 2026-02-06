package com.facebook.react.views.drawer;

import O1.a;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.w0;
import e8.C3500a;
import io.intercom.android.sdk.models.carousel.BlockAlignment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import lf.C6521e;
import m8.C3793a;
import m8.C3795b;
import mf.O;
import p8.C3938a;
import p8.C3939b;
import p8.C3940c;
import p8.C3941d;

@Q7.a(name = "AndroidDrawerLayout")
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 E2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002FGB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u000bJ\u001f\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0016\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001dJ!\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\u001f\u0010\u000bJ\u0017\u0010 \u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010!J!\u0010#\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b#\u0010\u000bJ!\u0010%\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010$H\u0017¢\u0006\u0004\b%\u0010&J!\u0010'\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010$H\u0017¢\u0006\u0004\b'\u0010&J\u001f\u0010)\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0019H\u0016¢\u0006\u0004\b)\u0010\u001cJ\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u001b\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020$0-H\u0016¢\u0006\u0004\b.\u0010/J)\u00104\u001a\u00020\t2\u0006\u00100\u001a\u00020\u00022\u0006\u00101\u001a\u00020$2\b\u00103\u001a\u0004\u0018\u000102H\u0017¢\u0006\u0004\b4\u00105J)\u00104\u001a\u00020\t2\u0006\u00100\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u00072\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b4\u00106J\u001b\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002070-H\u0016¢\u0006\u0004\b8\u0010/J\u001b\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002070-H\u0016¢\u0006\u0004\b9\u0010/J'\u0010>\u001a\u00020\t2\u0006\u0010:\u001a\u00020\u00022\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020$H\u0016¢\u0006\u0004\b>\u0010?J\u0015\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020@H\u0016¢\u0006\u0004\bA\u0010BR\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00020@8\u0002X\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006H"}, d2 = {"Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/facebook/react/views/drawer/a;", "Lm8/b;", "<init>", "()V", "view", "", "drawerPosition", "Llf/M;", "setDrawerPositionInternal", "(Lcom/facebook/react/views/drawer/a;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/h0;", "reactContext", "addEventEmitters", "(Lcom/facebook/react/uimanager/h0;Lcom/facebook/react/views/drawer/a;)V", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/h0;)Lcom/facebook/react/views/drawer/a;", "value", "setDrawerPosition", "Lcom/facebook/react/bridge/Dynamic;", "(Lcom/facebook/react/views/drawer/a;Lcom/facebook/react/bridge/Dynamic;)V", "", "width", "setDrawerWidth", "(Lcom/facebook/react/views/drawer/a;F)V", "(Lcom/facebook/react/views/drawer/a;Ljava/lang/Float;)V", "drawerLockMode", "setDrawerLockMode", "openDrawer", "(Lcom/facebook/react/views/drawer/a;)V", "closeDrawer", "setKeyboardDismissMode", "", "setDrawerBackgroundColor", "(Lcom/facebook/react/views/drawer/a;Ljava/lang/Integer;)V", "setStatusBarBackgroundColor", "elevation", "setElevation", "", "needsCustomLayoutForChildren", "()Z", "", "getCommandsMap", "()Ljava/util/Map;", "root", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", "receiveCommand", "(Lcom/facebook/react/views/drawer/a;ILcom/facebook/react/bridge/ReadableArray;)V", "(Lcom/facebook/react/views/drawer/a;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "", "getExportedViewConstants", "getExportedCustomDirectEventTypeConstants", "parent", "Landroid/view/View;", "child", "index", "addView", "(Lcom/facebook/react/views/drawer/a;Landroid/view/View;I)V", "Lcom/facebook/react/uimanager/w0;", "getDelegate", "()Lcom/facebook/react/uimanager/w0;", "delegate", "Lcom/facebook/react/uimanager/w0;", "Companion", "b", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReactDrawerLayoutManager extends ViewGroupManager<a> implements C3795b {
    public static final int CLOSE_DRAWER = 2;
    public static final String COMMAND_CLOSE_DRAWER = "closeDrawer";
    public static final String COMMAND_OPEN_DRAWER = "openDrawer";
    public static final a Companion = new a((DefaultConstructorMarker) null);
    private static final String DRAWER_POSITION = "DrawerPosition";
    private static final String DRAWER_POSITION_LEFT = "Left";
    private static final String DRAWER_POSITION_RIGHT = "Right";
    public static final int OPEN_DRAWER = 1;
    public static final String REACT_CLASS = "AndroidDrawerLayout";
    private final w0 delegate = new C3793a(this);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements a.e {

        /* renamed from: a  reason: collision with root package name */
        private final O1.a f41857a;

        /* renamed from: b  reason: collision with root package name */
        private final EventDispatcher f41858b;

        public b(O1.a aVar, EventDispatcher eventDispatcher) {
            C6496s.h(aVar, "drawerLayout");
            C6496s.h(eventDispatcher, "eventDispatcher");
            this.f41857a = aVar;
            this.f41858b = eventDispatcher;
        }

        public void a(View view) {
            C6496s.h(view, "view");
            this.f41858b.h(new C3939b(n0.f(this.f41857a), this.f41857a.getId()));
        }

        public void b(View view) {
            C6496s.h(view, "view");
            this.f41858b.h(new C3938a(n0.f(this.f41857a), this.f41857a.getId()));
        }

        public void c(int i10) {
            this.f41858b.h(new C3941d(n0.f(this.f41857a), this.f41857a.getId(), i10));
        }

        public void d(View view, float f10) {
            C6496s.h(view, "view");
            this.f41858b.h(new C3940c(n0.f(this.f41857a), this.f41857a.getId(), f10));
        }
    }

    private final void setDrawerPositionInternal(a aVar, String str) {
        if (C6496s.c(str, BlockAlignment.LEFT)) {
            aVar.setDrawerPosition$ReactAndroid_release(8388611);
        } else if (C6496s.c(str, BlockAlignment.RIGHT)) {
            aVar.setDrawerPosition$ReactAndroid_release(8388613);
        } else {
            U5.a.I("ReactNative", "drawerPosition must be 'left' or 'right', received" + str);
            aVar.setDrawerPosition$ReactAndroid_release(8388611);
        }
    }

    public Map<String, Integer> getCommandsMap() {
        return O.l(C6502A.a(COMMAND_OPEN_DRAWER, 1), C6502A.a(COMMAND_CLOSE_DRAWER, 2));
    }

    public w0 getDelegate() {
        return this.delegate;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new LinkedHashMap<>();
        }
        exportedCustomDirectEventTypeConstants.put("topDrawerSlide", O.f(C6502A.a("registrationName", "onDrawerSlide")));
        exportedCustomDirectEventTypeConstants.put("topDrawerOpen", O.f(C6502A.a("registrationName", "onDrawerOpen")));
        exportedCustomDirectEventTypeConstants.put("topDrawerClose", O.f(C6502A.a("registrationName", "onDrawerClose")));
        exportedCustomDirectEventTypeConstants.put("topDrawerStateChanged", O.f(C6502A.a("registrationName", "onDrawerStateChanged")));
        return exportedCustomDirectEventTypeConstants;
    }

    public Map<String, Object> getExportedViewConstants() {
        return O.f(C6502A.a(DRAWER_POSITION, O.l(C6502A.a(DRAWER_POSITION_LEFT, 8388611), C6502A.a(DRAWER_POSITION_RIGHT, 8388613))));
    }

    public String getName() {
        return REACT_CLASS;
    }

    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @C3500a(customType = "Color", name = "drawerBackgroundColor")
    public void setDrawerBackgroundColor(a aVar, Integer num) {
        C6496s.h(aVar, "view");
    }

    @C3500a(name = "keyboardDismissMode")
    public void setKeyboardDismissMode(a aVar, String str) {
        C6496s.h(aVar, "view");
    }

    @C3500a(customType = "Color", name = "statusBarBackgroundColor")
    public void setStatusBarBackgroundColor(a aVar, Integer num) {
        C6496s.h(aVar, "view");
    }

    /* access modifiers changed from: protected */
    public void addEventEmitters(C3415h0 h0Var, a aVar) {
        C6496s.h(h0Var, "reactContext");
        C6496s.h(aVar, "view");
        EventDispatcher c10 = n0.c(h0Var, aVar.getId());
        if (c10 != null) {
            aVar.a(new b(aVar, c10));
        }
    }

    public void closeDrawer(a aVar) {
        C6496s.h(aVar, "view");
        aVar.W();
    }

    /* access modifiers changed from: protected */
    public a createViewInstance(C3415h0 h0Var) {
        C6496s.h(h0Var, "context");
        return new a(h0Var);
    }

    public void openDrawer(a aVar) {
        C6496s.h(aVar, "view");
        aVar.X();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r5.equals("unlocked") != false) goto L_0x005a;
     */
    @e8.C3500a(name = "drawerLockMode")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setDrawerLockMode(com.facebook.react.views.drawer.a r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C6496s.h(r4, r0)
            r0 = 0
            if (r5 == 0) goto L_0x005a
            int r1 = r5.hashCode()
            r2 = -1292600945(0xffffffffb2f4798f, float:-2.8460617E-8)
            if (r1 == r2) goto L_0x0033
            r2 = -210949405(0xfffffffff36d2ae3, float:-1.8790347E31)
            if (r1 == r2) goto L_0x002a
            r2 = 168848173(0xa106b2d, float:6.953505E-33)
            if (r1 == r2) goto L_0x001c
            goto L_0x003b
        L_0x001c:
            java.lang.String r1 = "locked-open"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x0025
            goto L_0x003b
        L_0x0025:
            r5 = 2
            r4.setDrawerLockMode(r5)
            goto L_0x005d
        L_0x002a:
            java.lang.String r1 = "unlocked"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x003b
            goto L_0x005a
        L_0x0033:
            java.lang.String r1 = "locked-closed"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x0055
        L_0x003b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown drawerLockMode "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r1 = "ReactNative"
            U5.a.I(r1, r5)
            r4.setDrawerLockMode(r0)
            goto L_0x005d
        L_0x0055:
            r5 = 1
            r4.setDrawerLockMode(r5)
            goto L_0x005d
        L_0x005a:
            r4.setDrawerLockMode(r0)
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.drawer.ReactDrawerLayoutManager.setDrawerLockMode(com.facebook.react.views.drawer.a, java.lang.String):void");
    }

    public void setDrawerPosition(a aVar, String str) {
        C6496s.h(aVar, "view");
        if (str == null) {
            aVar.setDrawerPosition$ReactAndroid_release(8388611);
        } else {
            setDrawerPositionInternal(aVar, str);
        }
    }

    @C3500a(defaultFloat = Float.NaN, name = "drawerWidth")
    public final void setDrawerWidth(a aVar, float f10) {
        int i10;
        C6496s.h(aVar, "view");
        if (Float.isNaN(f10)) {
            i10 = -1;
        } else {
            i10 = Math.round(G.f41415a.b(f10));
        }
        aVar.setDrawerWidth$ReactAndroid_release(i10);
    }

    public void setElevation(a aVar, float f10) {
        C6496s.h(aVar, "view");
        aVar.setDrawerElevation(G.f41415a.b(f10));
    }

    public void addView(a aVar, View view, int i10) {
        C6496s.h(aVar, "parent");
        C6496s.h(view, "child");
        if (getChildCount(aVar) >= 2) {
            throw new JSApplicationIllegalArgumentException("The Drawer cannot have more than two children");
        } else if (i10 == 0 || i10 == 1) {
            aVar.addView(view, i10);
            aVar.Y();
        } else {
            throw new JSApplicationIllegalArgumentException("The only valid indices for drawer's child are 0 or 1. Got " + i10 + " instead.");
        }
    }

    @C6521e
    public void receiveCommand(a aVar, int i10, ReadableArray readableArray) {
        C6496s.h(aVar, "root");
        if (i10 == 1) {
            aVar.X();
        } else if (i10 == 2) {
            aVar.W();
        }
    }

    @C3500a(name = "drawerPosition")
    public final void setDrawerPosition(a aVar, Dynamic dynamic) {
        C6496s.h(aVar, "view");
        C6496s.h(dynamic, "drawerPosition");
        if (dynamic.isNull()) {
            aVar.setDrawerPosition$ReactAndroid_release(8388611);
        } else if (dynamic.getType() == ReadableType.Number) {
            int asInt = dynamic.asInt();
            if (8388611 == asInt || 8388613 == asInt) {
                aVar.setDrawerPosition$ReactAndroid_release(asInt);
                return;
            }
            U5.a.I("ReactNative", "Unknown drawerPosition " + asInt);
            aVar.setDrawerPosition$ReactAndroid_release(8388611);
        } else if (dynamic.getType() == ReadableType.String) {
            setDrawerPositionInternal(aVar, dynamic.asString());
        } else {
            U5.a.I("ReactNative", "drawerPosition must be a string or int");
            aVar.setDrawerPosition$ReactAndroid_release(8388611);
        }
    }

    public void receiveCommand(a aVar, String str, ReadableArray readableArray) {
        C6496s.h(aVar, "root");
        C6496s.h(str, "commandId");
        if (C6496s.c(str, COMMAND_OPEN_DRAWER)) {
            aVar.X();
        } else if (C6496s.c(str, COMMAND_CLOSE_DRAWER)) {
            aVar.W();
        }
    }

    public void setDrawerWidth(a aVar, Float f10) {
        int i10;
        C6496s.h(aVar, "view");
        if (f10 != null) {
            i10 = Math.round(G.f41415a.b(f10.floatValue()));
        } else {
            i10 = -1;
        }
        aVar.setDrawerWidth$ReactAndroid_release(i10);
    }
}
