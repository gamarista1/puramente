package Ug;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class B {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f65277b = AtomicIntegerFieldUpdater.newUpdater(B.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f65278a;

    public B(Throwable th2, boolean z10) {
        this.f65278a = th2;
        this._handled$volatile = z10 ? 1 : 0;
    }

    public final boolean a() {
        if (f65277b.get(this) != 0) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        return f65277b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return O.a(this) + '[' + this.f65278a + ']';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(Throwable th2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(th2, (i10 & 2) != 0 ? false : z10);
    }
}
