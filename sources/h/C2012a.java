package h;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.C6496s;

/* renamed from: h.a  reason: case insensitive filesystem */
public abstract class C2012a {

    /* renamed from: h.a$a  reason: collision with other inner class name */
    public static final class C0351a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f21092a;

        public C0351a(Object obj) {
            this.f21092a = obj;
        }

        public final Object a() {
            return this.f21092a;
        }
    }

    public abstract Intent createIntent(Context context, Object obj);

    public C0351a getSynchronousResult(Context context, Object obj) {
        C6496s.h(context, "context");
        return null;
    }

    public abstract Object parseResult(int i10, Intent intent);
}
