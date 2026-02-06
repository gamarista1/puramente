package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.location.zzbe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import za.C5298a;
import za.c;

/* renamed from: com.google.android.gms.location.h  reason: case insensitive filesystem */
public class C4551h extends C5298a {
    public static final Parcelable.Creator<C4551h> CREATOR = new C4561s();

    /* renamed from: a  reason: collision with root package name */
    private final List f54390a;

    /* renamed from: b  reason: collision with root package name */
    private final int f54391b;

    /* renamed from: c  reason: collision with root package name */
    private final String f54392c;

    /* renamed from: d  reason: collision with root package name */
    private final String f54393d;

    /* renamed from: com.google.android.gms.location.h$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List f54394a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private int f54395b = 5;

        /* renamed from: c  reason: collision with root package name */
        private String f54396c = "";

        public a a(C4549f fVar) {
            C4536s.m(fVar, "geofence can't be null.");
            C4536s.b(fVar instanceof zzbe, "Geofence must be created using Geofence.Builder.");
            this.f54394a.add((zzbe) fVar);
            return this;
        }

        public a b(List list) {
            if (list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C4549f fVar = (C4549f) it.next();
                    if (fVar != null) {
                        a(fVar);
                    }
                }
            }
            return this;
        }

        public C4551h c() {
            C4536s.b(!this.f54394a.isEmpty(), "No geofence has been added to this request.");
            return new C4551h(this.f54394a, this.f54395b, this.f54396c, (String) null);
        }

        public a d(int i10) {
            this.f54395b = i10 & 7;
            return this;
        }
    }

    C4551h(List list, int i10, String str, String str2) {
        this.f54390a = list;
        this.f54391b = i10;
        this.f54392c = str;
        this.f54393d = str2;
    }

    public int o0() {
        return this.f54391b;
    }

    public String toString() {
        return "GeofencingRequest[geofences=" + this.f54390a + ", initialTrigger=" + this.f54391b + ", tag=" + this.f54392c + ", attributionTag=" + this.f54393d + "]";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.H(parcel, 1, this.f54390a, false);
        c.t(parcel, 2, o0());
        c.D(parcel, 3, this.f54392c, false);
        c.D(parcel, 4, this.f54393d, false);
        c.b(parcel, a10);
    }
}
