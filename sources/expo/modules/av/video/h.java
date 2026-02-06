package expo.modules.av.video;

import android.view.View;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReadableMap;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import expo.modules.av.f;
import ie.C5037g;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import lf.C6502A;
import lf.C6514M;
import qe.C5155b;
import qe.C5157d;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lexpo/modules/av/video/h;", "Lke/b;", "<init>", "()V", "Lke/d;", "b", "()Lke/d;", "expo-av_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h extends ke.b {

    static final class a implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f60376a = new a();

        a() {
        }

        public final void a(VideoViewWrapper videoViewWrapper) {
            C6496s.h(videoViewWrapper, "view");
            videoViewWrapper.getVideoViewInstance().H();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((VideoViewWrapper) obj);
            return C6514M.f71813a;
        }
    }

    static final class b implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final b f60377a = new b();

        b() {
        }

        public final void a(VideoViewWrapper videoViewWrapper, ReadableMap readableMap) {
            C6496s.h(videoViewWrapper, "view");
            C6496s.h(readableMap, "status");
            videoViewWrapper.getVideoViewInstance().K(new Nd.a(readableMap.toHashMap()), (Md.d) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((VideoViewWrapper) obj, (ReadableMap) obj2);
            return C6514M.f71813a;
        }
    }

    static final class c implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final c f60378a = new c();

        c() {
        }

        public final void a(VideoViewWrapper videoViewWrapper, boolean z10) {
            C6496s.h(videoViewWrapper, "view");
            videoViewWrapper.getVideoViewInstance().setUseNativeControls(z10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((VideoViewWrapper) obj, ((Boolean) obj2).booleanValue());
            return C6514M.f71813a;
        }
    }

    static final class d implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final d f60379a = new d();

        d() {
        }

        public final void a(VideoViewWrapper videoViewWrapper, ReadableMap readableMap) {
            C6496s.h(videoViewWrapper, "view");
            C6496s.h(readableMap, "source");
            videoViewWrapper.getVideoViewInstance().setSource(new Nd.a(readableMap.toHashMap()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((VideoViewWrapper) obj, (ReadableMap) obj2);
            return C6514M.f71813a;
        }
    }

    static final class e implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final e f60380a = new e();

        e() {
        }

        public final void a(VideoViewWrapper videoViewWrapper, String str) {
            C6496s.h(videoViewWrapper, "view");
            C6496s.h(str, "resizeModeOrdinalString");
            videoViewWrapper.getVideoViewInstance().setResizeMode(Kd.b.values()[Integer.parseInt(str)]);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((VideoViewWrapper) obj, (String) obj2);
            return C6514M.f71813a;
        }
    }

    public static final class f implements f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f60381a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ae.p f60382b;

        public static final class a extends d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ae.p f60383a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ g f60384b;

            a(ae.p pVar, g gVar) {
                this.f60383a = pVar;
                this.f60384b = gVar;
            }

            public void a() {
                this.f60383a.resolve(this.f60384b.getStatus());
            }

            public void b() {
                this.f60383a.resolve(this.f60384b.getStatus());
            }

            /* access modifiers changed from: protected */
            public void e(String str) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("This presentation change has been interrupted by an error.");
                if (str != null) {
                    sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                    sb2.append(str);
                }
                this.f60383a.reject("E_FULLSCREEN_VIDEO_PLAYER", sb2.toString(), (Throwable) null);
            }

            /* access modifiers changed from: protected */
            public void f() {
                this.f60383a.reject("E_FULLSCREEN_VIDEO_PLAYER", "This presentation change has been interrupted by a newer change request.", (Throwable) null);
            }

            /* access modifiers changed from: protected */
            public void g() {
                this.f60383a.reject("E_FULLSCREEN_VIDEO_PLAYER", "This presentation change tries to interrupt an older request. Await the old request and then try again.", (Throwable) null);
            }
        }

        f(boolean z10, ae.p pVar) {
            this.f60381a = z10;
            this.f60382b = pVar;
        }

        public void a(g gVar) {
            C6496s.h(gVar, "videoView");
            a aVar = new a(this.f60382b, gVar);
            if (this.f60381a) {
                gVar.D(aVar);
            } else {
                gVar.B(aVar);
            }
        }
    }

    public static final class g implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final g f60385a = new g();

        /* renamed from: a */
        public final Ff.p invoke() {
            return O.m(Integer.TYPE);
        }
    }

    /* renamed from: expo.modules.av.video.h$h  reason: collision with other inner class name */
    public static final class C0885h implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0885h f60386a = new C0885h();

        /* renamed from: a */
        public final Ff.p invoke() {
            return O.m(Boolean.TYPE);
        }
    }

    public static final class i implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f60387a;

        public i(h hVar) {
            this.f60387a = hVar;
        }

        public final void a(Object[] objArr, ae.p pVar) {
            C6496s.h(objArr, "<destruct>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            Number number = objArr[0];
            boolean booleanValue = objArr[1].booleanValue();
            expo.modules.av.f.f60245a.d(this.f60387a.c().p(), number.intValue(), new f(booleanValue, pVar), pVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (ae.p) obj2);
            return C6514M.f71813a;
        }
    }

    public static final class j implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final j f60388a = new j();

        /* renamed from: a */
        public final Ff.p invoke() {
            return O.m(VideoViewWrapper.class);
        }
    }

    public static final class k implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6798l f60389a;

        public k(C6798l lVar) {
            this.f60389a = lVar;
        }

        public final void a(View view) {
            C6496s.h(view, "it");
            this.f60389a.invoke((VideoViewWrapper) view);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((View) obj);
            return C6514M.f71813a;
        }
    }

    public static final class l implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final l f60390a = new l();

        /* renamed from: a */
        public final Ff.p invoke() {
            return O.m(ReadableMap.class);
        }
    }

    public static final class m implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final m f60391a = new m();

        /* renamed from: a */
        public final Ff.p invoke() {
            return O.m(Boolean.TYPE);
        }
    }

    public static final class n implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final n f60392a = new n();

        /* renamed from: a */
        public final Ff.p invoke() {
            return O.m(ReadableMap.class);
        }
    }

    public static final class o implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final o f60393a = new o();

        /* renamed from: a */
        public final Ff.p invoke() {
            return O.m(String.class);
        }
    }

    public ke.d b() {
        Class<Integer> cls;
        Class<Integer> cls2 = Integer.class;
        Class<String> cls3 = String.class;
        Class<VideoViewWrapper> cls4 = VideoViewWrapper.class;
        Class<Boolean> cls5 = Boolean.class;
        Class<ReadableMap> cls6 = ReadableMap.class;
        D3.a.c("[" + "ExpoModulesCore" + "] " + (getClass() + ".ModuleDefinition"));
        try {
            ke.c cVar = new ke.c(this);
            cVar.o("ExpoVideoView");
            Ff.d b10 = O.b(cls4);
            if (cVar.s() == null) {
                expo.modules.kotlin.views.l lVar = new expo.modules.kotlin.views.l(b10, new qe.O(O.b(cls4), false, j.f60388a, 2, (DefaultConstructorMarker) null));
                we.b.g(lVar);
                lVar.h(new k(a.f60376a));
                lVar.b("onStatusUpdate", "onLoadStart", "onLoad", "onError", "onReadyForDisplay", "onFullscreenUpdate");
                b bVar = b.f60377a;
                Map f10 = lVar.f();
                C5157d dVar = C5157d.f61437a;
                Ff.d b11 = O.b(cls6);
                Boolean bool = Boolean.FALSE;
                C5155b bVar2 = (C5155b) dVar.a().get(new Pair(b11, bool));
                if (bVar2 == null) {
                    try {
                        cls = cls2;
                        bVar2 = new C5155b(new qe.O(O.b(cls6), false, l.f60390a));
                    } catch (Throwable th2) {
                        th = th2;
                        D3.a.f();
                        throw th;
                    }
                } else {
                    cls = cls2;
                }
                f10.put("status", new expo.modules.kotlin.views.c("status", bVar2, bVar));
                c cVar2 = c.f60378a;
                Map f11 = lVar.f();
                C5155b bVar3 = (C5155b) dVar.a().get(new Pair(O.b(cls5), bool));
                if (bVar3 == null) {
                    bVar3 = new C5155b(new qe.O(O.b(cls5), false, m.f60391a));
                }
                f11.put("useNativeControls", new expo.modules.kotlin.views.c("useNativeControls", bVar3, cVar2));
                d dVar2 = d.f60379a;
                Map f12 = lVar.f();
                C5155b bVar4 = (C5155b) dVar.a().get(new Pair(O.b(cls6), bool));
                if (bVar4 == null) {
                    bVar4 = new C5155b(new qe.O(O.b(cls6), false, n.f60392a));
                }
                f12.put("source", new expo.modules.kotlin.views.c("source", bVar4, dVar2));
                e eVar = e.f60380a;
                Map f13 = lVar.f();
                C5155b bVar5 = (C5155b) dVar.a().get(new Pair(O.b(cls3), bool));
                if (bVar5 == null) {
                    bVar5 = new C5155b(new qe.O(O.b(cls3), false, o.f60393a));
                }
                f13.put("resizeMode", new expo.modules.kotlin.views.c("resizeMode", bVar5, eVar));
                cVar.t(lVar.c());
                cVar.e(C6502A.a("ScaleNone", String.valueOf(Kd.b.LEFT_TOP.ordinal())), C6502A.a("ScaleToFill", String.valueOf(Kd.b.FIT_XY.ordinal())), C6502A.a("ScaleAspectFit", String.valueOf(Kd.b.FIT_CENTER.ordinal())), C6502A.a("ScaleAspectFill", String.valueOf(Kd.b.CENTER_CROP.ordinal())));
                C5155b bVar6 = (C5155b) dVar.a().get(new Pair(O.b(cls), bool));
                if (bVar6 == null) {
                    bVar6 = new C5155b(new qe.O(O.b(cls), false, g.f60385a));
                }
                C5155b bVar7 = (C5155b) dVar.a().get(new Pair(O.b(cls5), bool));
                if (bVar7 == null) {
                    bVar7 = new C5155b(new qe.O(O.b(cls5), false, C0885h.f60386a));
                }
                try {
                    cVar.k().put("setFullscreen", new C5037g("setFullscreen", new C5155b[]{bVar6, bVar7}, new i(this)));
                    ke.d p10 = cVar.p();
                    D3.a.f();
                    return p10;
                } catch (Throwable th3) {
                    th = th3;
                    D3.a.f();
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("The module definition may have exported only one view manager.");
            }
        } catch (Throwable th4) {
            th = th4;
            D3.a.f();
            throw th;
        }
    }
}
