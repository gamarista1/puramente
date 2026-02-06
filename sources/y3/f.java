package y3;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.amazon.a.a.o.b;
import java.util.List;
import kotlin.jvm.internal.C6496s;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f28728a = new f();

    private f() {
    }

    public static final List a(Cursor cursor) {
        C6496s.h(cursor, b.f37479b);
        List<Uri> notificationUris = cursor.getNotificationUris();
        C6496s.e(notificationUris);
        return notificationUris;
    }

    public static final void b(Cursor cursor, ContentResolver contentResolver, List list) {
        C6496s.h(cursor, b.f37479b);
        C6496s.h(contentResolver, "cr");
        C6496s.h(list, "uris");
        cursor.setNotificationUris(contentResolver, list);
    }
}
