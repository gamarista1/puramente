package retrofit2;

import java.util.concurrent.Executor;
import retrofit2.C6670c;
import retrofit2.z;

abstract class y {

    /* renamed from: a  reason: collision with root package name */
    static final Executor f72996a;

    /* renamed from: b  reason: collision with root package name */
    static final z f72997b;

    /* renamed from: c  reason: collision with root package name */
    static final C6670c f72998c;

    static {
        String property = System.getProperty("java.vm.name");
        property.hashCode();
        if (property.equals("RoboVM")) {
            f72996a = null;
            f72997b = new z();
            f72998c = new C6670c();
        } else if (!property.equals("Dalvik")) {
            f72996a = null;
            f72997b = new z.b();
            f72998c = new C6670c.a();
        } else {
            f72996a = new C6668a();
            f72997b = new z.a();
            f72998c = new C6670c.a();
        }
    }
}
