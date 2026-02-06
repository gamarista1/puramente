package Fg;

import Of.m0;
import java.util.Set;
import kotlin.jvm.internal.C6496s;

public abstract class G {

    /* renamed from: a  reason: collision with root package name */
    private final I0 f62926a;

    /* renamed from: b  reason: collision with root package name */
    private final Set f62927b;

    /* renamed from: c  reason: collision with root package name */
    private final C5366d0 f62928c;

    public G(I0 i02, Set set, C5366d0 d0Var) {
        C6496s.h(i02, "howThisTypeIsUsed");
        this.f62926a = i02;
        this.f62927b = set;
        this.f62928c = d0Var;
    }

    public abstract C5366d0 a();

    public abstract I0 b();

    public abstract Set c();

    public abstract G d(m0 m0Var);

    public abstract int hashCode();
}
