package com.android.billingclient.api;

import com.android.billingclient.api.C3198e;
import com.revenuecat.purchases.google.ErrorsKt;

abstract class O {

    /* renamed from: A  reason: collision with root package name */
    static final C3198e f38126A;

    /* renamed from: B  reason: collision with root package name */
    static final C3198e f38127B;

    /* renamed from: C  reason: collision with root package name */
    static final C3198e f38128C;

    /* renamed from: D  reason: collision with root package name */
    static final C3198e f38129D;

    /* renamed from: E  reason: collision with root package name */
    static final C3198e f38130E;

    /* renamed from: F  reason: collision with root package name */
    static final C3198e f38131F;

    /* renamed from: G  reason: collision with root package name */
    static final C3198e f38132G;

    /* renamed from: a  reason: collision with root package name */
    static final C3198e f38133a;

    /* renamed from: b  reason: collision with root package name */
    static final C3198e f38134b;

    /* renamed from: c  reason: collision with root package name */
    static final C3198e f38135c;

    /* renamed from: d  reason: collision with root package name */
    static final C3198e f38136d;

    /* renamed from: e  reason: collision with root package name */
    static final C3198e f38137e;

    /* renamed from: f  reason: collision with root package name */
    static final C3198e f38138f;

    /* renamed from: g  reason: collision with root package name */
    static final C3198e f38139g;

    /* renamed from: h  reason: collision with root package name */
    static final C3198e f38140h;

    /* renamed from: i  reason: collision with root package name */
    static final C3198e f38141i;

    /* renamed from: j  reason: collision with root package name */
    static final C3198e f38142j;

    /* renamed from: k  reason: collision with root package name */
    static final C3198e f38143k;

    /* renamed from: l  reason: collision with root package name */
    static final C3198e f38144l;

    /* renamed from: m  reason: collision with root package name */
    static final C3198e f38145m;

    /* renamed from: n  reason: collision with root package name */
    static final C3198e f38146n;

    /* renamed from: o  reason: collision with root package name */
    static final C3198e f38147o;

    /* renamed from: p  reason: collision with root package name */
    static final C3198e f38148p;

    /* renamed from: q  reason: collision with root package name */
    static final C3198e f38149q;

    /* renamed from: r  reason: collision with root package name */
    static final C3198e f38150r;

    /* renamed from: s  reason: collision with root package name */
    static final C3198e f38151s;

    /* renamed from: t  reason: collision with root package name */
    static final C3198e f38152t;

    /* renamed from: u  reason: collision with root package name */
    static final C3198e f38153u;

    /* renamed from: v  reason: collision with root package name */
    static final C3198e f38154v;

    /* renamed from: w  reason: collision with root package name */
    static final C3198e f38155w;

    /* renamed from: x  reason: collision with root package name */
    static final C3198e f38156x;

    /* renamed from: y  reason: collision with root package name */
    static final C3198e f38157y;

    /* renamed from: z  reason: collision with root package name */
    static final C3198e f38158z;

    static {
        C3198e.a c10 = C3198e.c();
        c10.c(3);
        c10.b(ErrorsKt.IN_APP_BILLING_LESS_THAN_3_ERROR_MESSAGE);
        f38133a = c10.a();
        C3198e.a c11 = C3198e.c();
        c11.c(3);
        c11.b("Google Play In-app Billing API version is less than 9");
        f38134b = c11.a();
        C3198e.a c12 = C3198e.c();
        c12.c(3);
        c12.b("Billing service unavailable on device.");
        f38135c = c12.a();
        C3198e.a c13 = C3198e.c();
        c13.c(2);
        c13.b("Billing service unavailable on device.");
        f38136d = c13.a();
        C3198e.a c14 = C3198e.c();
        c14.c(5);
        c14.b("Client is already in the process of connecting to billing service.");
        f38137e = c14.a();
        C3198e.a c15 = C3198e.c();
        c15.c(5);
        c15.b("The list of SKUs can't be empty.");
        f38138f = c15.a();
        C3198e.a c16 = C3198e.c();
        c16.c(5);
        c16.b("SKU type can't be empty.");
        f38139g = c16.a();
        C3198e.a c17 = C3198e.c();
        c17.c(5);
        c17.b("Product type can't be empty.");
        f38140h = c17.a();
        C3198e.a c18 = C3198e.c();
        c18.c(-2);
        c18.b("Client does not support extra params.");
        f38141i = c18.a();
        C3198e.a c19 = C3198e.c();
        c19.c(5);
        c19.b("Invalid purchase token.");
        f38142j = c19.a();
        C3198e.a c20 = C3198e.c();
        c20.c(6);
        c20.b("An internal error occurred.");
        f38143k = c20.a();
        C3198e.a c21 = C3198e.c();
        c21.c(5);
        c21.b("SKU can't be null.");
        c21.a();
        C3198e.a c22 = C3198e.c();
        c22.c(0);
        f38144l = c22.a();
        C3198e.a c23 = C3198e.c();
        c23.c(-1);
        c23.b("Service connection is disconnected.");
        f38145m = c23.a();
        C3198e.a c24 = C3198e.c();
        c24.c(2);
        c24.b("Timeout communicating with service.");
        f38146n = c24.a();
        C3198e.a c25 = C3198e.c();
        c25.c(-2);
        c25.b("Client does not support subscriptions.");
        f38147o = c25.a();
        C3198e.a c26 = C3198e.c();
        c26.c(-2);
        c26.b("Client does not support subscriptions update.");
        f38148p = c26.a();
        C3198e.a c27 = C3198e.c();
        c27.c(-2);
        c27.b("Client does not support get purchase history.");
        f38149q = c27.a();
        C3198e.a c28 = C3198e.c();
        c28.c(-2);
        c28.b("Client does not support price change confirmation.");
        f38150r = c28.a();
        C3198e.a c29 = C3198e.c();
        c29.c(-2);
        c29.b("Play Store version installed does not support cross selling products.");
        f38151s = c29.a();
        C3198e.a c30 = C3198e.c();
        c30.c(-2);
        c30.b("Client does not support multi-item purchases.");
        f38152t = c30.a();
        C3198e.a c31 = C3198e.c();
        c31.c(-2);
        c31.b("Client does not support offer_id_token.");
        f38153u = c31.a();
        C3198e.a c32 = C3198e.c();
        c32.c(-2);
        c32.b("Client does not support ProductDetails.");
        f38154v = c32.a();
        C3198e.a c33 = C3198e.c();
        c33.c(-2);
        c33.b("Client does not support in-app messages.");
        f38155w = c33.a();
        C3198e.a c34 = C3198e.c();
        c34.c(-2);
        c34.b("Client does not support user choice billing.");
        c34.a();
        C3198e.a c35 = C3198e.c();
        c35.c(-2);
        c35.b("Play Store version installed does not support external offer.");
        f38156x = c35.a();
        C3198e.a c36 = C3198e.c();
        c36.c(-2);
        c36.b("Play Store version installed does not support multi-item purchases with season pass in one cart.");
        f38157y = c36.a();
        C3198e.a c37 = C3198e.c();
        c37.c(5);
        c37.b("Unknown feature");
        f38158z = c37.a();
        C3198e.a c38 = C3198e.c();
        c38.c(-2);
        c38.b("Play Store version installed does not support get billing config.");
        f38126A = c38.a();
        C3198e.a c39 = C3198e.c();
        c39.c(-2);
        c39.b("Query product details with serialized docid is not supported.");
        f38127B = c39.a();
        C3198e.a c40 = C3198e.c();
        c40.c(4);
        c40.b("Item is unavailable for purchase.");
        f38128C = c40.a();
        C3198e.a c41 = C3198e.c();
        c41.c(-2);
        c41.b("Query product details with developer specified account is not supported.");
        f38129D = c41.a();
        C3198e.a c42 = C3198e.c();
        c42.c(-2);
        c42.b("Play Store version installed does not support alternative billing only.");
        f38130E = c42.a();
        C3198e.a c43 = C3198e.c();
        c43.c(5);
        c43.b("To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.");
        f38131F = c43.a();
        C3198e.a c44 = C3198e.c();
        c44.c(6);
        c44.b("An error occurred while retrieving billing override.");
        f38132G = c44.a();
    }

    static C3198e a(int i10, String str) {
        C3198e.a c10 = C3198e.c();
        c10.c(i10);
        c10.b(str);
        return c10.a();
    }
}
