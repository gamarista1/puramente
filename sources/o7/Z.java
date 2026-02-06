package o7;

import android.content.DialogInterface;

public final /* synthetic */ class Z implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b0 f47175a;

    public /* synthetic */ Z(b0 b0Var) {
        this.f47175a = b0Var;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        b0.v(this.f47175a, dialogInterface);
    }
}
