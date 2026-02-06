package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class BeanPropertyMap implements Iterable<SettableBeanProperty>, Serializable {
    private static final long serialVersionUID = 2;
    protected final boolean _caseInsensitive;
    private Object[] _hashArea;
    private int _hashMask;
    private SettableBeanProperty[] _propsInOrder;
    private int _size;
    private int _spillCount;

    public BeanPropertyMap(boolean z10, Collection<SettableBeanProperty> collection) {
        this._caseInsensitive = z10;
        this._propsInOrder = (SettableBeanProperty[]) collection.toArray(new SettableBeanProperty[collection.size()]);
        init(collection);
    }

    private final SettableBeanProperty _find2(String str, int i10, Object obj) {
        if (obj == null) {
            return null;
        }
        int i11 = this._hashMask + 1;
        int i12 = ((i10 >> 1) + i11) << 1;
        Object obj2 = this._hashArea[i12];
        if (str.equals(obj2)) {
            return (SettableBeanProperty) this._hashArea[i12 + 1];
        }
        if (obj2 != null) {
            int i13 = (i11 + (i11 >> 1)) << 1;
            int i14 = this._spillCount + i13;
            while (i13 < i14) {
                Object obj3 = this._hashArea[i13];
                if (obj3 == str || str.equals(obj3)) {
                    return (SettableBeanProperty) this._hashArea[i13 + 1];
                }
                i13 += 2;
            }
        }
        return null;
    }

    private final int _findFromOrdered(SettableBeanProperty settableBeanProperty) {
        int length = this._propsInOrder.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this._propsInOrder[i10] == settableBeanProperty) {
                return i10;
            }
        }
        throw new IllegalStateException("Illegal state: property '" + settableBeanProperty.getName() + "' missing from _propsInOrder");
    }

    private final int _findIndexInHash(String str) {
        int _hashCode = _hashCode(str);
        int i10 = _hashCode << 1;
        if (str.equals(this._hashArea[i10])) {
            return i10 + 1;
        }
        int i11 = this._hashMask + 1;
        int i12 = ((_hashCode >> 1) + i11) << 1;
        if (str.equals(this._hashArea[i12])) {
            return i12 + 1;
        }
        int i13 = (i11 + (i11 >> 1)) << 1;
        int i14 = this._spillCount + i13;
        while (i13 < i14) {
            if (str.equals(this._hashArea[i13])) {
                return i13 + 1;
            }
            i13 += 2;
        }
        return -1;
    }

    private final int _hashCode(String str) {
        return str.hashCode() & this._hashMask;
    }

    public static BeanPropertyMap construct(Collection<SettableBeanProperty> collection, boolean z10) {
        return new BeanPropertyMap(z10, collection);
    }

    private static final int findSize(int i10) {
        if (i10 <= 5) {
            return 8;
        }
        if (i10 <= 12) {
            return 16;
        }
        int i11 = 32;
        while (i11 < i10 + (i10 >> 2)) {
            i11 += i11;
        }
        return i11;
    }

    private List<SettableBeanProperty> properties() {
        ArrayList arrayList = new ArrayList(this._size);
        int length = this._hashArea.length;
        for (int i10 = 1; i10 < length; i10 += 2) {
            SettableBeanProperty settableBeanProperty = (SettableBeanProperty) this._hashArea[i10];
            if (settableBeanProperty != null) {
                arrayList.add(settableBeanProperty);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public SettableBeanProperty _rename(SettableBeanProperty settableBeanProperty, NameTransformer nameTransformer) {
        JsonDeserializer<Object> unwrappingDeserializer;
        if (settableBeanProperty == null) {
            return settableBeanProperty;
        }
        SettableBeanProperty withSimpleName = settableBeanProperty.withSimpleName(nameTransformer.transform(settableBeanProperty.getName()));
        JsonDeserializer<Object> valueDeserializer = withSimpleName.getValueDeserializer();
        if (valueDeserializer == null || (unwrappingDeserializer = valueDeserializer.unwrappingDeserializer(nameTransformer)) == valueDeserializer) {
            return withSimpleName;
        }
        return withSimpleName.withValueDeserializer(unwrappingDeserializer);
    }

    public BeanPropertyMap assignIndexes() {
        int length = this._hashArea.length;
        int i10 = 0;
        for (int i11 = 1; i11 < length; i11 += 2) {
            SettableBeanProperty settableBeanProperty = (SettableBeanProperty) this._hashArea[i11];
            if (settableBeanProperty != null) {
                settableBeanProperty.assignIndex(i10);
                i10++;
            }
        }
        return this;
    }

    public SettableBeanProperty find(int i10) {
        int length = this._hashArea.length;
        for (int i11 = 1; i11 < length; i11 += 2) {
            SettableBeanProperty settableBeanProperty = (SettableBeanProperty) this._hashArea[i11];
            if (settableBeanProperty != null && i10 == settableBeanProperty.getPropertyIndex()) {
                return settableBeanProperty;
            }
        }
        return null;
    }

    public boolean findDeserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) {
        SettableBeanProperty find = find(str);
        if (find == null) {
            return false;
        }
        try {
            find.deserializeAndSet(jsonParser, deserializationContext, obj);
            return true;
        } catch (Exception e10) {
            wrapAndThrow(e10, obj, str, deserializationContext);
            return true;
        }
    }

    public SettableBeanProperty[] getPropertiesInInsertionOrder() {
        return this._propsInOrder;
    }

    /* access modifiers changed from: protected */
    public final String getPropertyName(SettableBeanProperty settableBeanProperty) {
        boolean z10 = this._caseInsensitive;
        String name = settableBeanProperty.getName();
        if (z10) {
            return name.toLowerCase();
        }
        return name;
    }

    /* access modifiers changed from: protected */
    public void init(Collection<SettableBeanProperty> collection) {
        int size = collection.size();
        this._size = size;
        int findSize = findSize(size);
        this._hashMask = findSize - 1;
        int i10 = (findSize >> 1) + findSize;
        Object[] objArr = new Object[(i10 * 2)];
        int i11 = 0;
        for (SettableBeanProperty next : collection) {
            if (next != null) {
                String propertyName = getPropertyName(next);
                int _hashCode = _hashCode(propertyName);
                int i12 = _hashCode << 1;
                if (objArr[i12] != null) {
                    i12 = ((_hashCode >> 1) + findSize) << 1;
                    if (objArr[i12] != null) {
                        i12 = (i10 << 1) + i11;
                        i11 += 2;
                        if (i12 >= objArr.length) {
                            objArr = Arrays.copyOf(objArr, objArr.length + 4);
                        }
                    }
                }
                objArr[i12] = propertyName;
                objArr[i12 + 1] = next;
            }
        }
        this._hashArea = objArr;
        this._spillCount = i11;
    }

    public Iterator<SettableBeanProperty> iterator() {
        return properties().iterator();
    }

    public void remove(SettableBeanProperty settableBeanProperty) {
        ArrayList arrayList = new ArrayList(this._size);
        String propertyName = getPropertyName(settableBeanProperty);
        int length = this._hashArea.length;
        boolean z10 = false;
        for (int i10 = 1; i10 < length; i10 += 2) {
            Object[] objArr = this._hashArea;
            SettableBeanProperty settableBeanProperty2 = (SettableBeanProperty) objArr[i10];
            if (settableBeanProperty2 != null) {
                if (z10 || !(z10 = propertyName.equals(objArr[i10 - 1]))) {
                    arrayList.add(settableBeanProperty2);
                } else {
                    this._propsInOrder[_findFromOrdered(settableBeanProperty2)] = null;
                }
            }
        }
        if (z10) {
            init(arrayList);
            return;
        }
        throw new NoSuchElementException("No entry '" + settableBeanProperty.getName() + "' found, can't remove");
    }

    public BeanPropertyMap renameAll(NameTransformer nameTransformer) {
        if (nameTransformer == null || nameTransformer == NameTransformer.NOP) {
            return this;
        }
        ArrayList arrayList = new ArrayList(r0);
        for (SettableBeanProperty settableBeanProperty : this._propsInOrder) {
            if (settableBeanProperty == null) {
                arrayList.add(settableBeanProperty);
            } else {
                arrayList.add(_rename(settableBeanProperty, nameTransformer));
            }
        }
        return new BeanPropertyMap(this._caseInsensitive, (Collection<SettableBeanProperty>) arrayList);
    }

    public void replace(SettableBeanProperty settableBeanProperty) {
        String propertyName = getPropertyName(settableBeanProperty);
        int _findIndexInHash = _findIndexInHash(propertyName);
        if (_findIndexInHash >= 0) {
            Object[] objArr = this._hashArea;
            objArr[_findIndexInHash] = settableBeanProperty;
            this._propsInOrder[_findFromOrdered((SettableBeanProperty) objArr[_findIndexInHash])] = settableBeanProperty;
            return;
        }
        throw new NoSuchElementException("No entry '" + propertyName + "' found, can't replace");
    }

    public int size() {
        return this._size;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Properties=[");
        Iterator<SettableBeanProperty> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            SettableBeanProperty next = it.next();
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(next.getName());
            sb2.append('(');
            sb2.append(next.getType());
            sb2.append(')');
            i10 = i11;
        }
        sb2.append(']');
        return sb2.toString();
    }

    public BeanPropertyMap withCaseInsensitivity(boolean z10) {
        if (this._caseInsensitive == z10) {
            return this;
        }
        return new BeanPropertyMap(this, z10);
    }

    public BeanPropertyMap withProperty(SettableBeanProperty settableBeanProperty) {
        String propertyName = getPropertyName(settableBeanProperty);
        int length = this._hashArea.length;
        int i10 = 1;
        while (i10 < length) {
            SettableBeanProperty settableBeanProperty2 = (SettableBeanProperty) this._hashArea[i10];
            if (settableBeanProperty2 == null || !settableBeanProperty2.getName().equals(propertyName)) {
                i10 += 2;
            } else {
                this._hashArea[i10] = settableBeanProperty;
                this._propsInOrder[_findFromOrdered(settableBeanProperty2)] = settableBeanProperty;
                return this;
            }
        }
        int _hashCode = _hashCode(propertyName);
        int i11 = this._hashMask + 1;
        int i12 = _hashCode << 1;
        Object[] objArr = this._hashArea;
        if (objArr[i12] != null) {
            i12 = ((_hashCode >> 1) + i11) << 1;
            if (objArr[i12] != null) {
                int i13 = (i11 + (i11 >> 1)) << 1;
                int i14 = this._spillCount;
                i12 = i13 + i14;
                this._spillCount = i14 + 2;
                if (i12 >= objArr.length) {
                    this._hashArea = Arrays.copyOf(objArr, objArr.length + 4);
                }
            }
        }
        Object[] objArr2 = this._hashArea;
        objArr2[i12] = propertyName;
        objArr2[i12 + 1] = settableBeanProperty;
        SettableBeanProperty[] settableBeanPropertyArr = this._propsInOrder;
        int length2 = settableBeanPropertyArr.length;
        SettableBeanProperty[] settableBeanPropertyArr2 = (SettableBeanProperty[]) Arrays.copyOf(settableBeanPropertyArr, length2 + 1);
        this._propsInOrder = settableBeanPropertyArr2;
        settableBeanPropertyArr2[length2] = settableBeanProperty;
        return this;
    }

    public BeanPropertyMap withoutProperties(Collection<String> collection) {
        if (collection.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList(r0);
        for (SettableBeanProperty settableBeanProperty : this._propsInOrder) {
            if (settableBeanProperty != null && !collection.contains(settableBeanProperty.getName())) {
                arrayList.add(settableBeanProperty);
            }
        }
        return new BeanPropertyMap(this._caseInsensitive, (Collection<SettableBeanProperty>) arrayList);
    }

    /* access modifiers changed from: protected */
    public void wrapAndThrow(Throwable th2, Object obj, String str, DeserializationContext deserializationContext) {
        boolean z10;
        while ((th2 instanceof InvocationTargetException) && th2.getCause() != null) {
            th2 = th2.getCause();
        }
        if (!(th2 instanceof Error)) {
            if (deserializationContext == null || deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (th2 instanceof IOException) {
                if (!z10 || !(th2 instanceof JsonProcessingException)) {
                    throw ((IOException) th2);
                }
            } else if (!z10 && (th2 instanceof RuntimeException)) {
                throw ((RuntimeException) th2);
            }
            throw JsonMappingException.wrapWithPath(th2, obj, str);
        }
        throw ((Error) th2);
    }

    public SettableBeanProperty find(String str) {
        if (str != null) {
            if (this._caseInsensitive) {
                str = str.toLowerCase();
            }
            int hashCode = str.hashCode() & this._hashMask;
            int i10 = hashCode << 1;
            Object obj = this._hashArea[i10];
            if (obj == str || str.equals(obj)) {
                return (SettableBeanProperty) this._hashArea[i10 + 1];
            }
            return _find2(str, hashCode, obj);
        }
        throw new IllegalArgumentException("Can not pass null property name");
    }

    protected BeanPropertyMap(BeanPropertyMap beanPropertyMap, boolean z10) {
        this._caseInsensitive = z10;
        SettableBeanProperty[] settableBeanPropertyArr = beanPropertyMap._propsInOrder;
        SettableBeanProperty[] settableBeanPropertyArr2 = (SettableBeanProperty[]) Arrays.copyOf(settableBeanPropertyArr, settableBeanPropertyArr.length);
        this._propsInOrder = settableBeanPropertyArr2;
        init(Arrays.asList(settableBeanPropertyArr2));
    }
}
