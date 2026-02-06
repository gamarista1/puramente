package ae;

import android.app.Activity;
import android.content.Intent;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.LifecycleEventListener;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C6496s;

public final class s implements LifecycleEventListener, ActivityEventListener {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference f53646a;

    public s(C4464a aVar) {
        C6496s.h(aVar, "appContext");
        this.f53646a = new WeakReference(aVar);
    }

    public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
        C6496s.h(activity, "activity");
        C4464a aVar = (C4464a) this.f53646a.get();
        if (aVar != null) {
            aVar.x(activity, i10, i11, intent);
        }
    }

    public void onHostDestroy() {
        C4464a aVar = (C4464a) this.f53646a.get();
        if (aVar != null) {
            aVar.A();
        }
    }

    public void onHostPause() {
        C4464a aVar = (C4464a) this.f53646a.get();
        if (aVar != null) {
            aVar.B();
        }
    }

    public void onHostResume() {
        C4464a aVar = (C4464a) this.f53646a.get();
        if (aVar != null) {
            aVar.C();
        }
    }

    public void onNewIntent(Intent intent) {
        C4464a aVar = (C4464a) this.f53646a.get();
        if (aVar != null) {
            aVar.D(intent);
        }
    }

    public void onUserLeaveHint(Activity activity) {
        C6496s.h(activity, "activity");
        C4464a aVar = (C4464a) this.f53646a.get();
        if (aVar != null) {
            aVar.E();
        }
    }
}
