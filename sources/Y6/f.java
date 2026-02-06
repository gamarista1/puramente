package y6;

import A6.e;
import A6.i;
import A6.j;
import A6.k;
import A6.l;
import Ef.m;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import v6.C4106a;
import v6.C4109d;
import w6.C4142b;
import w6.C4143c;
import y6.C4188a;
import yf.C6787a;

public final class f implements C4188a {

    /* renamed from: a  reason: collision with root package name */
    private final C4109d f49556a;

    /* renamed from: b  reason: collision with root package name */
    private final C4143c f49557b;

    /* renamed from: c  reason: collision with root package name */
    private final k f49558c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f49559d;

    /* renamed from: e  reason: collision with root package name */
    private final String f49560e;

    /* renamed from: f  reason: collision with root package name */
    private final int f49561f;

    /* renamed from: g  reason: collision with root package name */
    private final int f49562g;

    /* renamed from: h  reason: collision with root package name */
    private j f49563h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final int f49564i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public int f49565j;

    /* renamed from: k  reason: collision with root package name */
    private final a f49566k;

    public static final class a implements i {

        /* renamed from: a  reason: collision with root package name */
        private final int f49567a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f49568b;

        a(f fVar) {
            this.f49568b = fVar;
            this.f49567a = fVar.f49564i;
        }

        public int a() {
            return this.f49568b.f49565j;
        }

        public void b(int i10) {
            if (i10 != this.f49568b.f49565j) {
                f fVar = this.f49568b;
                fVar.f49565j = m.l(i10, 1, fVar.f49564i);
                j g10 = this.f49568b.l();
                if (g10 != null) {
                    g10.c(this.f49568b.f49565j);
                }
            }
        }

        public int c() {
            return this.f49567a;
        }
    }

    public f(String str, C4109d dVar, C4143c cVar, k kVar, boolean z10) {
        C6496s.h(dVar, "animationInformation");
        C6496s.h(cVar, "bitmapFrameRenderer");
        C6496s.h(kVar, "frameLoaderFactory");
        this.f49556a = dVar;
        this.f49557b = cVar;
        this.f49558c = kVar;
        this.f49559d = z10;
        this.f49560e = str == null ? String.valueOf(hashCode()) : str;
        this.f49561f = dVar.n();
        this.f49562g = dVar.g();
        int k10 = k(dVar);
        this.f49564i = k10;
        this.f49565j = k10;
        this.f49566k = new a(this);
    }

    private final g j(int i10, int i11) {
        if (!this.f49559d) {
            return new g(this.f49561f, this.f49562g);
        }
        int i12 = this.f49561f;
        int i13 = this.f49562g;
        if (i10 < i12 || i11 < i13) {
            double d10 = ((double) i12) / ((double) i13);
            if (i11 > i10) {
                i13 = m.h(i11, i13);
                i12 = (int) (((double) i13) * d10);
            } else {
                i12 = m.h(i10, i12);
                i13 = (int) (((double) i12) / d10);
            }
        }
        return new g(i12, i13);
    }

    private final int k(C4109d dVar) {
        return (int) m.e(TimeUnit.SECONDS.toMillis(1) / ((long) (dVar.k() / dVar.a())), 1);
    }

    /* access modifiers changed from: private */
    public final j l() {
        if (this.f49563h == null) {
            this.f49563h = this.f49558c.b(this.f49560e, this.f49557b, this.f49556a);
        }
        return this.f49563h;
    }

    /* access modifiers changed from: private */
    public static final C6514M m() {
        return C6514M.f71813a;
    }

    public void a(int i10, int i11, C6787a aVar) {
        if (i10 > 0 && i11 > 0 && this.f49561f > 0 && this.f49562g > 0) {
            g j10 = j(i10, i11);
            j l10 = l();
            if (l10 != null) {
                int b10 = j10.b();
                int b11 = j10.b();
                if (aVar == null) {
                    new e
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0023: CONSTRUCTOR  (r4v2 ? I:y6.e) =  call: y6.e.<init>():void type: CONSTRUCTOR in method: y6.f.a(int, int, yf.a):void, dex: classes2.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v2 ?
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	... 48 more
                        */
                    /*
                        this = this;
                        if (r2 <= 0) goto L_0x0029
                        if (r3 <= 0) goto L_0x0029
                        int r0 = r1.f49561f
                        if (r0 <= 0) goto L_0x0029
                        int r0 = r1.f49562g
                        if (r0 > 0) goto L_0x000d
                        goto L_0x0029
                    L_0x000d:
                        y6.g r2 = r1.j(r2, r3)
                        A6.j r3 = r1.l()
                        if (r3 == 0) goto L_0x0029
                        int r0 = r2.b()
                        int r2 = r2.b()
                        if (r4 != 0) goto L_0x0026
                        y6.e r4 = new y6.e
                        r4.<init>()
                    L_0x0026:
                        r3.a(r0, r2, r4)
                    L_0x0029:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: y6.f.a(int, int, yf.a):void");
                }

                public X5.a b(int i10, int i11, int i12) {
                    l lVar;
                    g j10 = j(i11, i12);
                    j l10 = l();
                    if (l10 != null) {
                        lVar = l10.b(i10, j10.b(), j10.a());
                    } else {
                        lVar = null;
                    }
                    if (lVar != null) {
                        e.f29386a.h(this.f49566k, lVar);
                    }
                    if (lVar != null) {
                        return lVar.a();
                    }
                    return null;
                }

                public void c() {
                    j l10 = l();
                    if (l10 != null) {
                        k.f29415d.b(this.f49560e, l10);
                    }
                    this.f49563h = null;
                }

                public void d(C4189b bVar, C4142b bVar2, C4106a aVar, int i10, C6787a aVar2) {
                    C4188a.C0754a.e(this, bVar, bVar2, aVar, i10, aVar2);
                }

                public void onStop() {
                    j l10 = l();
                    if (l10 != null) {
                        l10.onStop();
                    }
                    c();
                }
            }
