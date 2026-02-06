package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import za.C5298a;
import za.c;

/* renamed from: com.google.android.gms.location.d  reason: case insensitive filesystem */
public class C4547d extends C5298a {
    public static final Parcelable.Creator<C4547d> CREATOR = new X();

    /* renamed from: e  reason: collision with root package name */
    public static final Comparator f54385e = new W();

    /* renamed from: a  reason: collision with root package name */
    private final List f54386a;

    /* renamed from: b  reason: collision with root package name */
    private final String f54387b;

    /* renamed from: c  reason: collision with root package name */
    private final List f54388c;

    /* renamed from: d  reason: collision with root package name */
    private String f54389d;

    public C4547d(List list, String str, List list2, String str2) {
        boolean z10;
        List list3;
        C4536s.m(list, "transitions can't be null");
        if (list.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C4536s.b(z10, "transitions can't be empty.");
        C4536s.l(list);
        TreeSet treeSet = new TreeSet(f54385e);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4546c cVar = (C4546c) it.next();
            C4536s.b(treeSet.add(cVar), String.format("Found duplicated transition: %s.", new Object[]{cVar}));
        }
        this.f54386a = Collections.unmodifiableList(list);
        this.f54387b = str;
        if (list2 == null) {
            list3 = Collections.emptyList();
        } else {
            list3 = Collections.unmodifiableList(list2);
        }
        this.f54388c = list3;
        this.f54389d = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C4547d dVar = (C4547d) obj;
            if (!C4535q.b(this.f54386a, dVar.f54386a) || !C4535q.b(this.f54387b, dVar.f54387b) || !C4535q.b(this.f54389d, dVar.f54389d) || !C4535q.b(this.f54388c, dVar.f54388c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        int hashCode = this.f54386a.hashCode() * 31;
        String str = this.f54387b;
        int i12 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (hashCode + i10) * 31;
        List list = this.f54388c;
        if (list != null) {
            i11 = list.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str2 = this.f54389d;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return i14 + i12;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f54386a);
        String str = this.f54387b;
        String valueOf2 = String.valueOf(this.f54388c);
        String str2 = this.f54389d;
        int length = valueOf.length();
        int length2 = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 79 + length2 + valueOf2.length() + String.valueOf(str2).length());
        sb2.append("ActivityTransitionRequest [mTransitions=");
        sb2.append(valueOf);
        sb2.append(", mTag='");
        sb2.append(str);
        sb2.append("', mClients=");
        sb2.append(valueOf2);
        sb2.append(", mAttributionTag=");
        sb2.append(str2);
        sb2.append(']');
        return sb2.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C4536s.l(parcel);
        int a10 = c.a(parcel);
        c.H(parcel, 1, this.f54386a, false);
        c.D(parcel, 2, this.f54387b, false);
        c.H(parcel, 3, this.f54388c, false);
        c.D(parcel, 4, this.f54389d, false);
        c.b(parcel, a10);
    }
}
