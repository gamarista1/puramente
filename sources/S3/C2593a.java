package s3;

import androidx.profileinstaller.b;

/* renamed from: s3.a  reason: case insensitive filesystem */
public final /* synthetic */ class C2593a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f25899a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f25900b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f25901c;

    public /* synthetic */ C2593a(b bVar, int i10, Object obj) {
        this.f25899a = bVar;
        this.f25900b = i10;
        this.f25901c = obj;
    }

    public final void run() {
        this.f25899a.g(this.f25900b, this.f25901c);
    }
}
