package com.revenuecat.purchases.paywalls;

import Sg.C5538a;
import Sg.k;
import Sg.m;
import Sg.p;
import android.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a7\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "stringRepresentation", "", "parseRGBAColor", "(Ljava/lang/String;)I", "alpha", "red", "green", "blue", "colorInt", "(IIII)I", "LSg/m;", "rgbaColorRegex", "LSg/m;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ColorUtilsKt {
    private static final m rgbaColorRegex = new m("^#([A-Fa-f0-9]{2})([A-Fa-f0-9]{2})([A-Fa-f0-9]{2})([A-Fa-f0-9]{2})?$");

    public static final int colorInt(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    public static final int parseRGBAColor(String str) {
        C6496s.h(str, "stringRepresentation");
        k c10 = rgbaColorRegex.c(str);
        if (c10 == null) {
            return Color.parseColor(str);
        }
        k.b a10 = c10.a();
        String str2 = (String) a10.a().b().get(1);
        String str3 = (String) a10.a().b().get(2);
        String str4 = (String) a10.a().b().get(3);
        Object r02 = C6565s.r0(c10.b(), 4);
        String str5 = (String) r02;
        if (str5 == null || p.d0(str5)) {
            r02 = null;
        }
        String str6 = (String) r02;
        if (str6 == null) {
            str6 = "FF";
        }
        return colorInt(Integer.parseInt(str6, C5538a.a(16)), Integer.parseInt(str2, C5538a.a(16)), Integer.parseInt(str3, C5538a.a(16)), Integer.parseInt(str4, C5538a.a(16)));
    }
}
