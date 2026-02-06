package ha;

import android.content.res.Resources;
import android.text.TextUtils;
import ja.C3645a;
import ja.M;
import ja.w;
import java.util.Locale;
import k9.C3717q0;

public class b implements g {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f44140a;

    public b(Resources resources) {
        this.f44140a = (Resources) C3645a.e(resources);
    }

    private String b(C3717q0 q0Var) {
        int i10 = q0Var.f45783y;
        if (i10 == -1 || i10 < 1) {
            return "";
        }
        if (i10 == 1) {
            return this.f44140a.getString(e.f44146c);
        }
        if (i10 == 2) {
            return this.f44140a.getString(e.f44154k);
        }
        if (i10 == 6 || i10 == 7) {
            return this.f44140a.getString(e.f44156m);
        }
        if (i10 != 8) {
            return this.f44140a.getString(e.f44155l);
        }
        return this.f44140a.getString(e.f44157n);
    }

    private String c(C3717q0 q0Var) {
        int i10 = q0Var.f45766h;
        if (i10 == -1) {
            return "";
        }
        return this.f44140a.getString(e.f44145b, new Object[]{Float.valueOf(((float) i10) / 1000000.0f)});
    }

    private String d(C3717q0 q0Var) {
        if (TextUtils.isEmpty(q0Var.f45760b)) {
            return "";
        }
        return q0Var.f45760b;
    }

    private String e(C3717q0 q0Var) {
        String j10 = j(f(q0Var), h(q0Var));
        if (TextUtils.isEmpty(j10)) {
            return d(q0Var);
        }
        return j10;
    }

    private String f(C3717q0 q0Var) {
        Locale locale;
        String str = q0Var.f45761c;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return "";
        }
        if (M.f44981a >= 21) {
            locale = Locale.forLanguageTag(str);
        } else {
            locale = new Locale(str);
        }
        Locale R10 = M.R();
        String displayName = locale.getDisplayName(R10);
        if (TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int offsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            return displayName.substring(0, offsetByCodePoints).toUpperCase(R10) + displayName.substring(offsetByCodePoints);
        } catch (IndexOutOfBoundsException unused) {
            return displayName;
        }
    }

    private String g(C3717q0 q0Var) {
        int i10 = q0Var.f45775q;
        int i11 = q0Var.f45776r;
        if (i10 == -1 || i11 == -1) {
            return "";
        }
        return this.f44140a.getString(e.f44147d, new Object[]{Integer.valueOf(i10), Integer.valueOf(i11)});
    }

    private String h(C3717q0 q0Var) {
        String str;
        if ((q0Var.f45763e & 2) != 0) {
            str = this.f44140a.getString(e.f44148e);
        } else {
            str = "";
        }
        if ((q0Var.f45763e & 4) != 0) {
            str = j(str, this.f44140a.getString(e.f44151h));
        }
        if ((q0Var.f45763e & 8) != 0) {
            str = j(str, this.f44140a.getString(e.f44150g));
        }
        if ((q0Var.f45763e & 1088) != 0) {
            return j(str, this.f44140a.getString(e.f44149f));
        }
        return str;
    }

    private static int i(C3717q0 q0Var) {
        int k10 = w.k(q0Var.f45770l);
        if (k10 != -1) {
            return k10;
        }
        if (w.n(q0Var.f45767i) != null) {
            return 2;
        }
        if (w.c(q0Var.f45767i) != null) {
            return 1;
        }
        if (q0Var.f45775q != -1 || q0Var.f45776r != -1) {
            return 2;
        }
        if (q0Var.f45783y == -1 && q0Var.f45784z == -1) {
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
                    str = this.f44140a.getString(e.f44144a, new Object[]{str, str2});
                }
            }
        }
        return str;
    }

    public String a(C3717q0 q0Var) {
        String str;
        int i10 = i(q0Var);
        if (i10 == 2) {
            str = j(h(q0Var), g(q0Var), c(q0Var));
        } else if (i10 == 1) {
            str = j(e(q0Var), b(q0Var), c(q0Var));
        } else {
            str = e(q0Var);
        }
        if (str.length() == 0) {
            return this.f44140a.getString(e.f44158o);
        }
        return str;
    }
}
