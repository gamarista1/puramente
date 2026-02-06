package B1;

import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.tasks.OnFailureListener;

public final /* synthetic */ class f implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HiddenActivity f774a;

    public /* synthetic */ f(HiddenActivity hiddenActivity) {
        this.f774a = hiddenActivity;
    }

    public final void onFailure(Exception exc) {
        HiddenActivity.w(this.f774a, exc);
    }
}
