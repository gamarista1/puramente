package Ec;

import Dc.p;
import Gc.e;
import android.util.Log;
import com.google.firebase.remoteconfig.internal.f;
import com.google.firebase.remoteconfig.internal.g;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private f f50754a;

    /* renamed from: b  reason: collision with root package name */
    private a f50755b;

    /* renamed from: c  reason: collision with root package name */
    private Executor f50756c;

    /* renamed from: d  reason: collision with root package name */
    private Set f50757d = Collections.newSetFromMap(new ConcurrentHashMap());

    public c(f fVar, a aVar, Executor executor) {
        this.f50754a = fVar;
        this.f50755b = aVar;
        this.f50756c = executor;
    }

    public void c(g gVar) {
        try {
            e b10 = this.f50755b.b(gVar);
            for (Object a10 : this.f50757d) {
                android.support.v4.media.session.c.a(a10);
                this.f50756c.execute(new b((Gc.f) null, b10));
            }
        } catch (p e10) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e10);
        }
    }
}
