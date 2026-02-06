package io.intercom.android.sdk.models;

import Oc.c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J4\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÇ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001c\u0010\u0015J\u0010\u0010\u001d\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u001d\u0010\u0013J\u001a\u0010 \u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH×\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010\u0019¨\u0006("}, d2 = {"Lio/intercom/android/sdk/models/Form;", "Landroid/os/Parcelable;", "", "type", "", "Lio/intercom/android/sdk/models/Attribute;", "attributes", "", "disabled", "<init>", "(Ljava/lang/String;Ljava/util/List;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/util/List;Z)Lio/intercom/android/sdk/models/Form;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "Ljava/util/List;", "getAttributes", "Z", "getDisabled", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Form implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Form> CREATOR = new Creator();
    @c("attributes")
    private final List<Attribute> attributes;
    @c("disabled")
    private final boolean disabled;
    @c("type")
    private final String type;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Form> {
        public final Form createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            boolean z10 = false;
            for (int i10 = 0; i10 != readInt; i10++) {
                arrayList.add(Attribute.CREATOR.createFromParcel(parcel));
            }
            if (parcel.readInt() != 0) {
                z10 = true;
            }
            return new Form(readString, arrayList, z10);
        }

        public final Form[] newArray(int i10) {
            return new Form[i10];
        }
    }

    public Form(String str, List<Attribute> list, boolean z10) {
        C6496s.h(str, "type");
        C6496s.h(list, "attributes");
        this.type = str;
        this.attributes = list;
        this.disabled = z10;
    }

    public static /* synthetic */ Form copy$default(Form form, String str, List<Attribute> list, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = form.type;
        }
        if ((i10 & 2) != 0) {
            list = form.attributes;
        }
        if ((i10 & 4) != 0) {
            z10 = form.disabled;
        }
        return form.copy(str, list, z10);
    }

    public final String component1() {
        return this.type;
    }

    public final List<Attribute> component2() {
        return this.attributes;
    }

    public final boolean component3() {
        return this.disabled;
    }

    public final Form copy(String str, List<Attribute> list, boolean z10) {
        C6496s.h(str, "type");
        C6496s.h(list, "attributes");
        return new Form(str, list, z10);
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Form)) {
            return false;
        }
        Form form = (Form) obj;
        return C6496s.c(this.type, form.type) && C6496s.c(this.attributes, form.attributes) && this.disabled == form.disabled;
    }

    public final List<Attribute> getAttributes() {
        return this.attributes;
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.attributes.hashCode()) * 31) + Boolean.hashCode(this.disabled);
    }

    public String toString() {
        return "Form(type=" + this.type + ", attributes=" + this.attributes + ", disabled=" + this.disabled + ')';
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "dest");
        parcel.writeString(this.type);
        List<Attribute> list = this.attributes;
        parcel.writeInt(list.size());
        for (Attribute writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i10);
        }
        parcel.writeInt(this.disabled ? 1 : 0);
    }
}
