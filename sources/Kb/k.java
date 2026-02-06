package kb;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import lb.C5074g;
import lb.C5076i;
import lb.C5087t;

abstract class k extends C5074g {

    /* renamed from: a  reason: collision with root package name */
    final C5076i f60910a;

    /* renamed from: b  reason: collision with root package name */
    final TaskCompletionSource f60911b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ m f60912c;

    k(m mVar, C5076i iVar, TaskCompletionSource taskCompletionSource) {
        this.f60912c = mVar;
        this.f60910a = iVar;
        this.f60911b = taskCompletionSource;
    }

    public void Y0(Bundle bundle) {
        C5087t tVar = this.f60912c.f60915a;
        if (tVar != null) {
            tVar.r(this.f60911b);
        }
        this.f60910a.d("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
