package T1;

import android.view.ViewGroup;
import androidx.fragment.app.C1769q;
import kotlin.jvm.internal.C6496s;

public final class n extends m {

    /* renamed from: b  reason: collision with root package name */
    private final ViewGroup f5972b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(C1769q qVar, ViewGroup viewGroup) {
        super(qVar, "Attempting to add fragment " + qVar + " to container " + viewGroup + " which is not a FragmentContainerView");
        C6496s.h(qVar, "fragment");
        C6496s.h(viewGroup, "container");
        this.f5972b = viewGroup;
    }
}
