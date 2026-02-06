package Fe;

import Fe.C3016e;
import Ie.c;
import Ie.g;
import Ie.j;
import android.app.Activity;
import java.io.PrintWriter;
import java.io.StringWriter;

public class D {

    /* renamed from: b  reason: collision with root package name */
    private static volatile D f30832b;

    /* renamed from: a  reason: collision with root package name */
    C3016e.f f30833a;

    class a implements C3016e.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f30834a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f30835b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Activity f30836c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C3016e.f f30837d;

        a(String str, String str2, Activity activity, C3016e.f fVar) {
            this.f30834a = str;
            this.f30835b = str2;
            this.f30836c = activity;
            this.f30837d = fVar;
        }

        public void a(String str, C3020i iVar) {
            if (iVar == null) {
                j.a(str, this.f30834a, this.f30835b, this.f30836c);
                return;
            }
            C3016e.f fVar = this.f30837d;
            if (fVar != null) {
                fVar.a(str, iVar);
            } else {
                C3023l.l("Unable to share link " + iVar.b());
            }
            if (iVar.a() == -113 || iVar.a() == -117) {
                j.a(str, this.f30834a, this.f30835b, this.f30836c);
            }
        }
    }

    private class b implements C3016e.f {

        /* renamed from: a  reason: collision with root package name */
        private final C3016e.f f30839a;

        /* renamed from: b  reason: collision with root package name */
        private final Ce.a f30840b;

        /* renamed from: c  reason: collision with root package name */
        private String f30841c = "";

        b(C3016e.f fVar, g gVar, Ce.a aVar) {
            this.f30839a = fVar;
            this.f30840b = aVar;
        }

        public void a(String str, C3020i iVar) {
            c cVar = new c(Ie.a.SHARE);
            if (iVar == null) {
                cVar.c(y.SharedLink.b(), str);
                cVar.c(y.SharedChannel.b(), this.f30841c);
                cVar.b(this.f30840b);
            } else {
                cVar.c(y.ShareError.b(), iVar.b());
            }
            cVar.f(C3016e.X().M());
            C3016e.f fVar = this.f30839a;
            if (fVar != null) {
                fVar.a(str, iVar);
            }
        }
    }

    private D() {
    }

    public static D a() {
        if (f30832b == null) {
            synchronized (D.class) {
                try {
                    if (f30832b == null) {
                        f30832b = new D();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f30832b;
    }

    /* access modifiers changed from: package-private */
    public void b(Activity activity, Ce.a aVar, g gVar, C3016e.f fVar, String str, String str2) {
        this.f30833a = new b(fVar, gVar, aVar);
        try {
            aVar.e(activity, gVar, new a(str, str2, activity, fVar));
        } catch (Exception e10) {
            StringWriter stringWriter = new StringWriter();
            e10.printStackTrace(new PrintWriter(stringWriter));
            C3023l.b(stringWriter.toString());
            C3016e.f fVar2 = this.f30833a;
            if (fVar2 != null) {
                fVar2.a((String) null, new C3020i("Trouble sharing link", -110));
                return;
            }
            C3023l.l("Unable to share link. " + e10.getMessage());
        }
    }
}
