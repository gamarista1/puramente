package W0;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import yf.C6798l;

class G extends D {
    public G(InputConnection inputConnection, C6798l lVar) {
        super(inputConnection, lVar);
    }

    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        InputConnection c10 = c();
        if (c10 != null) {
            c10.performHandwritingGesture(handwritingGesture, executor, intConsumer);
        }
    }

    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        InputConnection c10 = c();
        if (c10 != null) {
            return c10.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }
}
