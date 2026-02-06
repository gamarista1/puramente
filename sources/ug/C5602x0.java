package Ug;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C6496s;

/* renamed from: Ug.x0  reason: case insensitive filesystem */
public final class C5602x0 extends CancellationException {

    /* renamed from: a  reason: collision with root package name */
    public final transient C5600w0 f65418a;

    public C5602x0(String str, Throwable th2, C5600w0 w0Var) {
        super(str);
        this.f65418a = w0Var;
        if (th2 != null) {
            initCause(th2);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C5602x0) {
                C5602x0 x0Var = (C5602x0) obj;
                if (!C6496s.c(x0Var.getMessage(), getMessage()) || !C6496s.c(x0Var.f65418a, this.f65418a) || !C6496s.c(x0Var.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        int i10;
        String message = getMessage();
        C6496s.e(message);
        int hashCode = ((message.hashCode() * 31) + this.f65418a.hashCode()) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i10 = cause.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public String toString() {
        return super.toString() + "; job=" + this.f65418a;
    }
}
