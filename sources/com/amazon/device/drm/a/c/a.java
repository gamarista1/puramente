package com.amazon.device.drm.a.c;

import com.amazon.device.drm.model.LicenseResponse;
import com.amazon.device.drm.model.RequestId;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private RequestId f37793a;

    /* renamed from: b  reason: collision with root package name */
    private LicenseResponse.RequestStatus f37794b;

    public LicenseResponse a() {
        return new LicenseResponse(this);
    }

    public RequestId b() {
        return this.f37793a;
    }

    public LicenseResponse.RequestStatus c() {
        return this.f37794b;
    }

    public a a(RequestId requestId) {
        this.f37793a = requestId;
        return this;
    }

    public a a(LicenseResponse.RequestStatus requestStatus) {
        this.f37794b = requestStatus;
        return this;
    }
}
