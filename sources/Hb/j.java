package Hb;

import Lb.B;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.C;

public final /* synthetic */ class j implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ B.a f50874a;

    public /* synthetic */ j(B.a aVar) {
        this.f50874a = aVar;
    }

    public final void onSuccess(Object obj) {
        this.f50874a.b(((C) obj).f());
    }
}
