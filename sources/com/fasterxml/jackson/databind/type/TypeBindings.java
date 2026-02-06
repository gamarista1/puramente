package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import java.lang.reflect.TypeVariable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TypeBindings implements Serializable {
    private static final TypeBindings EMPTY;
    private static final String[] NO_STRINGS;
    private static final JavaType[] NO_TYPES;
    private static final long serialVersionUID = 1;
    private final int _hashCode;
    private final String[] _names;
    private final JavaType[] _types;
    private final String[] _unboundVariables;

    static final class AsKey {
        private final int _hash;
        private final JavaType[] _params;
        private final Class<?> _raw;

        public AsKey(Class<?> cls, JavaType[] javaTypeArr, int i10) {
            this._raw = cls;
            this._params = javaTypeArr;
            this._hash = i10;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != AsKey.class) {
                return false;
            }
            AsKey asKey = (AsKey) obj;
            if (this._hash == asKey._hash && this._raw == asKey._raw) {
                JavaType[] javaTypeArr = asKey._params;
                int length = this._params.length;
                if (length == javaTypeArr.length) {
                    for (int i10 = 0; i10 < length; i10++) {
                        if (!this._params[i10].equals(javaTypeArr[i10])) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this._hash;
        }

        public String toString() {
            return this._raw.getName() + "<>";
        }
    }

    static class TypeParamStash {
        private static final TypeVariable<?>[] VARS_ABSTRACT_LIST = AbstractList.class.getTypeParameters();
        private static final TypeVariable<?>[] VARS_ARRAY_LIST = ArrayList.class.getTypeParameters();
        private static final TypeVariable<?>[] VARS_COLLECTION = Collection.class.getTypeParameters();
        private static final TypeVariable<?>[] VARS_HASH_MAP = HashMap.class.getTypeParameters();
        private static final TypeVariable<?>[] VARS_ITERABLE = Iterable.class.getTypeParameters();
        private static final TypeVariable<?>[] VARS_LINKED_HASH_MAP = LinkedHashMap.class.getTypeParameters();
        private static final TypeVariable<?>[] VARS_LIST = List.class.getTypeParameters();
        private static final TypeVariable<?>[] VARS_MAP = Map.class.getTypeParameters();

        TypeParamStash() {
        }

        public static TypeVariable<?>[] paramsFor1(Class<?> cls) {
            if (cls == Collection.class) {
                return VARS_COLLECTION;
            }
            if (cls == List.class) {
                return VARS_LIST;
            }
            if (cls == ArrayList.class) {
                return VARS_ARRAY_LIST;
            }
            if (cls == AbstractList.class) {
                return VARS_ABSTRACT_LIST;
            }
            if (cls == Iterable.class) {
                return VARS_ITERABLE;
            }
            return cls.getTypeParameters();
        }

        public static TypeVariable<?>[] paramsFor2(Class<?> cls) {
            if (cls == Map.class) {
                return VARS_MAP;
            }
            if (cls == HashMap.class) {
                return VARS_HASH_MAP;
            }
            if (cls == LinkedHashMap.class) {
                return VARS_LINKED_HASH_MAP;
            }
            return cls.getTypeParameters();
        }
    }

    static {
        String[] strArr = new String[0];
        NO_STRINGS = strArr;
        JavaType[] javaTypeArr = new JavaType[0];
        NO_TYPES = javaTypeArr;
        EMPTY = new TypeBindings(strArr, javaTypeArr, (String[]) null);
    }

    private TypeBindings(String[] strArr, JavaType[] javaTypeArr, String[] strArr2) {
        strArr = strArr == null ? NO_STRINGS : strArr;
        this._names = strArr;
        javaTypeArr = javaTypeArr == null ? NO_TYPES : javaTypeArr;
        this._types = javaTypeArr;
        if (strArr.length == javaTypeArr.length) {
            int length = javaTypeArr.length;
            int i10 = 1;
            for (int i11 = 0; i11 < length; i11++) {
                i10 += this._types[i11].hashCode();
            }
            this._unboundVariables = strArr2;
            this._hashCode = i10;
            return;
        }
        throw new IllegalArgumentException("Mismatching names (" + strArr.length + "), types (" + javaTypeArr.length + ")");
    }

    public static TypeBindings create(Class<?> cls, List<JavaType> list) {
        return create(cls, (list == null || list.isEmpty()) ? NO_TYPES : (JavaType[]) list.toArray(new JavaType[list.size()]));
    }

    public static TypeBindings createIfNeeded(Class<?> cls, JavaType javaType) {
        int i10;
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null) {
            i10 = 0;
        } else {
            i10 = typeParameters.length;
        }
        if (i10 == 0) {
            return EMPTY;
        }
        if (i10 == 1) {
            return new TypeBindings(new String[]{typeParameters[0].getName()}, new JavaType[]{javaType}, (String[]) null);
        }
        throw new IllegalArgumentException("Can not create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + i10);
    }

    public static TypeBindings emptyBindings() {
        return EMPTY;
    }

    public Object asKey(Class<?> cls) {
        return new AsKey(cls, this._types, this._hashCode);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        TypeBindings typeBindings = (TypeBindings) obj;
        int length = this._types.length;
        if (length != typeBindings.size()) {
            return false;
        }
        JavaType[] javaTypeArr = typeBindings._types;
        for (int i10 = 0; i10 < length; i10++) {
            if (!javaTypeArr[i10].equals(this._types[i10])) {
                return false;
            }
        }
        return true;
    }

    public JavaType findBoundType(String str) {
        JavaType selfReferencedType;
        int length = this._names.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(this._names[i10])) {
                JavaType javaType = this._types[i10];
                if (!(javaType instanceof ResolvedRecursiveType) || (selfReferencedType = ((ResolvedRecursiveType) javaType).getSelfReferencedType()) == null) {
                    return javaType;
                }
                return selfReferencedType;
            }
        }
        return null;
    }

    public String getBoundName(int i10) {
        if (i10 < 0) {
            return null;
        }
        String[] strArr = this._names;
        if (i10 >= strArr.length) {
            return null;
        }
        return strArr[i10];
    }

    public JavaType getBoundType(int i10) {
        if (i10 < 0) {
            return null;
        }
        JavaType[] javaTypeArr = this._types;
        if (i10 >= javaTypeArr.length) {
            return null;
        }
        return javaTypeArr[i10];
    }

    public List<JavaType> getTypeParameters() {
        JavaType[] javaTypeArr = this._types;
        if (javaTypeArr.length == 0) {
            return Collections.emptyList();
        }
        return Arrays.asList(javaTypeArr);
    }

    public boolean hasUnbound(String str) {
        String[] strArr = this._unboundVariables;
        if (strArr == null) {
            return false;
        }
        int length = strArr.length;
        do {
            length--;
            if (length < 0) {
                return false;
            }
        } while (!str.equals(this._unboundVariables[length]));
        return true;
    }

    public int hashCode() {
        return this._hashCode;
    }

    public boolean isEmpty() {
        if (this._types.length == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public Object readResolve() {
        String[] strArr = this._names;
        if (strArr == null || strArr.length == 0) {
            return EMPTY;
        }
        return this;
    }

    public int size() {
        return this._types.length;
    }

    public String toString() {
        if (this._types.length == 0) {
            return "<>";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('<');
        int length = this._types.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 > 0) {
                sb2.append(',');
            }
            sb2.append(this._types[i10].getGenericSignature());
        }
        sb2.append('>');
        return sb2.toString();
    }

    /* access modifiers changed from: protected */
    public JavaType[] typeParameterArray() {
        return this._types;
    }

    public TypeBindings withUnboundVariable(String str) {
        int i10;
        String[] strArr;
        String[] strArr2 = this._unboundVariables;
        if (strArr2 == null) {
            i10 = 0;
        } else {
            i10 = strArr2.length;
        }
        if (i10 == 0) {
            strArr = new String[1];
        } else {
            strArr = (String[]) Arrays.copyOf(strArr2, i10 + 1);
        }
        strArr[i10] = str;
        return new TypeBindings(this._names, this._types, strArr);
    }

    public static TypeBindings create(Class<?> cls, JavaType[] javaTypeArr) {
        String[] strArr;
        if (javaTypeArr == null) {
            javaTypeArr = NO_TYPES;
        } else {
            int length = javaTypeArr.length;
            if (length == 1) {
                return create(cls, javaTypeArr[0]);
            }
            if (length == 2) {
                return create(cls, javaTypeArr[0], javaTypeArr[1]);
            }
        }
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            strArr = NO_STRINGS;
        } else {
            int length2 = typeParameters.length;
            strArr = new String[length2];
            for (int i10 = 0; i10 < length2; i10++) {
                strArr[i10] = typeParameters[i10].getName();
            }
        }
        if (strArr.length == javaTypeArr.length) {
            return new TypeBindings(strArr, javaTypeArr, (String[]) null);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can not create TypeBindings for class ");
        sb2.append(cls.getName());
        sb2.append(" with ");
        sb2.append(javaTypeArr.length);
        sb2.append(" type parameter");
        sb2.append(javaTypeArr.length == 1 ? "" : "s");
        sb2.append(": class expects ");
        sb2.append(strArr.length);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static TypeBindings createIfNeeded(Class<?> cls, JavaType[] javaTypeArr) {
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            return EMPTY;
        }
        if (javaTypeArr == null) {
            javaTypeArr = NO_TYPES;
        }
        int length = typeParameters.length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = typeParameters[i10].getName();
        }
        if (length == javaTypeArr.length) {
            return new TypeBindings(strArr, javaTypeArr, (String[]) null);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can not create TypeBindings for class ");
        sb2.append(cls.getName());
        sb2.append(" with ");
        sb2.append(javaTypeArr.length);
        sb2.append(" type parameter");
        sb2.append(javaTypeArr.length == 1 ? "" : "s");
        sb2.append(": class expects ");
        sb2.append(length);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static TypeBindings create(Class<?> cls, JavaType javaType) {
        int i10;
        TypeVariable[] paramsFor1 = TypeParamStash.paramsFor1(cls);
        if (paramsFor1 == null) {
            i10 = 0;
        } else {
            i10 = paramsFor1.length;
        }
        if (i10 == 1) {
            return new TypeBindings(new String[]{paramsFor1[0].getName()}, new JavaType[]{javaType}, (String[]) null);
        }
        throw new IllegalArgumentException("Can not create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + i10);
    }

    public static TypeBindings create(Class<?> cls, JavaType javaType, JavaType javaType2) {
        int i10;
        TypeVariable[] paramsFor2 = TypeParamStash.paramsFor2(cls);
        if (paramsFor2 == null) {
            i10 = 0;
        } else {
            i10 = paramsFor2.length;
        }
        if (i10 == 2) {
            return new TypeBindings(new String[]{paramsFor2[0].getName(), paramsFor2[1].getName()}, new JavaType[]{javaType, javaType2}, (String[]) null);
        }
        throw new IllegalArgumentException("Can not create TypeBindings for class " + cls.getName() + " with 2 type parameters: class expects " + i10);
    }
}
