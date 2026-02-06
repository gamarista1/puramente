package androidx.fragment.app;

import androidx.fragment.app.C1758f;
import androidx.fragment.app.b0;

/* renamed from: androidx.fragment.app.j  reason: case insensitive filesystem */
public final /* synthetic */ class C1762j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b0.d f16990a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b0.d f16991b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C1758f.g f16992c;

    public /* synthetic */ C1762j(b0.d dVar, b0.d dVar2, C1758f.g gVar) {
        this.f16990a = dVar;
        this.f16991b = dVar2;
        this.f16992c = gVar;
    }

    public final void run() {
        C1758f.g.p(this.f16990a, this.f16991b, this.f16992c);
    }
}
