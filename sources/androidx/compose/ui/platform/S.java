package androidx.compose.ui.platform;

import L0.c;
import android.view.ActionMode;
import android.view.View;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q0.C2423i;
import yf.C6787a;

public final class S implements p1 {

    /* renamed from: a  reason: collision with root package name */
    private final View f13651a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public ActionMode f13652b;

    /* renamed from: c  reason: collision with root package name */
    private final c f13653c = new c(new a(this), (C2423i) null, (C6787a) null, (C6787a) null, (C6787a) null, (C6787a) null, 62, (DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private r1 f13654d = r1.Hidden;

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ S f13655a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(S s10) {
            super(0);
            this.f13655a = s10;
        }

        public final void invoke() {
            this.f13655a.f13652b = null;
        }
    }

    public S(View view) {
        this.f13651a = view;
    }

    public void a() {
        this.f13654d = r1.Hidden;
        ActionMode actionMode = this.f13652b;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.f13652b = null;
    }

    public void b(C2423i iVar, C6787a aVar, C6787a aVar2, C6787a aVar3, C6787a aVar4) {
        this.f13653c.l(iVar);
        this.f13653c.h(aVar);
        this.f13653c.i(aVar3);
        this.f13653c.j(aVar2);
        this.f13653c.k(aVar4);
        ActionMode actionMode = this.f13652b;
        if (actionMode == null) {
            this.f13654d = r1.Shown;
            this.f13652b = q1.f13825a.b(this.f13651a, new L0.a(this.f13653c), 1);
        } else if (actionMode != null) {
            actionMode.invalidate();
        }
    }

    public r1 getStatus() {
        return this.f13654d;
    }
}
