package ya;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.C1767o;
import androidx.fragment.app.J;
import com.google.android.gms.common.internal.C4536s;

public class j extends C1767o {

    /* renamed from: q  reason: collision with root package name */
    private Dialog f62286q;

    /* renamed from: r  reason: collision with root package name */
    private DialogInterface.OnCancelListener f62287r;

    /* renamed from: s  reason: collision with root package name */
    private Dialog f62288s;

    public static j U(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        j jVar = new j();
        Dialog dialog2 = (Dialog) C4536s.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        jVar.f62286q = dialog2;
        if (onCancelListener != null) {
            jVar.f62287r = onCancelListener;
        }
        return jVar;
    }

    public Dialog K(Bundle bundle) {
        Dialog dialog = this.f62286q;
        if (dialog != null) {
            return dialog;
        }
        Q(false);
        if (this.f62288s == null) {
            this.f62288s = new AlertDialog.Builder((Context) C4536s.l(getContext())).create();
        }
        return this.f62288s;
    }

    public void T(J j10, String str) {
        super.T(j10, str);
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f62287r;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
