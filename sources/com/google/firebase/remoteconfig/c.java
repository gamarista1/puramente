package com.google.firebase.remoteconfig;

import Dc.v;
import Dc.w;
import Ea.e;
import Ea.h;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.C4491c;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.f;
import com.google.firebase.remoteconfig.internal.m;
import com.google.firebase.remoteconfig.internal.o;
import com.google.firebase.remoteconfig.internal.p;
import com.google.firebase.remoteconfig.internal.q;
import com.google.firebase.remoteconfig.internal.u;
import com.google.firebase.remoteconfig.internal.y;
import com.revenuecat.purchases.api.BuildConfig;
import ic.C5027b;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import jc.C5046e;
import ub.C5230g;
import w.C2780Y;
import xb.C5276a;

public class c implements Fc.a {

    /* renamed from: j  reason: collision with root package name */
    private static final e f57786j = h.c();

    /* renamed from: k  reason: collision with root package name */
    private static final Random f57787k = new Random();

    /* renamed from: l  reason: collision with root package name */
    private static final Map f57788l = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final Map f57789a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f57790b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f57791c;

    /* renamed from: d  reason: collision with root package name */
    private final C5230g f57792d;

    /* renamed from: e  reason: collision with root package name */
    private final C5046e f57793e;

    /* renamed from: f  reason: collision with root package name */
    private final vb.c f57794f;

    /* renamed from: g  reason: collision with root package name */
    private final C5027b f57795g;

    /* renamed from: h  reason: collision with root package name */
    private final String f57796h;

    /* renamed from: i  reason: collision with root package name */
    private Map f57797i;

    private static class a implements C4491c.a {

        /* renamed from: a  reason: collision with root package name */
        private static final AtomicReference f57798a = new AtomicReference();

        private a() {
        }

        /* access modifiers changed from: private */
        public static void c(Context context) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference = f57798a;
            if (atomicReference.get() == null) {
                a aVar = new a();
                if (C2780Y.a(atomicReference, (Object) null, aVar)) {
                    C4491c.c(application);
                    C4491c.b().a(aVar);
                }
            }
        }

        public void a(boolean z10) {
            c.q(z10);
        }
    }

    c(Context context, ScheduledExecutorService scheduledExecutorService, C5230g gVar, C5046e eVar, vb.c cVar, C5027b bVar) {
        this(context, scheduledExecutorService, gVar, eVar, cVar, bVar, true);
    }

    private f e(String str, String str2) {
        return f.h(this.f57791c, u.c(this.f57790b, String.format("%s_%s_%s_%s.json", new Object[]{"frc", this.f57796h, str, str2})));
    }

    private o i(f fVar, f fVar2) {
        return new o(this.f57791c, fVar, fVar2);
    }

    static p j(Context context, String str, String str2) {
        return new p(context.getSharedPreferences(String.format("%s_%s_%s_%s", new Object[]{"frc", str, str2, "settings"}), 0));
    }

    private static y k(C5230g gVar, String str, C5027b bVar) {
        if (!o(gVar) || !str.equals("firebase")) {
            return null;
        }
        return new y(bVar);
    }

    private Ec.c m(f fVar, f fVar2) {
        return new Ec.c(fVar, Ec.a.a(fVar, fVar2), this.f57791c);
    }

    private static boolean n(C5230g gVar, String str) {
        if (!str.equals("firebase") || !o(gVar)) {
            return false;
        }
        return true;
    }

    private static boolean o(C5230g gVar) {
        return gVar.q().equals("[DEFAULT]");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C5276a p() {
        return null;
    }

    /* access modifiers changed from: private */
    public static synchronized void q(boolean z10) {
        synchronized (c.class) {
            for (a E10 : f57788l.values()) {
                E10.E(z10);
            }
        }
    }

    public synchronized a c(String str) {
        f e10;
        f e11;
        f e12;
        p j10;
        o i10;
        String str2;
        try {
            e10 = e(str, "fetch");
            e11 = e(str, "activate");
            e12 = e(str, BuildConfig.FLAVOR);
            j10 = j(this.f57790b, this.f57796h, str);
            i10 = i(e11, e12);
            y k10 = k(this.f57792d, str, this.f57795g);
            if (k10 != null) {
                i10.b(new v(k10));
            }
            str2 = str;
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return d(this.f57792d, str2, this.f57793e, this.f57794f, this.f57791c, e10, e11, e12, g(str, e10, j10), i10, j10, m(e11, e12));
    }

    /* access modifiers changed from: package-private */
    public synchronized a d(C5230g gVar, String str, C5046e eVar, vb.c cVar, Executor executor, f fVar, f fVar2, f fVar3, m mVar, o oVar, p pVar, Ec.c cVar2) {
        a aVar;
        String str2 = str;
        synchronized (this) {
            try {
                if (!this.f57789a.containsKey(str2)) {
                    Context context = this.f57790b;
                    vb.c cVar3 = n(gVar, str) ? cVar : null;
                    a aVar2 = r10;
                    a aVar3 = new a(context, gVar, eVar, cVar3, executor, fVar, fVar2, fVar3, mVar, oVar, pVar, l(gVar, eVar, mVar, fVar2, this.f57790b, str, pVar), cVar2);
                    aVar2.I();
                    this.f57789a.put(str2, aVar2);
                    f57788l.put(str2, aVar2);
                }
                aVar = (a) this.f57789a.get(str2);
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    public a f() {
        return c("firebase");
    }

    /* access modifiers changed from: package-private */
    public synchronized m g(String str, f fVar, p pVar) {
        C5046e eVar;
        C5027b bVar;
        try {
            eVar = this.f57793e;
            if (o(this.f57792d)) {
                bVar = this.f57795g;
            } else {
                new w
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0015: CONSTRUCTOR  (r0v2 ? I:Dc.w) =  call: Dc.w.<init>():void type: CONSTRUCTOR in method: com.google.firebase.remoteconfig.c.g(java.lang.String, com.google.firebase.remoteconfig.internal.f, com.google.firebase.remoteconfig.internal.p):com.google.firebase.remoteconfig.internal.m, dex: classes3.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v2 ?
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 43 more
                    */
                /*
                    this = this;
                    monitor-enter(r11)
                    com.google.firebase.remoteconfig.internal.m r10 = new com.google.firebase.remoteconfig.internal.m     // Catch:{ all -> 0x0011 }
                    jc.e r1 = r11.f57793e     // Catch:{ all -> 0x0011 }
                    ub.g r0 = r11.f57792d     // Catch:{ all -> 0x0011 }
                    boolean r0 = o(r0)     // Catch:{ all -> 0x0011 }
                    if (r0 == 0) goto L_0x0013
                    ic.b r0 = r11.f57795g     // Catch:{ all -> 0x0011 }
                L_0x000f:
                    r2 = r0
                    goto L_0x0019
                L_0x0011:
                    r12 = move-exception
                    goto L_0x0037
                L_0x0013:
                    Dc.w r0 = new Dc.w     // Catch:{ all -> 0x0011 }
                    r0.<init>()     // Catch:{ all -> 0x0011 }
                    goto L_0x000f
                L_0x0019:
                    java.util.concurrent.ScheduledExecutorService r3 = r11.f57791c     // Catch:{ all -> 0x0011 }
                    Ea.e r4 = f57786j     // Catch:{ all -> 0x0011 }
                    java.util.Random r5 = f57787k     // Catch:{ all -> 0x0011 }
                    ub.g r0 = r11.f57792d     // Catch:{ all -> 0x0011 }
                    ub.p r0 = r0.r()     // Catch:{ all -> 0x0011 }
                    java.lang.String r0 = r0.b()     // Catch:{ all -> 0x0011 }
                    com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient r7 = r11.h(r0, r12, r14)     // Catch:{ all -> 0x0011 }
                    java.util.Map r9 = r11.f57797i     // Catch:{ all -> 0x0011 }
                    r0 = r10
                    r6 = r13
                    r8 = r14
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0011 }
                    monitor-exit(r11)
                    return r10
                L_0x0037:
                    monitor-exit(r11)     // Catch:{ all -> 0x0011 }
                    throw r12
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.c.g(java.lang.String, com.google.firebase.remoteconfig.internal.f, com.google.firebase.remoteconfig.internal.p):com.google.firebase.remoteconfig.internal.m");
            }

            /* access modifiers changed from: package-private */
            public ConfigFetchHttpClient h(String str, String str2, p pVar) {
                return new ConfigFetchHttpClient(this.f57790b, this.f57792d.r().c(), str, str2, pVar.c(), pVar.c());
            }

            /* access modifiers changed from: package-private */
            public synchronized q l(C5230g gVar, C5046e eVar, m mVar, f fVar, Context context, String str, p pVar) {
                q qVar;
                synchronized (this) {
                    qVar = new q(gVar, eVar, mVar, fVar, context, str, pVar, this.f57791c);
                }
                return qVar;
            }

            protected c(Context context, ScheduledExecutorService scheduledExecutorService, C5230g gVar, C5046e eVar, vb.c cVar, C5027b bVar, boolean z10) {
                this.f57789a = new HashMap();
                this.f57797i = new HashMap();
                this.f57790b = context;
                this.f57791c = scheduledExecutorService;
                this.f57792d = gVar;
                this.f57793e = eVar;
                this.f57794f = cVar;
                this.f57795g = bVar;
                this.f57796h = gVar.r().c();
                a.c(context);
                if (z10) {
                    Tasks.call(scheduledExecutorService, new b(this));
                }
            }
        }
