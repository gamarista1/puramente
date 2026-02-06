package io.intercom.android.sdk.ui.preview.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/ui/preview/data/DeleteType;", "Landroid/os/Parcelable;", "<init>", "()V", "None", "Delete", "Remove", "Lio/intercom/android/sdk/ui/preview/data/DeleteType$Delete;", "Lio/intercom/android/sdk/ui/preview/data/DeleteType$None;", "Lio/intercom/android/sdk/ui/preview/data/DeleteType$Remove;", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class DeleteType implements Parcelable {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/intercom/android/sdk/ui/preview/data/DeleteType$Delete;", "Lio/intercom/android/sdk/ui/preview/data/DeleteType;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Delete extends DeleteType {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Delete> CREATOR = new Creator();
        public static final Delete INSTANCE = new Delete();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Delete> {
            public final Delete createFromParcel(Parcel parcel) {
                C6496s.h(parcel, "parcel");
                parcel.readInt();
                return Delete.INSTANCE;
            }

            public final Delete[] newArray(int i10) {
                return new Delete[i10];
            }
        }

        private Delete() {
            super((DefaultConstructorMarker) null);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C6496s.h(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/intercom/android/sdk/ui/preview/data/DeleteType$None;", "Lio/intercom/android/sdk/ui/preview/data/DeleteType;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class None extends DeleteType {
        public static final int $stable = 0;
        public static final Parcelable.Creator<None> CREATOR = new Creator();
        public static final None INSTANCE = new None();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<None> {
            public final None createFromParcel(Parcel parcel) {
                C6496s.h(parcel, "parcel");
                parcel.readInt();
                return None.INSTANCE;
            }

            public final None[] newArray(int i10) {
                return new None[i10];
            }
        }

        private None() {
            super((DefaultConstructorMarker) null);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C6496s.h(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/intercom/android/sdk/ui/preview/data/DeleteType$Remove;", "Lio/intercom/android/sdk/ui/preview/data/DeleteType;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Remove extends DeleteType {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Remove> CREATOR = new Creator();
        public static final Remove INSTANCE = new Remove();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Remove> {
            public final Remove createFromParcel(Parcel parcel) {
                C6496s.h(parcel, "parcel");
                parcel.readInt();
                return Remove.INSTANCE;
            }

            public final Remove[] newArray(int i10) {
                return new Remove[i10];
            }
        }

        private Remove() {
            super((DefaultConstructorMarker) null);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C6496s.h(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ DeleteType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DeleteType() {
    }
}
