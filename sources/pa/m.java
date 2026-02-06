package Pa;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4536s;
import ya.C5291h;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f52136a;

    /* renamed from: b  reason: collision with root package name */
    private final String f52137b;

    public m(Context context, String str) {
        C4536s.l(context);
        this.f52136a = context.getResources();
        if (!TextUtils.isEmpty(str)) {
            this.f52137b = str;
        } else {
            this.f52137b = a(context);
        }
    }

    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(C5291h.f62281a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public final String b(String str) {
        int identifier = this.f52136a.getIdentifier(str, "string", this.f52137b);
        if (identifier == 0) {
            return null;
        }
        try {
            return this.f52136a.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
