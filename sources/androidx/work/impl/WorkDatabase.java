package androidx.work.impl;

import P3.C1299b;
import P3.e;
import P3.j;
import P3.o;
import P3.r;
import P3.v;
import P3.z;
import android.content.Context;
import androidx.work.C1835b;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u3.t;
import u3.u;
import y3.h;
import z3.C2981f;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "Lu3/u;", "<init>", "()V", "LP3/v;", "H", "()LP3/v;", "LP3/b;", "C", "()LP3/b;", "LP3/z;", "I", "()LP3/z;", "LP3/j;", "E", "()LP3/j;", "LP3/o;", "F", "()LP3/o;", "LP3/r;", "G", "()LP3/r;", "LP3/e;", "D", "()LP3/e;", "p", "a", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class WorkDatabase extends u {

    /* renamed from: p  reason: collision with root package name */
    public static final a f18819p = new a((DefaultConstructorMarker) null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public static final h c(Context context, h.b bVar) {
            C6496s.h(context, "$context");
            C6496s.h(bVar, "configuration");
            h.b.a a10 = h.b.f28731f.a(context);
            a10.d(bVar.f28733b).c(bVar.f28734c).e(true).a(true);
            return new C2981f().a(a10.b());
        }

        public final WorkDatabase b(Context context, Executor executor, C1835b bVar, boolean z10) {
            u.a aVar;
            C6496s.h(context, "context");
            C6496s.h(executor, "queryExecutor");
            C6496s.h(bVar, "clock");
            Class<WorkDatabase> cls = WorkDatabase.class;
            if (z10) {
                aVar = t.c(context, cls).c();
            } else {
                aVar = t.a(context, cls, "androidx.work.workdb").f(new D(context));
            }
            return (WorkDatabase) aVar.g(executor).a(new C1844d(bVar)).b(C1851k.f18936c).b(new v(context, 2, 3)).b(C1852l.f18937c).b(C1853m.f18938c).b(new v(context, 5, 6)).b(C1854n.f18939c).b(C1855o.f18940c).b(C1856p.f18941c).b(new S(context)).b(new v(context, 10, 11)).b(C1847g.f18932c).b(C1848h.f18933c).b(C1849i.f18934c).b(C1850j.f18935c).e().d();
        }

        private a() {
        }
    }

    public abstract C1299b C();

    public abstract e D();

    public abstract j E();

    public abstract o F();

    public abstract r G();

    public abstract v H();

    public abstract z I();
}
