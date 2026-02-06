package io.intercom.android.sdk.m5.conversation.states;

import io.intercom.android.sdk.models.Attribute;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/AttributeData;", "", "attribute", "Lio/intercom/android/sdk/models/Attribute;", "partId", "", "isFormDisabled", "", "<init>", "(Lio/intercom/android/sdk/models/Attribute;Ljava/lang/String;Z)V", "getAttribute", "()Lio/intercom/android/sdk/models/Attribute;", "getPartId", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AttributeData {
    public static final int $stable = 8;
    private final Attribute attribute;
    private final boolean isFormDisabled;
    private final String partId;

    public AttributeData(Attribute attribute2, String str, boolean z10) {
        C6496s.h(attribute2, "attribute");
        C6496s.h(str, "partId");
        this.attribute = attribute2;
        this.partId = str;
        this.isFormDisabled = z10;
    }

    public static /* synthetic */ AttributeData copy$default(AttributeData attributeData, Attribute attribute2, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            attribute2 = attributeData.attribute;
        }
        if ((i10 & 2) != 0) {
            str = attributeData.partId;
        }
        if ((i10 & 4) != 0) {
            z10 = attributeData.isFormDisabled;
        }
        return attributeData.copy(attribute2, str, z10);
    }

    public final Attribute component1() {
        return this.attribute;
    }

    public final String component2() {
        return this.partId;
    }

    public final boolean component3() {
        return this.isFormDisabled;
    }

    public final AttributeData copy(Attribute attribute2, String str, boolean z10) {
        C6496s.h(attribute2, "attribute");
        C6496s.h(str, "partId");
        return new AttributeData(attribute2, str, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttributeData)) {
            return false;
        }
        AttributeData attributeData = (AttributeData) obj;
        return C6496s.c(this.attribute, attributeData.attribute) && C6496s.c(this.partId, attributeData.partId) && this.isFormDisabled == attributeData.isFormDisabled;
    }

    public final Attribute getAttribute() {
        return this.attribute;
    }

    public final String getPartId() {
        return this.partId;
    }

    public int hashCode() {
        return (((this.attribute.hashCode() * 31) + this.partId.hashCode()) * 31) + Boolean.hashCode(this.isFormDisabled);
    }

    public final boolean isFormDisabled() {
        return this.isFormDisabled;
    }

    public String toString() {
        return "AttributeData(attribute=" + this.attribute + ", partId=" + this.partId + ", isFormDisabled=" + this.isFormDisabled + ')';
    }
}
