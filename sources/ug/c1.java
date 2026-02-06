package Ug;

import java.util.concurrent.CancellationException;

public final class c1 extends CancellationException {

    /* renamed from: a  reason: collision with root package name */
    public final transient C5600w0 f65354a;

    public c1(String str, C5600w0 w0Var) {
        super(str);
        this.f65354a = w0Var;
    }

    public c1(String str) {
        this(str, (C5600w0) null);
    }
}
