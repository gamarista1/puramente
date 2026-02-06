package com.facebook.react.views.image;

import U5.a;
import android.graphics.Shader;
import kotlin.jvm.internal.C6496s;
import q6.q;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f41877a = new d();

    private d() {
    }

    public static final Shader.TileMode a() {
        return Shader.TileMode.CLAMP;
    }

    public static final q b() {
        q qVar = q.f47741i;
        C6496s.g(qVar, "CENTER_CROP");
        return qVar;
    }

    public static final q c(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1881872635:
                    if (str.equals("stretch")) {
                        q qVar = q.f47733a;
                        C6496s.g(qVar, "FIT_XY");
                        return qVar;
                    }
                    break;
                case -1364013995:
                    if (str.equals("center")) {
                        q qVar2 = q.f47740h;
                        C6496s.g(qVar2, "CENTER_INSIDE");
                        return qVar2;
                    }
                    break;
                case -934531685:
                    if (str.equals("repeat")) {
                        return i.f41908l.a();
                    }
                    break;
                case 3387192:
                    if (str.equals("none")) {
                        return i.f41908l.a();
                    }
                    break;
                case 94852023:
                    if (str.equals("cover")) {
                        q qVar3 = q.f47741i;
                        C6496s.g(qVar3, "CENTER_CROP");
                        return qVar3;
                    }
                    break;
                case 951526612:
                    if (str.equals("contain")) {
                        q qVar4 = q.f47737e;
                        C6496s.g(qVar4, "FIT_CENTER");
                        return qVar4;
                    }
                    break;
            }
        }
        if (str != null) {
            a.I("ReactNative", "Invalid resize mode: '" + str + "'");
        }
        return b();
    }

    public static final Shader.TileMode d(String str) {
        if (C6496s.c("contain", str) || C6496s.c("cover", str) || C6496s.c("stretch", str) || C6496s.c("center", str) || C6496s.c("none", str)) {
            return Shader.TileMode.CLAMP;
        }
        if (C6496s.c("repeat", str)) {
            return Shader.TileMode.REPEAT;
        }
        if (str != null) {
            a.I("ReactNative", "Invalid resize mode: '" + str + "'");
        }
        return a();
    }
}
