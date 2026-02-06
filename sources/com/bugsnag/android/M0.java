package com.bugsnag.android;

final class M0 {

    /* renamed from: a  reason: collision with root package name */
    private final StringBuilder f38551a = new StringBuilder();

    public final void a(String str, Object obj) {
        StringBuilder sb2 = this.f38551a;
        sb2.append(str + '=' + obj);
        this.f38551a.append("\n");
    }

    public String toString() {
        return this.f38551a.toString();
    }
}
