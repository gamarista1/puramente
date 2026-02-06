package e9;

import W8.j;
import Y8.i;
import Y8.o;
import Y8.t;
import Z8.e;
import Z8.m;
import f9.x;
import g9.C3546d;
import h9.C3585b;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

public class c implements e {

    /* renamed from: f  reason: collision with root package name */
    private static final Logger f43359f = Logger.getLogger(t.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final x f43360a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f43361b;

    /* renamed from: c  reason: collision with root package name */
    private final e f43362c;

    /* renamed from: d  reason: collision with root package name */
    private final C3546d f43363d;

    /* renamed from: e  reason: collision with root package name */
    private final C3585b f43364e;

    public c(Executor executor, e eVar, x xVar, C3546d dVar, C3585b bVar) {
        this.f43361b = executor;
        this.f43362c = eVar;
        this.f43360a = xVar;
        this.f43363d = dVar;
        this.f43364e = bVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object d(o oVar, i iVar) {
        this.f43363d.g1(oVar, iVar);
        this.f43360a.b(oVar, 1);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(o oVar, j jVar, i iVar) {
        try {
            m mVar = this.f43362c.get(oVar.b());
            if (mVar == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{oVar.b()});
                f43359f.warning(format);
                jVar.a(new IllegalArgumentException(format));
                return;
            }
            this.f43364e.n(new C3503b(this, oVar, mVar.b(iVar)));
            jVar.a((Exception) null);
        } catch (Exception e10) {
            Logger logger = f43359f;
            logger.warning("Error scheduling event " + e10.getMessage());
            jVar.a(e10);
        }
    }

    public void a(o oVar, i iVar, j jVar) {
        this.f43361b.execute(new C3502a(this, oVar, jVar, iVar));
    }
}
