package K4;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import kotlin.jvm.internal.C6496s;

public abstract class a extends ContentProvider {
    /* access modifiers changed from: protected */
    public final void a() {
        String str;
        int i10 = Build.VERSION.SDK_INT;
        if (26 <= i10 && i10 < 29) {
            String callingPackage = getCallingPackage();
            if (callingPackage != null) {
                Context context = getContext();
                if (context == null) {
                    str = null;
                } else {
                    str = context.getPackageName();
                }
                if (C6496s.c(callingPackage, str)) {
                    return;
                }
            }
            throw new SecurityException("Provider does not allow Uri permissions to be granted");
        }
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        a();
        return 0;
    }

    public final String getType(Uri uri) {
        a();
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        a();
        return null;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        a();
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        a();
        return 0;
    }
}
