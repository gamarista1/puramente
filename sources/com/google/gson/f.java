package com.google.gson;

import Pc.u;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private u f58178a = u.f52215g;

    /* renamed from: b  reason: collision with root package name */
    private o f58179b = o.DEFAULT;

    /* renamed from: c  reason: collision with root package name */
    private c f58180c = b.IDENTITY;

    /* renamed from: d  reason: collision with root package name */
    private final Map f58181d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final List f58182e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final List f58183f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private boolean f58184g = false;

    /* renamed from: h  reason: collision with root package name */
    private String f58185h = e.f58143B;

    /* renamed from: i  reason: collision with root package name */
    private int f58186i = 2;

    /* renamed from: j  reason: collision with root package name */
    private int f58187j = 2;

    /* renamed from: k  reason: collision with root package name */
    private boolean f58188k = false;

    /* renamed from: l  reason: collision with root package name */
    private boolean f58189l = false;

    /* renamed from: m  reason: collision with root package name */
    private boolean f58190m = true;

    /* renamed from: n  reason: collision with root package name */
    private d f58191n = e.f58142A;

    /* renamed from: o  reason: collision with root package name */
    private boolean f58192o = false;

    /* renamed from: p  reason: collision with root package name */
    private q f58193p = e.f58147z;

    /* renamed from: q  reason: collision with root package name */
    private boolean f58194q = true;

    /* renamed from: r  reason: collision with root package name */
    private s f58195r = e.f58145D;

    /* renamed from: s  reason: collision with root package name */
    private s f58196s = e.f58146E;

    /* renamed from: t  reason: collision with root package name */
    private final ArrayDeque f58197t = new ArrayDeque();

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.lang.String r4, int r5, int r6, java.util.List r7) {
        /*
            boolean r0 = com.google.gson.internal.sql.d.f58344a
            r1 = 0
            if (r4 == 0) goto L_0x0026
            java.lang.String r2 = r4.trim()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0026
            com.google.gson.internal.bind.c$b r5 = com.google.gson.internal.bind.c.b.f58208b
            com.google.gson.u r5 = r5.b(r4)
            if (r0 == 0) goto L_0x0024
            com.google.gson.internal.bind.c$b r6 = com.google.gson.internal.sql.d.f58346c
            com.google.gson.u r1 = r6.b(r4)
            com.google.gson.internal.bind.c$b r6 = com.google.gson.internal.sql.d.f58345b
            com.google.gson.u r4 = r6.b(r4)
            goto L_0x0047
        L_0x0024:
            r4 = r1
            goto L_0x0047
        L_0x0026:
            r4 = 2
            if (r5 != r4) goto L_0x002d
            if (r6 == r4) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            return
        L_0x002d:
            com.google.gson.internal.bind.c$b r4 = com.google.gson.internal.bind.c.b.f58208b
            com.google.gson.u r4 = r4.a(r5, r6)
            if (r0 == 0) goto L_0x0045
            com.google.gson.internal.bind.c$b r1 = com.google.gson.internal.sql.d.f58346c
            com.google.gson.u r1 = r1.a(r5, r6)
            com.google.gson.internal.bind.c$b r2 = com.google.gson.internal.sql.d.f58345b
            com.google.gson.u r5 = r2.a(r5, r6)
            r3 = r5
            r5 = r4
            r4 = r3
            goto L_0x0047
        L_0x0045:
            r5 = r4
            goto L_0x0024
        L_0x0047:
            r7.add(r5)
            if (r0 == 0) goto L_0x0052
            r7.add(r1)
            r7.add(r4)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.f.a(java.lang.String, int, int, java.util.List):void");
    }

    public e b() {
        ArrayList arrayList = r1;
        ArrayList arrayList2 = new ArrayList(this.f58182e.size() + this.f58183f.size() + 3);
        arrayList2.addAll(this.f58182e);
        Collections.reverse(arrayList2);
        ArrayList arrayList3 = new ArrayList(this.f58183f);
        Collections.reverse(arrayList3);
        arrayList2.addAll(arrayList3);
        a(this.f58185h, this.f58186i, this.f58187j, arrayList2);
        u uVar = this.f58178a;
        c cVar = this.f58180c;
        HashMap hashMap = r5;
        HashMap hashMap2 = new HashMap(this.f58181d);
        boolean z10 = this.f58184g;
        boolean z11 = this.f58188k;
        boolean z12 = this.f58192o;
        boolean z13 = this.f58190m;
        d dVar = this.f58191n;
        q qVar = this.f58193p;
        boolean z14 = this.f58189l;
        boolean z15 = this.f58194q;
        o oVar = this.f58179b;
        String str = this.f58185h;
        int i10 = this.f58186i;
        int i11 = this.f58187j;
        ArrayList arrayList4 = r1;
        u uVar2 = uVar;
        ArrayList arrayList5 = new ArrayList(this.f58182e);
        ArrayList arrayList6 = r1;
        ArrayList arrayList7 = new ArrayList(this.f58183f);
        s sVar = this.f58195r;
        s sVar2 = this.f58196s;
        ArrayList arrayList8 = r1;
        ArrayList arrayList9 = new ArrayList(this.f58197t);
        return new e(uVar2, cVar, hashMap, z10, z11, z12, z13, dVar, qVar, z14, z15, oVar, str, i10, i11, arrayList4, arrayList6, arrayList, sVar, sVar2, arrayList8);
    }

    public f c(u uVar) {
        Objects.requireNonNull(uVar);
        this.f58182e.add(uVar);
        return this;
    }
}
