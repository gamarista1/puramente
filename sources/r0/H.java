package R0;

import java.text.CharacterIterator;

public final class H implements CharacterIterator {

    /* renamed from: a  reason: collision with root package name */
    private final CharSequence f5499a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5500b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5501c;

    /* renamed from: d  reason: collision with root package name */
    private int f5502d;

    public H(CharSequence charSequence, int i10, int i11) {
        this.f5499a = charSequence;
        this.f5500b = i10;
        this.f5501c = i11;
        this.f5502d = i10;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public char current() {
        int i10 = this.f5502d;
        if (i10 == this.f5501c) {
            return 65535;
        }
        return this.f5499a.charAt(i10);
    }

    public char first() {
        this.f5502d = this.f5500b;
        return current();
    }

    public int getBeginIndex() {
        return this.f5500b;
    }

    public int getEndIndex() {
        return this.f5501c;
    }

    public int getIndex() {
        return this.f5502d;
    }

    public char last() {
        int i10 = this.f5500b;
        int i11 = this.f5501c;
        if (i10 == i11) {
            this.f5502d = i11;
            return 65535;
        }
        int i12 = i11 - 1;
        this.f5502d = i12;
        return this.f5499a.charAt(i12);
    }

    public char next() {
        int i10 = this.f5502d + 1;
        this.f5502d = i10;
        int i11 = this.f5501c;
        if (i10 < i11) {
            return this.f5499a.charAt(i10);
        }
        this.f5502d = i11;
        return 65535;
    }

    public char previous() {
        int i10 = this.f5502d;
        if (i10 <= this.f5500b) {
            return 65535;
        }
        int i11 = i10 - 1;
        this.f5502d = i11;
        return this.f5499a.charAt(i11);
    }

    public char setIndex(int i10) {
        int i11 = this.f5500b;
        if (i10 > this.f5501c || i11 > i10) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f5502d = i10;
        return current();
    }
}
