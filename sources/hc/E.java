package Hc;

import Ic.b;
import Ug.C5600w0;
import Ug.K;
import Ug.L;
import Ug.M;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.p;

public final class E {

    /* renamed from: f  reason: collision with root package name */
    public static final b f50937f = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final g f50938a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Messenger f50939b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f50940c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final LinkedBlockingDeque f50941d = new LinkedBlockingDeque(20);

    /* renamed from: e  reason: collision with root package name */
    private final d f50942e = new d(this);

    public static final class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final g f50943a;

        /* renamed from: Hc.E$a$a  reason: collision with other inner class name */
        static final class C0776a extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f50944a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f50945b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0776a(String str, C6658d dVar) {
                super(2, dVar);
                this.f50945b = str;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new C0776a(this.f50945b, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((C0776a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f50944a;
                if (i10 == 0) {
                    w.b(obj);
                    Ic.a aVar = Ic.a.f51165a;
                    this.f50944a = 1;
                    obj = aVar.b(this);
                    if (obj == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    w.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str = this.f50945b;
                Iterator it = ((Map) obj).values().iterator();
                if (!it.hasNext()) {
                    return C6514M.f71813a;
                }
                android.support.v4.media.session.c.a(it.next());
                new b.C0786b(str);
                throw null;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(g gVar) {
            super(Looper.getMainLooper());
            C6496s.h(gVar, "backgroundDispatcher");
            this.f50943a = gVar;
        }

        private final void a(String str) {
            Log.d("SessionLifecycleClient", "Session update received: " + str);
            C5600w0 unused = C5576k.d(L.a(this.f50943a), (g) null, (M) null, new C0776a(str, (C6658d) null), 3, (Object) null);
        }

        public void handleMessage(Message message) {
            String str;
            C6496s.h(message, "msg");
            if (message.what == 3) {
                Bundle data = message.getData();
                if (data == null || (str = data.getString("SessionUpdateExtra")) == null) {
                    str = "";
                }
                a(str);
                return;
            }
            Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + message);
            super.handleMessage(message);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static final class c extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f50946a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ E f50947b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f50948c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(E e10, List list, C6658d dVar) {
            super(2, dVar);
            this.f50947b = e10;
            this.f50948c = list;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new c(this.f50947b, this.f50948c, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((c) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f50946a;
            if (i10 == 0) {
                w.b(obj);
                Ic.a aVar = Ic.a.f51165a;
                this.f50946a = 1;
                obj = aVar.b(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Map map = (Map) obj;
            if (map.isEmpty()) {
                Log.d("SessionLifecycleClient", "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.");
            } else {
                Iterable values = map.values();
                if (!(values instanceof Collection) || !((Collection) values).isEmpty()) {
                    Iterator it = values.iterator();
                    if (it.hasNext()) {
                        android.support.v4.media.session.c.a(it.next());
                        throw null;
                    }
                }
                Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
            }
            return C6514M.f71813a;
        }
    }

    public static final class d implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ E f50949a;

        d(E e10) {
            this.f50949a = e10;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d("SessionLifecycleClient", "Connected to SessionLifecycleService. Queue size " + this.f50949a.f50941d.size());
            this.f50949a.f50939b = new Messenger(iBinder);
            this.f50949a.f50940c = true;
            E e10 = this.f50949a;
            C5600w0 unused = e10.k(e10.h());
        }

        public void onServiceDisconnected(ComponentName componentName) {
            Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
            this.f50949a.f50939b = null;
            this.f50949a.f50940c = false;
        }
    }

    public E(g gVar) {
        C6496s.h(gVar, "backgroundDispatcher");
        this.f50938a = gVar;
    }

    /* access modifiers changed from: private */
    public final List h() {
        ArrayList arrayList = new ArrayList();
        this.f50941d.drainTo(arrayList);
        return arrayList;
    }

    private final void j(int i10) {
        List h10 = h();
        Message obtain = Message.obtain((Handler) null, i10, 0, 0);
        C6496s.g(obtain, "obtain(null, messageCode, 0, 0)");
        h10.add(obtain);
        k(h10);
    }

    /* access modifiers changed from: private */
    public final C5600w0 k(List list) {
        return C5576k.d(L.a(this.f50938a), (g) null, (M) null, new c(this, list, (C6658d) null), 3, (Object) null);
    }

    public final void f() {
        j(2);
    }

    public final void g(G g10) {
        C6496s.h(g10, "sessionLifecycleServiceBinder");
        g10.a(new Messenger(new a(this.f50938a)), this.f50942e);
    }

    public final void i() {
        j(1);
    }
}
