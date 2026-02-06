package y3;

import android.database.Cursor;
import android.os.Bundle;
import com.amazon.a.a.o.b;
import kotlin.jvm.internal.C6496s;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f28727a = new e();

    private e() {
    }

    public static final void a(Cursor cursor, Bundle bundle) {
        C6496s.h(cursor, b.f37479b);
        C6496s.h(bundle, "extras");
        cursor.setExtras(bundle);
    }
}
