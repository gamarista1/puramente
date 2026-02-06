package Hf;

import Ff.g;
import Ff.l;
import Ff.p;
import Ff.w;
import If.A;
import If.K0;
import If.U0;
import If.j1;
import Jf.h;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import kotlin.jvm.internal.C6496s;

public abstract class c {
    public static final Constructor a(g gVar) {
        Member member;
        h S10;
        C6496s.h(gVar, "<this>");
        A b10 = j1.b(gVar);
        if (b10 == null || (S10 = b10.S()) == null) {
            member = null;
        } else {
            member = S10.getMember();
        }
        if (member instanceof Constructor) {
            return (Constructor) member;
        }
        return null;
    }

    public static final Field b(l lVar) {
        C6496s.h(lVar, "<this>");
        K0 d10 = j1.d(lVar);
        if (d10 != null) {
            return d10.j0();
        }
        return null;
    }

    public static final Method c(l lVar) {
        C6496s.h(lVar, "<this>");
        return d(lVar.d());
    }

    public static final Method d(g gVar) {
        Member member;
        h S10;
        C6496s.h(gVar, "<this>");
        A b10 = j1.b(gVar);
        if (b10 == null || (S10 = b10.S()) == null) {
            member = null;
        } else {
            member = S10.getMember();
        }
        if (member instanceof Method) {
            return (Method) member;
        }
        return null;
    }

    public static final Method e(Ff.h hVar) {
        C6496s.h(hVar, "<this>");
        return d(hVar.g());
    }

    public static final Type f(p pVar) {
        C6496s.h(pVar, "<this>");
        Type a10 = ((U0) pVar).a();
        if (a10 == null) {
            return w.f(pVar);
        }
        return a10;
    }
}
