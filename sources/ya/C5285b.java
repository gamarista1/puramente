package ya;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.C4536s;

/* renamed from: ya.b  reason: case insensitive filesystem */
public class C5285b extends DialogFragment {

    /* renamed from: a  reason: collision with root package name */
    private Dialog f62270a;

    /* renamed from: b  reason: collision with root package name */
    private DialogInterface.OnCancelListener f62271b;

    /* renamed from: c  reason: collision with root package name */
    private Dialog f62272c;

    public static C5285b a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C5285b bVar = new C5285b();
        Dialog dialog2 = (Dialog) C4536s.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        bVar.f62270a = dialog2;
        if (onCancelListener != null) {
            bVar.f62271b = onCancelListener;
        }
        return bVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f62271b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f62270a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f62272c == null) {
            this.f62272c = new AlertDialog.Builder((Context) C4536s.l(getActivity())).create();
        }
        return this.f62272c;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
