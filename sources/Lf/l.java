package Lf;

import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6531o;
import lf.C6534r;
import mf.Y;
import ng.c;
import ng.f;
import sf.C6714a;

public enum l {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");
    

    /* renamed from: e  reason: collision with root package name */
    public static final a f63890e = null;

    /* renamed from: f  reason: collision with root package name */
    public static final Set f63891f = null;

    /* renamed from: a  reason: collision with root package name */
    private final f f63902a;

    /* renamed from: b  reason: collision with root package name */
    private final f f63903b;

    /* renamed from: c  reason: collision with root package name */
    private final Lazy f63904c;

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f63905d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        l lVar;
        l lVar2;
        l lVar3;
        l lVar4;
        l lVar5;
        l lVar6;
        l lVar7;
        l[] a10;
        f63901p = C6714a.a(a10);
        f63890e = new a((DefaultConstructorMarker) null);
        f63891f = Y.j(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7);
    }

    private l(String str) {
        f i10 = f.i(str);
        C6496s.g(i10, "identifier(...)");
        this.f63902a = i10;
        f i11 = f.i(str + "Array");
        C6496s.g(i11, "identifier(...)");
        this.f63903b = i11;
        C6534r rVar = C6534r.PUBLICATION;
        this.f63904c = C6531o.a(rVar, new j(this));
        this.f63905d = C6531o.a(rVar, new k(this));
    }

    /* access modifiers changed from: private */
    public static final c e(l lVar) {
        c c10 = o.f63920A.c(lVar.f63903b);
        C6496s.g(c10, "child(...)");
        return c10;
    }

    /* access modifiers changed from: private */
    public static final c m(l lVar) {
        c c10 = o.f63920A.c(lVar.f63902a);
        C6496s.g(c10, "child(...)");
        return c10;
    }

    public final c f() {
        return (c) this.f63905d.getValue();
    }

    public final f i() {
        return this.f63903b;
    }

    public final c j() {
        return (c) this.f63904c.getValue();
    }

    public final f l() {
        return this.f63902a;
    }
}
