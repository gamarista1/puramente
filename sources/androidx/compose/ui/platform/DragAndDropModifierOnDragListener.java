package androidx.compose.ui.platform;

import android.view.DragEvent;
import android.view.View;
import androidx.collection.C1588b;
import k0.i;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.C2229b;
import n0.C2230c;
import n0.C2231d;
import n0.C2232e;
import n0.C2234g;
import yf.C6798l;
import yf.q;

final class DragAndDropModifierOnDragListener implements View.OnDragListener, C2230c {

    /* renamed from: a  reason: collision with root package name */
    private final q f13505a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C2232e f13506b = new C2232e(a.f13509a);

    /* renamed from: c  reason: collision with root package name */
    private final C1588b f13507c = new C1588b(0, 1, (DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private final i f13508d = new DragAndDropModifierOnDragListener$modifier$1(this);

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f13509a = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final C2234g invoke(C2229b bVar) {
            return null;
        }
    }

    public DragAndDropModifierOnDragListener(q qVar) {
        this.f13505a = qVar;
    }

    public void a(C2231d dVar) {
        this.f13507c.add(dVar);
    }

    public boolean b(C2231d dVar) {
        return this.f13507c.contains(dVar);
    }

    public i d() {
        return this.f13508d;
    }

    public boolean onDrag(View view, DragEvent dragEvent) {
        C2229b bVar = new C2229b(dragEvent);
        switch (dragEvent.getAction()) {
            case 1:
                boolean l22 = this.f13506b.l2(bVar);
                for (C2231d S02 : this.f13507c) {
                    S02.S0(bVar);
                }
                return l22;
            case 2:
                this.f13506b.R0(bVar);
                return false;
            case 3:
                return this.f13506b.T(bVar);
            case 4:
                this.f13506b.o0(bVar);
                return false;
            case 5:
                this.f13506b.n1(bVar);
                return false;
            case 6:
                this.f13506b.t0(bVar);
                return false;
            default:
                return false;
        }
    }
}
