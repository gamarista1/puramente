package M;

import Sg.p;
import W0.Q;
import android.view.inputmethod.ExtractedText;

public abstract class v0 {
    /* access modifiers changed from: private */
    public static final ExtractedText b(Q q10) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = q10.h();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = q10.h().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = Q0.Q.l(q10.g());
        extractedText.selectionEnd = Q0.Q.k(q10.g());
        extractedText.flags = p.N(q10.h(), 10, false, 2, (Object) null) ^ true ? 1 : 0;
        return extractedText;
    }
}
