package u4;

import java.util.concurrent.atomic.AtomicBoolean;

public final /* synthetic */ class r implements P {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f48558a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f48559b;

    public /* synthetic */ r(String str, AtomicBoolean atomicBoolean) {
        this.f48558a = str;
        this.f48559b = atomicBoolean;
    }

    public final void onResult(Object obj) {
        C4080u.K(this.f48558a, this.f48559b, (C4071k) obj);
    }
}
