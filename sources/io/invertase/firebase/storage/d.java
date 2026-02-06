package io.invertase.firebase.storage;

import com.google.android.gms.tasks.OnCanceledListener;

public final /* synthetic */ class d implements OnCanceledListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f71474a;

    public /* synthetic */ d(f fVar) {
        this.f71474a = fVar;
    }

    public final void onCanceled() {
        this.f71474a.w();
    }
}
