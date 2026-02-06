package Y0;

import Q0.C1326i;
import Q0.C1327j;
import android.text.style.ClickableSpan;
import android.view.View;

final class j extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    private final C1326i f10244a;

    public j(C1326i iVar) {
        this.f10244a = iVar;
    }

    public void onClick(View view) {
        C1327j a10 = this.f10244a.a();
        if (a10 != null) {
            a10.a(this.f10244a);
        }
    }
}
