package com.facebook.react.uimanager;

import android.graphics.BlendMode;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C1692h0;
import com.adjust.sdk.Constants;
import com.facebook.react.C3367m;
import kotlin.jvm.internal.C6496s;

/* renamed from: com.facebook.react.uimanager.d  reason: case insensitive filesystem */
public final class C3406d {

    /* renamed from: a  reason: collision with root package name */
    public static final C3406d f41565a = new C3406d();

    private C3406d() {
    }

    public static final boolean a(ViewGroup viewGroup) {
        C6496s.h(viewGroup, "view");
        for (View tag : C1692h0.a(viewGroup)) {
            if (tag.getTag(C3367m.f40942r) != null) {
                return true;
            }
        }
        return false;
    }

    public static final BlendMode b(String str) {
        if (str == null || Build.VERSION.SDK_INT < 29) {
            return null;
        }
        switch (str.hashCode()) {
            case -2120744511:
                if (str.equals("luminosity")) {
                    return BlendMode.LUMINOSITY;
                }
                break;
            case -1427739212:
                if (str.equals("hard-light")) {
                    return BlendMode.HARD_LIGHT;
                }
                break;
            case -1338968417:
                if (str.equals("darken")) {
                    return BlendMode.DARKEN;
                }
                break;
            case -1247677005:
                if (str.equals("soft-light")) {
                    return BlendMode.SOFT_LIGHT;
                }
                break;
            case -1091287984:
                if (str.equals("overlay")) {
                    return BlendMode.OVERLAY;
                }
                break;
            case -1039745817:
                if (str.equals(Constants.NORMAL)) {
                    return null;
                }
                break;
            case -907689876:
                if (str.equals("screen")) {
                    return BlendMode.SCREEN;
                }
                break;
            case -230491182:
                if (str.equals("saturation")) {
                    return BlendMode.SATURATION;
                }
                break;
            case -120580883:
                if (str.equals("color-dodge")) {
                    return BlendMode.COLOR_DODGE;
                }
                break;
            case 103672:
                if (str.equals("hue")) {
                    return BlendMode.HUE;
                }
                break;
            case 94842723:
                if (str.equals("color")) {
                    return BlendMode.COLOR;
                }
                break;
            case 170546239:
                if (str.equals("lighten")) {
                    return BlendMode.LIGHTEN;
                }
                break;
            case 653829668:
                if (str.equals("multiply")) {
                    return BlendMode.MULTIPLY;
                }
                break;
            case 1242982905:
                if (str.equals("color-burn")) {
                    return BlendMode.COLOR_BURN;
                }
                break;
            case 1686617550:
                if (str.equals("exclusion")) {
                    return BlendMode.EXCLUSION;
                }
                break;
            case 1728361789:
                if (str.equals("difference")) {
                    return BlendMode.DIFFERENCE;
                }
                break;
        }
        throw new IllegalArgumentException("Invalid mix-blend-mode name: " + str);
    }
}
