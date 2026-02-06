package Hb;

import Lb.B;
import com.google.android.gms.tasks.OnFailureListener;

public final /* synthetic */ class e implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ B.a f50866a;

    public /* synthetic */ e(B.a aVar) {
        this.f50866a = aVar;
    }

    public final void onFailure(Exception exc) {
        this.f50866a.a(exc.getMessage());
    }
}
