package D0;

import android.view.MotionEvent;
import androidx.compose.ui.viewinterop.c;
import k0.i;
import kotlin.jvm.internal.C6498u;
import yf.C6798l;

public abstract class L {

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f1411a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(1);
            this.f1411a = cVar;
        }

        /* renamed from: a */
        public final Boolean invoke(MotionEvent motionEvent) {
            boolean z10;
            switch (motionEvent.getActionMasked()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    z10 = this.f1411a.dispatchTouchEvent(motionEvent);
                    break;
                default:
                    z10 = this.f1411a.dispatchGenericMotionEvent(motionEvent);
                    break;
            }
            return Boolean.valueOf(z10);
        }
    }

    public static final i a(i iVar, c cVar) {
        K k10 = new K();
        k10.e(new a(cVar));
        S s10 = new S();
        k10.i(s10);
        cVar.setOnRequestDisallowInterceptTouchEvent$ui_release(s10);
        return iVar.h(k10);
    }
}
