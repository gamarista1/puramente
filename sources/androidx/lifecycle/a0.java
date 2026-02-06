package androidx.lifecycle;

import b2.C1882f;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.io.Closeable;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

public abstract class a0 {
    private final C1882f impl = new C1882f();

    public final void addCloseable(String str, AutoCloseable autoCloseable) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(autoCloseable, "closeable");
        C1882f fVar = this.impl;
        if (fVar != null) {
            fVar.e(str, autoCloseable);
        }
    }

    public final void clear$lifecycle_viewmodel_release() {
        C1882f fVar = this.impl;
        if (fVar != null) {
            fVar.f();
        }
        onCleared();
    }

    public final <T extends AutoCloseable> T getCloseable(String str) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        C1882f fVar = this.impl;
        if (fVar != null) {
            return fVar.h(str);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
    }

    public void addCloseable(AutoCloseable autoCloseable) {
        C6496s.h(autoCloseable, "closeable");
        C1882f fVar = this.impl;
        if (fVar != null) {
            fVar.d(autoCloseable);
        }
    }

    @C6521e
    public /* synthetic */ void addCloseable(Closeable closeable) {
        C6496s.h(closeable, "closeable");
        C1882f fVar = this.impl;
        if (fVar != null) {
            fVar.d(closeable);
        }
    }
}
