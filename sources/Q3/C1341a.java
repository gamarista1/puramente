package Q3;

import android.app.Application;
import kotlin.jvm.internal.C6496s;

/* renamed from: Q3.a  reason: case insensitive filesystem */
final class C1341a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1341a f5451a = new C1341a();

    private C1341a() {
    }

    public final String a() {
        String processName = Application.getProcessName();
        C6496s.g(processName, "getProcessName()");
        return processName;
    }
}
