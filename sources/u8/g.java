package u8;

import android.os.Bundle;
import com.facebook.C3459v;
import com.facebook.r;
import io.branch.rnbranch.RNBranchModule;
import kotlin.jvm.internal.C6496s;
import o7.C3885a;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    private final r f48637a;

    public g(r rVar) {
        this.f48637a = rVar;
    }

    public void a(C3885a aVar) {
        C6496s.h(aVar, "appCall");
        r rVar = this.f48637a;
        if (rVar != null) {
            rVar.onCancel();
        }
    }

    public void b(C3885a aVar, C3459v vVar) {
        C6496s.h(aVar, "appCall");
        C6496s.h(vVar, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
        r rVar = this.f48637a;
        if (rVar != null) {
            rVar.a(vVar);
        }
    }

    public abstract void c(C3885a aVar, Bundle bundle);
}
