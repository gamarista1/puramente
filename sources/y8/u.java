package Y8;

import android.content.Context;
import g9.C3546d;
import java.io.Closeable;

abstract class u implements Closeable {

    interface a {
        a a(Context context);

        u f();
    }

    u() {
    }

    /* access modifiers changed from: package-private */
    public abstract C3546d a();

    /* access modifiers changed from: package-private */
    public abstract t b();

    public void close() {
        a().close();
    }
}
