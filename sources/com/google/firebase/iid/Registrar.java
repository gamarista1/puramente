package com.google.firebase.iid;

import Cc.h;
import Cc.i;
import Eb.C4282c;
import Eb.C4283d;
import Eb.q;
import androidx.annotation.Keep;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.ComponentRegistrar;
import gc.j;
import hc.C5010a;
import java.util.Arrays;
import java.util.List;
import jc.C5046e;
import ub.C5230g;

@Keep
public final class Registrar implements ComponentRegistrar {

    private static class a implements C5010a {

        /* renamed from: a  reason: collision with root package name */
        final FirebaseInstanceId f57291a;

        public a(FirebaseInstanceId firebaseInstanceId) {
            this.f57291a = firebaseInstanceId;
        }

        public String a() {
            return this.f57291a.n();
        }

        public void b(C5010a.C0892a aVar) {
            this.f57291a.a(aVar);
        }

        public void c(String str, String str2) {
            this.f57291a.f(str, str2);
        }

        public Task d() {
            String n10 = this.f57291a.n();
            if (n10 != null) {
                return Tasks.forResult(n10);
            }
            return this.f57291a.j().continueWith(q.f57327a);
        }
    }

    static final /* synthetic */ FirebaseInstanceId lambda$getComponents$0$Registrar(C4283d dVar) {
        return new FirebaseInstanceId((C5230g) dVar.get(C5230g.class), dVar.e(i.class), dVar.e(j.class), (C5046e) dVar.get(C5046e.class));
    }

    static final /* synthetic */ C5010a lambda$getComponents$1$Registrar(C4283d dVar) {
        return new a((FirebaseInstanceId) dVar.get(FirebaseInstanceId.class));
    }

    @Keep
    public List<C4282c> getComponents() {
        Class<FirebaseInstanceId> cls = FirebaseInstanceId.class;
        return Arrays.asList(new C4282c[]{C4282c.e(cls).b(q.l(C5230g.class)).b(q.j(i.class)).b(q.j(j.class)).b(q.l(C5046e.class)).f(o.f57325a).c().d(), C4282c.e(C5010a.class).b(q.l(cls)).f(p.f57326a).d(), h.b("fire-iid", "21.1.0")});
    }
}
