package L7;

import L7.b;
import android.view.Choreographer;
import com.facebook.react.bridge.UiThreadUtil;
import kotlin.jvm.internal.C6496s;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f32569a = new a();

    /* renamed from: L7.a$a  reason: collision with other inner class name */
    private static final class C0532a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        private final Choreographer f32570a;

        public C0532a() {
            Choreographer instance = Choreographer.getInstance();
            C6496s.g(instance, "getInstance(...)");
            this.f32570a = instance;
        }

        public void a(Choreographer.FrameCallback frameCallback) {
            C6496s.h(frameCallback, "callback");
            this.f32570a.postFrameCallback(frameCallback);
        }

        public void b(Choreographer.FrameCallback frameCallback) {
            C6496s.h(frameCallback, "callback");
            this.f32570a.removeFrameCallback(frameCallback);
        }
    }

    private a() {
    }

    public static final a b() {
        return f32569a;
    }

    public b.a a() {
        UiThreadUtil.assertOnUiThread();
        return new C0532a();
    }
}
