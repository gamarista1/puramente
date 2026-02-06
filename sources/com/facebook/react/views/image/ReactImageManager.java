package com.facebook.react.views.image;

import android.graphics.PorterDuff;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C3400a;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.C3430x;
import com.facebook.react.uimanager.C3431y;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.views.image.b;
import e8.C3500a;
import e8.C3501b;
import j8.d;
import j8.m;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import lf.C6521e;
import mf.O;
import n6.b;

@Q7.a(name = "RCTImageView")
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u000b\b\u0007\u0018\u0000 S2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001TB=\b\u0007\u0012\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB-\b\u0017\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\t\u0010\rB7\b\u0017\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\t\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010 \u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b \u0010\u001fJ\u001f\u0010#\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b#\u0010$J!\u0010&\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b&\u0010'J!\u0010)\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b)\u0010'J!\u0010*\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b*\u0010'J!\u0010-\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010,\u001a\u0004\u0018\u00010+H\u0007¢\u0006\u0004\b-\u0010.J!\u00100\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010+H\u0007¢\u0006\u0004\b0\u0010.J\u001f\u00102\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u00101\u001a\u00020!H\u0007¢\u0006\u0004\b2\u0010$J'\u00105\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u00103\u001a\u00020+2\u0006\u00104\u001a\u00020!H\u0007¢\u0006\u0004\b5\u00106J!\u00108\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u00107\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b8\u0010'J!\u0010:\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u00109\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b:\u0010'J\u001f\u0010<\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010;\u001a\u00020!H\u0007¢\u0006\u0004\b<\u0010$J!\u0010>\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010=\u001a\u0004\u0018\u00010+H\u0007¢\u0006\u0004\b>\u0010.J\u001f\u0010@\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u0017H\u0007¢\u0006\u0004\b@\u0010\u001bJ\u001f\u0010B\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010A\u001a\u00020+H\u0007¢\u0006\u0004\bB\u0010CJ\u001f\u0010E\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u0017H\u0007¢\u0006\u0004\bE\u0010\u001bJ!\u0010H\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010G\u001a\u0004\u0018\u00010FH\u0007¢\u0006\u0004\bH\u0010IJ\u001b\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0JH\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0002H\u0014¢\u0006\u0004\bM\u0010NR&\u0010\u0004\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010OR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010PR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010QR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010R¨\u0006U"}, d2 = {"Lcom/facebook/react/views/image/ReactImageManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/facebook/react/views/image/h;", "Ln6/b;", "draweeControllerBuilder", "Lcom/facebook/react/views/image/a;", "globalImageLoadListener", "Lcom/facebook/react/views/image/f;", "callerContextFactory", "<init>", "(Ln6/b;Lcom/facebook/react/views/image/a;Lcom/facebook/react/views/image/f;)V", "", "callerContext", "(Ln6/b;Ljava/lang/Object;)V", "(Ln6/b;Lcom/facebook/react/views/image/a;Ljava/lang/Object;)V", "Lcom/facebook/react/uimanager/h0;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/h0;)Lcom/facebook/react/views/image/h;", "", "getName", "()Ljava/lang/String;", "view", "", "accessible", "Llf/M;", "setAccessible", "(Lcom/facebook/react/views/image/h;Z)V", "Lcom/facebook/react/bridge/ReadableArray;", "sources", "setSrc", "(Lcom/facebook/react/views/image/h;Lcom/facebook/react/bridge/ReadableArray;)V", "setSource", "", "blurRadius", "setBlurRadius", "(Lcom/facebook/react/views/image/h;F)V", "analyticTag", "setInternal_AnalyticsTag", "(Lcom/facebook/react/views/image/h;Ljava/lang/String;)V", "source", "setDefaultSource", "setLoadingIndicatorSource", "", "borderColor", "setBorderColor", "(Lcom/facebook/react/views/image/h;Ljava/lang/Integer;)V", "overlayColor", "setOverlayColor", "borderWidth", "setBorderWidth", "index", "borderRadius", "setBorderRadius", "(Lcom/facebook/react/views/image/h;IF)V", "resizeMode", "setResizeMode", "resizeMethod", "setResizeMethod", "resizeMultiplier", "setResizeMultiplier", "tintColor", "setTintColor", "enabled", "setProgressiveRenderingEnabled", "durationMs", "setFadeDuration", "(Lcom/facebook/react/views/image/h;I)V", "shouldNotifyLoadEvents", "setLoadHandlersRegistered", "Lcom/facebook/react/bridge/ReadableMap;", "headers", "setHeaders", "(Lcom/facebook/react/views/image/h;Lcom/facebook/react/bridge/ReadableMap;)V", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "onAfterUpdateTransaction", "(Lcom/facebook/react/views/image/h;)V", "Ln6/b;", "Lcom/facebook/react/views/image/a;", "Lcom/facebook/react/views/image/f;", "Ljava/lang/Object;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReactImageManager extends SimpleViewManager<h> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    private static final String ON_ERROR = "onError";
    private static final String ON_LOAD = "onLoad";
    private static final String ON_LOAD_END = "onLoadEnd";
    private static final String ON_LOAD_START = "onLoadStart";
    private static final String ON_PROGRESS = "onProgress";
    public static final String REACT_CLASS = "RCTImageView";
    private static final String REGISTRATION_NAME = "registrationName";
    private Object callerContext;
    private final f callerContextFactory;
    private final b draweeControllerBuilder;
    private final a globalImageLoadListener;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public ReactImageManager() {
        this((b) null, (a) null, (f) null, 7, (DefaultConstructorMarker) null);
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new LinkedHashMap<>();
        }
        b.a aVar = b.f41863h;
        exportedCustomDirectEventTypeConstants.put(aVar.f(4), O.f(C6502A.a(REGISTRATION_NAME, ON_LOAD_START)));
        exportedCustomDirectEventTypeConstants.put(aVar.f(5), O.f(C6502A.a(REGISTRATION_NAME, ON_PROGRESS)));
        exportedCustomDirectEventTypeConstants.put(aVar.f(2), O.f(C6502A.a(REGISTRATION_NAME, ON_LOAD)));
        exportedCustomDirectEventTypeConstants.put(aVar.f(1), O.f(C6502A.a(REGISTRATION_NAME, ON_ERROR)));
        exportedCustomDirectEventTypeConstants.put(aVar.f(3), O.f(C6502A.a(REGISTRATION_NAME, ON_LOAD_END)));
        return exportedCustomDirectEventTypeConstants;
    }

    public String getName() {
        return REACT_CLASS;
    }

    @C3500a(name = "accessible")
    public final void setAccessible(h hVar, boolean z10) {
        C6496s.h(hVar, "view");
        hVar.setFocusable(z10);
    }

    @C3500a(name = "blurRadius")
    public final void setBlurRadius(h hVar, float f10) {
        C6496s.h(hVar, "view");
        hVar.setBlurRadius(f10);
    }

    @C3500a(customType = "Color", name = "borderColor")
    public final void setBorderColor(h hVar, Integer num) {
        C6496s.h(hVar, "view");
        C3400a.q(hVar, m.f44918b, num);
    }

    @C3501b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public final void setBorderRadius(h hVar, int i10, float f10) {
        C3430x xVar;
        C6496s.h(hVar, "view");
        if (Float.isNaN(f10)) {
            xVar = null;
        } else {
            xVar = new C3430x(f10, C3431y.POINT);
        }
        C3400a.r(hVar, d.values()[i10], xVar);
    }

    @C3500a(name = "borderWidth")
    public final void setBorderWidth(h hVar, float f10) {
        C6496s.h(hVar, "view");
        C3400a.t(hVar, m.f44918b, Float.valueOf(f10));
    }

    @C3500a(name = "defaultSource")
    public final void setDefaultSource(h hVar, String str) {
        C6496s.h(hVar, "view");
        hVar.setDefaultSource(str);
    }

    @C3500a(name = "fadeDuration")
    public final void setFadeDuration(h hVar, int i10) {
        C6496s.h(hVar, "view");
        hVar.setFadeDuration(i10);
    }

    @C3500a(name = "headers")
    public final void setHeaders(h hVar, ReadableMap readableMap) {
        C6496s.h(hVar, "view");
        if (readableMap != null) {
            hVar.setHeaders(readableMap);
        }
    }

    @C3500a(name = "internal_analyticTag")
    public final void setInternal_AnalyticsTag(h hVar, String str) {
        C6496s.h(hVar, "view");
    }

    @C3500a(name = "shouldNotifyLoadEvents")
    public final void setLoadHandlersRegistered(h hVar, boolean z10) {
        C6496s.h(hVar, "view");
        hVar.setShouldNotifyLoadEvents(z10);
    }

    @C3500a(name = "loadingIndicatorSrc")
    public final void setLoadingIndicatorSource(h hVar, String str) {
        C6496s.h(hVar, "view");
        hVar.setLoadingIndicatorSource(str);
    }

    @C3500a(customType = "Color", name = "overlayColor")
    public final void setOverlayColor(h hVar, Integer num) {
        C6496s.h(hVar, "view");
        if (num == null) {
            hVar.setOverlayColor(0);
        } else {
            hVar.setOverlayColor(num.intValue());
        }
    }

    @C3500a(name = "progressiveRenderingEnabled")
    public final void setProgressiveRenderingEnabled(h hVar, boolean z10) {
        C6496s.h(hVar, "view");
        hVar.setProgressiveRenderingEnabled(z10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r3.equals("auto") == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        r2.setResizeMethod(com.facebook.react.views.image.c.f41871a);
        U5.a.I("ReactNative", "Invalid resize method: '" + r3 + "'");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    @e8.C3500a(name = "resizeMethod")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setResizeMethod(com.facebook.react.views.image.h r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C6496s.h(r2, r0)
            if (r3 == 0) goto L_0x0065
            int r0 = r3.hashCode()
            switch(r0) {
                case -934437708: goto L_0x0036;
                case 3005871: goto L_0x002d;
                case 3387192: goto L_0x001e;
                case 109250890: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x003e
        L_0x000f:
            java.lang.String r0 = "scale"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0018
            goto L_0x003e
        L_0x0018:
            com.facebook.react.views.image.c r3 = com.facebook.react.views.image.c.SCALE
            r2.setResizeMethod(r3)
            goto L_0x006a
        L_0x001e:
            java.lang.String r0 = "none"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0027
            goto L_0x003e
        L_0x0027:
            com.facebook.react.views.image.c r3 = com.facebook.react.views.image.c.NONE
            r2.setResizeMethod(r3)
            goto L_0x006a
        L_0x002d:
            java.lang.String r0 = "auto"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0065
            goto L_0x003e
        L_0x0036:
            java.lang.String r0 = "resize"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x005f
        L_0x003e:
            com.facebook.react.views.image.c r0 = com.facebook.react.views.image.c.AUTO
            r2.setResizeMethod(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Invalid resize method: '"
            r2.append(r0)
            r2.append(r3)
            java.lang.String r3 = "'"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "ReactNative"
            U5.a.I(r3, r2)
            goto L_0x006a
        L_0x005f:
            com.facebook.react.views.image.c r3 = com.facebook.react.views.image.c.RESIZE
            r2.setResizeMethod(r3)
            goto L_0x006a
        L_0x0065:
            com.facebook.react.views.image.c r3 = com.facebook.react.views.image.c.AUTO
            r2.setResizeMethod(r3)
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.image.ReactImageManager.setResizeMethod(com.facebook.react.views.image.h, java.lang.String):void");
    }

    @C3500a(name = "resizeMode")
    public final void setResizeMode(h hVar, String str) {
        C6496s.h(hVar, "view");
        hVar.setScaleType(d.c(str));
        hVar.setTileMode(d.d(str));
    }

    @C3500a(name = "resizeMultiplier")
    public final void setResizeMultiplier(h hVar, float f10) {
        C6496s.h(hVar, "view");
        if (f10 < 0.01f) {
            U5.a.I("ReactNative", "Invalid resize multiplier: '" + f10 + "'");
        }
        hVar.setResizeMultiplier(f10);
    }

    @C3500a(name = "source")
    public final void setSource(h hVar, ReadableArray readableArray) {
        C6496s.h(hVar, "view");
        hVar.setSource(readableArray);
    }

    @C3500a(name = "src")
    public final void setSrc(h hVar, ReadableArray readableArray) {
        C6496s.h(hVar, "view");
        setSource(hVar, readableArray);
    }

    @C3500a(customType = "Color", name = "tintColor")
    public final void setTintColor(h hVar, Integer num) {
        C6496s.h(hVar, "view");
        if (num == null) {
            hVar.clearColorFilter();
        } else {
            hVar.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    public ReactImageManager(n6.b bVar) {
        this(bVar, (a) null, (f) null, 6, (DefaultConstructorMarker) null);
    }

    public h createViewInstance(C3415h0 h0Var) {
        C6496s.h(h0Var, "context");
        Object obj = this.callerContext;
        if (obj == null) {
            obj = null;
        }
        n6.b bVar = this.draweeControllerBuilder;
        if (bVar == null) {
            bVar = j6.d.h();
        }
        C6496s.e(bVar);
        return new h(h0Var, bVar, (a) null, obj);
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(h hVar) {
        C6496s.h(hVar, "view");
        super.onAfterUpdateTransaction(hVar);
        hVar.n();
    }

    public ReactImageManager(n6.b bVar, a aVar) {
        this(bVar, aVar, (f) null, 4, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReactImageManager(n6.b bVar, a aVar, f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : bVar, (i10 & 2) != 0 ? null : aVar, (i10 & 4) != 0 ? null : fVar);
    }

    public ReactImageManager(n6.b bVar, a aVar, f fVar) {
        this.draweeControllerBuilder = bVar;
    }

    @C6521e
    public ReactImageManager(n6.b bVar, Object obj) {
        this(bVar, (a) null, (f) null);
        this.callerContext = obj;
    }

    @C6521e
    public ReactImageManager(n6.b bVar, a aVar, Object obj) {
        this(bVar, aVar, (f) null);
        this.callerContext = obj;
    }
}
