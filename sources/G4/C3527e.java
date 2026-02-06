package g4;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import j4.C3627n;

/* renamed from: g4.e  reason: case insensitive filesystem */
public final class C3527e implements C3526d {
    private final boolean b(int i10, Context context) {
        try {
            if (context.getResources().getResourceEntryName(i10) != null) {
                return true;
            }
            return false;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    public /* bridge */ /* synthetic */ Object a(Object obj, C3627n nVar) {
        return c(((Number) obj).intValue(), nVar);
    }

    public Uri c(int i10, C3627n nVar) {
        if (!b(i10, nVar.g())) {
            return null;
        }
        return Uri.parse("android.resource://" + nVar.g().getPackageName() + '/' + i10);
    }
}
