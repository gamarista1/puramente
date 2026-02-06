package com.facebook.react.uimanager;

import C7.d;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import androidx.core.view.C1680b0;
import com.facebook.react.C3367m;
import com.facebook.react.C3370p;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.C3428v;
import com.facebook.react.uimanager.C3432z;
import com.facebook.react.uimanager.I;
import com.facebook.react.uimanager.events.m;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import e8.C3500a;
import f8.C3519a;
import io.intercom.android.sdk.models.AttributeType;
import j8.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import k8.C3676a;

public abstract class BaseViewManager<T extends View, C extends C3428v> extends ViewManager<T, C> implements View.OnLayoutChangeListener {
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = ((float) Math.sqrt(5.0d));
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    private static final String STATE_BUSY = "busy";
    private static final String STATE_CHECKED = "checked";
    private static final String STATE_EXPANDED = "expanded";
    private static final String STATE_MIXED = "mixed";
    private static final C3432z.a sMatrixDecompositionContext = new C3432z.a();
    private static final double[] sTransformDecompositionArray = new double[16];

    private static class a {
        /* JADX WARNING: Removed duplicated region for block: B:12:0x002c A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void a(android.view.View r4, com.facebook.react.bridge.ReadableArray r5, java.lang.Boolean r6) {
            /*
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 0
                r2 = 31
                if (r0 < r2) goto L_0x000a
                r4.setRenderEffect(r1)
            L_0x000a:
                if (r5 == 0) goto L_0x0028
                boolean r3 = com.facebook.react.uimanager.C3420m.t(r5)
                if (r3 == 0) goto L_0x001f
                android.graphics.Paint r0 = new android.graphics.Paint
                r0.<init>()
                android.graphics.ColorMatrixColorFilter r5 = com.facebook.react.uimanager.C3420m.v(r5)
                r0.setColorFilter(r5)
                goto L_0x0029
            L_0x001f:
                if (r0 < r2) goto L_0x0028
                android.graphics.RenderEffect r5 = com.facebook.react.uimanager.C3420m.w(r5)
                r4.setRenderEffect(r5)
            L_0x0028:
                r0 = r1
            L_0x0029:
                r5 = 2
                if (r0 != 0) goto L_0x003a
                if (r6 == 0) goto L_0x0035
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L_0x0035
                goto L_0x0036
            L_0x0035:
                r5 = 0
            L_0x0036:
                r4.setLayerType(r5, r1)
                goto L_0x003d
            L_0x003a:
                r4.setLayerType(r5, r0)
            L_0x003d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.BaseViewManager.a.a(android.view.View, com.facebook.react.bridge.ReadableArray, java.lang.Boolean):void");
        }
    }

    public BaseViewManager() {
        super((ReactApplicationContext) null);
    }

    private void logUnsupportedPropertyWarning(String str) {
        U5.a.K("ReactNative", "%s doesn't support property '%s'", getName(), str);
    }

    private static float sanitizeFloatPropertyValue(float f10) {
        if (f10 >= -3.4028235E38f && f10 <= Float.MAX_VALUE) {
            return f10;
        }
        if (f10 < -3.4028235E38f || f10 == Float.NEGATIVE_INFINITY) {
            return -3.4028235E38f;
        }
        if (f10 > Float.MAX_VALUE || f10 == Float.POSITIVE_INFINITY) {
            return Float.MAX_VALUE;
        }
        if (Float.isNaN(f10)) {
            return CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        throw new IllegalStateException("Invalid float property value: " + f10);
    }

    private static void setPointerEventsFlag(View view, m.b bVar, boolean z10) {
        int i10;
        int i11;
        Integer num = (Integer) view.getTag(C3367m.f40943s);
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = 0;
        }
        int ordinal = 1 << bVar.ordinal();
        int i12 = C3367m.f40943s;
        if (z10) {
            i11 = ordinal | i10;
        } else {
            i11 = (~ordinal) & i10;
        }
        view.setTag(i12, Integer.valueOf(i11));
    }

    private void updateViewAccessibility(T t10) {
        I.Z(t10, t10.isFocusable(), t10.getImportantForAccessibility());
    }

    private void updateViewContentDescription(T t10) {
        Dynamic dynamic;
        String str = (String) t10.getTag(C3367m.f40929e);
        ReadableMap readableMap = (ReadableMap) t10.getTag(C3367m.f40932h);
        ArrayList arrayList = new ArrayList();
        ReadableMap readableMap2 = (ReadableMap) t10.getTag(C3367m.f40934j);
        if (str != null) {
            arrayList.add(str);
        }
        if (readableMap != null) {
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                Dynamic dynamic2 = readableMap.getDynamic(nextKey);
                if (nextKey.equals(STATE_CHECKED) && dynamic2.getType() == ReadableType.String && dynamic2.asString().equals(STATE_MIXED)) {
                    arrayList.add(t10.getContext().getString(C3370p.f41143F));
                } else if (nextKey.equals(STATE_BUSY) && dynamic2.getType() == ReadableType.Boolean && dynamic2.asBoolean()) {
                    arrayList.add(t10.getContext().getString(C3370p.f41142E));
                }
            }
        }
        if (readableMap2 != null && readableMap2.hasKey(AttributeType.TEXT) && (dynamic = readableMap2.getDynamic(AttributeType.TEXT)) != null && dynamic.getType() == ReadableType.String) {
            arrayList.add(dynamic.asString());
        }
        if (arrayList.size() > 0) {
            t10.setContentDescription(TextUtils.join(", ", arrayList));
        }
    }

    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        d.a b10 = d.a().b("topPointerCancel", d.d("phasedRegistrationNames", d.e("bubbled", "onPointerCancel", "captured", "onPointerCancelCapture"))).b("topPointerDown", d.d("phasedRegistrationNames", d.e("bubbled", "onPointerDown", "captured", "onPointerDownCapture")));
        Boolean bool = Boolean.TRUE;
        exportedCustomDirectEventTypeConstants.putAll(b10.b("topPointerEnter", d.d("phasedRegistrationNames", d.f("bubbled", "onPointerEnter", "captured", "onPointerEnterCapture", "skipBubbling", bool))).b("topPointerLeave", d.d("phasedRegistrationNames", d.f("bubbled", "onPointerLeave", "captured", "onPointerLeaveCapture", "skipBubbling", bool))).b("topPointerMove", d.d("phasedRegistrationNames", d.e("bubbled", "onPointerMove", "captured", "onPointerMoveCapture"))).b("topPointerUp", d.d("phasedRegistrationNames", d.e("bubbled", "onPointerUp", "captured", "onPointerUpCapture"))).b("topPointerOut", d.d("phasedRegistrationNames", d.e("bubbled", "onPointerOut", "captured", "onPointerOutCapture"))).b("topPointerOver", d.d("phasedRegistrationNames", d.e("bubbled", "onPointerOver", "captured", "onPointerOverCapture"))).b("topClick", d.d("phasedRegistrationNames", d.e("bubbled", "onClick", "captured", "onClickCapture"))).a());
        return exportedCustomDirectEventTypeConstants;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(d.a().b("topAccessibilityAction", d.d("registrationName", "onAccessibilityAction")).a());
        return exportedCustomDirectEventTypeConstants;
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(T t10) {
        super.onAfterUpdateTransaction(t10);
        updateViewAccessibility(t10);
        Boolean bool = (Boolean) t10.getTag(C3367m.f40940p);
        if (bool != null && bool.booleanValue()) {
            t10.addOnLayoutChangeListener(this);
            setTransformProperty(t10, (ReadableArray) t10.getTag(C3367m.f40920A), (ReadableArray) t10.getTag(C3367m.f40921B));
            t10.setTag(C3367m.f40940p, Boolean.FALSE);
        }
        a.a(t10, (ReadableArray) t10.getTag(C3367m.f40938n), (Boolean) t10.getTag(C3367m.f40922C));
    }

    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = i16 - i14;
        int i19 = i12 - i10;
        if (i13 - i11 != i17 - i15 || i19 != i18) {
            ReadableArray readableArray = (ReadableArray) view.getTag(C3367m.f40921B);
            ReadableArray readableArray2 = (ReadableArray) view.getTag(C3367m.f40920A);
            if (readableArray2 != null || readableArray != null) {
                setTransformProperty(view, readableArray2, readableArray);
            }
        }
    }

    /* access modifiers changed from: protected */
    public T prepareToRecycleView(C3415h0 h0Var, T t10) {
        t10.setTag((Object) null);
        t10.setTag(C3367m.f40943s, (Object) null);
        t10.setTag(C3367m.f40944t, (Object) null);
        t10.setTag(C3367m.f40924E, (Object) null);
        t10.setTag(C3367m.f40941q, (Object) null);
        t10.setTag(C3367m.f40929e, (Object) null);
        t10.setTag(C3367m.f40928d, (Object) null);
        t10.setTag(C3367m.f40931g, (Object) null);
        t10.setTag(C3367m.f40932h, (Object) null);
        t10.setTag(C3367m.f40925a, (Object) null);
        t10.setTag(C3367m.f40934j, (Object) null);
        t10.setTag(C3367m.f40933i, (Object) null);
        setTransformProperty(t10, (ReadableArray) null, (ReadableArray) null);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 28) {
            return null;
        }
        t10.resetPivot();
        t10.setTop(0);
        t10.setBottom(0);
        t10.setLeft(0);
        t10.setRight(0);
        t10.setElevation(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        if (i10 >= 29) {
            t10.setAnimationMatrix((Matrix) null);
        }
        t10.setTag(C3367m.f40920A, (Object) null);
        t10.setTag(C3367m.f40921B, (Object) null);
        t10.setTag(C3367m.f40940p, (Object) null);
        t10.removeOnLayoutChangeListener(this);
        t10.setTag(C3367m.f40922C, (Object) null);
        t10.setTag(C3367m.f40938n, (Object) null);
        t10.setTag(C3367m.f40942r, (Object) null);
        a.a(t10, (ReadableArray) null, (Boolean) null);
        if (i10 >= 28) {
            t10.setOutlineAmbientShadowColor(-16777216);
            t10.setOutlineSpotShadowColor(-16777216);
        }
        t10.setNextFocusDownId(-1);
        t10.setNextFocusForwardId(-1);
        t10.setNextFocusRightId(-1);
        t10.setNextFocusUpId(-1);
        t10.setFocusable(false);
        t10.setFocusableInTouchMode(false);
        t10.setElevation(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        t10.setAlpha(1.0f);
        setPadding(t10, 0, 0, 0, 0);
        t10.setForeground((Drawable) null);
        return t10;
    }

    @C3500a(name = "accessibilityActions")
    public void setAccessibilityActions(T t10, ReadableArray readableArray) {
        if (readableArray != null) {
            t10.setTag(C3367m.f40925a, readableArray);
        }
    }

    @C3500a(name = "accessibilityCollection")
    public void setAccessibilityCollection(T t10, ReadableMap readableMap) {
        t10.setTag(C3367m.f40926b, readableMap);
    }

    @C3500a(name = "accessibilityCollectionItem")
    public void setAccessibilityCollectionItem(T t10, ReadableMap readableMap) {
        t10.setTag(C3367m.f40927c, readableMap);
    }

    @C3500a(name = "accessibilityHint")
    public void setAccessibilityHint(T t10, String str) {
        t10.setTag(C3367m.f40928d, str);
        updateViewContentDescription(t10);
    }

    @C3500a(name = "accessibilityLabel")
    public void setAccessibilityLabel(T t10, String str) {
        t10.setTag(C3367m.f40929e, str);
        updateViewContentDescription(t10);
    }

    @C3500a(name = "accessibilityLabelledBy")
    public void setAccessibilityLabelledBy(T t10, Dynamic dynamic) {
        if (!dynamic.isNull()) {
            if (dynamic.getType() == ReadableType.String) {
                t10.setTag(C3367m.f40941q, dynamic.asString());
            } else if (dynamic.getType() == ReadableType.Array) {
                t10.setTag(C3367m.f40941q, dynamic.asArray().getString(0));
            }
        }
    }

    @C3500a(name = "accessibilityLiveRegion")
    public void setAccessibilityLiveRegion(T t10, String str) {
        if (str == null || str.equals("none")) {
            C1680b0.q0(t10, 0);
        } else if (str.equals("polite")) {
            C1680b0.q0(t10, 1);
        } else if (str.equals("assertive")) {
            C1680b0.q0(t10, 2);
        }
    }

    @C3500a(name = "accessibilityRole")
    public void setAccessibilityRole(T t10, String str) {
        if (str == null) {
            t10.setTag(C3367m.f40931g, (Object) null);
        } else {
            t10.setTag(C3367m.f40931g, I.e.c(str));
        }
    }

    @C3500a(name = "accessibilityValue")
    public void setAccessibilityValue(T t10, ReadableMap readableMap) {
        if (readableMap == null) {
            t10.setTag(C3367m.f40934j, (Object) null);
            t10.setContentDescription((CharSequence) null);
            return;
        }
        t10.setTag(C3367m.f40934j, readableMap);
        if (readableMap.hasKey(AttributeType.TEXT)) {
            updateViewContentDescription(t10);
        }
    }

    @C3500a(customType = "Color", defaultInt = 0, name = "backgroundColor")
    public void setBackgroundColor(T t10, int i10) {
        C3400a.o(t10, Integer.valueOf(i10));
    }

    public void setBorderBottomLeftRadius(T t10, float f10) {
        logUnsupportedPropertyWarning(Snapshot.BORDER_BOTTOM_LEFT_RADIUS);
    }

    public void setBorderBottomRightRadius(T t10, float f10) {
        logUnsupportedPropertyWarning(Snapshot.BORDER_BOTTOM_RIGHT_RADIUS);
    }

    public void setBorderRadius(T t10, float f10) {
        logUnsupportedPropertyWarning(Snapshot.BORDER_RADIUS);
    }

    public void setBorderTopLeftRadius(T t10, float f10) {
        logUnsupportedPropertyWarning(Snapshot.BORDER_TOP_LEFT_RADIUS);
    }

    public void setBorderTopRightRadius(T t10, float f10) {
        logUnsupportedPropertyWarning(Snapshot.BORDER_TOP_RIGHT_RADIUS);
    }

    @C3500a(customType = "BoxShadow", name = "boxShadow")
    public void setBoxShadow(T t10, ReadableArray readableArray) {
        C3400a.u(t10, readableArray);
    }

    @C3500a(name = "onClick")
    public void setClick(T t10, boolean z10) {
        setPointerEventsFlag(t10, m.b.CLICK, z10);
    }

    @C3500a(name = "onClickCapture")
    public void setClickCapture(T t10, boolean z10) {
        setPointerEventsFlag(t10, m.b.CLICK_CAPTURE, z10);
    }

    @C3500a(name = "elevation")
    public void setElevation(T t10, float f10) {
        C1680b0.w0(t10, G.h(f10));
    }

    @C3500a(customType = "Filter", name = "filter")
    public void setFilter(T t10, ReadableArray readableArray) {
        if (C3519a.c(t10) == 2) {
            t10.setTag(C3367m.f40938n, readableArray);
        }
    }

    @C3500a(name = "importantForAccessibility")
    public void setImportantForAccessibility(T t10, String str) {
        if (str == null || str.equals("auto")) {
            C1680b0.y0(t10, 0);
        } else if (str.equals("yes")) {
            C1680b0.y0(t10, 1);
        } else if (str.equals("no")) {
            C1680b0.y0(t10, 2);
        } else if (str.equals("no-hide-descendants")) {
            C1680b0.y0(t10, 4);
        }
    }

    @C3500a(name = "mixBlendMode")
    public void setMixBlendMode(T t10, String str) {
        if (C3519a.c(t10) == 2) {
            t10.setTag(C3367m.f40942r, C3406d.b(str));
            if (t10.getParent() instanceof View) {
                ((View) t10.getParent()).invalidate();
            }
        }
    }

    @C3500a(name = "onMoveShouldSetResponder")
    public void setMoveShouldSetResponder(T t10, boolean z10) {
    }

    @C3500a(name = "onMoveShouldSetResponderCapture")
    public void setMoveShouldSetResponderCapture(T t10, boolean z10) {
    }

    @C3500a(name = "nativeID")
    public void setNativeId(T t10, String str) {
        t10.setTag(C3367m.f40924E, str);
        C3676a.c(t10);
    }

    @C3500a(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(T t10, float f10) {
        t10.setAlpha(f10);
    }

    @C3500a(customType = "Color", name = "outlineColor")
    public void setOutlineColor(T t10, Integer num) {
        C3400a.x(t10, num);
    }

    @C3500a(name = "outlineOffset")
    public void setOutlineOffset(T t10, float f10) {
        C3400a.y(t10, f10);
    }

    @C3500a(name = "outlineStyle")
    public void setOutlineStyle(T t10, String str) {
        n nVar;
        if (str == null) {
            nVar = null;
        } else {
            nVar = n.b(str);
        }
        C3400a.z(t10, nVar);
    }

    @C3500a(name = "outlineWidth")
    public void setOutlineWidth(T t10, float f10) {
        C3400a.A(t10, f10);
    }

    @C3500a(name = "onPointerEnter")
    public void setPointerEnter(T t10, boolean z10) {
        setPointerEventsFlag(t10, m.b.ENTER, z10);
    }

    @C3500a(name = "onPointerEnterCapture")
    public void setPointerEnterCapture(T t10, boolean z10) {
        setPointerEventsFlag(t10, m.b.ENTER_CAPTURE, z10);
    }

    @C3500a(name = "onPointerLeave")
    public void setPointerLeave(T t10, boolean z10) {
        setPointerEventsFlag(t10, m.b.LEAVE, z10);
    }

    @C3500a(name = "onPointerLeaveCapture")
    public void setPointerLeaveCapture(T t10, boolean z10) {
        setPointerEventsFlag(t10, m.b.LEAVE_CAPTURE, z10);
    }

    @C3500a(name = "onPointerMove")
    public void setPointerMove(T t10, boolean z10) {
        setPointerEventsFlag(t10, m.b.MOVE, z10);
    }

    @C3500a(name = "onPointerMoveCapture")
    public void setPointerMoveCapture(T t10, boolean z10) {
        setPointerEventsFlag(t10, m.b.MOVE_CAPTURE, z10);
    }

    @C3500a(name = "onPointerOut")
    public void setPointerOut(T t10, boolean z10) {
        setPointerEventsFlag(t10, m.b.OUT, z10);
    }

    @C3500a(name = "onPointerOutCapture")
    public void setPointerOutCapture(T t10, boolean z10) {
        setPointerEventsFlag(t10, m.b.OUT_CAPTURE, z10);
    }

    @C3500a(name = "onPointerOver")
    public void setPointerOver(T t10, boolean z10) {
        setPointerEventsFlag(t10, m.b.OVER, z10);
    }

    @C3500a(name = "onPointerOverCapture")
    public void setPointerOverCapture(T t10, boolean z10) {
        setPointerEventsFlag(t10, m.b.OVER_CAPTURE, z10);
    }

    @C3500a(name = "renderToHardwareTextureAndroid")
    public void setRenderToHardwareTexture(T t10, boolean z10) {
        t10.setTag(C3367m.f40922C, Boolean.valueOf(z10));
    }

    @C3500a(name = "onResponderEnd")
    public void setResponderEnd(T t10, boolean z10) {
    }

    @C3500a(name = "onResponderGrant")
    public void setResponderGrant(T t10, boolean z10) {
    }

    @C3500a(name = "onResponderMove")
    public void setResponderMove(T t10, boolean z10) {
    }

    @C3500a(name = "onResponderReject")
    public void setResponderReject(T t10, boolean z10) {
    }

    @C3500a(name = "onResponderRelease")
    public void setResponderRelease(T t10, boolean z10) {
    }

    @C3500a(name = "onResponderStart")
    public void setResponderStart(T t10, boolean z10) {
    }

    @C3500a(name = "onResponderTerminate")
    public void setResponderTerminate(T t10, boolean z10) {
    }

    @C3500a(name = "onResponderTerminationRequest")
    public void setResponderTerminationRequest(T t10, boolean z10) {
    }

    @C3500a(name = "role")
    public void setRole(T t10, String str) {
        if (str == null) {
            t10.setTag(C3367m.f40950z, (Object) null);
        } else {
            t10.setTag(C3367m.f40950z, I.f.b(str));
        }
    }

    @C3500a(name = "rotation")
    @Deprecated
    public void setRotation(T t10, float f10) {
        t10.setRotation(f10);
    }

    @C3500a(defaultFloat = 1.0f, name = "scaleX")
    @Deprecated
    public void setScaleX(T t10, float f10) {
        t10.setScaleX(f10);
    }

    @C3500a(defaultFloat = 1.0f, name = "scaleY")
    @Deprecated
    public void setScaleY(T t10, float f10) {
        t10.setScaleY(f10);
    }

    @C3500a(customType = "Color", defaultInt = -16777216, name = "shadowColor")
    public void setShadowColor(T t10, int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            t10.setOutlineAmbientShadowColor(i10);
            t10.setOutlineSpotShadowColor(i10);
        }
    }

    @C3500a(name = "onShouldBlockNativeResponder")
    public void setShouldBlockNativeResponder(T t10, boolean z10) {
    }

    @C3500a(name = "onStartShouldSetResponder")
    public void setStartShouldSetResponder(T t10, boolean z10) {
    }

    @C3500a(name = "onStartShouldSetResponderCapture")
    public void setStartShouldSetResponderCapture(T t10, boolean z10) {
    }

    @C3500a(name = "testID")
    public void setTestId(T t10, String str) {
        t10.setTag(C3367m.f40944t, str);
        t10.setTag(str);
    }

    @C3500a(name = "onTouchCancel")
    public void setTouchCancel(T t10, boolean z10) {
    }

    @C3500a(name = "onTouchEnd")
    public void setTouchEnd(T t10, boolean z10) {
    }

    @C3500a(name = "onTouchMove")
    public void setTouchMove(T t10, boolean z10) {
    }

    @C3500a(name = "onTouchStart")
    public void setTouchStart(T t10, boolean z10) {
    }

    @C3500a(name = "transform")
    public void setTransform(T t10, ReadableArray readableArray) {
        if (!Objects.equals((ReadableArray) t10.getTag(C3367m.f40920A), readableArray)) {
            t10.setTag(C3367m.f40920A, readableArray);
            t10.setTag(C3367m.f40940p, Boolean.TRUE);
        }
    }

    @C3500a(name = "transformOrigin")
    public void setTransformOrigin(T t10, ReadableArray readableArray) {
        if (!Objects.equals((ReadableArray) t10.getTag(C3367m.f40921B), readableArray)) {
            t10.setTag(C3367m.f40921B, readableArray);
            t10.setTag(C3367m.f40940p, Boolean.TRUE);
        }
    }

    /* access modifiers changed from: protected */
    public void setTransformProperty(T t10, ReadableArray readableArray, ReadableArray readableArray2) {
        boolean z10;
        if (readableArray == null) {
            t10.setTranslationX(G.h(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
            t10.setTranslationY(G.h(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
            t10.setRotation(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            t10.setRotationX(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            t10.setRotationY(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            t10.setScaleX(1.0f);
            t10.setScaleY(1.0f);
            t10.setCameraDistance(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            return;
        }
        if (C3519a.c(t10) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3432z.a aVar = sMatrixDecompositionContext;
        aVar.a();
        double[] dArr = sTransformDecompositionArray;
        k0.e(readableArray, dArr, G.f((float) t10.getWidth()), G.f((float) t10.getHeight()), readableArray2, z10);
        C3432z.k(dArr, aVar);
        t10.setTranslationX(G.h(sanitizeFloatPropertyValue((float) aVar.f41848d[0])));
        t10.setTranslationY(G.h(sanitizeFloatPropertyValue((float) aVar.f41848d[1])));
        t10.setRotation(sanitizeFloatPropertyValue((float) aVar.f41849e[2]));
        t10.setRotationX(sanitizeFloatPropertyValue((float) aVar.f41849e[0]));
        t10.setRotationY(sanitizeFloatPropertyValue((float) aVar.f41849e[1]));
        t10.setScaleX(sanitizeFloatPropertyValue((float) aVar.f41846b[0]));
        t10.setScaleY(sanitizeFloatPropertyValue((float) aVar.f41846b[1]));
        double[] dArr2 = aVar.f41845a;
        if (dArr2.length > 2) {
            float f10 = (float) dArr2[2];
            if (f10 == CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                f10 = 7.8125E-4f;
            }
            float f11 = -1.0f / f10;
            float f12 = C3408e.c().density;
            t10.setCameraDistance(sanitizeFloatPropertyValue(f12 * f12 * f11 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        }
    }

    @C3500a(defaultFloat = 0.0f, name = "translateX")
    @Deprecated
    public void setTranslateX(T t10, float f10) {
        t10.setTranslationX(G.h(f10));
    }

    @C3500a(defaultFloat = 0.0f, name = "translateY")
    @Deprecated
    public void setTranslateY(T t10, float f10) {
        t10.setTranslationY(G.h(f10));
    }

    @C3500a(name = "accessibilityState")
    public void setViewState(T t10, ReadableMap readableMap) {
        if (readableMap != null) {
            if (readableMap.hasKey(STATE_EXPANDED)) {
                t10.setTag(C3367m.f40933i, Boolean.valueOf(readableMap.getBoolean(STATE_EXPANDED)));
            }
            if (readableMap.hasKey("selected")) {
                boolean isSelected = t10.isSelected();
                boolean z10 = readableMap.getBoolean("selected");
                t10.setSelected(z10);
                if (t10.isAccessibilityFocused() && isSelected && !z10) {
                    t10.announceForAccessibility(t10.getContext().getString(C3370p.f41144G));
                }
            } else {
                t10.setSelected(false);
            }
            t10.setTag(C3367m.f40932h, readableMap);
            if (readableMap.hasKey("disabled") && !readableMap.getBoolean("disabled")) {
                t10.setEnabled(true);
            }
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                if (nextKey.equals(STATE_BUSY) || nextKey.equals(STATE_EXPANDED) || (nextKey.equals(STATE_CHECKED) && readableMap.getType(STATE_CHECKED) == ReadableType.String)) {
                    updateViewContentDescription(t10);
                    return;
                } else if (t10.isAccessibilityFocused()) {
                    t10.sendAccessibilityEvent(1);
                }
            }
        }
    }

    @C3500a(name = "zIndex")
    public void setZIndex(T t10, float f10) {
        ViewGroupManager.setViewZIndex(t10, Math.round(f10));
        ViewParent parent = t10.getParent();
        if (parent instanceof C3401a0) {
            ((C3401a0) parent).updateDrawingOrder();
        }
    }

    public BaseViewManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
