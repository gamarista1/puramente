package com.facebook.react.uimanager;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.yoga.i;
import com.facebook.yoga.l;
import com.facebook.yoga.n;
import com.facebook.yoga.u;
import com.facebook.yoga.v;
import com.facebook.yoga.w;
import com.facebook.yoga.x;
import e8.C3500a;
import e8.C3501b;

/* renamed from: com.facebook.react.uimanager.v  reason: case insensitive filesystem */
public class C3428v extends V {
    boolean mCollapsable;
    private final b mTempYogaValue = new b();

    /* renamed from: com.facebook.react.uimanager.v$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f41824a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.facebook.yoga.w[] r0 = com.facebook.yoga.w.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f41824a = r0
                com.facebook.yoga.w r1 = com.facebook.yoga.w.POINT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f41824a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.yoga.w r1 = com.facebook.yoga.w.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f41824a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.yoga.w r1 = com.facebook.yoga.w.AUTO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f41824a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.yoga.w r1 = com.facebook.yoga.w.PERCENT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.C3428v.a.<clinit>():void");
        }
    }

    /* renamed from: com.facebook.react.uimanager.v$b */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        float f41825a;

        /* renamed from: b  reason: collision with root package name */
        w f41826b;

        /* access modifiers changed from: package-private */
        public void a(Dynamic dynamic) {
            if (dynamic.isNull()) {
                this.f41826b = w.UNDEFINED;
                this.f41825a = Float.NaN;
            } else if (dynamic.getType() == ReadableType.String) {
                String asString = dynamic.asString();
                if (asString.equals("auto")) {
                    this.f41826b = w.AUTO;
                    this.f41825a = Float.NaN;
                } else if (asString.endsWith("%")) {
                    this.f41826b = w.PERCENT;
                    this.f41825a = Float.parseFloat(asString.substring(0, asString.length() - 1));
                } else {
                    U5.a.I("ReactNative", "Unknown value: " + asString);
                    this.f41826b = w.UNDEFINED;
                    this.f41825a = Float.NaN;
                }
            } else if (dynamic.getType() == ReadableType.Number) {
                this.f41826b = w.POINT;
                this.f41825a = G.g(dynamic.asDouble());
            } else {
                this.f41826b = w.UNDEFINED;
                this.f41825a = Float.NaN;
            }
        }

        private b() {
        }
    }

    private int f(int i10) {
        if (!com.facebook.react.modules.i18nmanager.a.f().d(getThemedContext())) {
            return i10;
        }
        if (i10 == 0) {
            return 4;
        }
        if (i10 != 2) {
            return i10;
        }
        return 5;
    }

    @C3500a(name = "alignContent")
    public void setAlignContent(String str) {
        if (!isVirtual()) {
            if (str == null) {
                setAlignContent(com.facebook.yoga.a.FLEX_START);
                return;
            }
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1881872635:
                    if (str.equals("stretch")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1720785339:
                    if (str.equals("baseline")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1364013995:
                    if (str.equals("center")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -46581362:
                    if (str.equals("flex-start")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 3005871:
                    if (str.equals("auto")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 441309761:
                    if (str.equals("space-between")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 1742952711:
                    if (str.equals("flex-end")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1937124468:
                    if (str.equals("space-around")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 2055030478:
                    if (str.equals("space-evenly")) {
                        c10 = 8;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    setAlignContent(com.facebook.yoga.a.STRETCH);
                    return;
                case 1:
                    setAlignContent(com.facebook.yoga.a.BASELINE);
                    return;
                case 2:
                    setAlignContent(com.facebook.yoga.a.CENTER);
                    return;
                case 3:
                    setAlignContent(com.facebook.yoga.a.FLEX_START);
                    return;
                case 4:
                    setAlignContent(com.facebook.yoga.a.AUTO);
                    return;
                case 5:
                    setAlignContent(com.facebook.yoga.a.SPACE_BETWEEN);
                    return;
                case 6:
                    setAlignContent(com.facebook.yoga.a.FLEX_END);
                    return;
                case 7:
                    setAlignContent(com.facebook.yoga.a.SPACE_AROUND);
                    return;
                case 8:
                    setAlignContent(com.facebook.yoga.a.SPACE_EVENLY);
                    return;
                default:
                    U5.a.I("ReactNative", "invalid value for alignContent: " + str);
                    setAlignContent(com.facebook.yoga.a.FLEX_START);
                    return;
            }
        }
    }

    @C3500a(name = "alignItems")
    public void setAlignItems(String str) {
        if (!isVirtual()) {
            if (str == null) {
                setAlignItems(com.facebook.yoga.a.STRETCH);
                return;
            }
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1881872635:
                    if (str.equals("stretch")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1720785339:
                    if (str.equals("baseline")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1364013995:
                    if (str.equals("center")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -46581362:
                    if (str.equals("flex-start")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 3005871:
                    if (str.equals("auto")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 441309761:
                    if (str.equals("space-between")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 1742952711:
                    if (str.equals("flex-end")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1937124468:
                    if (str.equals("space-around")) {
                        c10 = 7;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    setAlignItems(com.facebook.yoga.a.STRETCH);
                    return;
                case 1:
                    setAlignItems(com.facebook.yoga.a.BASELINE);
                    return;
                case 2:
                    setAlignItems(com.facebook.yoga.a.CENTER);
                    return;
                case 3:
                    setAlignItems(com.facebook.yoga.a.FLEX_START);
                    return;
                case 4:
                    setAlignItems(com.facebook.yoga.a.AUTO);
                    return;
                case 5:
                    setAlignItems(com.facebook.yoga.a.SPACE_BETWEEN);
                    return;
                case 6:
                    setAlignItems(com.facebook.yoga.a.FLEX_END);
                    return;
                case 7:
                    setAlignItems(com.facebook.yoga.a.SPACE_AROUND);
                    return;
                default:
                    U5.a.I("ReactNative", "invalid value for alignItems: " + str);
                    setAlignItems(com.facebook.yoga.a.STRETCH);
                    return;
            }
        }
    }

    @C3500a(name = "alignSelf")
    public void setAlignSelf(String str) {
        if (!isVirtual()) {
            if (str == null) {
                setAlignSelf(com.facebook.yoga.a.AUTO);
                return;
            }
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1881872635:
                    if (str.equals("stretch")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1720785339:
                    if (str.equals("baseline")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1364013995:
                    if (str.equals("center")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -46581362:
                    if (str.equals("flex-start")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 3005871:
                    if (str.equals("auto")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 441309761:
                    if (str.equals("space-between")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 1742952711:
                    if (str.equals("flex-end")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1937124468:
                    if (str.equals("space-around")) {
                        c10 = 7;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    setAlignSelf(com.facebook.yoga.a.STRETCH);
                    return;
                case 1:
                    setAlignSelf(com.facebook.yoga.a.BASELINE);
                    return;
                case 2:
                    setAlignSelf(com.facebook.yoga.a.CENTER);
                    return;
                case 3:
                    setAlignSelf(com.facebook.yoga.a.FLEX_START);
                    return;
                case 4:
                    setAlignSelf(com.facebook.yoga.a.AUTO);
                    return;
                case 5:
                    setAlignSelf(com.facebook.yoga.a.SPACE_BETWEEN);
                    return;
                case 6:
                    setAlignSelf(com.facebook.yoga.a.FLEX_END);
                    return;
                case 7:
                    setAlignSelf(com.facebook.yoga.a.SPACE_AROUND);
                    return;
                default:
                    U5.a.I("ReactNative", "invalid value for alignSelf: " + str);
                    setAlignSelf(com.facebook.yoga.a.AUTO);
                    return;
            }
        }
    }

    @C3500a(defaultFloat = Float.NaN, name = "aspectRatio")
    public void setAspectRatio(float f10) {
        setStyleAspectRatio(f10);
    }

    @C3501b(defaultFloat = Float.NaN, names = {"borderWidth", "borderStartWidth", "borderEndWidth", "borderTopWidth", "borderBottomWidth", "borderLeftWidth", "borderRightWidth"})
    public void setBorderWidths(int i10, float f10) {
        if (!isVirtual()) {
            setBorder(f(F0.f41411b[i10]), G.h(f10));
        }
    }

    @C3500a(name = "collapsable")
    public void setCollapsable(boolean z10) {
        this.mCollapsable = z10;
    }

    @C3500a(name = "collapsableChildren")
    public void setCollapsableChildren(boolean z10) {
    }

    @C3500a(name = "columnGap")
    public void setColumnGap(Dynamic dynamic) {
        if (!isVirtual()) {
            this.mTempYogaValue.a(dynamic);
            int i10 = a.f41824a[this.mTempYogaValue.f41826b.ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                setColumnGap(this.mTempYogaValue.f41825a);
            } else if (i10 == 4) {
                setColumnGapPercent(this.mTempYogaValue.f41825a);
            }
            dynamic.recycle();
        }
    }

    @C3500a(name = "display")
    public void setDisplay(String str) {
        if (!isVirtual()) {
            if (str == null) {
                setDisplay(i.FLEX);
            } else if (str.equals("flex")) {
                setDisplay(i.FLEX);
            } else if (!str.equals("none")) {
                U5.a.I("ReactNative", "invalid value for display: " + str);
                setDisplay(i.FLEX);
            } else {
                setDisplay(i.NONE);
            }
        }
    }

    @C3500a(defaultFloat = 0.0f, name = "flex")
    public void setFlex(float f10) {
        if (!isVirtual()) {
            super.setFlex(f10);
        }
    }

    @C3500a(name = "flexBasis")
    public void setFlexBasis(Dynamic dynamic) {
        if (!isVirtual()) {
            this.mTempYogaValue.a(dynamic);
            int i10 = a.f41824a[this.mTempYogaValue.f41826b.ordinal()];
            if (i10 == 1 || i10 == 2) {
                setFlexBasis(this.mTempYogaValue.f41825a);
            } else if (i10 == 3) {
                setFlexBasisAuto();
            } else if (i10 == 4) {
                setFlexBasisPercent(this.mTempYogaValue.f41825a);
            }
            dynamic.recycle();
        }
    }

    @C3500a(name = "flexDirection")
    public void setFlexDirection(String str) {
        if (!isVirtual()) {
            if (str == null) {
                setFlexDirection(l.COLUMN);
                return;
            }
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1448970769:
                    if (str.equals("row-reverse")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1354837162:
                    if (str.equals("column")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 113114:
                    if (str.equals("row")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1272730475:
                    if (str.equals("column-reverse")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    setFlexDirection(l.ROW_REVERSE);
                    return;
                case 1:
                    setFlexDirection(l.COLUMN);
                    return;
                case 2:
                    setFlexDirection(l.ROW);
                    return;
                case 3:
                    setFlexDirection(l.COLUMN_REVERSE);
                    return;
                default:
                    U5.a.I("ReactNative", "invalid value for flexDirection: " + str);
                    setFlexDirection(l.COLUMN);
                    return;
            }
        }
    }

    @C3500a(defaultFloat = 0.0f, name = "flexGrow")
    public void setFlexGrow(float f10) {
        if (!isVirtual()) {
            super.setFlexGrow(f10);
        }
    }

    @C3500a(defaultFloat = 0.0f, name = "flexShrink")
    public void setFlexShrink(float f10) {
        if (!isVirtual()) {
            super.setFlexShrink(f10);
        }
    }

    @C3500a(name = "flexWrap")
    public void setFlexWrap(String str) {
        if (!isVirtual()) {
            if (str == null) {
                setFlexWrap(x.NO_WRAP);
                return;
            }
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1039592053:
                    if (str.equals("nowrap")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -749527969:
                    if (str.equals("wrap-reverse")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3657802:
                    if (str.equals("wrap")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    setFlexWrap(x.NO_WRAP);
                    return;
                case 1:
                    setFlexWrap(x.WRAP_REVERSE);
                    return;
                case 2:
                    setFlexWrap(x.WRAP);
                    return;
                default:
                    U5.a.I("ReactNative", "invalid value for flexWrap: " + str);
                    setFlexWrap(x.NO_WRAP);
                    return;
            }
        }
    }

    @C3500a(name = "gap")
    public void setGap(Dynamic dynamic) {
        if (!isVirtual()) {
            this.mTempYogaValue.a(dynamic);
            int i10 = a.f41824a[this.mTempYogaValue.f41826b.ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                setGap(this.mTempYogaValue.f41825a);
            } else if (i10 == 4) {
                setGapPercent(this.mTempYogaValue.f41825a);
            }
            dynamic.recycle();
        }
    }

    @C3500a(name = "height")
    public void setHeight(Dynamic dynamic) {
        if (!isVirtual()) {
            this.mTempYogaValue.a(dynamic);
            int i10 = a.f41824a[this.mTempYogaValue.f41826b.ordinal()];
            if (i10 == 1 || i10 == 2) {
                setStyleHeight(this.mTempYogaValue.f41825a);
            } else if (i10 == 3) {
                setStyleHeightAuto();
            } else if (i10 == 4) {
                setStyleHeightPercent(this.mTempYogaValue.f41825a);
            }
            dynamic.recycle();
        }
    }

    @C3500a(name = "inset")
    public void setInset(Dynamic dynamic) {
    }

    @C3501b(names = {"insetBlock", "insetBlockEnd", "insetBlockStart"})
    public void setInsetBlock(int i10, Dynamic dynamic) {
    }

    @C3501b(names = {"insetInline", "insetInlineEnd", "insetInlineStart"})
    public void setInsetInline(int i10, Dynamic dynamic) {
    }

    @C3500a(name = "justifyContent")
    public void setJustifyContent(String str) {
        if (!isVirtual()) {
            if (str == null) {
                setJustifyContent(n.FLEX_START);
                return;
            }
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1364013995:
                    if (str.equals("center")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -46581362:
                    if (str.equals("flex-start")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 441309761:
                    if (str.equals("space-between")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1742952711:
                    if (str.equals("flex-end")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 1937124468:
                    if (str.equals("space-around")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 2055030478:
                    if (str.equals("space-evenly")) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    setJustifyContent(n.CENTER);
                    return;
                case 1:
                    setJustifyContent(n.FLEX_START);
                    return;
                case 2:
                    setJustifyContent(n.SPACE_BETWEEN);
                    return;
                case 3:
                    setJustifyContent(n.FLEX_END);
                    return;
                case 4:
                    setJustifyContent(n.SPACE_AROUND);
                    return;
                case 5:
                    setJustifyContent(n.SPACE_EVENLY);
                    return;
                default:
                    U5.a.I("ReactNative", "invalid value for justifyContent: " + str);
                    setJustifyContent(n.FLEX_START);
                    return;
            }
        }
    }

    @C3500a(name = "experimental_layoutConformance")
    public void setLayoutConformance(String str) {
    }

    @C3501b(names = {"marginBlock", "marginBlockEnd", "marginBlockStart"})
    public void setMarginBlock(int i10, Dynamic dynamic) {
    }

    @C3501b(names = {"marginInline", "marginInlineEnd", "marginInlineStart"})
    public void setMarginInline(int i10, Dynamic dynamic) {
    }

    @C3501b(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
    public void setMargins(int i10, Dynamic dynamic) {
        if (!isVirtual()) {
            int f10 = f(F0.f41412c[i10]);
            this.mTempYogaValue.a(dynamic);
            int i11 = a.f41824a[this.mTempYogaValue.f41826b.ordinal()];
            if (i11 == 1 || i11 == 2) {
                setMargin(f10, this.mTempYogaValue.f41825a);
            } else if (i11 == 3) {
                setMarginAuto(f10);
            } else if (i11 == 4) {
                setMarginPercent(f10, this.mTempYogaValue.f41825a);
            }
            dynamic.recycle();
        }
    }

    @C3500a(name = "maxHeight")
    public void setMaxHeight(Dynamic dynamic) {
        if (!isVirtual()) {
            this.mTempYogaValue.a(dynamic);
            int i10 = a.f41824a[this.mTempYogaValue.f41826b.ordinal()];
            if (i10 == 1 || i10 == 2) {
                setStyleMaxHeight(this.mTempYogaValue.f41825a);
            } else if (i10 == 4) {
                setStyleMaxHeightPercent(this.mTempYogaValue.f41825a);
            }
            dynamic.recycle();
        }
    }

    @C3500a(name = "maxWidth")
    public void setMaxWidth(Dynamic dynamic) {
        if (!isVirtual()) {
            this.mTempYogaValue.a(dynamic);
            int i10 = a.f41824a[this.mTempYogaValue.f41826b.ordinal()];
            if (i10 == 1 || i10 == 2) {
                setStyleMaxWidth(this.mTempYogaValue.f41825a);
            } else if (i10 == 4) {
                setStyleMaxWidthPercent(this.mTempYogaValue.f41825a);
            }
            dynamic.recycle();
        }
    }

    @C3500a(name = "minHeight")
    public void setMinHeight(Dynamic dynamic) {
        if (!isVirtual()) {
            this.mTempYogaValue.a(dynamic);
            int i10 = a.f41824a[this.mTempYogaValue.f41826b.ordinal()];
            if (i10 == 1 || i10 == 2) {
                setStyleMinHeight(this.mTempYogaValue.f41825a);
            } else if (i10 == 4) {
                setStyleMinHeightPercent(this.mTempYogaValue.f41825a);
            }
            dynamic.recycle();
        }
    }

    @C3500a(name = "minWidth")
    public void setMinWidth(Dynamic dynamic) {
        if (!isVirtual()) {
            this.mTempYogaValue.a(dynamic);
            int i10 = a.f41824a[this.mTempYogaValue.f41826b.ordinal()];
            if (i10 == 1 || i10 == 2) {
                setStyleMinWidth(this.mTempYogaValue.f41825a);
            } else if (i10 == 4) {
                setStyleMinWidthPercent(this.mTempYogaValue.f41825a);
            }
            dynamic.recycle();
        }
    }

    @C3500a(name = "overflow")
    public void setOverflow(String str) {
        if (!isVirtual()) {
            if (str == null) {
                setOverflow(u.VISIBLE);
                return;
            }
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1217487446:
                    if (str.equals("hidden")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -907680051:
                    if (str.equals("scroll")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 466743410:
                    if (str.equals("visible")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    setOverflow(u.HIDDEN);
                    return;
                case 1:
                    setOverflow(u.SCROLL);
                    return;
                case 2:
                    setOverflow(u.VISIBLE);
                    return;
                default:
                    U5.a.I("ReactNative", "invalid value for overflow: " + str);
                    setOverflow(u.VISIBLE);
                    return;
            }
        }
    }

    @C3501b(names = {"paddingBlock", "paddingBlockEnd", "paddingBlockStart"})
    public void setPaddingBlock(int i10, Dynamic dynamic) {
    }

    @C3501b(names = {"paddingInline", "paddingInlineEnd", "paddingInlineStart"})
    public void setPaddingInline(int i10, Dynamic dynamic) {
    }

    @C3501b(names = {"padding", "paddingVertical", "paddingHorizontal", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
    public void setPaddings(int i10, Dynamic dynamic) {
        if (!isVirtual()) {
            int f10 = f(F0.f41412c[i10]);
            this.mTempYogaValue.a(dynamic);
            int i11 = a.f41824a[this.mTempYogaValue.f41826b.ordinal()];
            if (i11 == 1 || i11 == 2) {
                setPadding(f10, this.mTempYogaValue.f41825a);
            } else if (i11 == 4) {
                setPaddingPercent(f10, this.mTempYogaValue.f41825a);
            }
            dynamic.recycle();
        }
    }

    @C3500a(name = "position")
    public void setPosition(String str) {
        if (!isVirtual()) {
            if (str == null) {
                setPositionType(v.RELATIVE);
            } else if (str.equals("relative")) {
                setPositionType(v.RELATIVE);
            } else if (!str.equals("absolute")) {
                U5.a.I("ReactNative", "invalid value for position: " + str);
                setPositionType(v.RELATIVE);
            } else {
                setPositionType(v.ABSOLUTE);
            }
        }
    }

    @C3501b(names = {"start", "end", "left", "right", "top", "bottom"})
    public void setPositionValues(int i10, Dynamic dynamic) {
        if (!isVirtual()) {
            int f10 = f(new int[]{4, 5, 0, 2, 1, 3}[i10]);
            this.mTempYogaValue.a(dynamic);
            int i11 = a.f41824a[this.mTempYogaValue.f41826b.ordinal()];
            if (i11 == 1 || i11 == 2) {
                setPosition(f10, this.mTempYogaValue.f41825a);
            } else if (i11 == 4) {
                setPositionPercent(f10, this.mTempYogaValue.f41825a);
            }
            dynamic.recycle();
        }
    }

    @C3500a(name = "rowGap")
    public void setRowGap(Dynamic dynamic) {
        if (!isVirtual()) {
            this.mTempYogaValue.a(dynamic);
            int i10 = a.f41824a[this.mTempYogaValue.f41826b.ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                setRowGap(this.mTempYogaValue.f41825a);
            } else if (i10 == 4) {
                setRowGapPercent(this.mTempYogaValue.f41825a);
            }
            dynamic.recycle();
        }
    }

    @C3500a(name = "onLayout")
    public void setShouldNotifyOnLayout(boolean z10) {
        super.setShouldNotifyOnLayout(z10);
    }

    @C3500a(name = "onPointerEnter")
    public void setShouldNotifyPointerEnter(boolean z10) {
    }

    @C3500a(name = "onPointerLeave")
    public void setShouldNotifyPointerLeave(boolean z10) {
    }

    @C3500a(name = "onPointerMove")
    public void setShouldNotifyPointerMove(boolean z10) {
    }

    @C3500a(name = "width")
    public void setWidth(Dynamic dynamic) {
        if (!isVirtual()) {
            this.mTempYogaValue.a(dynamic);
            int i10 = a.f41824a[this.mTempYogaValue.f41826b.ordinal()];
            if (i10 == 1 || i10 == 2) {
                setStyleWidth(this.mTempYogaValue.f41825a);
            } else if (i10 == 3) {
                setStyleWidthAuto();
            } else if (i10 == 4) {
                setStyleWidthPercent(this.mTempYogaValue.f41825a);
            }
            dynamic.recycle();
        }
    }
}
