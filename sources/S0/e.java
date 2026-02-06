package S0;

import java.text.BreakIterator;

public final class e extends b {

    /* renamed from: a  reason: collision with root package name */
    private final CharSequence f5826a;

    /* renamed from: b  reason: collision with root package name */
    private final BreakIterator f5827b;

    public e(CharSequence charSequence) {
        this.f5826a = charSequence;
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f5827b = characterInstance;
    }

    public int e(int i10) {
        return this.f5827b.following(i10);
    }

    public int f(int i10) {
        return this.f5827b.preceding(i10);
    }
}
