package fe;

import D3.a;
import android.os.Bundle;
import expo.modules.kotlin.exception.CodedException;
import io.intercom.android.sdk.metrics.MetricTracker;
import ke.b;
import ke.c;
import ke.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lfe/b;", "Lke/b;", "<init>", "()V", "Lke/d;", "b", "()Lke/d;", "Lexpo/modules/kotlin/exception/CodedException;", "codedException", "Llf/M;", "k", "(Lexpo/modules/kotlin/exception/CodedException;)V", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: fe.b  reason: case insensitive filesystem */
public final class C4992b extends b {
    public d b() {
        a.c("[" + "ExpoModulesCore" + "] " + (getClass() + ".ModuleDefinition"));
        try {
            c cVar = new c(this);
            cVar.o("ExpoModulesCoreErrorManager");
            cVar.g("ExpoModulesCoreErrorManager.onNewException", "ExpoModulesCoreErrorManager.onNewWarning");
            return cVar.p();
        } finally {
            a.f();
        }
    }

    public final void k(CodedException codedException) {
        C6496s.h(codedException, "codedException");
        Bundle bundle = new Bundle();
        String message = codedException.getMessage();
        if (message == null) {
            message = codedException.toString();
        }
        bundle.putString(MetricTracker.Object.MESSAGE, message);
        C6514M m10 = C6514M.f71813a;
        h("ExpoModulesCoreErrorManager.onNewException", bundle);
    }
}
