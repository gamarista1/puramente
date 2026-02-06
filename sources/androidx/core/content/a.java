package androidx.core.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import u1.d;
import u1.l;

public abstract class a {
    public static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        try {
            return contentResolver.query(uri, strArr, str, strArr2, str2, cancellationSignal);
        } catch (Exception e10) {
            if (e10 instanceof OperationCanceledException) {
                throw new l();
            }
            throw e10;
        }
    }

    public static Cursor b(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, d dVar) {
        CancellationSignal cancellationSignal;
        if (dVar != null) {
            cancellationSignal = (CancellationSignal) dVar.b();
        } else {
            cancellationSignal = null;
        }
        return a(contentResolver, uri, strArr, str, strArr2, str2, cancellationSignal);
    }
}
