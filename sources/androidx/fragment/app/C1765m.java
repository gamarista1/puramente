package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.fragment.app.C1758f;

/* renamed from: androidx.fragment.app.m  reason: case insensitive filesystem */
public final /* synthetic */ class C1765m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1758f.g f16997a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f16998b;

    public /* synthetic */ C1765m(C1758f.g gVar, ViewGroup viewGroup) {
        this.f16997a = gVar;
        this.f16998b = viewGroup;
    }

    public final void run() {
        C1758f.g.b.a.c(this.f16997a, this.f16998b);
    }
}
