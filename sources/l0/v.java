package l0;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager$AutofillCallback;

public final class v extends AutofillManager$AutofillCallback {

    /* renamed from: a  reason: collision with root package name */
    public static final v f23484a = new v();

    private v() {
    }

    public final void a(d dVar) {
        dVar.a().registerCallback(s.a(this));
    }

    public final void b(d dVar) {
        dVar.a().unregisterCallback(s.a(this));
    }

    public void onAutofillEvent(View view, int i10, int i11) {
        String str;
        super.onAutofillEvent(view, i10, i11);
        if (i11 == 1) {
            str = "Autofill popup was shown.";
        } else if (i11 == 2) {
            str = "Autofill popup was hidden.";
        } else if (i11 != 3) {
            str = "Unknown status event.";
        } else {
            str = "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account";
        }
        Log.d("Autofill Status", str);
    }
}
