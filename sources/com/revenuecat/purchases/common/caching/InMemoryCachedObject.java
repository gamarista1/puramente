package com.revenuecat.purchases.common.caching;

import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import io.intercom.android.sdk.models.AttributeType;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R$\u0010\u0018\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/revenuecat/purchases/common/caching/InMemoryCachedObject;", "T", "", "Ljava/util/Date;", "lastUpdatedAt", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "<init>", "(Ljava/util/Date;Lcom/revenuecat/purchases/common/DateProvider;)V", "Llf/M;", "clearCacheTimestamp", "()V", "clearCache", "instance", "cacheInstance", "(Ljava/lang/Object;)V", "date", "updateCacheTimestamp", "(Ljava/util/Date;)V", "Ljava/util/Date;", "getLastUpdatedAt$purchases_defaultsRelease", "()Ljava/util/Date;", "setLastUpdatedAt$purchases_defaultsRelease", "Lcom/revenuecat/purchases/common/DateProvider;", "cachedInstance", "Ljava/lang/Object;", "getCachedInstance", "()Ljava/lang/Object;", "setCachedInstance", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InMemoryCachedObject<T> {
    private T cachedInstance;
    private final DateProvider dateProvider;
    private Date lastUpdatedAt;

    public InMemoryCachedObject() {
        this((Date) null, (DateProvider) null, 3, (DefaultConstructorMarker) null);
    }

    public final void cacheInstance(T t10) {
        this.cachedInstance = t10;
        this.lastUpdatedAt = this.dateProvider.getNow();
    }

    public final void clearCache() {
        clearCacheTimestamp();
        this.cachedInstance = null;
    }

    public final void clearCacheTimestamp() {
        this.lastUpdatedAt = null;
    }

    public final T getCachedInstance() {
        return this.cachedInstance;
    }

    public final Date getLastUpdatedAt$purchases_defaultsRelease() {
        return this.lastUpdatedAt;
    }

    public final void setCachedInstance(T t10) {
        this.cachedInstance = t10;
    }

    public final void setLastUpdatedAt$purchases_defaultsRelease(Date date) {
        this.lastUpdatedAt = date;
    }

    public final void updateCacheTimestamp(Date date) {
        C6496s.h(date, AttributeType.DATE);
        this.lastUpdatedAt = date;
    }

    public InMemoryCachedObject(Date date, DateProvider dateProvider2) {
        C6496s.h(dateProvider2, "dateProvider");
        this.lastUpdatedAt = date;
        this.dateProvider = dateProvider2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InMemoryCachedObject(Date date, DateProvider dateProvider2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : date, (i10 & 2) != 0 ? new DefaultDateProvider() : dateProvider2);
    }
}
