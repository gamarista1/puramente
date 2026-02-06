package Hf;

import Ff.c;
import Ff.g;
import Ff.h;
import Ff.l;
import If.A;
import If.j1;
import Jf.h;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C6496s;

public abstract class a {
    public static final boolean a(c cVar) {
        boolean z10;
        Member member;
        boolean z11;
        boolean z12;
        h U10;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        C6496s.h(cVar, "<this>");
        if (cVar instanceof Ff.h) {
            l lVar = (l) cVar;
            Field b10 = c.b(lVar);
            if (b10 != null) {
                z19 = b10.isAccessible();
            } else {
                z19 = true;
            }
            if (!z19) {
                return false;
            }
            Method c10 = c.c(lVar);
            if (c10 != null) {
                z20 = c10.isAccessible();
            } else {
                z20 = true;
            }
            if (!z20) {
                return false;
            }
            Method e10 = c.e((Ff.h) cVar);
            if (e10 != null) {
                z21 = e10.isAccessible();
            } else {
                z21 = true;
            }
            if (!z21) {
                return false;
            }
        } else if (cVar instanceof l) {
            l lVar2 = (l) cVar;
            Field b11 = c.b(lVar2);
            if (b11 != null) {
                z17 = b11.isAccessible();
            } else {
                z17 = true;
            }
            if (!z17) {
                return false;
            }
            Method c11 = c.c(lVar2);
            if (c11 != null) {
                z18 = c11.isAccessible();
            } else {
                z18 = true;
            }
            if (!z18) {
                return false;
            }
        } else if (cVar instanceof l.b) {
            Field b12 = c.b(((l.b) cVar).i());
            if (b12 != null) {
                z15 = b12.isAccessible();
            } else {
                z15 = true;
            }
            if (!z15) {
                return false;
            }
            Method d10 = c.d((g) cVar);
            if (d10 != null) {
                z16 = d10.isAccessible();
            } else {
                z16 = true;
            }
            if (!z16) {
                return false;
            }
        } else if (cVar instanceof h.a) {
            Field b13 = c.b(((h.a) cVar).i());
            if (b13 != null) {
                z13 = b13.isAccessible();
            } else {
                z13 = true;
            }
            if (!z13) {
                return false;
            }
            Method d11 = c.d((g) cVar);
            if (d11 != null) {
                z14 = d11.isAccessible();
            } else {
                z14 = true;
            }
            if (!z14) {
                return false;
            }
        } else if (cVar instanceof g) {
            g gVar = (g) cVar;
            Method d12 = c.d(gVar);
            if (d12 != null) {
                z10 = d12.isAccessible();
            } else {
                z10 = true;
            }
            if (!z10) {
                return false;
            }
            A b14 = j1.b(cVar);
            AccessibleObject accessibleObject = null;
            if (b14 == null || (U10 = b14.U()) == null) {
                member = null;
            } else {
                member = U10.getMember();
            }
            if (member instanceof AccessibleObject) {
                accessibleObject = (AccessibleObject) member;
            }
            if (accessibleObject != null) {
                z11 = accessibleObject.isAccessible();
            } else {
                z11 = true;
            }
            if (!z11) {
                return false;
            }
            Constructor a10 = c.a(gVar);
            if (a10 != null) {
                z12 = a10.isAccessible();
            } else {
                z12 = true;
            }
            if (!z12) {
                return false;
            }
        } else {
            throw new UnsupportedOperationException("Unknown callable: " + cVar + " (" + cVar.getClass() + ')');
        }
        return true;
    }

    public static final void b(c cVar, boolean z10) {
        Member member;
        Jf.h U10;
        C6496s.h(cVar, "<this>");
        if (cVar instanceof Ff.h) {
            l lVar = (l) cVar;
            Field b10 = c.b(lVar);
            if (b10 != null) {
                b10.setAccessible(z10);
            }
            Method c10 = c.c(lVar);
            if (c10 != null) {
                c10.setAccessible(z10);
            }
            Method e10 = c.e((Ff.h) cVar);
            if (e10 != null) {
                e10.setAccessible(z10);
            }
        } else if (cVar instanceof l) {
            l lVar2 = (l) cVar;
            Field b11 = c.b(lVar2);
            if (b11 != null) {
                b11.setAccessible(z10);
            }
            Method c11 = c.c(lVar2);
            if (c11 != null) {
                c11.setAccessible(z10);
            }
        } else if (cVar instanceof l.b) {
            Field b12 = c.b(((l.b) cVar).i());
            if (b12 != null) {
                b12.setAccessible(z10);
            }
            Method d10 = c.d((g) cVar);
            if (d10 != null) {
                d10.setAccessible(z10);
            }
        } else if (cVar instanceof h.a) {
            Field b13 = c.b(((h.a) cVar).i());
            if (b13 != null) {
                b13.setAccessible(z10);
            }
            Method d11 = c.d((g) cVar);
            if (d11 != null) {
                d11.setAccessible(z10);
            }
        } else if (cVar instanceof g) {
            g gVar = (g) cVar;
            Method d12 = c.d(gVar);
            if (d12 != null) {
                d12.setAccessible(z10);
            }
            A b14 = j1.b(cVar);
            AccessibleObject accessibleObject = null;
            if (b14 == null || (U10 = b14.U()) == null) {
                member = null;
            } else {
                member = U10.getMember();
            }
            if (member instanceof AccessibleObject) {
                accessibleObject = (AccessibleObject) member;
            }
            if (accessibleObject != null) {
                accessibleObject.setAccessible(true);
            }
            Constructor a10 = c.a(gVar);
            if (a10 != null) {
                a10.setAccessible(z10);
            }
        } else {
            throw new UnsupportedOperationException("Unknown callable: " + cVar + " (" + cVar.getClass() + ')');
        }
    }
}
