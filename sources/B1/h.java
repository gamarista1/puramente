package B1;

import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.tasks.OnFailureListener;

public final /* synthetic */ class h implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HiddenActivity f776a;

    public /* synthetic */ h(HiddenActivity hiddenActivity) {
        this.f776a = hiddenActivity;
    }

    public final void onFailure(Exception exc) {
        HiddenActivity.n(this.f776a, exc);
    }
}
