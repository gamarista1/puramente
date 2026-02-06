package Cf;

import java.util.Random;
import kotlin.jvm.internal.C6496s;

public final class b extends a {

    /* renamed from: c  reason: collision with root package name */
    private final a f62629c = new a();

    public static final class a extends ThreadLocal {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    public Random i() {
        Object obj = this.f62629c.get();
        C6496s.g(obj, "get(...)");
        return (Random) obj;
    }
}
