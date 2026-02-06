package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.C4494f;
import com.google.android.gms.common.api.internal.C4502n;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import ya.C5286c;

/* renamed from: com.google.android.gms.common.internal.h  reason: case insensitive filesystem */
public abstract class C4526h extends C4518c implements a.f {
    private static volatile Executor zaa;
    private final C4522e zab;
    private final Set zac;
    private final Account zad;

    protected C4526h(Context context, Looper looper, int i10, C4522e eVar, f.b bVar, f.c cVar) {
        this(context, looper, i10, eVar, (C4494f) bVar, (C4502n) cVar);
    }

    private final Set d(Set set) {
        Set<Scope> validateScopes = validateScopes(set);
        for (Scope contains : validateScopes) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return validateScopes;
    }

    public final Account getAccount() {
        return this.zad;
    }

    /* access modifiers changed from: protected */
    public Executor getBindServiceExecutor() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final C4522e getClientSettings() {
        return this.zab;
    }

    public C5286c[] getRequiredFeatures() {
        return new C5286c[0];
    }

    /* access modifiers changed from: protected */
    public final Set<Scope> getScopes() {
        return this.zac;
    }

    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        if (requiresSignIn()) {
            return this.zac;
        }
        return Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    public Set<Scope> validateScopes(Set<Scope> set) {
        return set;
    }

    protected C4526h(Context context, Looper looper, int i10, C4522e eVar, C4494f fVar, C4502n nVar) {
        this(context, looper, C4527i.b(context), com.google.android.gms.common.a.o(), i10, eVar, (C4494f) C4536s.l(fVar), (C4502n) C4536s.l(nVar));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C4526h(android.content.Context r11, android.os.Looper r12, com.google.android.gms.common.internal.C4527i r13, com.google.android.gms.common.a r14, int r15, com.google.android.gms.common.internal.C4522e r16, com.google.android.gms.common.api.internal.C4494f r17, com.google.android.gms.common.api.internal.C4502n r18) {
        /*
            r10 = this;
            r9 = r10
            r0 = r17
            r1 = r18
            r2 = 0
            if (r0 != 0) goto L_0x000a
            r6 = r2
            goto L_0x0010
        L_0x000a:
            com.google.android.gms.common.internal.J r3 = new com.google.android.gms.common.internal.J
            r3.<init>(r0)
            r6 = r3
        L_0x0010:
            if (r1 != 0) goto L_0x0014
            r7 = r2
            goto L_0x001a
        L_0x0014:
            com.google.android.gms.common.internal.K r0 = new com.google.android.gms.common.internal.K
            r0.<init>(r1)
            r7 = r0
        L_0x001a:
            java.lang.String r8 = r16.k()
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r16
            r9.zab = r0
            android.accounts.Account r1 = r16.b()
            r9.zad = r1
            java.util.Set r0 = r16.e()
            java.util.Set r0 = r10.d(r0)
            r9.zac = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C4526h.<init>(android.content.Context, android.os.Looper, com.google.android.gms.common.internal.i, com.google.android.gms.common.a, int, com.google.android.gms.common.internal.e, com.google.android.gms.common.api.internal.f, com.google.android.gms.common.api.internal.n):void");
    }
}
