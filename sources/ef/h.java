package Ef;

import java.util.NoSuchElementException;
import mf.L;

public final class h extends L {

    /* renamed from: a  reason: collision with root package name */
    private final int f62821a;

    /* renamed from: b  reason: collision with root package name */
    private final int f62822b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f62823c;

    /* renamed from: d  reason: collision with root package name */
    private int f62824d;

    public h(int i10, int i11, int i12) {
        this.f62821a = i12;
        this.f62822b = i11;
        boolean z10 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z10 = true;
        }
        this.f62823c = z10;
        this.f62824d = !z10 ? i11 : i10;
    }

    public int a() {
        int i10 = this.f62824d;
        if (i10 != this.f62822b) {
            this.f62824d = this.f62821a + i10;
        } else if (this.f62823c) {
            this.f62823c = false;
        } else {
            throw new NoSuchElementException();
        }
        return i10;
    }

    public boolean hasNext() {
        return this.f62823c;
    }
}
