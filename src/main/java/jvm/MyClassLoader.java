package jvm;

import java.util.Base64;

public class MyClassLoader extends ClassLoader{
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        new MyClassLoader().findClass("jvm.Test1").newInstance();
    }
    @Override
    protected  Class<?> findClass(String name) throws ClassNotFoundException{
        String class1 = "yv66vgAAADQAJgoABwAXCQAYABkIABoKABsAHAgAHQcAHgcAHwEABjxpbml0PgEAAygpVgEABENvZGUBAA9MaW5lTnVtYmVyVGFibGUBABJMb2NhbFZhcmlhYmxlVGFibGUBAAR0aGlzAQALTGp2bS9UZXN0MTsBAARtYWluAQAWKFtMamF2YS9sYW5nL1N0cmluZzspVgEABGFyZ3MBABNbTGphdmEvbGFuZy9TdHJpbmc7AQAQTWV0aG9kUGFyYW1ldGVycwEACDxjbGluaXQ+AQAKU291cmNlRmlsZQEAClRlc3QxLmphdmEMAAgACQcAIAwAIQAiAQAQ5rWL6K+VbWFpbuWHveaVsAcAIwwAJAAlAQAS5rWL6K+V6Z2Z5oCB5pa55rOVAQAJanZtL1Rlc3QxAQAQamF2YS9sYW5nL09iamVjdAEAEGphdmEvbGFuZy9TeXN0ZW0BAANvdXQBABVMamF2YS9pby9QcmludFN0cmVhbTsBABNqYXZhL2lvL1ByaW50U3RyZWFtAQAHcHJpbnRsbgEAFShMamF2YS9sYW5nL1N0cmluZzspVgAhAAYABwAAAAAAAwABAAgACQABAAoAAAAvAAEAAQAAAAUqtwABsQAAAAIACwAAAAYAAQAAAAMADAAAAAwAAQAAAAUADQAOAAAACQAPABAAAgAKAAAANwACAAEAAAAJsgACEgO2AASxAAAAAgALAAAACgACAAAABQAIAAYADAAAAAwAAQAAAAkAEQASAAAAEwAAAAUBABEAAAAIABQACQABAAoAAAAlAAIAAAAAAAmyAAISBbYABLEAAAABAAsAAAAKAAIAAAAIAAgACQABABUAAAACABY=";
         byte[] decode = decode(class1);
         return defineClass(name,decode,0,decode.length);
    }

    public byte[] decode(String base64){
        return Base64.getDecoder().decode(base64);
    }
}
