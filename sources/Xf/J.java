package Xf;

import Lf.o;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import lf.C6502A;
import mf.O;
import mf.Y;
import ng.c;

public abstract class J {

    /* renamed from: a  reason: collision with root package name */
    private static final c f66285a;

    /* renamed from: b  reason: collision with root package name */
    private static final c f66286b;

    /* renamed from: c  reason: collision with root package name */
    private static final c f66287c;

    /* renamed from: d  reason: collision with root package name */
    private static final c f66288d;

    /* renamed from: e  reason: collision with root package name */
    private static final c f66289e;

    /* renamed from: f  reason: collision with root package name */
    private static final c f66290f;

    /* renamed from: g  reason: collision with root package name */
    private static final c f66291g;

    /* renamed from: h  reason: collision with root package name */
    private static final c f66292h;

    /* renamed from: i  reason: collision with root package name */
    private static final c f66293i = new c("javax.annotation.meta.TypeQualifier");

    /* renamed from: j  reason: collision with root package name */
    private static final c f66294j = new c("javax.annotation.meta.TypeQualifierNickname");

    /* renamed from: k  reason: collision with root package name */
    private static final c f66295k = new c("javax.annotation.meta.TypeQualifierDefault");

    /* renamed from: l  reason: collision with root package name */
    private static final c f66296l;

    /* renamed from: m  reason: collision with root package name */
    private static final c f66297m;

    /* renamed from: n  reason: collision with root package name */
    private static final c f66298n;

    /* renamed from: o  reason: collision with root package name */
    private static final c f66299o = new c("javax.annotation.ParametersAreNonnullByDefault");

    /* renamed from: p  reason: collision with root package name */
    private static final c f66300p = new c("javax.annotation.ParametersAreNullableByDefault");

    /* renamed from: q  reason: collision with root package name */
    private static final Set f66301q;

    /* renamed from: r  reason: collision with root package name */
    private static final Set f66302r;

    /* renamed from: s  reason: collision with root package name */
    private static final Set f66303s;

    /* renamed from: t  reason: collision with root package name */
    private static final Set f66304t;

    /* renamed from: u  reason: collision with root package name */
    private static final Set f66305u;

    /* renamed from: v  reason: collision with root package name */
    private static final Set f66306v = Y.j(I.f66276o, I.f66277p);

    /* renamed from: w  reason: collision with root package name */
    private static final Set f66307w = Y.j(I.f66275n, I.f66278q);

    /* renamed from: x  reason: collision with root package name */
    private static final Map f66308x = O.l(C6502A.a(I.f66265d, o.a.f63968H), C6502A.a(I.f66267f, o.a.f63976L), C6502A.a(I.f66269h, o.a.f64043y), C6502A.a(I.f66270i, o.a.f63984P));

    /* renamed from: y  reason: collision with root package name */
    private static final c f66309y = new c("kotlin.annotations.jvm.UnderMigration");

    static {
        c cVar = r0;
        c cVar2 = new c("org.jspecify.nullness.Nullable");
        f66285a = cVar2;
        c cVar3 = new c("org.jspecify.nullness.NullMarked");
        f66286b = cVar3;
        c cVar4 = new c("org.jspecify.nullness.NullnessUnspecified");
        f66287c = cVar4;
        c cVar5 = new c("org.jspecify.annotations.NonNull");
        f66288d = cVar5;
        c cVar6 = r3;
        c cVar7 = new c("org.jspecify.annotations.Nullable");
        f66289e = cVar7;
        c cVar8 = new c("org.jspecify.annotations.NullMarked");
        f66290f = cVar8;
        c cVar9 = new c("org.jspecify.annotations.NullnessUnspecified");
        f66291g = cVar9;
        c cVar10 = new c("org.jspecify.annotations.NullUnmarked");
        f66292h = cVar10;
        c cVar11 = new c("javax.annotation.Nonnull");
        f66296l = cVar11;
        c cVar12 = r4;
        c cVar13 = new c("javax.annotation.Nullable");
        f66297m = cVar13;
        c cVar14 = r5;
        c cVar15 = new c("javax.annotation.CheckForNull");
        f66298n = cVar15;
        f66301q = Y.j(cVar11, cVar15);
        c cVar16 = cVar11;
        c cVar17 = cVar10;
        c cVar18 = cVar9;
        c cVar19 = cVar8;
        c cVar20 = cVar4;
        c cVar21 = cVar3;
        c cVar22 = cVar;
        c cVar23 = cVar6;
        Set j10 = Y.j(I.f66273l, cVar5, new c("android.annotation.NonNull"), new c("androidx.annotation.NonNull"), new c("androidx.annotation.RecentlyNonNull"), new c("androidx.annotation.NonNull"), new c("com.android.annotations.NonNull"), new c("org.checkerframework.checker.nullness.compatqual.NonNullDecl"), new c("org.checkerframework.checker.nullness.qual.NonNull"), new c("edu.umd.cs.findbugs.annotations.NonNull"), new c("io.reactivex.annotations.NonNull"), new c("io.reactivex.rxjava3.annotations.NonNull"), new c("org.eclipse.jdt.annotation.NonNull"), new c("lombok.NonNull"));
        f66302r = j10;
        c cVar24 = I.f66274m;
        c cVar25 = r1;
        c cVar26 = new c("android.annotation.Nullable");
        c cVar27 = r1;
        c cVar28 = new c("androidx.annotation.Nullable");
        c cVar29 = r1;
        c cVar30 = new c("androidx.annotation.RecentlyNullable");
        c cVar31 = r1;
        c cVar32 = new c("androidx.annotation.Nullable");
        c cVar33 = r1;
        c cVar34 = new c("com.android.annotations.Nullable");
        c cVar35 = cVar16;
        c cVar36 = r1;
        c cVar37 = new c("org.checkerframework.checker.nullness.compatqual.NullableDecl");
        c cVar38 = r1;
        c cVar39 = new c("org.checkerframework.checker.nullness.qual.Nullable");
        c cVar40 = r1;
        c cVar41 = new c("edu.umd.cs.findbugs.annotations.Nullable");
        c cVar42 = r1;
        c cVar43 = new c("edu.umd.cs.findbugs.annotations.PossiblyNull");
        c cVar44 = cVar20;
        c cVar45 = r1;
        c cVar46 = new c("edu.umd.cs.findbugs.annotations.CheckForNull");
        c cVar47 = cVar21;
        c cVar48 = r1;
        c cVar49 = new c("io.reactivex.annotations.Nullable");
        c cVar50 = r1;
        c cVar51 = new c("io.reactivex.rxjava3.annotations.Nullable");
        c cVar52 = r1;
        c cVar53 = new c("org.eclipse.jdt.annotation.Nullable");
        Set j11 = Y.j(cVar24, cVar22, cVar23, cVar12, cVar14, cVar25, cVar27, cVar29, cVar31, cVar33, cVar36, cVar38, cVar40, cVar42, cVar45, cVar48, cVar50, cVar52);
        f66303s = j11;
        c cVar54 = cVar20;
        f66304t = Y.j(cVar54, cVar18);
        f66305u = Y.o(Y.o(Y.o(Y.o(Y.n(Y.n(new LinkedHashSet(), j10), j11), cVar16), cVar21), cVar19), cVar17);
    }

    public static final Set a() {
        return f66301q;
    }

    public static final Set b() {
        return f66304t;
    }

    public static final c c() {
        return f66296l;
    }

    public static final c d() {
        return f66299o;
    }

    public static final c e() {
        return f66300p;
    }

    public static final c f() {
        return f66293i;
    }

    public static final c g() {
        return f66295k;
    }

    public static final c h() {
        return f66294j;
    }

    public static final c i() {
        return f66290f;
    }

    public static final c j() {
        return f66292h;
    }

    public static final c k() {
        return f66286b;
    }

    public static final Set l() {
        return f66307w;
    }

    public static final Set m() {
        return f66302r;
    }

    public static final Set n() {
        return f66303s;
    }

    public static final Set o() {
        return f66306v;
    }

    public static final c p() {
        return f66309y;
    }
}
