package com.facebook.react.views.view;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.C3400a;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.C3430x;
import com.facebook.react.uimanager.C3431y;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.H;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.n0;
import e8.C3500a;
import e8.C3501b;
import f8.C3519a;
import io.intercom.android.sdk.models.carousel.BlockAlignment;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import j8.C3643a;
import j8.d;
import j8.f;
import j8.m;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import lf.C6521e;
import mf.O;

@Q7.a(name = "RCTView")
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b,\n\u0002\u0010%\n\u0002\b\t\b\u0017\u0018\u0000 _2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001`B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00020\b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u001c\u0010\u001aJ!\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b\u001e\u0010\u0010J\u001f\u0010 \u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\bH\u0017¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\bH\u0017¢\u0006\u0004\b\"\u0010!J\u001f\u0010#\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\bH\u0017¢\u0006\u0004\b#\u0010!J\u001f\u0010$\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\bH\u0017¢\u0006\u0004\b$\u0010!J\u001f\u0010%\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\bH\u0017¢\u0006\u0004\b%\u0010!J'\u0010)\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\b2\u0006\u0010(\u001a\u00020'H\u0017¢\u0006\u0004\b)\u0010*J'\u0010)\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\b2\u0006\u0010,\u001a\u00020+H\u0017¢\u0006\u0004\b)\u0010-J!\u0010/\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b/\u00100J\u001f\u00102\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u00101\u001a\u00020'H\u0017¢\u0006\u0004\b2\u00103J!\u00105\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\b\u00104\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b5\u00100J!\u00107\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\b\u00106\u001a\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b7\u00108J!\u0010:\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\b\u00109\u001a\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b:\u00108J\u001f\u0010<\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u0017H\u0017¢\u0006\u0004\b<\u0010\u001aJ'\u0010>\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\b2\u0006\u0010=\u001a\u00020+H\u0017¢\u0006\u0004\b>\u0010-J)\u0010@\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\b2\b\u0010?\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b@\u0010AJ\u001f\u0010C\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\u0017H\u0017¢\u0006\u0004\bC\u0010\u001aJ\u001f\u0010E\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u0017H\u0017¢\u0006\u0004\bE\u0010\u001aJ\u001f\u0010G\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u0017H\u0017¢\u0006\u0004\bG\u0010\u001aJ!\u0010I\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010H\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\bI\u00100J\u001f\u0010K\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010J\u001a\u00020\u0006H\u0017¢\u0006\u0004\bK\u00100J\u001f\u0010M\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010L\u001a\u00020+H\u0016¢\u0006\u0004\bM\u0010NJ+\u0010Q\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010O\u001a\u0004\u0018\u00010\f2\b\u0010P\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u0006H\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010V\u001a\u00020\u00022\u0006\u0010U\u001a\u00020\u0012H\u0016¢\u0006\u0004\bV\u0010WJ\u001b\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0XH\u0016¢\u0006\u0004\bY\u0010ZJ)\u0010\\\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b\\\u0010]J)\u0010\\\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\\\u0010^¨\u0006a"}, d2 = {"Lcom/facebook/react/views/view/ReactViewManager;", "Lcom/facebook/react/views/view/ReactClippingViewManager;", "Lcom/facebook/react/views/view/e;", "<init>", "()V", "Lcom/facebook/react/bridge/ReadableMap;", "", "key", "", "px", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)I", "root", "Lcom/facebook/react/bridge/ReadableArray;", "args", "Llf/M;", "handleSetPressed", "(Lcom/facebook/react/views/view/e;Lcom/facebook/react/bridge/ReadableArray;)V", "handleHotspotUpdate", "Lcom/facebook/react/uimanager/h0;", "reactContext", "view", "prepareToRecycleView", "(Lcom/facebook/react/uimanager/h0;Lcom/facebook/react/views/view/e;)Lcom/facebook/react/views/view/e;", "", "accessible", "setAccessible", "(Lcom/facebook/react/views/view/e;Z)V", "hasTVPreferredFocus", "setTVPreferredFocus", "backgroundImage", "setBackgroundImage", "viewId", "nextFocusDown", "(Lcom/facebook/react/views/view/e;I)V", "nextFocusForward", "nextFocusLeft", "nextFocusRight", "nextFocusUp", "index", "Lcom/facebook/react/bridge/Dynamic;", "rawBorderRadius", "setBorderRadius", "(Lcom/facebook/react/views/view/e;ILcom/facebook/react/bridge/Dynamic;)V", "", "borderRadius", "(Lcom/facebook/react/views/view/e;IF)V", "borderStyle", "setBorderStyle", "(Lcom/facebook/react/views/view/e;Ljava/lang/String;)V", "hitSlop", "setHitSlop", "(Lcom/facebook/react/views/view/e;Lcom/facebook/react/bridge/Dynamic;)V", "pointerEventsStr", "setPointerEvents", "background", "setNativeBackground", "(Lcom/facebook/react/views/view/e;Lcom/facebook/react/bridge/ReadableMap;)V", "foreground", "setNativeForeground", "needsOffscreenAlphaCompositing", "setNeedsOffscreenAlphaCompositing", "width", "setBorderWidth", "color", "setBorderColor", "(Lcom/facebook/react/views/view/e;ILjava/lang/Integer;)V", "collapsable", "setCollapsable", "collapsableChildren", "setCollapsableChildren", "focusable", "setFocusable", "overflow", "setOverflow", "backfaceVisibility", "setBackfaceVisibility", "opacity", "setOpacity", "(Lcom/facebook/react/views/view/e;F)V", "transforms", "transformOrigin", "setTransformProperty", "(Lcom/facebook/react/views/view/e;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;)V", "getName", "()Ljava/lang/String;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/h0;)Lcom/facebook/react/views/view/e;", "", "getCommandsMap", "()Ljava/util/Map;", "commandId", "receiveCommand", "(Lcom/facebook/react/views/view/e;ILcom/facebook/react/bridge/ReadableArray;)V", "(Lcom/facebook/react/views/view/e;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ReactViewManager extends ReactClippingViewManager<e> {
    private static final int CMD_HOTSPOT_UPDATE = 1;
    private static final int CMD_SET_PRESSED = 2;
    public static final a Companion = new a((DefaultConstructorMarker) null);
    private static final String HOTSPOT_UPDATE_KEY = "hotspotUpdate";
    public static final String REACT_CLASS = "RCTView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3, 4, 5, 9, 10, 11};

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f42331a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.facebook.react.bridge.ReadableType[] r0 = com.facebook.react.bridge.ReadableType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Map     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Number     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Null     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f42331a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.ReactViewManager.b.<clinit>():void");
        }
    }

    public ReactViewManager() {
        setupViewRecycling();
    }

    private final void handleHotspotUpdate(e eVar, ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() != 2) {
            throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'updateHotspot' command");
        }
        G g10 = G.f41415a;
        eVar.drawableHotspotChanged(g10.a(readableArray.getDouble(0)), g10.a(readableArray.getDouble(1)));
    }

    private final void handleSetPressed(e eVar, ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() != 1) {
            throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'setPressed' command");
        }
        eVar.setPressed(readableArray.getBoolean(0));
    }

    private final int px(ReadableMap readableMap, String str) {
        if (readableMap.hasKey(str)) {
            return (int) G.f41415a.a(readableMap.getDouble(str));
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public static final void setFocusable$lambda$2(e eVar, View view) {
        Context context = eVar.getContext();
        C6496s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher c10 = n0.c((ReactContext) context, eVar.getId());
        if (c10 != null) {
            c10.h(new h(n0.e(eVar.getContext()), eVar.getId()));
        }
    }

    public Map<String, Integer> getCommandsMap() {
        return O.n(C6502A.a(HOTSPOT_UPDATE_KEY, 1), C6502A.a("setPressed", 2));
    }

    public String getName() {
        return REACT_CLASS;
    }

    @C3500a(defaultInt = -1, name = "nextFocusDown")
    public void nextFocusDown(e eVar, int i10) {
        C6496s.h(eVar, "view");
        eVar.setNextFocusDownId(i10);
    }

    @C3500a(defaultInt = -1, name = "nextFocusForward")
    public void nextFocusForward(e eVar, int i10) {
        C6496s.h(eVar, "view");
        eVar.setNextFocusForwardId(i10);
    }

    @C3500a(defaultInt = -1, name = "nextFocusLeft")
    public void nextFocusLeft(e eVar, int i10) {
        C6496s.h(eVar, "view");
        eVar.setNextFocusLeftId(i10);
    }

    @C3500a(defaultInt = -1, name = "nextFocusRight")
    public void nextFocusRight(e eVar, int i10) {
        C6496s.h(eVar, "view");
        eVar.setNextFocusRightId(i10);
    }

    @C3500a(defaultInt = -1, name = "nextFocusUp")
    public void nextFocusUp(e eVar, int i10) {
        C6496s.h(eVar, "view");
        eVar.setNextFocusUpId(i10);
    }

    @C3500a(name = "accessible")
    public void setAccessible(e eVar, boolean z10) {
        C6496s.h(eVar, "view");
        eVar.setFocusable(z10);
    }

    @C3500a(name = "backfaceVisibility")
    public void setBackfaceVisibility(e eVar, String str) {
        C6496s.h(eVar, "view");
        C6496s.h(str, "backfaceVisibility");
        eVar.setBackfaceVisibility(str);
    }

    @C3500a(customType = "BackgroundImage", name = "experimental_backgroundImage")
    public void setBackgroundImage(e eVar, ReadableArray readableArray) {
        C6496s.h(eVar, "view");
        if (C3519a.c(eVar) != 2) {
            return;
        }
        if (readableArray == null || readableArray.size() <= 0) {
            C3400a.p(eVar, (List) null);
            return;
        }
        ArrayList arrayList = new ArrayList(readableArray.size());
        int size = readableArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ReadableMap map = readableArray.getMap(i10);
            Context context = eVar.getContext();
            C6496s.g(context, "getContext(...)");
            arrayList.add(new C3643a(map, context));
        }
        C3400a.p(eVar, arrayList);
    }

    @C3501b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor", "borderStartColor", "borderEndColor", "borderBlockColor", "borderBlockEndColor", "borderBlockStartColor"})
    public void setBorderColor(e eVar, int i10, Integer num) {
        C6496s.h(eVar, "view");
        C3400a.q(eVar, m.f44917a.a(SPACING_TYPES[i10]), num);
    }

    @C3501b(names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius", "borderTopStartRadius", "borderTopEndRadius", "borderBottomStartRadius", "borderBottomEndRadius", "borderEndEndRadius", "borderEndStartRadius", "borderStartEndRadius", "borderStartStartRadius"})
    public void setBorderRadius(e eVar, int i10, Dynamic dynamic) {
        C6496s.h(eVar, "view");
        C6496s.h(dynamic, "rawBorderRadius");
        C3430x a10 = C3430x.f41831c.a(dynamic);
        if (!(C3519a.c(eVar) == 2 || a10 == null || a10.a() != C3431y.PERCENT)) {
            a10 = null;
        }
        C3400a.r(eVar, d.values()[i10], a10);
    }

    @C3500a(name = "borderStyle")
    public void setBorderStyle(e eVar, String str) {
        f fVar;
        C6496s.h(eVar, "view");
        if (str == null) {
            fVar = null;
        } else {
            fVar = f.f44875a.a(str);
        }
        C3400a.s(eVar, fVar);
    }

    @C3501b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth", "borderStartWidth", "borderEndWidth"})
    public void setBorderWidth(e eVar, int i10, float f10) {
        C6496s.h(eVar, "view");
        C3400a.t(eVar, m.values()[i10], Float.valueOf(f10));
    }

    @C3500a(name = "collapsable")
    public void setCollapsable(e eVar, boolean z10) {
        C6496s.h(eVar, "view");
    }

    @C3500a(name = "collapsableChildren")
    public void setCollapsableChildren(e eVar, boolean z10) {
        C6496s.h(eVar, "view");
    }

    @C3500a(name = "focusable")
    public void setFocusable(e eVar, boolean z10) {
        C6496s.h(eVar, "view");
        if (z10) {
            eVar.setOnClickListener(new g(eVar));
            eVar.setFocusable(true);
            return;
        }
        eVar.setOnClickListener((View.OnClickListener) null);
        eVar.setClickable(false);
    }

    @C3500a(name = "hitSlop")
    public void setHitSlop(e eVar, Dynamic dynamic) {
        C6496s.h(eVar, "view");
        C6496s.h(dynamic, "hitSlop");
        int i10 = b.f42331a[dynamic.getType().ordinal()];
        if (i10 == 1) {
            ReadableMap asMap = dynamic.asMap();
            eVar.setHitSlopRect(new Rect(px(asMap, BlockAlignment.LEFT), px(asMap, VerticalAlignment.TOP), px(asMap, BlockAlignment.RIGHT), px(asMap, VerticalAlignment.BOTTOM)));
        } else if (i10 == 2) {
            int a10 = (int) G.f41415a.a(dynamic.asDouble());
            eVar.setHitSlopRect(new Rect(a10, a10, a10, a10));
        } else if (i10 != 3) {
            ReadableType type = dynamic.getType();
            U5.a.I("ReactNative", "Invalid type for 'hitSlop' value " + type);
            eVar.setHitSlopRect((Rect) null);
        } else {
            eVar.setHitSlopRect((Rect) null);
        }
    }

    @C3500a(name = "nativeBackgroundAndroid")
    public void setNativeBackground(e eVar, ReadableMap readableMap) {
        Drawable drawable;
        C6496s.h(eVar, "view");
        if (readableMap != null) {
            drawable = d.a(eVar.getContext(), readableMap);
        } else {
            drawable = null;
        }
        C3400a.w(eVar, drawable);
    }

    @C3500a(name = "nativeForegroundAndroid")
    public void setNativeForeground(e eVar, ReadableMap readableMap) {
        Drawable drawable;
        C6496s.h(eVar, "view");
        if (readableMap != null) {
            drawable = d.a(eVar.getContext(), readableMap);
        } else {
            drawable = null;
        }
        eVar.setForeground(drawable);
    }

    @C3500a(name = "needsOffscreenAlphaCompositing")
    public void setNeedsOffscreenAlphaCompositing(e eVar, boolean z10) {
        C6496s.h(eVar, "view");
        eVar.setNeedsOffscreenAlphaCompositing(z10);
    }

    @C3500a(name = "overflow")
    public void setOverflow(e eVar, String str) {
        C6496s.h(eVar, "view");
        eVar.setOverflow(str);
    }

    @C3500a(name = "pointerEvents")
    public void setPointerEvents(e eVar, String str) {
        C6496s.h(eVar, "view");
        eVar.setPointerEvents(H.f41416a.c(str));
    }

    @C3500a(name = "hasTVPreferredFocus")
    public void setTVPreferredFocus(e eVar, boolean z10) {
        C6496s.h(eVar, "view");
        if (z10) {
            eVar.setFocusable(true);
            eVar.setFocusableInTouchMode(true);
            eVar.requestFocus();
        }
    }

    public e createViewInstance(C3415h0 h0Var) {
        C6496s.h(h0Var, "context");
        return new e(h0Var);
    }

    /* access modifiers changed from: protected */
    public e prepareToRecycleView(C3415h0 h0Var, e eVar) {
        C6496s.h(h0Var, "reactContext");
        C6496s.h(eVar, "view");
        e eVar2 = (e) super.prepareToRecycleView(h0Var, eVar);
        if (eVar2 != null) {
            eVar2.recycleView();
        }
        return eVar;
    }

    public void setOpacity(e eVar, float f10) {
        C6496s.h(eVar, "view");
        eVar.setOpacityIfPossible(f10);
    }

    /* access modifiers changed from: protected */
    public void setTransformProperty(e eVar, ReadableArray readableArray, ReadableArray readableArray2) {
        C6496s.h(eVar, "view");
        super.setTransformProperty(eVar, readableArray, readableArray2);
        eVar.setBackfaceVisibilityDependantOpacity();
    }

    @C6521e
    public void receiveCommand(e eVar, int i10, ReadableArray readableArray) {
        C6496s.h(eVar, "root");
        if (i10 == 1) {
            handleHotspotUpdate(eVar, readableArray);
        } else if (i10 == 2) {
            handleSetPressed(eVar, readableArray);
        }
    }

    public void receiveCommand(e eVar, String str, ReadableArray readableArray) {
        C6496s.h(eVar, "root");
        C6496s.h(str, "commandId");
        if (C6496s.c(str, HOTSPOT_UPDATE_KEY)) {
            handleHotspotUpdate(eVar, readableArray);
        } else if (C6496s.c(str, "setPressed")) {
            handleSetPressed(eVar, readableArray);
        }
    }

    @C6521e
    public void setBorderRadius(e eVar, int i10, float f10) {
        C6496s.h(eVar, "view");
        setBorderRadius(eVar, i10, (Dynamic) new DynamicFromObject(Float.valueOf(f10)));
    }
}
