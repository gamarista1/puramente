package jg;

import ig.m;
import java.io.InputStream;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import pg.C6645g;
import wf.C6763c;

/* renamed from: jg.c  reason: case insensitive filesystem */
public abstract class C6431c {
    public static final Pair a(InputStream inputStream) {
        m mVar;
        C6496s.h(inputStream, "<this>");
        try {
            C6429a a10 = C6429a.f71504g.a(inputStream);
            if (a10.h()) {
                C6645g d10 = C6645g.d();
                C6430b.a(d10);
                mVar = m.W(inputStream, d10);
            } else {
                mVar = null;
            }
            Pair a11 = C6502A.a(mVar, a10);
            C6763c.a(inputStream, (Throwable) null);
            return a11;
        } catch (Throwable th2) {
            C6763c.a(inputStream, th);
            throw th2;
        }
    }
}
