package r3;

import Ug.C5584o;
import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import o3.C2381b;
import qf.C6658d;
import rf.C6680b;

public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public static final b f25746a = new b((DefaultConstructorMarker) null);

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n a(Context context) {
            C6496s.h(context, "context");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AdServicesInfo.version=");
            C2381b bVar = C2381b.f25078a;
            sb2.append(bVar.a());
            Log.d("MeasurementManager", sb2.toString());
            if (bVar.a() >= 5) {
                return new a(context);
            }
            return null;
        }

        private b() {
        }
    }

    public abstract Object a(C2570a aVar, C6658d dVar);

    public abstract Object b(C6658d dVar);

    public abstract Object c(Uri uri, InputEvent inputEvent, C6658d dVar);

    public abstract Object d(Uri uri, C6658d dVar);

    public abstract Object e(o oVar, C6658d dVar);

    public abstract Object f(p pVar, C6658d dVar);

    private static final class a extends n {
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final MeasurementManager f25747b;

        public a(MeasurementManager measurementManager) {
            C6496s.h(measurementManager, "mMeasurementManager");
            this.f25747b = measurementManager;
        }

        /* access modifiers changed from: private */
        public final DeletionRequest k(C2570a aVar) {
            C2571b.a();
            throw null;
        }

        /* access modifiers changed from: private */
        public final WebSourceRegistrationRequest l(o oVar) {
            d.a();
            throw null;
        }

        /* access modifiers changed from: private */
        public final WebTriggerRegistrationRequest m(p pVar) {
            e.a();
            throw null;
        }

        public Object a(C2570a aVar, C6658d<? super C6514M> dVar) {
            C5584o oVar = new C5584o(C6680b.c(dVar), 1);
            oVar.E();
            this.f25747b.deleteRegistrations(k(aVar), new m(), u1.n.a(oVar));
            Object v10 = oVar.v();
            if (v10 == C6680b.f()) {
                h.c(dVar);
            }
            if (v10 == C6680b.f()) {
                return v10;
            }
            return C6514M.f71813a;
        }

        public Object b(C6658d<? super Integer> dVar) {
            C5584o oVar = new C5584o(C6680b.c(dVar), 1);
            oVar.E();
            this.f25747b.getMeasurementApiStatus(new m(), u1.n.a(oVar));
            Object v10 = oVar.v();
            if (v10 == C6680b.f()) {
                h.c(dVar);
            }
            return v10;
        }

        public Object c(Uri uri, InputEvent inputEvent, C6658d<? super C6514M> dVar) {
            C5584o oVar = new C5584o(C6680b.c(dVar), 1);
            oVar.E();
            this.f25747b.registerSource(uri, inputEvent, new m(), u1.n.a(oVar));
            Object v10 = oVar.v();
            if (v10 == C6680b.f()) {
                h.c(dVar);
            }
            if (v10 == C6680b.f()) {
                return v10;
            }
            return C6514M.f71813a;
        }

        public Object d(Uri uri, C6658d<? super C6514M> dVar) {
            C5584o oVar = new C5584o(C6680b.c(dVar), 1);
            oVar.E();
            this.f25747b.registerTrigger(uri, new m(), u1.n.a(oVar));
            Object v10 = oVar.v();
            if (v10 == C6680b.f()) {
                h.c(dVar);
            }
            if (v10 == C6680b.f()) {
                return v10;
            }
            return C6514M.f71813a;
        }

        public Object e(o oVar, C6658d<? super C6514M> dVar) {
            C5584o oVar2 = new C5584o(C6680b.c(dVar), 1);
            oVar2.E();
            this.f25747b.registerWebSource(l(oVar), new m(), u1.n.a(oVar2));
            Object v10 = oVar2.v();
            if (v10 == C6680b.f()) {
                h.c(dVar);
            }
            if (v10 == C6680b.f()) {
                return v10;
            }
            return C6514M.f71813a;
        }

        public Object f(p pVar, C6658d<? super C6514M> dVar) {
            C5584o oVar = new C5584o(C6680b.c(dVar), 1);
            oVar.E();
            this.f25747b.registerWebTrigger(m(pVar), new m(), u1.n.a(oVar));
            Object v10 = oVar.v();
            if (v10 == C6680b.f()) {
                h.c(dVar);
            }
            if (v10 == C6680b.f()) {
                return v10;
            }
            return C6514M.f71813a;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(android.content.Context r2) {
            /*
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.C6496s.h(r2, r0)
                java.lang.Class r0 = r3.i.a()
                java.lang.Object r2 = r2.getSystemService(r0)
                java.lang.String r0 = "context.getSystemService…:class.java\n            )"
                kotlin.jvm.internal.C6496s.g(r2, r0)
                android.adservices.measurement.MeasurementManager r2 = r3.j.a(r2)
                r1.<init>((android.adservices.measurement.MeasurementManager) r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r3.n.a.<init>(android.content.Context):void");
        }
    }
}
