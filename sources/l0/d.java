package l0;

import android.view.View;
import android.view.autofill.AutofillManager;

public final class d implements g {

    /* renamed from: a  reason: collision with root package name */
    private final View f23479a;

    /* renamed from: b  reason: collision with root package name */
    private final w f23480b;

    /* renamed from: c  reason: collision with root package name */
    private final AutofillManager f23481c;

    public d(View view, w wVar) {
        this.f23479a = view;
        this.f23480b = wVar;
        AutofillManager a10 = C2164b.a(view.getContext().getSystemService(C2163a.a()));
        if (a10 != null) {
            this.f23481c = a10;
            view.setImportantForAutofill(1);
            return;
        }
        throw new IllegalStateException("Autofill service could not be located.");
    }

    public final AutofillManager a() {
        return this.f23481c;
    }

    public final w b() {
        return this.f23480b;
    }

    public final View c() {
        return this.f23479a;
    }
}
