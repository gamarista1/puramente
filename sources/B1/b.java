package B1;

import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.tasks.OnFailureListener;

public final /* synthetic */ class b implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HiddenActivity f770a;

    public /* synthetic */ b(HiddenActivity hiddenActivity) {
        this.f770a = hiddenActivity;
    }

    public final void onFailure(Exception exc) {
        HiddenActivity.t(this.f770a, exc);
    }
}
