package nf;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import mf.Y;

/* renamed from: nf.h  reason: case insensitive filesystem */
public final class C6616h implements Externalizable {

    /* renamed from: c  reason: collision with root package name */
    public static final a f72267c = new a((DefaultConstructorMarker) null);
    private static final long serialVersionUID = 0;

    /* renamed from: a  reason: collision with root package name */
    private Collection f72268a;

    /* renamed from: b  reason: collision with root package name */
    private final int f72269b;

    /* renamed from: nf.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C6616h(Collection collection, int i10) {
        C6496s.h(collection, "collection");
        this.f72268a = collection;
        this.f72269b = i10;
    }

    private final Object readResolve() {
        return this.f72268a;
    }

    public void readExternal(ObjectInput objectInput) {
        Collection collection;
        C6496s.h(objectInput, MetricTracker.Object.INPUT);
        byte readByte = objectInput.readByte();
        byte b10 = readByte & 1;
        if ((readByte & -2) == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                int i10 = 0;
                if (b10 == 0) {
                    List d10 = C6565s.d(readInt);
                    while (i10 < readInt) {
                        d10.add(objectInput.readObject());
                        i10++;
                    }
                    collection = C6565s.a(d10);
                } else if (b10 == 1) {
                    Set c10 = Y.c(readInt);
                    while (i10 < readInt) {
                        c10.add(objectInput.readObject());
                        i10++;
                    }
                    collection = Y.a(c10);
                } else {
                    throw new InvalidObjectException("Unsupported collection type tag: " + b10 + '.');
                }
                this.f72268a = collection;
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        throw new InvalidObjectException("Unsupported flags value: " + readByte + '.');
    }

    public void writeExternal(ObjectOutput objectOutput) {
        C6496s.h(objectOutput, "output");
        objectOutput.writeByte(this.f72269b);
        objectOutput.writeInt(this.f72268a.size());
        for (Object writeObject : this.f72268a) {
            objectOutput.writeObject(writeObject);
        }
    }
}
