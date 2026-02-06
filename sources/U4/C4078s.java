package u4;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: u4.s  reason: case insensitive filesystem */
public final /* synthetic */ class C4078s implements P {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f48560a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f48561b;

    public /* synthetic */ C4078s(String str, AtomicBoolean atomicBoolean) {
        this.f48560a = str;
        this.f48561b = atomicBoolean;
    }

    public final void onResult(Object obj) {
        C4080u.L(this.f48560a, this.f48561b, (Throwable) obj);
    }
}
