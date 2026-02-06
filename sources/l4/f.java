package L4;

import K4.b;
import K4.t;
import android.app.ActivityManager;
import android.os.storage.StorageManager;
import com.bugsnag.android.K;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class f extends a {

    /* renamed from: c  reason: collision with root package name */
    private final StorageManager f32513c;

    /* renamed from: d  reason: collision with root package name */
    private final ActivityManager f32514d;

    public f(c cVar, b bVar) {
        super(bVar, (t) null, 2, (DefaultConstructorMarker) null);
        this.f32513c = K.d(cVar.a());
        this.f32514d = K.a(cVar.a());
    }

    public final ActivityManager a() {
        return this.f32514d;
    }

    public final StorageManager b() {
        return this.f32513c;
    }
}
