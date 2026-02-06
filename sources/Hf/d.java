package Hf;

import Bg.K;
import Ff.f;
import Ff.g;
import If.C5442i0;
import If.C5445k;
import If.j1;
import Of.g0;
import ig.i;
import ig.t;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6493o;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;
import lf.C6525i;
import mg.C6577e;
import mg.C6578f;
import mg.C6581i;
import yf.p;

public abstract class d {

    /* synthetic */ class a extends C6493o implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final a f63338a = new a();

        a() {
            super(2);
        }

        public final String getName() {
            return "loadFunction";
        }

        public final f getOwner() {
            return O.b(K.class);
        }

        public final String getSignature() {
            return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
        }

        /* renamed from: i */
        public final g0 invoke(K k10, i iVar) {
            C6496s.h(k10, "p0");
            C6496s.h(iVar, "p1");
            return k10.s(iVar);
        }
    }

    public static final g a(C6525i iVar) {
        boolean z10;
        C6496s.h(iVar, "<this>");
        Metadata metadata = (Metadata) iVar.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        String[] d12 = metadata.d1();
        if (d12.length == 0) {
            d12 = null;
        }
        if (d12 == null) {
            return null;
        }
        Pair j10 = C6581i.j(d12, metadata.d2());
        C6578f fVar = (C6578f) j10.a();
        i iVar2 = (i) j10.b();
        int[] mv = metadata.mv();
        if ((metadata.xi() & 8) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C6577e eVar = new C6577e(mv, z10);
        Class<?> cls = iVar.getClass();
        t n02 = iVar2.n0();
        C6496s.g(n02, "getTypeTable(...)");
        return new C5442i0(C5445k.f63698d, (g0) j1.h(cls, iVar2, fVar, new kg.g(n02), eVar, a.f63338a));
    }
}
