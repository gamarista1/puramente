package k3;

import androidx.lifecycle.P;
import androidx.lifecycle.a0;
import h0.C2020d;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.jvm.internal.C6496s;

/* renamed from: k3.a  reason: case insensitive filesystem */
public final class C2149a extends a0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f23289a = "SaveableStateHolder_BackStackEntryKey";

    /* renamed from: b  reason: collision with root package name */
    private final UUID f23290b;

    /* renamed from: c  reason: collision with root package name */
    public WeakReference f23291c;

    public C2149a(P p10) {
        UUID uuid = (UUID) p10.c("SaveableStateHolder_BackStackEntryKey");
        if (uuid == null) {
            uuid = UUID.randomUUID();
            p10.g("SaveableStateHolder_BackStackEntryKey", uuid);
        }
        this.f23290b = uuid;
    }

    public final UUID b() {
        return this.f23290b;
    }

    public final WeakReference c() {
        WeakReference weakReference = this.f23291c;
        if (weakReference != null) {
            return weakReference;
        }
        C6496s.v("saveableStateHolderRef");
        return null;
    }

    public final void d(WeakReference weakReference) {
        this.f23291c = weakReference;
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        super.onCleared();
        C2020d dVar = (C2020d) c().get();
        if (dVar != null) {
            dVar.d(this.f23290b);
        }
        c().clear();
    }
}
