package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.support.v4.media.session.c;
import android.view.View;
import androidx.collection.C1588b;
import com.google.android.gms.common.api.f;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.e  reason: case insensitive filesystem */
public final class C4522e {

    /* renamed from: a  reason: collision with root package name */
    private final Account f54149a;

    /* renamed from: b  reason: collision with root package name */
    private final Set f54150b;

    /* renamed from: c  reason: collision with root package name */
    private final Set f54151c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f54152d;

    /* renamed from: e  reason: collision with root package name */
    private final int f54153e;

    /* renamed from: f  reason: collision with root package name */
    private final View f54154f;

    /* renamed from: g  reason: collision with root package name */
    private final String f54155g;

    /* renamed from: h  reason: collision with root package name */
    private final String f54156h;

    /* renamed from: i  reason: collision with root package name */
    private final Ra.a f54157i;

    /* renamed from: j  reason: collision with root package name */
    private Integer f54158j;

    /* renamed from: com.google.android.gms.common.internal.e$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private Account f54159a;

        /* renamed from: b  reason: collision with root package name */
        private C1588b f54160b;

        /* renamed from: c  reason: collision with root package name */
        private String f54161c;

        /* renamed from: d  reason: collision with root package name */
        private String f54162d;

        /* renamed from: e  reason: collision with root package name */
        private final Ra.a f54163e = Ra.a.f52305j;

        public C4522e a() {
            return new C4522e(this.f54159a, this.f54160b, (Map) null, 0, (View) null, this.f54161c, this.f54162d, this.f54163e, false);
        }

        public a b(String str) {
            this.f54161c = str;
            return this;
        }

        public final a c(Collection collection) {
            if (this.f54160b == null) {
                this.f54160b = new C1588b();
            }
            this.f54160b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.f54159a = account;
            return this;
        }

        public final a e(String str) {
            this.f54162d = str;
            return this;
        }
    }

    public C4522e(Account account, Set set, Map map, int i10, View view, String str, String str2, Ra.a aVar, boolean z10) {
        Set set2;
        this.f54149a = account;
        if (set == null) {
            set2 = Collections.emptySet();
        } else {
            set2 = Collections.unmodifiableSet(set);
        }
        this.f54150b = set2;
        map = map == null ? Collections.emptyMap() : map;
        this.f54152d = map;
        this.f54154f = view;
        this.f54153e = i10;
        this.f54155g = str;
        this.f54156h = str2;
        this.f54157i = aVar == null ? Ra.a.f52305j : aVar;
        HashSet hashSet = new HashSet(set2);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.f54151c = Collections.unmodifiableSet(hashSet);
        } else {
            c.a(it.next());
            throw null;
        }
    }

    public static C4522e a(Context context) {
        return new f.a(context).a();
    }

    public Account b() {
        return this.f54149a;
    }

    public String c() {
        Account account = this.f54149a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    public Account d() {
        Account account = this.f54149a;
        if (account != null) {
            return account;
        }
        return new Account(C4518c.DEFAULT_ACCOUNT, "com.google");
    }

    public Set e() {
        return this.f54151c;
    }

    public Set f(com.google.android.gms.common.api.a aVar) {
        c.a(this.f54152d.get(aVar));
        return this.f54150b;
    }

    public String g() {
        return this.f54155g;
    }

    public Set h() {
        return this.f54150b;
    }

    public final Ra.a i() {
        return this.f54157i;
    }

    public final Integer j() {
        return this.f54158j;
    }

    public final String k() {
        return this.f54156h;
    }

    public final void l(Integer num) {
        this.f54158j = num;
    }
}
