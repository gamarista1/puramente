package qf;

import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.v;
import rf.C6679a;
import rf.C6680b;

public final class i implements C6658d, e {

    /* renamed from: b  reason: collision with root package name */
    private static final a f72646b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f72647c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "result");

    /* renamed from: a  reason: collision with root package name */
    private final C6658d f72648a;
    private volatile Object result;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public i(C6658d dVar, Object obj) {
        C6496s.h(dVar, "delegate");
        this.f72648a = dVar;
        this.result = obj;
    }

    public final Object b() {
        Object obj = this.result;
        C6679a aVar = C6679a.UNDECIDED;
        if (obj == aVar) {
            if (b.a(f72647c, this, aVar, C6680b.f())) {
                return C6680b.f();
            }
            obj = this.result;
        }
        if (obj == C6679a.RESUMED) {
            return C6680b.f();
        }
        if (!(obj instanceof v.b)) {
            return obj;
        }
        throw ((v.b) obj).f71843a;
    }

    public e getCallerFrame() {
        C6658d dVar = this.f72648a;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public g getContext() {
        return this.f72648a.getContext();
    }

    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            C6679a aVar = C6679a.UNDECIDED;
            if (obj2 == aVar) {
                if (b.a(f72647c, this, aVar, obj)) {
                    return;
                }
            } else if (obj2 != C6680b.f()) {
                throw new IllegalStateException("Already resumed");
            } else if (b.a(f72647c, this, C6680b.f(), C6679a.RESUMED)) {
                this.f72648a.resumeWith(obj);
                return;
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f72648a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public i(C6658d dVar) {
        this(dVar, C6679a.UNDECIDED);
        C6496s.h(dVar, "delegate");
    }
}
