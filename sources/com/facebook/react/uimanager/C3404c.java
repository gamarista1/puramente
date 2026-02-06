package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import kotlin.jvm.internal.C6496s;

/* renamed from: com.facebook.react.uimanager.c  reason: case insensitive filesystem */
public abstract class C3404c implements w0 {

    /* renamed from: a  reason: collision with root package name */
    protected final BaseViewManager f41564a;

    public C3404c(BaseViewManager baseViewManager) {
        C6496s.h(baseViewManager, "mViewManager");
        this.f41564a = baseViewManager;
    }

    public void a(View view, String str, Object obj) {
        Integer num;
        Integer num2;
        C6496s.h(view, "view");
        if (str != null) {
            float f10 = 1.0f;
            float f11 = 0.0f;
            float f12 = Float.NaN;
            boolean z10 = false;
            switch (str.hashCode()) {
                case -2018402664:
                    if (str.equals("mixBlendMode")) {
                        this.f41564a.setMixBlendMode(view, (String) obj);
                        return;
                    }
                    return;
                case -1898517556:
                    if (str.equals("onPointerEnterCapture")) {
                        BaseViewManager baseViewManager = this.f41564a;
                        Boolean bool = (Boolean) obj;
                        if (bool != null) {
                            z10 = bool.booleanValue();
                        }
                        baseViewManager.setPointerEnterCapture(view, z10);
                        return;
                    }
                    return;
                case -1721943862:
                    if (str.equals("translateX")) {
                        BaseViewManager baseViewManager2 = this.f41564a;
                        Double d10 = (Double) obj;
                        if (d10 != null) {
                            f11 = (float) d10.doubleValue();
                        }
                        baseViewManager2.setTranslateX(view, f11);
                        return;
                    }
                    return;
                case -1721943861:
                    if (str.equals("translateY")) {
                        BaseViewManager baseViewManager3 = this.f41564a;
                        Double d11 = (Double) obj;
                        if (d11 != null) {
                            f11 = (float) d11.doubleValue();
                        }
                        baseViewManager3.setTranslateY(view, f11);
                        return;
                    }
                    return;
                case -1589741021:
                    if (str.equals("shadowColor")) {
                        BaseViewManager baseViewManager4 = this.f41564a;
                        if (obj == null) {
                            num = 0;
                        } else {
                            num = ColorPropConverter.getColor(obj, view.getContext());
                        }
                        C6496s.e(num);
                        baseViewManager4.setShadowColor(view, num.intValue());
                        return;
                    }
                    return;
                case -1489432511:
                    if (str.equals("outlineColor")) {
                        this.f41564a.setOutlineColor(view, (Integer) obj);
                        return;
                    }
                    return;
                case -1474494833:
                    if (str.equals("outlineStyle")) {
                        this.f41564a.setOutlineStyle(view, (String) obj);
                        return;
                    }
                    return;
                case -1471148380:
                    if (str.equals("outlineWidth")) {
                        BaseViewManager baseViewManager5 = this.f41564a;
                        Double d12 = (Double) obj;
                        if (d12 != null) {
                            f12 = (float) d12.doubleValue();
                        }
                        baseViewManager5.setOutlineWidth(view, f12);
                        return;
                    }
                    return;
                case -1351902487:
                    if (str.equals("onClick")) {
                        BaseViewManager baseViewManager6 = this.f41564a;
                        Boolean bool2 = (Boolean) obj;
                        if (bool2 != null) {
                            z10 = bool2.booleanValue();
                        }
                        baseViewManager6.setClick(view, z10);
                        return;
                    }
                    return;
                case -1274492040:
                    if (str.equals("filter")) {
                        this.f41564a.setFilter(view, (ReadableArray) obj);
                        return;
                    }
                    return;
                case -1267206133:
                    if (str.equals("opacity")) {
                        BaseViewManager baseViewManager7 = this.f41564a;
                        Double d13 = (Double) obj;
                        if (d13 != null) {
                            f10 = (float) d13.doubleValue();
                        }
                        baseViewManager7.setOpacity(view, f10);
                        return;
                    }
                    return;
                case -1247970794:
                    if (str.equals("onPointerOutCapture")) {
                        BaseViewManager baseViewManager8 = this.f41564a;
                        Boolean bool3 = (Boolean) obj;
                        if (bool3 != null) {
                            z10 = bool3.booleanValue();
                        }
                        baseViewManager8.setPointerOutCapture(view, z10);
                        return;
                    }
                    return;
                case -1228066334:
                    if (str.equals(Snapshot.BORDER_TOP_LEFT_RADIUS)) {
                        BaseViewManager baseViewManager9 = this.f41564a;
                        Double d14 = (Double) obj;
                        if (d14 != null) {
                            f12 = (float) d14.doubleValue();
                        }
                        baseViewManager9.setBorderTopLeftRadius(view, f12);
                        return;
                    }
                    return;
                case -1219666915:
                    if (str.equals("onClickCapture")) {
                        BaseViewManager baseViewManager10 = this.f41564a;
                        Boolean bool4 = (Boolean) obj;
                        if (bool4 != null) {
                            z10 = bool4.booleanValue();
                        }
                        baseViewManager10.setClickCapture(view, z10);
                        return;
                    }
                    return;
                case -1036769289:
                    if (str.equals("onPointerMoveCapture")) {
                        BaseViewManager baseViewManager11 = this.f41564a;
                        Boolean bool5 = (Boolean) obj;
                        if (bool5 != null) {
                            z10 = bool5.booleanValue();
                        }
                        baseViewManager11.setPointerMoveCapture(view, z10);
                        return;
                    }
                    return;
                case -908189618:
                    if (str.equals("scaleX")) {
                        BaseViewManager baseViewManager12 = this.f41564a;
                        Double d15 = (Double) obj;
                        if (d15 != null) {
                            f10 = (float) d15.doubleValue();
                        }
                        baseViewManager12.setScaleX(view, f10);
                        return;
                    }
                    return;
                case -908189617:
                    if (str.equals("scaleY")) {
                        BaseViewManager baseViewManager13 = this.f41564a;
                        Double d16 = (Double) obj;
                        if (d16 != null) {
                            f10 = (float) d16.doubleValue();
                        }
                        baseViewManager13.setScaleY(view, f10);
                        return;
                    }
                    return;
                case -877170387:
                    if (str.equals("testID")) {
                        this.f41564a.setTestId(view, (String) obj);
                        return;
                    }
                    return;
                case -781597262:
                    if (str.equals("transformOrigin")) {
                        this.f41564a.setTransformOrigin(view, (ReadableArray) obj);
                        return;
                    }
                    return;
                case -731417480:
                    if (str.equals("zIndex")) {
                        BaseViewManager baseViewManager14 = this.f41564a;
                        Double d17 = (Double) obj;
                        if (d17 != null) {
                            f11 = (float) d17.doubleValue();
                        }
                        baseViewManager14.setZIndex(view, f11);
                        return;
                    }
                    return;
                case -112141555:
                    if (str.equals("onPointerLeaveCapture")) {
                        BaseViewManager baseViewManager15 = this.f41564a;
                        Boolean bool6 = (Boolean) obj;
                        if (bool6 != null) {
                            z10 = bool6.booleanValue();
                        }
                        baseViewManager15.setPointerLeaveCapture(view, z10);
                        return;
                    }
                    return;
                case -101663499:
                    if (str.equals("accessibilityHint")) {
                        this.f41564a.setAccessibilityHint(view, (String) obj);
                        return;
                    }
                    return;
                case -101359900:
                    if (str.equals("accessibilityRole")) {
                        this.f41564a.setAccessibilityRole(view, (String) obj);
                        return;
                    }
                    return;
                case -80891667:
                    if (str.equals("renderToHardwareTextureAndroid")) {
                        BaseViewManager baseViewManager16 = this.f41564a;
                        Boolean bool7 = (Boolean) obj;
                        if (bool7 != null) {
                            z10 = bool7.booleanValue();
                        }
                        baseViewManager16.setRenderToHardwareTexture(view, z10);
                        return;
                    }
                    return;
                case -40300674:
                    if (str.equals("rotation")) {
                        BaseViewManager baseViewManager17 = this.f41564a;
                        Double d18 = (Double) obj;
                        if (d18 != null) {
                            f11 = (float) d18.doubleValue();
                        }
                        baseViewManager17.setRotation(view, f11);
                        return;
                    }
                    return;
                case -4379043:
                    if (str.equals("elevation")) {
                        BaseViewManager baseViewManager18 = this.f41564a;
                        Double d19 = (Double) obj;
                        if (d19 != null) {
                            f11 = (float) d19.doubleValue();
                        }
                        baseViewManager18.setElevation(view, f11);
                        return;
                    }
                    return;
                case 3506294:
                    if (str.equals("role")) {
                        this.f41564a.setRole(view, (String) obj);
                        return;
                    }
                    return;
                case 17941018:
                    if (str.equals("onPointerEnter")) {
                        BaseViewManager baseViewManager19 = this.f41564a;
                        Boolean bool8 = (Boolean) obj;
                        if (bool8 != null) {
                            z10 = bool8.booleanValue();
                        }
                        baseViewManager19.setPointerEnter(view, z10);
                        return;
                    }
                    return;
                case 24119801:
                    if (str.equals("onPointerLeave")) {
                        BaseViewManager baseViewManager20 = this.f41564a;
                        Boolean bool9 = (Boolean) obj;
                        if (bool9 != null) {
                            z10 = bool9.booleanValue();
                        }
                        baseViewManager20.setPointerLeave(view, z10);
                        return;
                    }
                    return;
                case 36255470:
                    if (str.equals("accessibilityLiveRegion")) {
                        this.f41564a.setAccessibilityLiveRegion(view, (String) obj);
                        return;
                    }
                    return;
                case 132353428:
                    if (str.equals("onPointerOverCapture")) {
                        BaseViewManager baseViewManager21 = this.f41564a;
                        Boolean bool10 = (Boolean) obj;
                        if (bool10 != null) {
                            z10 = bool10.booleanValue();
                        }
                        baseViewManager21.setPointerOverCapture(view, z10);
                        return;
                    }
                    return;
                case 317346576:
                    if (str.equals("onPointerOut")) {
                        BaseViewManager baseViewManager22 = this.f41564a;
                        Boolean bool11 = (Boolean) obj;
                        if (bool11 != null) {
                            z10 = bool11.booleanValue();
                        }
                        baseViewManager22.setPointerOut(view, z10);
                        return;
                    }
                    return;
                case 333432965:
                    if (str.equals(Snapshot.BORDER_TOP_RIGHT_RADIUS)) {
                        BaseViewManager baseViewManager23 = this.f41564a;
                        Double d20 = (Double) obj;
                        if (d20 != null) {
                            f12 = (float) d20.doubleValue();
                        }
                        baseViewManager23.setBorderTopRightRadius(view, f12);
                        return;
                    }
                    return;
                case 581268560:
                    if (str.equals(Snapshot.BORDER_BOTTOM_LEFT_RADIUS)) {
                        BaseViewManager baseViewManager24 = this.f41564a;
                        Double d21 = (Double) obj;
                        if (d21 != null) {
                            f12 = (float) d21.doubleValue();
                        }
                        baseViewManager24.setBorderBottomLeftRadius(view, f12);
                        return;
                    }
                    return;
                case 588239831:
                    if (str.equals(Snapshot.BORDER_BOTTOM_RIGHT_RADIUS)) {
                        BaseViewManager baseViewManager25 = this.f41564a;
                        Double d22 = (Double) obj;
                        if (d22 != null) {
                            f12 = (float) d22.doubleValue();
                        }
                        baseViewManager25.setBorderBottomRightRadius(view, f12);
                        return;
                    }
                    return;
                case 743055051:
                    if (str.equals("boxShadow")) {
                        this.f41564a.setBoxShadow(view, (ReadableArray) obj);
                        return;
                    }
                    return;
                case 746986311:
                    if (str.equals("importantForAccessibility")) {
                        this.f41564a.setImportantForAccessibility(view, (String) obj);
                        return;
                    }
                    return;
                case 1052666732:
                    if (str.equals("transform")) {
                        this.f41564a.setTransform(view, (ReadableArray) obj);
                        return;
                    }
                    return;
                case 1146842694:
                    if (str.equals("accessibilityLabel")) {
                        this.f41564a.setAccessibilityLabel(view, (String) obj);
                        return;
                    }
                    return;
                case 1153872867:
                    if (str.equals("accessibilityState")) {
                        this.f41564a.setViewState(view, (ReadableMap) obj);
                        return;
                    }
                    return;
                case 1156088003:
                    if (str.equals("accessibilityValue")) {
                        this.f41564a.setAccessibilityValue(view, (ReadableMap) obj);
                        return;
                    }
                    return;
                case 1247744079:
                    if (str.equals("onPointerMove")) {
                        BaseViewManager baseViewManager26 = this.f41564a;
                        Boolean bool12 = (Boolean) obj;
                        if (bool12 != null) {
                            z10 = bool12.booleanValue();
                        }
                        baseViewManager26.setPointerMove(view, z10);
                        return;
                    }
                    return;
                case 1247809874:
                    if (str.equals("onPointerOver")) {
                        BaseViewManager baseViewManager27 = this.f41564a;
                        Boolean bool13 = (Boolean) obj;
                        if (bool13 != null) {
                            z10 = bool13.booleanValue();
                        }
                        baseViewManager27.setPointerOver(view, z10);
                        return;
                    }
                    return;
                case 1287124693:
                    if (str.equals("backgroundColor")) {
                        BaseViewManager baseViewManager28 = this.f41564a;
                        if (obj == null) {
                            num2 = 0;
                        } else {
                            num2 = ColorPropConverter.getColor(obj, view.getContext());
                        }
                        C6496s.e(num2);
                        baseViewManager28.setBackgroundColor(view, num2.intValue());
                        return;
                    }
                    return;
                case 1349188574:
                    if (str.equals(Snapshot.BORDER_RADIUS)) {
                        BaseViewManager baseViewManager29 = this.f41564a;
                        Double d23 = (Double) obj;
                        if (d23 != null) {
                            f12 = (float) d23.doubleValue();
                        }
                        baseViewManager29.setBorderRadius(view, f12);
                        return;
                    }
                    return;
                case 1407295349:
                    if (str.equals("outlineOffset")) {
                        BaseViewManager baseViewManager30 = this.f41564a;
                        Double d24 = (Double) obj;
                        if (d24 != null) {
                            f12 = (float) d24.doubleValue();
                        }
                        baseViewManager30.setOutlineOffset(view, f12);
                        return;
                    }
                    return;
                case 1505602511:
                    if (str.equals("accessibilityActions")) {
                        this.f41564a.setAccessibilityActions(view, (ReadableArray) obj);
                        return;
                    }
                    return;
                case 1761903244:
                    if (str.equals("accessibilityCollection")) {
                        this.f41564a.setAccessibilityCollection(view, (ReadableMap) obj);
                        return;
                    }
                    return;
                case 1865277756:
                    if (str.equals("accessibilityLabelledBy")) {
                        this.f41564a.setAccessibilityLabelledBy(view, new DynamicFromObject(obj));
                        return;
                    }
                    return;
                case 1993034687:
                    if (str.equals("accessibilityCollectionItem")) {
                        this.f41564a.setAccessibilityCollectionItem(view, (ReadableMap) obj);
                        return;
                    }
                    return;
                case 2045685618:
                    if (str.equals("nativeID")) {
                        this.f41564a.setNativeId(view, (String) obj);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public void b(View view, String str, ReadableArray readableArray) {
        C6496s.h(view, "view");
    }
}
