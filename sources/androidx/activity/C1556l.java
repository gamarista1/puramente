package androidx.activity;

import androidx.activity.C1554j;
import h.C2012a;

/* renamed from: androidx.activity.l  reason: case insensitive filesystem */
public final /* synthetic */ class C1556l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1554j.g f10812a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f10813b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C2012a.C0351a f10814c;

    public /* synthetic */ C1556l(C1554j.g gVar, int i10, C2012a.C0351a aVar) {
        this.f10812a = gVar;
        this.f10813b = i10;
        this.f10814c = aVar;
    }

    public final void run() {
        C1554j.g.s(this.f10812a, this.f10813b, this.f10814c);
    }
}
