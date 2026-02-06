package com.facebook.react.views.text;

import U5.a;
import android.text.TextUtils;
import android.view.View;
import com.adjust.sdk.Constants;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C3400a;
import com.facebook.react.uimanager.C3430x;
import com.facebook.react.uimanager.C3431y;
import com.facebook.react.views.text.c;
import e8.C3500a;
import e8.C3501b;
import io.intercom.android.sdk.models.carousel.ActionType;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import j8.d;
import j8.f;
import j8.m;

public abstract class ReactTextAnchorViewManager<T extends View, C extends c> extends BaseViewManager<T, C> {
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3, 4, 5};
    private static final String TAG = "ReactTextAnchorViewManager";

    @C3500a(name = "accessible")
    public void setAccessible(k kVar, boolean z10) {
        kVar.setFocusable(z10);
    }

    @C3500a(name = "adjustsFontSizeToFit")
    public void setAdjustFontSizeToFit(k kVar, boolean z10) {
        kVar.setAdjustFontSizeToFit(z10);
    }

    @C3500a(name = "android_hyphenationFrequency")
    public void setAndroidHyphenationFrequency(k kVar, String str) {
        if (str == null || str.equals("none")) {
            kVar.setHyphenationFrequency(0);
        } else if (str.equals("full")) {
            kVar.setHyphenationFrequency(2);
        } else if (str.equals(Constants.NORMAL)) {
            kVar.setHyphenationFrequency(1);
        } else {
            a.I("ReactNative", "Invalid android_hyphenationFrequency: " + str);
            kVar.setHyphenationFrequency(0);
        }
    }

    @C3501b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(k kVar, int i10, Integer num) {
        C3400a.q(kVar, m.f44918b, num);
    }

    @C3501b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(k kVar, int i10, float f10) {
        C3430x xVar;
        if (Float.isNaN(f10)) {
            xVar = null;
        } else {
            xVar = new C3430x(f10, C3431y.POINT);
        }
        C3400a.r(kVar, d.values()[i10], xVar);
    }

    @C3500a(name = "borderStyle")
    public void setBorderStyle(k kVar, String str) {
        f fVar;
        if (str == null) {
            fVar = null;
        } else {
            fVar = f.b(str);
        }
        C3400a.s(kVar, fVar);
    }

    @C3501b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth", "borderStartWidth", "borderEndWidth"})
    public void setBorderWidth(k kVar, int i10, float f10) {
        C3400a.t(kVar, m.values()[i10], Float.valueOf(f10));
    }

    @C3500a(name = "dataDetectorType")
    public void setDataDetectorType(k kVar, String str) {
        if (str != null) {
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1192969641:
                    if (str.equals("phoneNumber")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 96673:
                    if (str.equals("all")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3321850:
                    if (str.equals(ActionType.LINK)) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 96619420:
                    if (str.equals("email")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    kVar.setLinkifyMask(4);
                    return;
                case 1:
                    kVar.setLinkifyMask(15);
                    return;
                case 2:
                    kVar.setLinkifyMask(1);
                    return;
                case 3:
                    kVar.setLinkifyMask(2);
                    return;
            }
        }
        kVar.setLinkifyMask(0);
    }

    @C3500a(defaultBoolean = false, name = "disabled")
    public void setDisabled(k kVar, boolean z10) {
        kVar.setEnabled(!z10);
    }

    @C3500a(name = "ellipsizeMode")
    public void setEllipsizeMode(k kVar, String str) {
        if (str == null || str.equals("tail")) {
            kVar.setEllipsizeLocation(TextUtils.TruncateAt.END);
        } else if (str.equals("head")) {
            kVar.setEllipsizeLocation(TextUtils.TruncateAt.START);
        } else if (str.equals("middle")) {
            kVar.setEllipsizeLocation(TextUtils.TruncateAt.MIDDLE);
        } else if (str.equals("clip")) {
            kVar.setEllipsizeLocation((TextUtils.TruncateAt) null);
        } else {
            a.I("ReactNative", "Invalid ellipsizeMode: " + str);
            kVar.setEllipsizeLocation(TextUtils.TruncateAt.END);
        }
    }

    @C3500a(name = "fontSize")
    public void setFontSize(k kVar, float f10) {
        kVar.setFontSize(f10);
    }

    @C3500a(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(k kVar, boolean z10) {
        kVar.setIncludeFontPadding(z10);
    }

    @C3500a(defaultFloat = 0.0f, name = "letterSpacing")
    public void setLetterSpacing(k kVar, float f10) {
        kVar.setLetterSpacing(f10);
    }

    @C3500a(name = "onInlineViewLayout")
    public void setNotifyOnInlineViewLayout(k kVar, boolean z10) {
        kVar.setNotifyOnInlineViewLayout(z10);
    }

    @C3500a(defaultInt = Integer.MAX_VALUE, name = "numberOfLines")
    public void setNumberOfLines(k kVar, int i10) {
        kVar.setNumberOfLines(i10);
    }

    @C3500a(name = "selectable")
    public void setSelectable(k kVar, boolean z10) {
        kVar.setTextIsSelectable(z10);
    }

    @C3500a(customType = "Color", name = "selectionColor")
    public void setSelectionColor(k kVar, Integer num) {
        if (num == null) {
            kVar.setHighlightColor(a.c(kVar.getContext()));
        } else {
            kVar.setHighlightColor(num.intValue());
        }
    }

    @C3500a(name = "textAlignVertical")
    public void setTextAlignVertical(k kVar, String str) {
        if (str == null || "auto".equals(str)) {
            kVar.setGravityVertical(0);
        } else if (VerticalAlignment.TOP.equals(str)) {
            kVar.setGravityVertical(48);
        } else if (VerticalAlignment.BOTTOM.equals(str)) {
            kVar.setGravityVertical(80);
        } else if ("center".equals(str)) {
            kVar.setGravityVertical(16);
        } else {
            a.I("ReactNative", "Invalid textAlignVertical: " + str);
            kVar.setGravityVertical(0);
        }
    }
}
