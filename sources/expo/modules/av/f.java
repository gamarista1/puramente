package expo.modules.av;

import Hd.s;
import Hd.t;
import Md.b;
import Md.d;
import Qd.c;
import ae.p;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.r;
import expo.modules.av.video.VideoViewWrapper;
import expo.modules.av.video.g;
import kotlin.jvm.internal.C6496s;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f60245a = new f();

    public interface a {
        void a(g gVar);
    }

    private f() {
    }

    public static final void c(b bVar, int i10, a aVar, d dVar) {
        C6496s.h(bVar, "moduleRegistry");
        C6496s.h(aVar, "callback");
        C6496s.h(dVar, BaseJavaModule.METHOD_TYPE_PROMISE);
        if (UiThreadUtil.isOnUiThread()) {
            f60245a.g(bVar, i10, aVar, dVar);
        } else {
            UiThreadUtil.runOnUiThread(new t(bVar, i10, aVar, dVar));
        }
    }

    /* access modifiers changed from: private */
    public static final void e(b bVar, int i10, a aVar, d dVar) {
        f60245a.g(bVar, i10, aVar, dVar);
    }

    /* access modifiers changed from: private */
    public static final void f(b bVar, int i10, a aVar, p pVar) {
        f60245a.h(bVar, i10, aVar, pVar);
    }

    private final void g(b bVar, int i10, a aVar, d dVar) {
        g gVar;
        try {
            VideoViewWrapper videoViewWrapper = (VideoViewWrapper) ((c) bVar.b(c.class)).resolveView(i10);
            if (videoViewWrapper != null) {
                gVar = videoViewWrapper.getVideoViewInstance();
            } else {
                gVar = null;
            }
            if (gVar != null) {
                aVar.a(gVar);
            } else {
                dVar.reject("E_VIDEO_TAGINCORRECT", "Invalid view returned from registry.");
            }
        } catch (r unused) {
            dVar.reject("E_VIDEO_TAGINCORRECT", "Invalid view returned from registry.");
        }
    }

    private final void h(b bVar, int i10, a aVar, p pVar) {
        g gVar;
        try {
            VideoViewWrapper videoViewWrapper = (VideoViewWrapper) ((c) bVar.b(c.class)).resolveView(i10);
            if (videoViewWrapper != null) {
                gVar = videoViewWrapper.getVideoViewInstance();
            } else {
                gVar = null;
            }
            if (gVar != null) {
                aVar.a(gVar);
            } else {
                pVar.reject("E_VIDEO_TAGINCORRECT", "Invalid view returned from registry.", (Throwable) null);
            }
        } catch (r unused) {
            pVar.reject("E_VIDEO_TAGINCORRECT", "Invalid view returned from registry.", (Throwable) null);
        }
    }

    public final void d(b bVar, int i10, a aVar, p pVar) {
        C6496s.h(bVar, "moduleRegistry");
        C6496s.h(aVar, "callback");
        C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
        if (UiThreadUtil.isOnUiThread()) {
            h(bVar, i10, aVar, pVar);
        } else {
            UiThreadUtil.runOnUiThread(new s(bVar, i10, aVar, pVar));
        }
    }
}
