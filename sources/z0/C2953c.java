package z0;

import android.view.View;
import z0.C2952b;

/* renamed from: z0.c  reason: case insensitive filesystem */
public final class C2953c implements C2951a {

    /* renamed from: a  reason: collision with root package name */
    private final View f29067a;

    public C2953c(View view) {
        this.f29067a = view;
    }

    public void a(int i10) {
        C2952b.a aVar = C2952b.f29066a;
        if (C2952b.b(i10, aVar.a())) {
            this.f29067a.performHapticFeedback(0);
        } else if (C2952b.b(i10, aVar.b())) {
            this.f29067a.performHapticFeedback(9);
        }
    }
}
