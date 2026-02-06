package C;

import android.os.Build;
import android.view.View;
import androidx.core.view.C1710q0;
import androidx.core.view.D0;
import androidx.core.view.I;
import java.util.List;

final class D extends C1710q0.b implements Runnable, I, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final g0 f829a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f830b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f831c;

    /* renamed from: d  reason: collision with root package name */
    private D0 f832d;

    public D(g0 g0Var) {
        super(g0Var.c() ^ true ? 1 : 0);
        this.f829a = g0Var;
    }

    public D0 i(View view, D0 d02) {
        this.f832d = d02;
        this.f829a.p(d02);
        if (this.f830b) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f831c) {
            this.f829a.o(d02);
            g0.n(this.f829a, d02, 0, 2, (Object) null);
        }
        if (this.f829a.c()) {
            return D0.f15980b;
        }
        return d02;
    }

    public void onEnd(C1710q0 q0Var) {
        this.f830b = false;
        this.f831c = false;
        D0 d02 = this.f832d;
        if (!(q0Var.a() == 0 || d02 == null)) {
            this.f829a.o(d02);
            this.f829a.p(d02);
            g0.n(this.f829a, d02, 0, 2, (Object) null);
        }
        this.f832d = null;
        super.onEnd(q0Var);
    }

    public void onPrepare(C1710q0 q0Var) {
        this.f830b = true;
        this.f831c = true;
        super.onPrepare(q0Var);
    }

    public D0 onProgress(D0 d02, List list) {
        g0.n(this.f829a, d02, 0, 2, (Object) null);
        if (this.f829a.c()) {
            return D0.f15980b;
        }
        return d02;
    }

    public C1710q0.a onStart(C1710q0 q0Var, C1710q0.a aVar) {
        this.f830b = false;
        return super.onStart(q0Var, aVar);
    }

    public void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    public void run() {
        if (this.f830b) {
            this.f830b = false;
            this.f831c = false;
            D0 d02 = this.f832d;
            if (d02 != null) {
                this.f829a.o(d02);
                g0.n(this.f829a, d02, 0, 2, (Object) null);
                this.f832d = null;
            }
        }
    }

    public void onViewDetachedFromWindow(View view) {
    }
}
