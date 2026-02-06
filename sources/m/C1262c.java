package M;

import J.C1228y;
import P.G;
import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.ui.platform.v1;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import yf.C6798l;

/* renamed from: M.c  reason: case insensitive filesystem */
final class C1262c {

    /* renamed from: a  reason: collision with root package name */
    public static final C1262c f4209a = new C1262c();

    private C1262c() {
    }

    /* access modifiers changed from: private */
    public static final void c(IntConsumer intConsumer, int i10) {
        intConsumer.accept(i10);
    }

    public final void b(C1228y yVar, G g10, HandwritingGesture handwritingGesture, v1 v1Var, Executor executor, IntConsumer intConsumer, C6798l lVar) {
        int i10;
        if (yVar != null) {
            i10 = i0.f4212a.l(yVar, handwritingGesture, g10, v1Var, lVar);
        } else {
            i10 = 3;
        }
        if (intConsumer != null) {
            if (executor != null) {
                executor.execute(new C1261b(intConsumer, i10));
            } else {
                intConsumer.accept(i10);
            }
        }
    }

    public final boolean d(C1228y yVar, G g10, PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (yVar != null) {
            return i0.f4212a.D(yVar, previewableHandwritingGesture, g10, cancellationSignal);
        }
        return false;
    }
}
