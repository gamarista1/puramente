package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C1758f;

/* renamed from: androidx.fragment.app.e  reason: case insensitive filesystem */
public final /* synthetic */ class C1757e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f16935a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f16936b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C1758f.a f16937c;

    public /* synthetic */ C1757e(ViewGroup viewGroup, View view, C1758f.a aVar) {
        this.f16935a = viewGroup;
        this.f16936b = view;
        this.f16937c = aVar;
    }

    public final void run() {
        C1758f.a.C0296a.b(this.f16935a, this.f16936b, this.f16937c);
    }
}
