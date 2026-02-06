package W0;

import Q0.Q;
import Sg.p;
import android.view.inputmethod.ExtractedText;

/* renamed from: W0.w  reason: case insensitive filesystem */
public abstract class C1454w {
    public static final ExtractedText a(Q q10) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = q10.h();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = q10.h().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = Q.l(q10.g());
        extractedText.selectionEnd = Q.k(q10.g());
        extractedText.flags = p.N(q10.h(), 10, false, 2, (Object) null) ^ true ? 1 : 0;
        return extractedText;
    }
}
