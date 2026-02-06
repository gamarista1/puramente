package i3;

import android.content.res.Resources;
import android.text.TextUtils;
import f2.C1960A;
import f2.s;
import i2.C2076a;
import i2.L;
import java.util.Locale;

/* renamed from: i3.f  reason: case insensitive filesystem */
public class C2095f implements e0 {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f22477a;

    public C2095f(Resources resources) {
        this.f22477a = (Resources) C2076a.e(resources);
    }

    private String b(s sVar) {
        int i10 = sVar.f20059B;
        if (i10 == -1 || i10 < 1) {
            return "";
        }
        if (i10 == 1) {
            return this.f22477a.getString(Z.f22354q);
        }
        if (i10 == 2) {
            return this.f22477a.getString(Z.f22363z);
        }
        if (i10 == 6 || i10 == 7) {
            return this.f22477a.getString(Z.f22334B);
        }
        if (i10 != 8) {
            return this.f22477a.getString(Z.f22333A);
        }
        return this.f22477a.getString(Z.f22335C);
    }

    private String c(s sVar) {
        int i10 = sVar.f20078i;
        if (i10 == -1) {
            return "";
        }
        return this.f22477a.getString(Z.f22353p, new Object[]{Float.valueOf(((float) i10) / 1000000.0f)});
    }

    private String d(s sVar) {
        if (TextUtils.isEmpty(sVar.f20071b)) {
            return "";
        }
        return sVar.f20071b;
    }

    private String e(s sVar) {
        String j10 = j(f(sVar), h(sVar));
        if (TextUtils.isEmpty(j10)) {
            return d(sVar);
        }
        return j10;
    }

    private String f(s sVar) {
        Locale locale;
        String str = sVar.f20073d;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return "";
        }
        if (L.f22072a >= 21) {
            locale = Locale.forLanguageTag(str);
        } else {
            locale = new Locale(str);
        }
        Locale S10 = L.S();
        String displayName = locale.getDisplayName(S10);
        if (TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int offsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            return displayName.substring(0, offsetByCodePoints).toUpperCase(S10) + displayName.substring(offsetByCodePoints);
        } catch (IndexOutOfBoundsException unused) {
            return displayName;
        }
    }

    private String g(s sVar) {
        int i10 = sVar.f20089t;
        int i11 = sVar.f20090u;
        if (i10 == -1 || i11 == -1) {
            return "";
        }
        return this.f22477a.getString(Z.f22355r, new Object[]{Integer.valueOf(i10), Integer.valueOf(i11)});
    }

    private String h(s sVar) {
        String str;
        if ((sVar.f20075f & 2) != 0) {
            str = this.f22477a.getString(Z.f22356s);
        } else {
            str = "";
        }
        if ((sVar.f20075f & 4) != 0) {
            str = j(str, this.f22477a.getString(Z.f22359v));
        }
        if ((sVar.f20075f & 8) != 0) {
            str = j(str, this.f22477a.getString(Z.f22358u));
        }
        if ((sVar.f20075f & 1088) != 0) {
            return j(str, this.f22477a.getString(Z.f22357t));
        }
        return str;
    }

    private static int i(s sVar) {
        int i10 = C1960A.i(sVar.f20083n);
        if (i10 != -1) {
            return i10;
        }
        if (C1960A.k(sVar.f20079j) != null) {
            return 2;
        }
        if (C1960A.b(sVar.f20079j) != null) {
            return 1;
        }
        if (sVar.f20089t != -1 || sVar.f20090u != -1) {
            return 2;
        }
        if (sVar.f20059B == -1 && sVar.f20060C == -1) {
            return -1;
        }
        return 1;
    }

    private String j(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                if (TextUtils.isEmpty(str)) {
                    str = str2;
                } else {
                    str = this.f22477a.getString(Z.f22352o, new Object[]{str, str2});
                }
            }
        }
        return str;
    }

    public String a(s sVar) {
        String str;
        int i10 = i(sVar);
        if (i10 == 2) {
            str = j(h(sVar), g(sVar), c(sVar));
        } else if (i10 == 1) {
            str = j(e(sVar), b(sVar), c(sVar));
        } else {
            str = e(sVar);
        }
        if (str.length() != 0) {
            return str;
        }
        String str2 = sVar.f20073d;
        if (str2 == null || str2.trim().isEmpty()) {
            return this.f22477a.getString(Z.f22336D);
        }
        return this.f22477a.getString(Z.f22337E, new Object[]{str2});
    }
}
