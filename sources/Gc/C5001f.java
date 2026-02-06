package gc;

import Cc.i;
import Eb.C4282c;
import Eb.C4283d;
import Eb.E;
import Eb.q;
import android.content.Context;
import android.util.Base64OutputStream;
import com.adjust.sdk.Constants;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import gc.j;
import ic.C5027b;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import u1.p;
import ub.C5230g;
import yb.C5292a;

/* renamed from: gc.f  reason: case insensitive filesystem */
public class C5001f implements i, j {

    /* renamed from: a  reason: collision with root package name */
    private final C5027b f60612a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f60613b;

    /* renamed from: c  reason: collision with root package name */
    private final C5027b f60614c;

    /* renamed from: d  reason: collision with root package name */
    private final Set f60615d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f60616e;

    private C5001f(Context context, String str, Set set, C5027b bVar, Executor executor) {
        this((C5027b) new C4998c(context, str), set, executor, bVar, context);
    }

    public static C4282c g() {
        E a10 = E.a(C5292a.class, Executor.class);
        return C4282c.f(C5001f.class, i.class, j.class).b(q.l(Context.class)).b(q.l(C5230g.class)).b(q.o(g.class)).b(q.n(i.class)).b(q.k(a10)).f(new C4997b(a10)).d();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C5001f h(E e10, C4283d dVar) {
        return new C5001f((Context) dVar.get(Context.class), ((C5230g) dVar.get(C5230g.class)).s(), dVar.b(g.class), dVar.e(i.class), (Executor) dVar.d(e10));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String i() {
        Base64OutputStream base64OutputStream;
        GZIPOutputStream gZIPOutputStream;
        String byteArrayOutputStream;
        synchronized (this) {
            try {
                q qVar = (q) this.f60612a.get();
                List c10 = qVar.c();
                qVar.b();
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < c10.size(); i10++) {
                    r rVar = (r) c10.get(i10);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", rVar.c());
                    jSONObject.put("dates", new JSONArray(rVar.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put(DiagnosticsEntry.VERSION_KEY, "2");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                gZIPOutputStream.write(jSONObject2.toString().getBytes(Constants.ENCODING));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString(Constants.ENCODING);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return byteArrayOutputStream;
        throw th;
        throw th;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ q j(Context context, String str) {
        return new q(context, str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Void k() {
        synchronized (this) {
            ((q) this.f60612a.get()).k(System.currentTimeMillis(), ((i) this.f60614c.get()).a());
        }
        return null;
    }

    public Task a() {
        if (!p.a(this.f60613b)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f60616e, new C4999d(this));
    }

    public synchronized j.a b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        q qVar = (q) this.f60612a.get();
        if (qVar.i(currentTimeMillis)) {
            qVar.g();
            return j.a.GLOBAL;
        }
        return j.a.NONE;
    }

    public Task l() {
        if (this.f60615d.size() <= 0) {
            return Tasks.forResult(null);
        }
        if (!p.a(this.f60613b)) {
            return Tasks.forResult(null);
        }
        return Tasks.call(this.f60616e, new C5000e(this));
    }

    C5001f(C5027b bVar, Set set, Executor executor, C5027b bVar2, Context context) {
        this.f60612a = bVar;
        this.f60615d = set;
        this.f60616e = executor;
        this.f60614c = bVar2;
        this.f60613b = context;
    }
}
