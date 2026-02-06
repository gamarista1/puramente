package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJT\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nHÇ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b!\u0010\u0018J\u0010\u0010\"\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\"\u0010\u0015J\u001a\u0010%\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010#H×\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b.\u0010\u0018R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u0010\u001e¨\u00061"}, d2 = {"Lio/intercom/android/sdk/blocks/lib/models/TicketAttribute;", "Landroid/os/Parcelable;", "", "id", "", "name", "type", "", "required", "identifier", "", "options", "<init>", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "component2", "()Ljava/lang/String;", "component3", "component4", "()Z", "component5", "component6", "()Ljava/util/List;", "copy", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;)Lio/intercom/android/sdk/blocks/lib/models/TicketAttribute;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getName", "getType", "Z", "getRequired", "getIdentifier", "Ljava/util/List;", "getOptions", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TicketAttribute implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<TicketAttribute> CREATOR = new Creator();

    /* renamed from: id  reason: collision with root package name */
    private final int f68547id;
    private final String identifier;
    private final String name;
    private final List<String> options;
    private final boolean required;
    private final String type;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TicketAttribute> {
        public final TicketAttribute createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "parcel");
            return new TicketAttribute(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.createStringArrayList());
        }

        public final TicketAttribute[] newArray(int i10) {
            return new TicketAttribute[i10];
        }
    }

    public TicketAttribute(int i10, String str, String str2, boolean z10, String str3, List<String> list) {
        C6496s.h(str, "name");
        C6496s.h(str2, "type");
        C6496s.h(list, "options");
        this.f68547id = i10;
        this.name = str;
        this.type = str2;
        this.required = z10;
        this.identifier = str3;
        this.options = list;
    }

    public static /* synthetic */ TicketAttribute copy$default(TicketAttribute ticketAttribute, int i10, String str, String str2, boolean z10, String str3, List<String> list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = ticketAttribute.f68547id;
        }
        if ((i11 & 2) != 0) {
            str = ticketAttribute.name;
        }
        String str4 = str;
        if ((i11 & 4) != 0) {
            str2 = ticketAttribute.type;
        }
        String str5 = str2;
        if ((i11 & 8) != 0) {
            z10 = ticketAttribute.required;
        }
        boolean z11 = z10;
        if ((i11 & 16) != 0) {
            str3 = ticketAttribute.identifier;
        }
        String str6 = str3;
        if ((i11 & 32) != 0) {
            list = ticketAttribute.options;
        }
        return ticketAttribute.copy(i10, str4, str5, z11, str6, list);
    }

    public final int component1() {
        return this.f68547id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.type;
    }

    public final boolean component4() {
        return this.required;
    }

    public final String component5() {
        return this.identifier;
    }

    public final List<String> component6() {
        return this.options;
    }

    public final TicketAttribute copy(int i10, String str, String str2, boolean z10, String str3, List<String> list) {
        C6496s.h(str, "name");
        C6496s.h(str2, "type");
        C6496s.h(list, "options");
        return new TicketAttribute(i10, str, str2, z10, str3, list);
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketAttribute)) {
            return false;
        }
        TicketAttribute ticketAttribute = (TicketAttribute) obj;
        return this.f68547id == ticketAttribute.f68547id && C6496s.c(this.name, ticketAttribute.name) && C6496s.c(this.type, ticketAttribute.type) && this.required == ticketAttribute.required && C6496s.c(this.identifier, ticketAttribute.identifier) && C6496s.c(this.options, ticketAttribute.options);
    }

    public final int getId() {
        return this.f68547id;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getOptions() {
        return this.options;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.f68547id) * 31) + this.name.hashCode()) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.required)) * 31;
        String str = this.identifier;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.options.hashCode();
    }

    public String toString() {
        return "TicketAttribute(id=" + this.f68547id + ", name=" + this.name + ", type=" + this.type + ", required=" + this.required + ", identifier=" + this.identifier + ", options=" + this.options + ')';
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "dest");
        parcel.writeInt(this.f68547id);
        parcel.writeString(this.name);
        parcel.writeString(this.type);
        parcel.writeInt(this.required ? 1 : 0);
        parcel.writeString(this.identifier);
        parcel.writeStringList(this.options);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TicketAttribute(int i10, String str, String str2, boolean z10, String str3, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, str2, z10, str3, (i11 & 32) != 0 ? C6565s.n() : list);
    }
}
