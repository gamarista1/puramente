package B1;

import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.tasks.OnFailureListener;

public final /* synthetic */ class d implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HiddenActivity f772a;

    public /* synthetic */ d(HiddenActivity hiddenActivity) {
        this.f772a = hiddenActivity;
    }

    public final void onFailure(Exception exc) {
        HiddenActivity.q(this.f772a, exc);
    }
}
