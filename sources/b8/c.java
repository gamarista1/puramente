package b8;

import com.facebook.react.bridge.UiThreadUtil;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C6496s;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f36257a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final Executor f36258b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final Executor f36259c = new a();

    private static final class a implements Executor {
        public void execute(Runnable runnable) {
            C6496s.h(runnable, "command");
            runnable.run();
        }
    }

    private static final class b implements Executor {
        public void execute(Runnable runnable) {
            C6496s.h(runnable, "command");
            UiThreadUtil.runOnUiThread(runnable);
        }
    }

    private c() {
    }
}
