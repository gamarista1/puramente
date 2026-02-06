package T1;

import android.view.ViewGroup;
import androidx.fragment.app.C1769q;
import kotlin.jvm.internal.C6496s;

public final class d extends m {

    /* renamed from: b  reason: collision with root package name */
    private final ViewGroup f5967b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(C1769q qVar, ViewGroup viewGroup) {
        super(qVar, "Attempting to use <fragment> tag to add fragment " + qVar + " to container " + viewGroup);
        C6496s.h(qVar, "fragment");
        this.f5967b = viewGroup;
    }
}
