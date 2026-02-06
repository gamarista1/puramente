package Ef;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.C6496s;
import mf.r;

public final class b extends r {

    /* renamed from: a  reason: collision with root package name */
    private final int f62809a;

    /* renamed from: b  reason: collision with root package name */
    private final int f62810b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f62811c;

    /* renamed from: d  reason: collision with root package name */
    private int f62812d;

    public b(char c10, char c11, int i10) {
        this.f62809a = i10;
        this.f62810b = c11;
        boolean z10 = false;
        if (i10 <= 0 ? C6496s.i(c10, c11) >= 0 : C6496s.i(c10, c11) <= 0) {
            z10 = true;
        }
        this.f62811c = z10;
        this.f62812d = !z10 ? c11 : c10;
    }

    public char a() {
        int i10 = this.f62812d;
        if (i10 != this.f62810b) {
            this.f62812d = this.f62809a + i10;
        } else if (this.f62811c) {
            this.f62811c = false;
        } else {
            throw new NoSuchElementException();
        }
        return (char) i10;
    }

    public boolean hasNext() {
        return this.f62811c;
    }
}
