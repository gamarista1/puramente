package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.C1758f;

/* renamed from: androidx.fragment.app.k  reason: case insensitive filesystem */
public final /* synthetic */ class C1763k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ W f16993a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f16994b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Rect f16995c;

    public /* synthetic */ C1763k(W w10, View view, Rect rect) {
        this.f16993a = w10;
        this.f16994b = view;
        this.f16995c = rect;
    }

    public final void run() {
        C1758f.g.q(this.f16993a, this.f16994b, this.f16995c);
    }
}
