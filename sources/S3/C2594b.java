package s3;

import androidx.profileinstaller.f;

/* renamed from: s3.b  reason: case insensitive filesystem */
public final /* synthetic */ class C2594b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f.c f25902a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f25903b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f25904c;

    public /* synthetic */ C2594b(f.c cVar, int i10, Object obj) {
        this.f25902a = cVar;
        this.f25903b = i10;
        this.f25904c = obj;
    }

    public final void run() {
        this.f25902a.a(this.f25903b, this.f25904c);
    }
}
