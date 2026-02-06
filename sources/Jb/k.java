package Jb;

import com.google.android.gms.tasks.OnFailureListener;

public final /* synthetic */ class k implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f51248a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f51249b;

    public /* synthetic */ k(n nVar, long j10) {
        this.f51248a = nVar;
        this.f51249b = j10;
    }

    public final void onFailure(Exception exc) {
        this.f51248a.f0(this.f51249b, exc);
    }
}
