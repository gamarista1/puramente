package j4;

import Ug.C5600w0;
import androidx.lifecycle.C1790m;
import androidx.lifecycle.C1798v;
import java.util.concurrent.CancellationException;

/* renamed from: j4.a  reason: case insensitive filesystem */
public final class C3614a implements C3629p {

    /* renamed from: a  reason: collision with root package name */
    private final C1790m f44624a;

    /* renamed from: b  reason: collision with root package name */
    private final C5600w0 f44625b;

    public C3614a(C1790m mVar, C5600w0 w0Var) {
        this.f44624a = mVar;
        this.f44625b = w0Var;
    }

    public void a() {
        C5600w0.a.a(this.f44625b, (CancellationException) null, 1, (Object) null);
    }

    public void onDestroy(C1798v vVar) {
        a();
    }

    public void start() {
        this.f44624a.a(this);
    }

    public void y() {
        this.f44624a.d(this);
    }
}
