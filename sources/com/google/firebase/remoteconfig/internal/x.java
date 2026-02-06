package com.google.firebase.remoteconfig.internal;

import Dc.u;
import com.adjust.sdk.Constants;
import io.intercom.android.sdk.models.AttributeType;

public class x implements u {

    /* renamed from: a  reason: collision with root package name */
    private final String f57946a;

    /* renamed from: b  reason: collision with root package name */
    private final int f57947b;

    x(String str, int i10) {
        this.f57946a = str;
        this.f57947b = i10;
    }

    private String a() {
        return asString().trim();
    }

    private void b() {
        if (this.f57946a == null) {
            throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }

    public boolean asBoolean() {
        if (this.f57947b == 0) {
            return false;
        }
        String a10 = a();
        if (o.f57884f.matcher(a10).matches()) {
            return true;
        }
        if (o.f57885g.matcher(a10).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", new Object[]{a10, AttributeType.BOOLEAN}));
    }

    public double asDouble() {
        if (this.f57947b == 0) {
            return 0.0d;
        }
        String a10 = a();
        try {
            return Double.valueOf(a10).doubleValue();
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", new Object[]{a10, "double"}), e10);
        }
    }

    public String asString() {
        if (this.f57947b == 0) {
            return "";
        }
        b();
        return this.f57946a;
    }

    public int i() {
        return this.f57947b;
    }

    public long j() {
        if (this.f57947b == 0) {
            return 0;
        }
        String a10 = a();
        try {
            return Long.valueOf(a10).longValue();
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", new Object[]{a10, Constants.LONG}), e10);
        }
    }
}
