package Gd;

import android.content.Context;
import android.content.res.Resources;
import java.io.InputStream;
import kotlin.jvm.internal.C6496s;

public abstract class d {
    private static final Integer a(Context context, String str) {
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        Integer valueOf = Integer.valueOf(resources.getIdentifier(str, "raw", packageName));
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf;
        }
        Integer valueOf2 = Integer.valueOf(resources.getIdentifier(str, "drawable", packageName));
        if (valueOf2.intValue() != 0) {
            return valueOf2;
        }
        return null;
    }

    public static final InputStream b(Context context, String str) {
        C6496s.h(context, "context");
        C6496s.h(str, "assetName");
        Resources resources = context.getResources();
        Integer a10 = a(context, str);
        if (a10 != null) {
            InputStream openRawResource = resources.openRawResource(a10.intValue());
            C6496s.g(openRawResource, "openRawResource(...)");
            return openRawResource;
        }
        throw new Resources.NotFoundException(str);
    }
}
